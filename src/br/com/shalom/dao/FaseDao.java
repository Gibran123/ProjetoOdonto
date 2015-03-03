package br.com.shalom.dao;

import java.util.List;

import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.com.shalom.modelo.Fase;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;

@SuppressWarnings("unchecked")
public class FaseDao {

	public void adicionarFase(Session session, Fase fase) {
		try{
			session.getTransaction().begin();
			session.save(fase);
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

	public void atulizarFase(Session session, Fase fase) {
		try {
			session.getTransaction().begin();
			session.update(fase);
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

	public void removerFase(Session session, Fase fase) {
		try {
			session.getTransaction().begin();
			session.delete(fase);
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

	//Lembrar de fechar conexao ao chamar o metodo
	public List<Fase> getAllFases(Session session) {
		List<Fase> fases = null;
		try {
			Query query = session.createQuery("select f from Fase f");
			fases = query.list();
                        if(fases.isEmpty()){
				JOptionPane.showMessageDialog(null, "Não existe fases cadastradas!");
			}
		} catch (HibernateException | PersistenceException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		return fases;
	}
        
        public List<String> getAllFasesByName(Session session) {
		List<String> fases = null;
		try {
			Criteria c  = session.createCriteria(Fase.class);
                        c.setProjection(Projections.property("nome"));
			fases = c.list();
                        if(fases.isEmpty()){
				JOptionPane.showMessageDialog(null, "Não existe fases cadastradas!");
			}
		} catch (HibernateException | PersistenceException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}finally{
                    session.close();
                }
		
		return fases;
	}
}
