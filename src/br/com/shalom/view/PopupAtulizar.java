/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.shalom.view;

import br.com.shalom.dao.GrupoDao;
import br.com.shalom.dao.MinisterioDao;
import br.com.shalom.dao.PessoaDao;
import br.com.shalom.modelo.Endereco;
import br.com.shalom.modelo.Funcao;
import br.com.shalom.modelo.Grupo;
import br.com.shalom.modelo.Ministerio;
import br.com.shalom.modelo.Pessoa;
import br.com.shalom.modelo.Status;
import br.com.shalom.util.JPAUtil;
import com.sun.glass.events.KeyEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author gibran
 */
public class PopupAtulizar extends javax.swing.JDialog {

    /**
     * Creates new form PopupAtulizar
     * @param parent
     * @param modal
     * @param p
     */
    public PopupAtulizar(java.awt.Frame parent, boolean modal,Pessoa p) {
        super(parent, modal);
        daoGrupo = new GrupoDao();
        daoMinisterio = new MinisterioDao();
        daoPessoa = new PessoaDao();
        pessoa = p;
        loadLoolAndFeel();
        initComponents();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension d = toolkit.getScreenSize();
	int maxX = d.width;
	int maxY = d.height;
	setLocation(maxX / 3, maxY / 11);
        carregarCampos(p);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFone = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextRua = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextCity = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboFuncao = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboStatus = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboGrupo = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jComboMinisterio = new javax.swing.JComboBox();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(437, 500));
        setMinimumSize(new java.awt.Dimension(437, 500));
        setModal(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(437, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(437, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(437, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));

        jLabel1.setText("Nome:");

        jTextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextNomeKeyPressed(evt);
            }
        });

        jLabel2.setText("Data de nascimento:");

        jLabel3.setText("Telefone:");

        try {
            jTextFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFone.setToolTipText("");
        jTextFone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFoneKeyPressed(evt);
            }
        });

        jLabel12.setText("ID:");

        jTextId.setEditable(false);

        jDateChooser.setDate(new Date());
        jDateChooser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooserKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(jTextFone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(4, 4, 4)
                        .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextRuaKeyPressed(evt);
            }
        });

        jLabel5.setText("Rua:");

        jLabel6.setText("Número:");

        jTextNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextNumKeyPressed(evt);
            }
        });

        jLabel7.setText("Cidade:");

        jTextCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextCityKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNum, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextRua, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCity, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereço", jPanel2);

        jLabel8.setText("Função:");

        jComboFuncao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OVELHA", "PASTOR", "NUCLEO" }));

        jLabel9.setText("Status:");

        jComboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PERMANENTE", "PERIFERICO", "FLUTUANTE", "EVASAO" }));

        jLabel10.setText("Grupo:");

        modelos = daoGrupo.getAllGroupsByName(JPAUtil.getSession());
        jComboGrupo.setModel(new DefaultComboBoxModel(modelos.toArray()));

        jLabel11.setText("Ministério:");

        modelos = daoMinisterio.getAllMinisteriosByName(JPAUtil.getSession());
        jComboMinisterio.setModel(new DefaultComboBoxModel(modelos.toArray()));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboFuncao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboMinisterio, 0, 206, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboMinisterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados da comunidade", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 420, 220));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Dados da comunidade");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 70, -1));

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        dispose();
        daoPessoa.atualizarPessoa(JPAUtil.getSession(), getPessoa());
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void jTextNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextNomeKeyPressed

    private void jTextFoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFoneKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFoneKeyPressed

    private void jDateChooserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_jDateChooserKeyPressed

    private void jTextRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRuaKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextRuaKeyPressed

    private void jTextNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNumKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextNumKeyPressed

    private void jTextCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCityKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextCityKeyPressed

    private Pessoa getPessoa() {
        Pessoa p = new Pessoa();
        p.setId(Integer.parseInt(jTextId.getText()));
        Grupo g = new Grupo();
        Ministerio m = new Ministerio();
        Endereco end = new Endereco();
        p.setNome(jTextNome.getText().trim());
        p.setNascimento(jDateChooser.getDate());
        p.setTelefone(jTextFone.getText());
        end.setCidade(jTextCity.getText().trim());
        end.setNumero(jTextNum.getText().trim());
        end.setRua(jTextRua.getText().trim());
        p.setEndereco(end);
        if (jComboFuncao.getSelectedIndex() == 0) {
            p.setFuncao(Funcao.OVELHA);
        }
        if (jComboFuncao.getSelectedIndex() == 1) {
            p.setFuncao(Funcao.PASTOR);
        }
        if (jComboFuncao.getSelectedIndex() == 2) {
            p.setFuncao(Funcao.NUCLEO);
        }
        if (jComboStatus.getSelectedIndex() == 0) {
            p.setStatus(Status.PERMANENTE);
        }
        if (jComboStatus.getSelectedIndex() == 1) {
            p.setStatus(Status.PERIFERICO);
        }
        if (jComboStatus.getSelectedIndex() == 2) {
            p.setStatus(Status.FLUTUANTE);
        }
        if (jComboStatus.getSelectedIndex() == 3) {
            p.setStatus(Status.EVASAO);
        }
        g.setNome(jComboGrupo.getSelectedItem().toString());
        p.setGrupo(g);
        m.setNome(jComboMinisterio.getSelectedItem().toString());
        p.setMinisterio(m);
        return p;
    }
    
    private void carregarCampos(Pessoa pessoa) {
        jTextId.setText(pessoa.getId().toString());
        jTextNome.setText(pessoa.getNome());
        jDateChooser.setDate(pessoa.getNascimento());
        jTextFone.setText(pessoa.getTelefone());
        jTextRua.setText(pessoa.getEndereco().getRua());
        jTextNum.setText(pessoa.getEndereco().getNumero());
        jTextCity.setText(pessoa.getEndereco().getCidade());
        jComboFuncao.setSelectedItem(pessoa.getFuncao().toString());
        jComboStatus.setSelectedItem(pessoa.getStatus().toString());
        jComboGrupo.setSelectedItem(pessoa.getGrupo().getNome());
        jComboMinisterio.setSelectedItem(pessoa.getMinisterio().getNome());
    }
    
    private static void loadLoolAndFeel() {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopupAtulizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox jComboFuncao;
    private javax.swing.JComboBox jComboGrupo;
    private javax.swing.JComboBox jComboMinisterio;
    private javax.swing.JComboBox jComboStatus;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextCity;
    private javax.swing.JFormattedTextField jTextFone;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextNum;
    private javax.swing.JTextField jTextRua;
    // End of variables declaration//GEN-END:variables
    private List<String> modelos;
    private final GrupoDao daoGrupo;
    private final MinisterioDao daoMinisterio;
    private final Pessoa pessoa;
    private final PessoaDao daoPessoa;
}
