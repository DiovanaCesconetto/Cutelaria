/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import regrasDeNegocios.Despesa;
import dao.DespesaDao;
import dao.FuncionarioDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import regrasDeNegocios.Funcionario;
/**
 *
 * @author letic
 */
public class FormDespesa extends javax.swing.JDialog {

    /**
     * Creates new form FormDespesa
     */
    public FormDespesa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela();
    DespesaDao dsdao= new DespesaDao();
   
    String sql = "null";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jSplitPane1 = new javax.swing.JSplitPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeDesp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumeroDocDespes = new javax.swing.JTextField();
        jb_Salvar = new javax.swing.JButton();
        jb_atualizar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtIdDesp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValorDesp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1Fundo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jb_novo = new javax.swing.JButton();
        jB_editar = new javax.swing.JButton();
        jB_excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Despesa = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1Fundo1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Numero documento");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 250, 139, 17);
        jPanel3.add(txtNomeDesp);
        txtNomeDesp.setBounds(60, 78, 370, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Data:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 187, 37, 17);
        jPanel3.add(txtNumeroDocDespes);
        txtNumeroDocDespes.setBounds(167, 245, 290, 30);

        jb_Salvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_Salvar.setText("SALVAR");
        jb_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SalvarActionPerformed(evt);
            }
        });
        jPanel3.add(jb_Salvar);
        jb_Salvar.setBounds(85, 318, 98, 43);

        jb_atualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_atualizar.setText("ATUALIZAR");
        jb_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_atualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jb_atualizar);
        jb_atualizar.setBounds(255, 318, 115, 39);

        jb_cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_cancelar.setText("CANCELAR");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        jPanel3.add(jb_cancelar);
        jb_cancelar.setBounds(435, 318, 130, 43);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 27, 38, 31);

        txtIdDesp.setEditable(false);
        txtIdDesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDespActionPerformed(evt);
            }
        });
        jPanel3.add(txtIdDesp);
        txtIdDesp.setBounds(58, 29, 158, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Valor:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 137, 41, 17);
        jPanel3.add(txtValorDesp);
        txtValorDesp.setBounds(61, 133, 110, 28);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nome:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 83, 46, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CADASTRO DE  DESPESA");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(160, 4, 186, 17);

        jLabel1Fundo.setBackground(new java.awt.Color(117, 64, 15));
        jLabel1Fundo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\facat.png")); // NOI18N
        jLabel1Fundo.setText("CAIXAAA");
        jPanel3.add(jLabel1Fundo);
        jLabel1Fundo.setBounds(0, 0, 630, 480);

        jTabbedPane3.addTab("cadastro", jPanel3);

        jPanel2.setLayout(null);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(134, 28, 198, 36);

        jb_novo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_novo.setText("NOVO");
        jb_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novoActionPerformed(evt);
            }
        });
        jPanel2.add(jb_novo);
        jb_novo.setBounds(69, 268, 85, 43);

        jB_editar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jB_editar.setText("EDITAR");
        jB_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_editarActionPerformed(evt);
            }
        });
        jPanel2.add(jB_editar);
        jB_editar.setBounds(388, 268, 87, 43);

        jB_excluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jB_excluir.setText("EXCLUIR");
        jB_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_excluirActionPerformed(evt);
            }
        });
        jPanel2.add(jB_excluir);
        jB_excluir.setBounds(212, 268, 97, 43);

        jT_Despesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome ", "valor", "data", "numero documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jT_Despesa);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 75, 534, 187);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Pesquisar:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 36, 71, 17);

        jLabel1Fundo1.setBackground(new java.awt.Color(117, 64, 15));
        jLabel1Fundo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\facat.png")); // NOI18N
        jLabel1Fundo1.setText("CAIXAAA");
        jPanel2.add(jLabel1Fundo1);
        jLabel1Fundo1.setBounds(0, 0, 630, 480);

        jTabbedPane3.addTab("listar", jPanel2);

        getContentPane().add(jTabbedPane3);
        jTabbedPane3.setBounds(0, 0, 589, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalvarActionPerformed
        // TODO add your handling code here:
        Despesa ds = new Despesa();

        ds.setDescricao_desp(txtNomeDesp.getText());
        ds.setValor_desp(Double.parseDouble(txtValorDesp.getText()));
        ds.setDatavencimento_desp(txtDataDesp.getText());
        ds.setNumerodoc_desp(txtNumeroDocDespes.getText());
        

        DespesaDao dsdao = new DespesaDao();
        dsdao.inserir(ds);
        preencherTabela();
        jTabbedPane1.setSelectedIndex(1);

        // vai mostrar qual painel da guia que eu quero voltar.
    }//GEN-LAST:event_jb_SalvarActionPerformed

    private void jb_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_atualizarActionPerformed
        Despesa ds = new Despesa();
        ds.setId_despesa(Integer.parseInt(txtIdDesp.getText()));
        ds.setDescricao_desp(txtNomeDesp.getText());
        ds.setValor_desp(Double.parseDouble(txtValorDesp.getText()));
        ds.setDatavencimento_desp(txtDataDesp.getText());
        ds.setNumerodoc_desp(txtNumeroDocDespes.getText());
        ds.setValor_desp(Double.parseDouble (txtValorDesp.getText()));

        DespesaDao dsdao =new DespesaDao();
        dsdao.atualizar(ds);
        
        preencherTabela();
        jTabbedPane1.setSelectedIndex(0);
        jb_atualizar.setVisible(false);
        jb_Salvar.setVisible(true);
    }//GEN-LAST:event_jb_atualizarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        // TODO add your handling code here:
        txtIdDesp.setText(null);
        txtNomeDesp.setText(null);
        txtDataDesp.setText(null);
        txtNumeroDocDespes.setText(null);
        txtValorDesp.setText(null);

        jb_atualizar.setVisible(false);
        jb_Salvar.setVisible(true);

    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void txtIdDespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDespActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jb_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novoActionPerformed
        // TODO add your handling code here:
        txtIdDesp.setText(null);
        txtNomeDesp.setText(null);
        txtDataDesp.setText(null);
        txtNumeroDocDespes.setText(null);
        txtValorDesp.setText(null);
        jb_atualizar.setVisible(false);
        jb_Salvar.setVisible(true);
        jTabbedPane1.setSelectedIndex(1);//volta pra primenira tela
    }//GEN-LAST:event_jb_novoActionPerformed

    private void jB_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_editarActionPerformed
        // TODO add your handling code here:
        int opcao = jT_Despesa.getSelectedRow(); //Pega a lh selecionada que esta na tabela
        if(opcao>=0){
            Despesa d = new Despesa();
            d.setId_despesa(Integer.parseInt(jT_Despesa.getValueAt(opcao,0).toString()));
            txtNomeDesp.setText(jT_Despesa.getValueAt(opcao, 1).toString()); // atribuindo um valor aos campos
            txtDataDesp.setText(jT_Despesa.getValueAt(opcao, 2).toString());
            txtNumeroDocDespes.setText(jT_Despesa.getValueAt(opcao, 3).toString());
            txtValorDesp.setText(jT_Despesa.getValueAt(opcao, 4).toString());
            jb_atualizar.setVisible(true);
            jb_Salvar.setVisible(false);
            jTabbedPane1.setSelectedIndex(1);

        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
    }//GEN-LAST:event_jB_editarActionPerformed

    private void jB_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_excluirActionPerformed
        // TODO add your handling code here:
        int opcao = jT_Despesa.getSelectedRow(); //Pega a lh selecionada que esta na tabela
        if(opcao>=0){
            Despesa d = new Despesa();
            d.setId_despesa(Integer.parseInt(jT_Despesa.getValueAt(opcao,0).toString()));
            d.setDescricao_desp(jT_Despesa.getValueAt(opcao, 1).toString());
            DespesaDao dsdao = new DespesaDao();
            dsdao.deletar(d);
            preencherTabela(); // para atualizar tabela
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha");

        }
        
       

    }//GEN-LAST:event_jB_excluirActionPerformed
      public void preencherTabela(){
    DespesaDao dsdao = new DespesaDao(); 
    List<Despesa> lista= dsdao.listarTodos();
    DefaultTableModel tabela =  (DefaultTableModel) jT_Despesa.getModel();
    tabela.setRowCount(0);
    for(Despesa d: lista){
        tabela.addRow(new Object[]{ d.getId_despesa(), d.getDescricao_desp(), d.getValor_desp(), d.getDatavencimento_desp(), d.getNumerodoc_desp()});
    }
      }    
      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormDespesa dialog = new FormDespesa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_editar;
    private javax.swing.JButton jB_excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Fundo;
    private javax.swing.JLabel jLabel1Fundo1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jT_Despesa;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jb_Salvar;
    private javax.swing.JButton jb_atualizar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_novo;
    private javax.swing.JTextField txtIdDesp;
    private javax.swing.JTextField txtNomeDesp;
    private javax.swing.JTextField txtNumeroDocDespes;
    private javax.swing.JTextField txtValorDesp;
    // End of variables declaration//GEN-END:variables
}
