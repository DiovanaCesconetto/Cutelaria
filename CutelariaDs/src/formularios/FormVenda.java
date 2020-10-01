package formularios;

import dao.ClienteDao;
import dao.FuncionarioDao;
import dao.ProdutoDao;
import dao.VendaDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import regrasDeNegocios.Funcionario;
import regrasDeNegocios.Produto;
import regrasDeNegocios.Cliente;
import regrasDeNegocios.Itens_venda;
import regrasDeNegocios.Venda;


public class FormVenda extends javax.swing.JFrame {
    VendaDao vdao = new VendaDao();
    Venda v = new Venda();
    Itens_venda vt= new Itens_venda();
    ProdutoDao pdao = new ProdutoDao();
    ClienteDao cdao = new ClienteDao();
    FuncionarioDao fdao = new FuncionarioDao();
     float valor = 0;
    
    
    String sql = "null";
    
    public FormVenda() {
        initComponents();
        preencherCBProduto();
        preencherCBCliente();
        preencherCBFuncionario();
        
         jlVTotal.setText("R$"+valor);
    }

    FormVenda(FormMenu aThis, boolean rootPaneCheckingEnabled) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollBar1 = new javax.swing.JScrollBar();
        cbClienteVenda = new javax.swing.JComboBox();
        cbFuncionarioVenda = new javax.swing.JComboBox();
        cbProdutoVenda = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_vendaProduto = new javax.swing.JTable();
        btAdicionar = new javax.swing.JButton();
        txtQuantidadeVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        btNovaVenda = new javax.swing.JButton();
        btCancelaVenda = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jlVTotal = new javax.swing.JLabel();
        btFinalizarVenda = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbProdutoVenda.setEnabled(false);
        cbProdutoVenda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProdutoVendaItemStateChanged(evt);
            }
        });
        cbProdutoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutoVendaActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente");

        jLabel2.setText("Funcionario");

        jLabel3.setText("Produto");

        Tabela_vendaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "codigo prod", "Nome produto", "marca ", "Quantidade", "Valor Unitario", "valor Total"
            }
        ));
        jScrollPane1.setViewportView(Tabela_vendaProduto);

        btAdicionar.setText("Adicionar");
        btAdicionar.setEnabled(false);
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        txtQuantidadeVenda.setEnabled(false);
        txtQuantidadeVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeVendaFocusGained(evt);
            }
        });
        txtQuantidadeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeVendaActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade");

        jLabel5.setText("Quantidade Disponivel");

        lbQuantidade.setText("0");

        btNovaVenda.setText("Nova Venda");
        btNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaVendaActionPerformed(evt);
            }
        });

        btCancelaVenda.setText("Cancelar Venda");
        btCancelaVenda.setEnabled(false);
        btCancelaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelaVendaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Valor Total:");

        jlVTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlVTotal.setText("jLabel7");

        btFinalizarVenda.setText("Finalizar Venda");
        btFinalizarVenda.setEnabled(false);
        btFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbClienteVenda, 0, 446, Short.MAX_VALUE)
                            .addComponent(cbFuncionarioVenda, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbProdutoVenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbQuantidade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(btNovaVenda)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtQuantidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btAdicionar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addComponent(btCancelaVenda)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btFinalizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jlVTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFuncionarioVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovaVenda)
                    .addComponent(btCancelaVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbQuantidade)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantidadeVenda)
                    .addComponent(btAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantidadeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeVendaActionPerformed
   
    }//GEN-LAST:event_txtQuantidadeVendaActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
       
        v.setQuantidade(Integer.parseInt(txtQuantidadeVenda.getText()));
        Produto p = (Produto) cbProdutoVenda.getSelectedItem();
        v.setProduto(p);
        vdao.inserirProduto(v);
        preencherTabela(sql);
         jlVTotal.setText("R$"+valor);
         btFinalizarVenda.setEnabled(true);
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaVendaActionPerformed
       
        cbProdutoVenda.setEnabled(true);
        btCancelaVenda.setEnabled(true);
        btNovaVenda.setEnabled(false);
        txtQuantidadeVenda.setEnabled(true);
        Cliente c = (Cliente) cbClienteVenda.getSelectedItem();
        Funcionario f = (Funcionario) cbFuncionarioVenda.getSelectedItem();
        v.setCliente(c);
        v.setFuncionario(f);
        vdao.novaVenda(v);
    }//GEN-LAST:event_btNovaVendaActionPerformed

    private void btCancelaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelaVendaActionPerformed
        cbProdutoVenda.setEnabled(false);
        btCancelaVenda.setEnabled(false);
        btNovaVenda.setEnabled(true); 
        txtQuantidadeVenda.setEnabled(false);
        btAdicionar.setEnabled(false);
     
            vdao.cancelarVenda(); // para atualizar tabela
      
    }//GEN-LAST:event_btCancelaVendaActionPerformed

    private void cbProdutoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProdutoVendaActionPerformed

    private void cbProdutoVendaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProdutoVendaItemStateChanged
        Produto p = (Produto) cbProdutoVenda.getSelectedItem();
        lbQuantidade.setText(p.getQuant_prod());       
    }//GEN-LAST:event_cbProdutoVendaItemStateChanged

    private void txtQuantidadeVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeVendaFocusGained
      btAdicionar.setEnabled(true);
    }//GEN-LAST:event_txtQuantidadeVendaFocusGained

    private void btFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarVendaActionPerformed
        v.setValorTotal(valor);
        vdao.finalizarVenda(v);
        cbProdutoVenda.setEnabled(false);
        btCancelaVenda.setEnabled(false);
        btNovaVenda.setEnabled(true); 
        txtQuantidadeVenda.setEnabled(false);
        btAdicionar.setEnabled(false);
        btFinalizarVenda.setEnabled(false);
       
    }//GEN-LAST:event_btFinalizarVendaActionPerformed
    
      public void preencherTabela(String sql) {
        List<Itens_venda> lista = vdao.listarTodos(sql);
        DefaultTableModel tabela = (DefaultTableModel) Tabela_vendaProduto.getModel();
        tabela.setRowCount(0);
        for (Itens_venda v : lista) {
            
            tabela.addRow(new Object[]{v.getProduto().getId_produto(),v.getProduto().getDescricao_prod(),v.getProduto().getMarca_prod(),v.getQuant_itenv(),v.getProduto().getValor_prod(),v.getValor_itenv()});
           valor = valor + (float) v.getValor_itenv();
        }
    }
 
    public void preencherCBFuncionario(){
        List<Funcionario> lista = fdao.listarTodos(sql);
        for (Funcionario f : lista){
            cbFuncionarioVenda.addItem(f);
        }
    }
    
    public void preencherCBCliente(){
        List<Cliente> lista = cdao.listarTodos(sql);
        for (Cliente c : lista){
            cbClienteVenda.addItem(c);
        }
    }
    
      public void preencherCBProduto(){
        List<Produto> lista = pdao.listarTodos(sql);
        for (Produto p : lista){
            cbProdutoVenda.addItem(p);
        }
    }
      
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
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela_vendaProduto;
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btCancelaVenda;
    private javax.swing.JButton btFinalizarVenda;
    private javax.swing.JButton btNovaVenda;
    private javax.swing.JComboBox cbClienteVenda;
    private javax.swing.JComboBox cbFuncionarioVenda;
    private javax.swing.JComboBox cbProdutoVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlVTotal;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JTextField txtQuantidadeVenda;
    // End of variables declaration//GEN-END:variables
}
