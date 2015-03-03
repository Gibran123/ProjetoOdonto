package br.com.shalom.dao;

import java.util.List;

import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.com.shalom.modelo.Ministerio;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;

@SuppressWarnings("unchecked")
public class MinisterioDao {

	public void adicionarMinisterio(Session session, Ministerio ministerio){
		try{
			session.getTransaction().begin();
			session.save(ministerio);
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

	public void atulizarMinisterio(Session session, Ministerio ministerio) {
		try{
			session.getTransaction().begin();
			session.update(ministerio);
			session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Transação concluida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		}catch(HibernateException | PersistenceException e){
			JOptionPane.showMessageDialog(null, "Erro ao atulizar registro!");
			session.getTransaction().rollback();
		}finally{
                        session.flush();
			session.close();
		}
	}

	public void removerMinisterio(Session session, Ministerio ministerio) {
		try{
			session.getTransaction().begin();
			session.delete(ministerio);
			session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Transação concluida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		}catch(HibernateException | PersistenceException e){
			JOptionPane.showMessageDialog(null, "Erro: Você não pode deletar elementos"
                                + " que ainda estão sendo utilizados!");
			session.getTransaction().rollback();
		}finally{
                        session.flush();
			session.close();
		}
	}

	//Quando chamar este metodo lembrar de fechar a sessão
	public List<Ministerio> getAllMinisterios(Session session) {
		List<Ministerio> ministerios = null;
		try{
                        Criteria criteria = session.createCriteria(Ministerio.class);
                        
                        ministerios = criteria.list();
                        if(ministerios.isEmpty()){
				JOptionPane.showMessageDialog(null, "Não existe ministerios cadastradas!");
			}
		}catch(HibernateException | PersistenceException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return ministerios;
	}
        
        public List<String> getAllMinisteriosByName(Session session) {
		List<String> ministerios = null;
		try{
			Criteria c = session.createCriteria(Ministerio.class);
                        c.setProjection(Projections.property("nome"));
			ministerios = c.list();
		}catch(HibernateException | PersistenceException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}finally{
                    session.close();
                }
		return ministerios;
	}

}
