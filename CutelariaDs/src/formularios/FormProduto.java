/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.FornecedorDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import dao.ProdutoDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import regrasDeNegocios.Fornecedor;
import regrasDeNegocios.Produto;


/**
 *
 * @author Igreja Ass Deus
 */
public class FormProduto extends javax.swing.JFrame {
    String sql = "null";
    ProdutoDao prdao= new ProdutoDao();
    Produto p = new Produto();
        public FormProduto() {
        initComponents();
        preencherTabela(sql);
        preencherCbFornecedor();
        jb_atualizar.setVisible(false); 
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDescriçãoProd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jb_Salvar = new javax.swing.JButton();
        jb_atualizar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtIdProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValorProd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtQuantidadeProd = new javax.swing.JTextField();
        txtMarcaProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbFornecedor = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Produto = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jb_novo = new javax.swing.JButton();
        jB_editar = new javax.swing.JButton();
        jB_excluir = new javax.swing.JButton();
        txtPesquisaCli = new javax.swing.JTextField();
        btPesquisarCli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel2.setLayout(null);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 206, 0, 0);
        jPanel2.add(txtDescriçãoProd);
        txtDescriçãoProd.setBounds(140, 80, 370, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Modelo:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 130, 55, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("QUANTIDADE:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 170, 102, 17);

        jb_Salvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_Salvar.setText("SALVAR");
        jb_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SalvarActionPerformed(evt);
            }
        });
        jPanel2.add(jb_Salvar);
        jb_Salvar.setBounds(70, 350, 98, 43);

        jb_atualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_atualizar.setText("ATUALIZAR");
        jb_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_atualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jb_atualizar);
        jb_atualizar.setBounds(240, 350, 115, 39);

        jb_cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_cancelar.setText("CANCELAR");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jb_cancelar);
        jb_cancelar.setBounds(420, 350, 130, 43);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 40, 38, 31);

        txtIdProd.setEditable(false);
        txtIdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdActionPerformed(evt);
            }
        });
        jPanel2.add(txtIdProd);
        txtIdProd.setBounds(140, 40, 150, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Fornecedor");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 237, 100, 30);
        jPanel2.add(txtValorProd);
        txtValorProd.setBounds(140, 200, 110, 28);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nome:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 90, 46, 17);
        jPanel2.add(txtQuantidadeProd);
        txtQuantidadeProd.setBounds(140, 160, 200, 30);

        txtMarcaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaProdActionPerformed(evt);
            }
        });
        jPanel2.add(txtMarcaProd);
        txtMarcaProd.setBounds(140, 120, 190, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CADASTRAR PRODUTO");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(190, 10, 170, 17);

        jPanel2.add(cbFornecedor);
        cbFornecedor.setBounds(140, 240, 230, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Valor:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 210, 41, 17);

        jTabbedPane1.addTab("Cadastro", jPanel2);

        tabela_Produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "descriçao ", "marca", "quantidade", "valor", "Fornecedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_Produto);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Pesquisar POR NOME:");

        jb_novo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_novo.setText("NOVO");
        jb_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novoActionPerformed(evt);
            }
        });

        jB_editar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jB_editar.setText("EDITAR");
        jB_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_editarActionPerformed(evt);
            }
        });

        jB_excluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jB_excluir.setText("EXCLUIR");
        jB_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_excluirActionPerformed(evt);
            }
        });

        txtPesquisaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaCliActionPerformed(evt);
            }
        });

        btPesquisarCli.setText("ok");
        btPesquisarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jb_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jB_excluir)
                        .addGap(79, 79, 79)
                        .addComponent(jB_editar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(btPesquisarCli))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPesquisaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisarCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("Listar", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novoActionPerformed
        // TODO add your handling code here:
        txtIdProd.setText(null);
        txtDescriçãoProd.setText(null);
        txtMarcaProd.setText(null);
        txtQuantidadeProd.setText(null);
        txtValorProd.setText(null);
        jb_atualizar.setVisible(false);
        jb_Salvar.setVisible(true);
        jTabbedPane1.setSelectedIndex(0);//volta pra primenira tela
    }//GEN-LAST:event_jb_novoActionPerformed

    private void jB_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_editarActionPerformed
        // TODO add your handling code here:
        int opcao = tabela_Produto.getSelectedRow(); //Pega a lh selecionada que esta na tabela
        if(opcao>=0){
            txtIdProd.setText(tabela_Produto.getValueAt(opcao,0).toString());
            txtDescriçãoProd.setText(tabela_Produto.getValueAt(opcao, 1).toString()); // atribuindo um valor aos campos
            txtMarcaProd.setText(tabela_Produto.getValueAt(opcao, 2).toString());
            txtQuantidadeProd.setText(tabela_Produto.getValueAt(opcao, 3).toString());
            txtValorProd.setText(tabela_Produto.getValueAt(opcao, 4).toString());
            cbFornecedor.setSelectedItem(tabela_Produto.getValueAt(opcao, 5).toString());
            
            jb_atualizar.setVisible(true);
            jb_Salvar.setVisible(false);
            jTabbedPane1.setSelectedIndex(0);


        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }

    }//GEN-LAST:event_jB_editarActionPerformed

    private void jB_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_excluirActionPerformed
        // TODO add your handling code here:
        int opcao = tabela_Produto.getSelectedRow(); //Pega a lh selecionada que esta na tabela
        if(opcao>=0){
            Produto p = new Produto();
            p.setId_produto(Integer.parseInt(tabela_Produto.getValueAt(opcao,0).toString()));
            p.setDescricao_prod(tabela_Produto.getValueAt(opcao, 1).toString());
          
            prdao.deletar(p);
            preencherTabela(sql); // para atualizar tabela
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha");

}


    }//GEN-LAST:event_jB_excluirActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        // TODO add your handling code here:
        txtIdProd.setText(null);
        txtDescriçãoProd.setText(null);
        txtQuantidadeProd.setText(null);
        txtMarcaProd.setText(null);
        txtValorProd.setText(null);

        jb_atualizar.setVisible(false);
        jb_Salvar.setVisible(true);


    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_atualizarActionPerformed
        // TODO add your handling code here:
        Produto pr = new Produto();
        pr.setId_produto(Integer.parseInt(txtIdProd.getText()));
        pr.setDescricao_prod(txtDescriçãoProd.getText());     
        pr.setMarca_prod(txtMarcaProd.getText());
        pr.setQuant_prod(txtQuantidadeProd.getText());     
        pr.setValor_prod(Float.parseFloat (txtValorProd.getText()));
        Fornecedor f = (Fornecedor) cbFornecedor.getSelectedItem();
        pr.setFornecedor(f);
        prdao.atualizar(pr);

        preencherTabela(sql);
        jTabbedPane1.setSelectedIndex(1);
        jb_atualizar.setVisible(false);
        jb_Salvar.setVisible(true);
    }//GEN-LAST:event_jb_atualizarActionPerformed

    private void jb_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalvarActionPerformed
        // TODO add your handling code here:
        Produto pr = new Produto();

        pr.setDescricao_prod(txtDescriçãoProd.getText());
        pr.setQuant_prod(txtQuantidadeProd.getText());
        pr.setMarca_prod(txtMarcaProd.getText());
        pr.setQuant_prod(txtQuantidadeProd.getText());
        pr.setValor_prod(Float.parseFloat(txtValorProd.getText()));
        Fornecedor f = (Fornecedor) cbFornecedor.getSelectedItem();
        pr.setFornecedor(f);
        prdao.inserir(pr);
        preencherTabela(sql);
        jTabbedPane1.setSelectedIndex(1);

        // vai mostrar qual painel da guia que eu quero voltar.
    }//GEN-LAST:event_jb_SalvarActionPerformed

    private void txtMarcaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaProdActionPerformed

    private void txtIdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdActionPerformed

    private void btPesquisarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarCliActionPerformed
        preencherTabela("SELECT * FROM PRODUTO where nome_cli like '%"+txtPesquisaCli.getText()+"%'");
    }//GEN-LAST:event_btPesquisarCliActionPerformed

    private void txtPesquisaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaCliActionPerformed

    public void preencherTabela(String sql){
   
    List<Produto> lista= prdao.listarTodos(sql);
    DefaultTableModel tabela = (DefaultTableModel) tabela_Produto.getModel();
    tabela.setRowCount(0);
    for(Produto p: lista){
        tabela.addRow(new Object[]{p.getId_produto(), p.getDescricao_prod(), p.getMarca_prod(), p.getQuant_prod(), p.getValor_prod(),p.getFornecedor().getNome_for()});
    }
    
    }
      public void preencherCbFornecedor(){
        FornecedorDao edao = new FornecedorDao();
        List<Fornecedor> lista = edao.listarTodos(sql);
        for (Fornecedor e : lista){
            cbFornecedor.addItem(e);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisarCli;
    private javax.swing.JComboBox cbFornecedor;
    private javax.swing.JButton jB_editar;
    private javax.swing.JButton jB_excluir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_Salvar;
    private javax.swing.JButton jb_atualizar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_novo;
    private javax.swing.JTable tabela_Produto;
    private javax.swing.JTextField txtDescriçãoProd;
    private javax.swing.JTextField txtIdProd;
    private javax.swing.JTextField txtMarcaProd;
    private javax.swing.JTextField txtPesquisaCli;
    private javax.swing.JTextField txtQuantidadeProd;
    private javax.swing.JTextField txtValorProd;
    // End of variables declaration//GEN-END:variables
}
