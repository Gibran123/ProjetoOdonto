package br.com.shalom.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.com.shalom.modelo.Fase;
import br.com.shalom.modelo.Grupo;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;

@SuppressWarnings("unchecked")
public class GrupoDao {

		
	public void adicionarGrupo(Session session, Grupo grupo) {
		try{
			Optional<Fase> fase = verificarFase(session, grupo);
			grupo.setFase(fase.get());
			session.getTransaction().begin();
			session.save(grupo);
			session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Transação concluida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }catch(HibernateException | PersistenceException e){
			JOptionPane.showMessageDialog(null, "Erro ao adicionar registro!");
                        session.getTransaction().rollback();
		}finally{
                        session.flush();
                        session.close();
		}
	}

	public void atulizarGrupo(Session session, Grupo grupo) {
		try {
			Optional<Fase> fase = verificarFase(session, grupo);
			grupo.setFase(fase.get());
			session.getTransaction().begin();
			session.update(grupo);
			session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Transação concluida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (HibernateException e) {
			JOptionPane.showMessageDialog(null, "Erro ao atulizar registro!");
			session.getTransaction().rollback();
		} finally {
                        session.flush();
			session.close();
		}
	}

	public void removerGrupo(Session session, Grupo grupo) {
		try {
			session.getTransaction().begin();
			session.delete(grupo);
			session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Transação concluida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (HibernateException | PersistenceException e) {
			JOptionPane.showMessageDialog(null, "Erro: Você não pode deletar elementos"
                                + " que ainda estão sendo utilizados!");
			session.getTransaction().rollback();
		} finally {
                        session.flush();
			session.close();
		}
	}

	//Quando chamar este metodo lembrar de fechar a sessão
	public List<Grupo> getAllGrupos(Session session){
		List<Grupo> grupos = null;
		try {
			grupos = session.createCriteria(Grupo.class).list();
                        if(grupos.isEmpty()){
				JOptionPane.showMessageDialog(null, "Não existe grupos cadastradas!");
			}
		} catch (HibernateException | PersistenceException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return grupos;
	}
        
        
        public List<String> getAllGroupsByName(Session session) {
		List<String> grupos = null;
		try {
                        Criteria c = session.createCriteria(Grupo.class);
                        c.setProjection(Projections.property("nome"));
			grupos = c.list();
                        if(grupos.isEmpty()){
				JOptionPane.showMessageDialog(null, "Não existe grupos cadastradas!");
			}
		} catch (HibernateException | PersistenceException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}finally{
                    session.close();
                }
		return grupos;
	}
	
	private Optional<Fase> verificarFase(Session session, Grupo grupo){
		List<Fase> fases = null;
		FaseDao dao = new FaseDao();
		fases = dao.getAllFases(session);
		return fases.stream()
		.filter(f -> f.getNome().equals(grupo.getFase().getNome()))
		.findFirst();
	}
   
}
