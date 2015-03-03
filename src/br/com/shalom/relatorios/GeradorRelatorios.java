package br.com.shalom.relatorios;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class GeradorRelatorios {

	public void aniversariantesDoMes() throws IOException, SQLException {
		Connection con = getConnection();
		try {
			File file =  new File("relatorios/Aniversariante.jasper");
						
			Map<String, Object> map = new HashMap<>();
			
			JasperPrint print = JasperFillManager.fillReport(file.getAbsolutePath(), map, con);
			
			JasperViewer.viewReport(print, false);

			JOptionPane.showMessageDialog(null, "PDF Gerado!");
		} catch (JRException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}finally{
			release(con);
		}
	}

	
	public void quadranteMinisterial() throws IOException, SQLException {
		Connection con = getConnection();
		try {
			
			File file =  new File("relatorios/Status.jasper");
			
			Map<String, Object> map = new HashMap<>();
			
			JasperPrint print = JasperFillManager.fillReport(file.getAbsolutePath(), map, con);
			
			JasperViewer.viewReport(print, false);

			JOptionPane.showMessageDialog(null, "PDF Gerado!");
		} catch (JRException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}finally{
			release(con);
		}
	}

	private void release(Connection con) {
		if(con != null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private Connection getConnection(){
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/shalom","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
