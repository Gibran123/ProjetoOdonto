/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.shalom.view;

import br.com.shalom.relatorios.GeradorRelatorios;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gibran
 */
public class Menu extends JFrame{
        private static final int DEFAULT_WIDTH = 600;
	private static final int DEFAULT_HEIGHT= 600;
	
	private JDesktopPane desktop;
        private JLabel logo;
	private GeradorRelatorios gr;
	public Menu(){
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		gr = new GeradorRelatorios();
		logo = new JLabel();
                
		desktop = new JDesktopPane();
		add(desktop, BorderLayout.CENTER);
		
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension d = toolkit.getScreenSize();
                int maxX = d.width;
                int maxY = d.height;
                          
                
//                logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/shalom/imagens/shalom.png")));
//                logo.setBounds(0, 0, 2192, 1057);
//                logo.setOpaque(true);
//                desktop.add(logo);
                
                JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu cadastroMenu = new JMenu("Gerenciar pessoas");
		menuBar.add(cadastroMenu);
		JMenuItem clienteItem = new JMenuItem("Cadastrar pessoas");
		clienteItem.setAccelerator(KeyStroke.getKeyStroke("ctrl P"));
		clienteItem.addActionListener((ActionEvent event) -> {
                    CadastroDePessoas cdp = new CadastroDePessoas();
                    desktop.add(cdp);
                    cdp.setMaximizable(true);
                    cdp.setVisible(true);
                });
		cadastroMenu.add(clienteItem);
		
                JMenuItem pesquisaItem = new JMenuItem("Pesquisar pessoas");
		pesquisaItem.addActionListener((ActionEvent e) -> {
                    PesquisaPessoas pp = new PesquisaPessoas();
                    desktop.add(pp);
                    pp.setMaximizable(true);
                    pp.setVisible(true);
                });
		cadastroMenu.add(pesquisaItem);
				
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.addActionListener((ActionEvent e) -> {
                    System.exit(0);
                });
		cadastroMenu.add(exitItem);
                
                
               JMenu gruposMenu = new JMenu("Gerenciar grupos");
               menuBar.add(gruposMenu);
               JMenuItem gruposItem = new JMenuItem("Cadastrar Grupos");
               gruposItem.setAccelerator(KeyStroke.getKeyStroke("ctrl G"));
               gruposItem.addActionListener((ActionEvent e) -> {
                   CadastroDeGrupos grupos = new CadastroDeGrupos();
                   desktop.add(grupos);
                   grupos.setMaximizable(true);
                   grupos.setVisible(true);
                });
               gruposMenu.add(gruposItem);
               
               JMenu faseMenu = new JMenu("Gerenciar fases");
               menuBar.add(faseMenu);
               JMenuItem faseItem = new JMenuItem("Cadastrar Fases");
               faseItem.setAccelerator(KeyStroke.getKeyStroke("ctrl F"));
               faseItem.addActionListener((ActionEvent e) -> {
                   CadastroDeFases fases = new CadastroDeFases();
                   desktop.add(fases);
                   fases.setMaximizable(true);
                   fases.setVisible(true);
                });
               faseMenu.add(faseItem);
                
               JMenu ministerioMenu = new JMenu("Gerenciar ministérios");
               menuBar.add(ministerioMenu);
               JMenuItem ministerioItem = new JMenuItem("Cadastrar Ministérios");
               ministerioItem.setAccelerator(KeyStroke.getKeyStroke("ctrl M"));
               ministerioItem.addActionListener((ActionEvent e) -> {
                   CadastroDeMinisterios ministerios = new CadastroDeMinisterios();
                   desktop.add(ministerios);
                   ministerios.setMaximizable(true);
                   ministerios.setVisible(true);
                });
               ministerioMenu.add(ministerioItem);
               
                JMenu relatorios = new JMenu("Relatórios");
                menuBar.add(relatorios);
                JMenuItem relatorioItem = new JMenuItem("Aniversariantes do mês");
		relatorioItem.addActionListener((ActionEvent e) -> {
                    try {
                        gr.aniversariantesDoMes();
                    } catch (IOException | SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                });
		relatorios.add(relatorioItem);
                
                
               JMenuItem relatorioItem2 = new JMenuItem("Quadrante ministerial");
               relatorioItem2.addActionListener((ActionEvent e) -> {
                   try {
                       gr.quadranteMinisterial();
                   } catch (IOException | SQLException ex) {
                       JOptionPane.showMessageDialog(null, ex.getMessage());
                   }
                });
               relatorios.add(relatorioItem2);
               
              
                                
        }
        
        	public static void main(String[] args) throws IOException, SQLException {
                 
                try{
                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
                        if("GTK+".equals(info.getName())){
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
                    JOptionPane.showMessageDialog(null,e.getMessage());
                }    
                    
		Menu desktopFrame = new Menu();
		desktopFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		desktopFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		desktopFrame.setVisible(true);
                
	}
}
