/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.shalom.view;

import br.com.shalom.dao.FaseDao;
import br.com.shalom.filter.TeclasPermitidas;
import br.com.shalom.modelo.Estado;
import br.com.shalom.modelo.Fase;
import br.com.shalom.util.JPAUtil;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.hibernate.Session;

/**
 *
 * @author gibran
 */
public class CadastroDeFases extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroDePessoas
     */
    public CadastroDeFases() {
        daoFase = new FaseDao();
        initComponents();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension d = toolkit.getScreenSize();
	int maxX = d.width;
	int maxY = d.height;
	setLocation(maxX / 12, maxY / 22);
        jTextNome.setDocument(new TeclasPermitidas());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btIncluir = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btListarPessoas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextId = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Fases");
        setMaximumSize(new java.awt.Dimension(1096, 606));
        setMinimumSize(new java.awt.Dimension(1096, 606));
        setPreferredSize(new java.awt.Dimension(1096, 606));
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/shalom/imagens/couple48.png"))); // NOI18N
        jLabel4.setText("Cadastro de Fases");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(865, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 1100, 60);

        jToolBar1.setRollover(true);

        btIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/shalom/imagens/add1-16.png"))); // NOI18N
        btIncluir.setText("Incluir");
        btIncluir.setFocusable(false);
        btIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });
        jToolBar1.add(btIncluir);

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/shalom/imagens/edit16.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setFocusable(false);
        btAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btAtualizar);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/shalom/imagens/edit16.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setFocusable(false);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(btExcluir);

        btListarPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/shalom/imagens/Índice.png"))); // NOI18N
        btListarPessoas.setText("Listar");
        btListarPessoas.setFocusable(false);
        btListarPessoas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListarPessoas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btListarPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarPessoasActionPerformed(evt);
            }
        });
        jToolBar1.add(btListarPessoas);
        jToolBar1.add(jSeparator2);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/shalom/imagens/save_16x16.gif"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setEnabled(false);
        btSalvar.setFocusable(false);
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jToolBar1.add(btSalvar);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/shalom/imagens/cancel16.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setEnabled(false);
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCancelar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 1100, 60);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FASE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        class AlinharCentro extends DefaultTableCellRenderer{
            public AlinharCentro(){
                setHorizontalAlignment(CENTER);
            }
        }

        TableCellRenderer center = new AlinharCentro();
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable.getColumnModel().getColumn(0).setWidth(50);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable.getColumnModel().getColumn(0).setMaxWidth(50);
        jTable.getColumnModel().getColumn(0).setCellRenderer(center);

        jTable.getColumnModel().getColumn(1).setWidth(600);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(600);
        jTable.getColumnModel().getColumn(1).setMaxWidth(600);

        jScrollPane1.setViewportView(jTable);

        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel2);
        jPanel2.setBounds(440, 0, 640, 420);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nome:");

        jTextNome.setEditable(false);

        jTextId.setEditable(false);
        jTextId.setVisible(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(282, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 10, 420, 400);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 140, 1080, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
        habilitarCamposEdicao();
        estado = Estado.INSERCAO;
    }//GEN-LAST:event_btIncluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        desabilitarCamposEdicao();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btListarPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarPessoasActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
        int count = tableModel.getRowCount();
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                tableModel.removeRow(0);
            }
        }
        Session session = JPAUtil.getSession();
        List<Fase> fases = daoFase.getAllFases(session);
        fases.forEach((Fase f) -> {
            tableModel.addRow(new String[]{f.getId().toString(), f.getNome()});
        });
        session.close();
    }//GEN-LAST:event_btListarPessoasActionPerformed

    private void jTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && (estado == Estado.ATUALIZACAO || estado == Estado.EXTINCAO)) {
            Fase f;
            Session s = JPAUtil.getSession();
            f = (Fase) s.load(Fase.class, Integer.parseInt(jTable.getValueAt(jTable.getSelectedRow(), 0).toString()));
            jTextId.setText(f.getId().toString());
            jTextNome.setText(f.getNome());
        }
    }//GEN-LAST:event_jTableKeyPressed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        habilitarCamposEdicao();
        estado = Estado.ATUALIZACAO;
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        estado = Estado.EXTINCAO;
        habilitarCamposExtincao();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void habilitarCamposExtincao() {
        btSalvar.setEnabled(true);
        btCancelar.setEnabled(true);
        btIncluir.setEnabled(false);
        btAtualizar.setEnabled(false);
        btListarPessoas.setEnabled(false);
        btExcluir.setEnabled(false);
    }

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Fase f = getFase();
        gerenciarEstados(f);
        btListarPessoasActionPerformed(evt);
        desabilitarCamposEdicao();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void gerenciarEstados(Fase f) {
        if (estado == Estado.INSERCAO) {
            daoFase.adicionarFase(JPAUtil.getSession(), f);
        }
        if (estado == Estado.ATUALIZACAO) {
            daoFase.atulizarFase(JPAUtil.getSession(), f);
        }
        if (estado == Estado.EXTINCAO) {
            daoFase.removerFase(JPAUtil.getSession(), f);
        }

        estado = Estado.NEUTRO;
    }

    private Fase getFase() {
        Fase f = new Fase();
        if (estado == Estado.EXTINCAO) {
            f.setId(Integer.parseInt(jTextId.getText().trim()));
            return f;
        }
        if (estado == Estado.ATUALIZACAO) {
            f.setId(Integer.parseInt(jTextId.getText().trim()));
        }
        f.setNome(jTextNome.getText().trim());
        return f;
    }

    private void habilitarCamposEdicao() {
        jTextNome.setEditable(true);
        btAtualizar.setEnabled(false);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
        btExcluir.setEnabled(false);
        btIncluir.setEnabled(false);
        btListarPessoas.setEnabled(false);
    }

    private void desabilitarCamposEdicao() {
        jTextNome.setEditable(false);
        btAtualizar.setEnabled(true);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);
        btExcluir.setEnabled(true);
        btIncluir.setEnabled(true);
        btListarPessoas.setEnabled(true);
        limparCampos();
    }

    private void limparCampos() {
        jTextNome.setText("");
        jTextId.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btListarPessoas;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    private final FaseDao daoFase;
    private List<String> modelos;
    private static Estado estado = null;
}
