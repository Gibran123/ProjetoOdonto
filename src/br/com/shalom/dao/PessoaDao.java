package br.com.shalom.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.com.shalom.modelo.Grupo;
import br.com.shalom.modelo.Ministerio;
import br.com.shalom.modelo.Pessoa;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

@SuppressWarnings("unchecked")
public class PessoaDao {

    
        
	public void adicionarPessoa(Session session, Pessoa pessoa) {

		try {
			Optional<Grupo> g = verificarGrupo(session, pessoa);
                        pessoa.setGrupo(g.get());
                        g.get().getPessoas().add(pessoa);
			Optional<Ministerio> m = verificarMinisterio(session, pessoa);
			pessoa.setMinisterio(m.get());
                        m.get().getPessoas().add(pessoa);
                        session.getTransaction().begin();
                        session.save(pessoa);
			session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Transação concluida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		} catch (HibernateException | PersistenceException e) {
				JOptionPane.showMessageDialog(null, "Erro ao adicionar registro!");
				session.getTransaction().rollback();
		} finally {
                        session.flush();
			session.close();
		}
	}
	
	public void removerPessoa(Session session, Pessoa pessoa){
		try {
			session.getTransaction().begin();
			session.delete(pessoa);
                        session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Transação concluida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		} catch (HibernateException | PersistenceException e) {
                                JOptionPane.showMessageDialog(null, "Erro ao remover registro!");
				session.getTransaction().rollback();
		} finally {
                        session.flush();
			session.close();
		}		
	}
	
	public void atualizarPessoa(Session session,Pessoa pessoa){
                try {
			Optional<Grupo> g = verificarGrupo(session, pessoa);
			pessoa.getGrupo().setId(g.get().getId());
			Optional<Ministerio> m = verificarMinisterio(session, pessoa);
			pessoa.setMinisterio(m.get());
			session.getTransaction().begin();
                        session.update(pessoa);	
			session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Transação concluida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		} catch (HibernateException | PersistenceException e) {
                                JOptionPane.showMessageDialog(null, "Erro ao atulizar registro!");
				session.getTransaction().rollback();
		} finally {
                        session.flush();
			session.close();
		}
	}
	
	public List<Pessoa> getAllPeople(Session session){
		List<Pessoa> pessoas = null;
		try {
			
                        Criteria criteria = session.createCriteria(Pessoa.class);
                        pessoas = criteria.list();
			if(pessoas.isEmpty()){
				JOptionPane.showMessageDialog(null, "Não existe pessoas cadastradas!");
			}
		} catch (HibernateException | PersistenceException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());	
		} finally {
			session.close();
		}
		
		return pessoas;
	}
        
        public List<Pessoa> getAllPeople(Session session,String pesquisa){
		List<Pessoa> pessoas = null;
		try {
                        Criteria criteria = session.createCriteria(Pessoa.class);
                        criteria.add(Restrictions.like("nome", "%"+pesquisa+"%", MatchMode.ANYWHERE));
                        pessoas = criteria.list();
			if(pessoas.isEmpty()){
				JOptionPane.showMessageDialog(null, "Nenhuma pesquisa encontrada!");
			}
		} catch (HibernateException | PersistenceException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());	
		} finally {
			session.close();
		}
		
		return pessoas;
	}
	
	private Optional<Grupo> verificarGrupo(Session session, Pessoa pessoa){
		List<Grupo> grupos = null;
		GrupoDao dao = new GrupoDao();
		grupos = dao.getAllGrupos(session);
		return grupos.stream()
		.filter(g -> g.getNome().equals(pessoa.getGrupo().getNome()))
		.findFirst();
	}
	
	private Optional<Ministerio> verificarMinisterio(Session session, Pessoa pessoa){
		List<Ministerio> grupos = null;
		MinisterioDao dao = new MinisterioDao();
		grupos = dao.getAllMinisterios(session);
		return grupos.stream()
		.filter(g -> g.getNome().equals(pessoa.getMinisterio().getNome()))
		.findFirst();
	}

        
        public Pessoa carregarPessoa(Session session, Integer id) {
            Pessoa pessoa;
            pessoa = (Pessoa) session.load(Pessoa.class, id);
            return pessoa;
        }

}


