/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.ClienteDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import regrasDeNegocios.Cliente;

/**
 *
 
 */
public class FormCliente extends javax.swing.JFrame {
    
    ClienteDao cldao= new ClienteDao();
    Cliente cl = new Cliente();
    String sql = "null";
    public FormCliente() {
        initComponents();
        
        preencherTabela(sql);
        btCancelar.setEnabled(true);
        
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbSexoCli = new javax.swing.JComboBox<>();
        btSalvar = new javax.swing.JButton();
        brAtualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtIdCli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRgCli = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEstadoCivilCli = new javax.swing.JFormattedTextField();
        txtEndereçoCli = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCPFCLi = new javax.swing.JFormattedTextField();
        txtDataNascCli = new javax.swing.JFormattedTextField();
        txtFoneCli = new javax.swing.JFormattedTextField();
        jLabel1Fundo = new javax.swing.JLabel();
        paineListar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Cliente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtPesquisaCli = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btPesquisarCli = new javax.swing.JButton();
        jLabel1Fundo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 204));

        painelCadastro.setBackground(java.awt.Color.pink);
        painelCadastro.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        painelCadastro.add(jLabel1);
        jLabel1.setBounds(20, 77, 46, 30);
        painelCadastro.add(txtNomeCli);
        txtNomeCli.setBounds(90, 80, 480, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");
        painelCadastro.add(jLabel2);
        jLabel2.setBounds(30, 127, 32, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado civil:");
        painelCadastro.add(jLabel4);
        jLabel4.setBounds(300, 190, 81, 17);

        cbSexoCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        cbSexoCli.setSelectedIndex(-1);
        cbSexoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoCliActionPerformed(evt);
            }
        });
        painelCadastro.add(cbSexoCli);
        cbSexoCli.setBounds(90, 240, 163, 30);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        painelCadastro.add(btSalvar);
        btSalvar.setBounds(10, 340, 111, 49);

        brAtualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        brAtualizar.setText("Atualizar");
        brAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brAtualizarActionPerformed(evt);
            }
        });
        painelCadastro.add(brAtualizar);
        brAtualizar.setBounds(230, 340, 111, 49);

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        painelCadastro.add(btCancelar);
        btCancelar.setBounds(460, 340, 111, 49);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID:");
        painelCadastro.add(jLabel8);
        jLabel8.setBounds(30, 27, 22, 30);

        txtIdCli.setEditable(false);
        painelCadastro.add(txtIdCli);
        txtIdCli.setBounds(90, 30, 143, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RG:");
        painelCadastro.add(jLabel9);
        jLabel9.setBounds(350, 130, 25, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FONE:");
        painelCadastro.add(jLabel10);
        jLabel10.setBounds(20, 177, 44, 30);
        painelCadastro.add(txtRgCli);
        txtRgCli.setBounds(390, 130, 180, 33);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Endereço:");
        painelCadastro.add(jLabel11);
        jLabel11.setBounds(10, 293, 70, 17);
        painelCadastro.add(txtEstadoCivilCli);
        txtEstadoCivilCli.setBounds(390, 180, 180, 33);

        txtEndereçoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndereçoCliActionPerformed(evt);
            }
        });
        painelCadastro.add(txtEndereçoCli);
        txtEndereçoCli.setBounds(90, 289, 480, 33);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SEXO:");
        painelCadastro.add(jLabel14);
        jLabel14.setBounds(20, 237, 44, 30);
        painelCadastro.add(jLabel3);
        jLabel3.setBounds(338, 168, 0, 0);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nascimento:");
        painelCadastro.add(jLabel6);
        jLabel6.setBounds(290, 250, 86, 17);

        try {
            txtCPFCLi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        painelCadastro.add(txtCPFCLi);
        txtCPFCLi.setBounds(90, 130, 163, 29);

        try {
            txtDataNascCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        painelCadastro.add(txtDataNascCli);
        txtDataNascCli.setBounds(390, 240, 180, 33);

        try {
            txtFoneCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        painelCadastro.add(txtFoneCli);
        txtFoneCli.setBounds(90, 180, 163, 33);

        jLabel1Fundo.setBackground(new java.awt.Color(117, 64, 15));
        jLabel1Fundo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\facat.png")); // NOI18N
        jLabel1Fundo.setText("CAIXAAA");
        painelCadastro.add(jLabel1Fundo);
        jLabel1Fundo.setBounds(0, 0, 630, 480);

        jTabbedPane1.addTab("Cadastro", painelCadastro);

        paineListar.setLayout(null);

        tabela_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "RG", "estado civil", "Sexo", "Data Nas", "Telefone", "endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_Cliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tabela_Cliente);

        paineListar.add(jScrollPane1);
        jScrollPane1.setBounds(10, 82, 508, 220);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Pesquisa por nome:");
        paineListar.add(jLabel7);
        jLabel7.setBounds(10, 28, 120, 36);
        paineListar.add(txtPesquisaCli);
        txtPesquisaCli.setBounds(135, 33, 334, 28);

        btNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        paineListar.add(btNovo);
        btNovo.setBounds(10, 309, 85, 40);

        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        paineListar.add(btExcluir);
        btExcluir.setBounds(420, 310, 99, 40);

        btEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        paineListar.add(btEditar);
        btEditar.setBounds(219, 308, 113, 43);

        btPesquisarCli.setText("ok");
        btPesquisarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarCliActionPerformed(evt);
            }
        });
        paineListar.add(btPesquisarCli);
        btPesquisarCli.setBounds(475, 36, 43, 23);

        jLabel1Fundo1.setBackground(new java.awt.Color(117, 64, 15));
        jLabel1Fundo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Fundo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\facat.png")); // NOI18N
        jLabel1Fundo1.setText("CAIXAAA");
        paineListar.add(jLabel1Fundo1);
        jLabel1Fundo1.setBounds(0, 0, 630, 480);

        jTabbedPane1.addTab("Listar", paineListar);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 650, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEndereçoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndereçoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndereçoCliActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        txtIdCli.setText(null);
        txtNomeCli.setText(null);
        txtCPFCLi.setText(null);
        txtRgCli.setText(null);
        txtEstadoCivilCli.setText(null);
        txtDataNascCli.setText(null);
        txtFoneCli.setText(null);
        txtEstadoCivilCli.setText(null);
        txtEndereçoCli.setText(null);

        cbSexoCli.setSelectedIndex(-1);

        btCancelar.setVisible(false );
        btSalvar.setVisible(true);
        paineGeralCliente.setSelectedIndex(0);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void brAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brAtualizarActionPerformed

        cl.setId_cliente(Integer.parseInt(txtIdCli.getText()));
        cl.setNome_cli(txtNomeCli.getText());
        cl.setCpf_cli(txtCPFCLi.getText());
        cl.setRg_cli(txtRgCli.getText());
        cl.setEstadoCivil(txtEstadoCivilCli.getText());
        cl.setSexo_cli(cbSexoCli.getSelectedItem().toString());
        cl.setDataNasc_cli(txtDataNascCli.getText());

        cl.setTelefone_cli(txtFoneCli.getText());
        cl.setEndereco_cli(txtEndereçoCli.getText());
        cldao.atualiza(cl);

        preencherTabela(sql);
        paineGeralCliente.setSelectedIndex(0);
        brAtualizar.setEnabled(false);
        btSalvar.setEnabled(false);
    }//GEN-LAST:event_brAtualizarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        cl.setNome_cli(txtNomeCli.getText());
        cl.setCpf_cli(txtCPFCLi.getText());
        cl.setRg_cli(txtRgCli.getText());
        cl.setEstadoCivil(txtEstadoCivilCli.getText());
        cl.setSexo_cli(cbSexoCli.getSelectedItem().toString());
        cl.setDataNasc_cli(txtDataNascCli.getText());
        cl.setTelefone_cli(txtFoneCli.getText());
        cl.setEndereco_cli(txtEndereçoCli.getText());

        cldao.inserir(cl);
        preencherTabela(sql);
        btCancelarActionPerformed(evt);
        paineGeralCliente.setSelectedIndex(1);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void cbSexoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoCliActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        btCancelarActionPerformed(evt);
        paineGeralCliente.setSelectedIndex(0);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        int opcao = tabela_Cliente.getSelectedRow();
        if (opcao >= 0) {

            cl.setId_cliente(Integer.parseInt(tabela_Cliente.getValueAt(opcao, 0).toString()));
            cl.setNome_cli(tabela_Cliente.getValueAt(opcao, 1).toString());
            cl.setCpf_cli(tabela_Cliente.getValueAt(opcao, 2).toString());

            cldao.deleter(cl);
            preencherTabela(sql);

        } else {
            JOptionPane.showMessageDialog(null, "selecione uma linha");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        int opcao = tabela_Cliente.getSelectedRow();
        if (opcao >= 0) {
            txtIdCli.setText(tabela_Cliente.getValueAt(opcao, 0).toString());
            txtNomeCli.setText(tabela_Cliente.getValueAt(opcao, 1).toString());
            txtCPFCLi.setText(tabela_Cliente.getValueAt(opcao, 2).toString());
            txtRgCli.setText(tabela_Cliente.getValueAt(opcao, 3).toString());
            txtEstadoCivilCli.setText(tabela_Cliente.getValueAt(opcao, 4).toString());
            cbSexoCli.setSelectedItem(tabela_Cliente.getValueAt(opcao, 5));
            txtDataNascCli.setText(tabela_Cliente.getValueAt(opcao, 6).toString());
            txtFoneCli.setText(tabela_Cliente.getValueAt(opcao, 7).toString());
            txtEndereçoCli.setText(tabela_Cliente.getValueAt(opcao, 8).toString());

            btCancelar.setEnabled(true);
            btSalvar.setEnabled(false);
            paineGeralCliente.setSelectedIndex(0);

        } else {
            JOptionPane.showMessageDialog(null, "selecione uma linha");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btPesquisarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarCliActionPerformed
        preencherTabela("SELECT * FROM cliente where nome_cli like '%"+txtPesquisaCli.getText()+"%'");
    }//GEN-LAST:event_btPesquisarCliActionPerformed

    public void preencherTabela(String sql) {
        List<Cliente> lista = cldao.listarTodos(sql);
        DefaultTableModel tabela = (DefaultTableModel) tabela_Cliente.getModel();
        tabela.setRowCount(0);
        for (Cliente c : lista) {
            tabela.addRow(new Object[]{c.getId_cliente(), c.getNome_cli(), c.getCpf_cli(),c.getRg_cli(),c.getEstadoCivil(),c.getSexo_cli(), c.getDataNasc_cli(),  c.getTelefone_cli(), c.getEndereco_cli()});

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
            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisarCli;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbSexoCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel1Fundo;
    private javax.swing.JLabel jLabel1Fundo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel paineListar;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JTable tabela_Cliente;
    private javax.swing.JFormattedTextField txtCPFCLi;
    private javax.swing.JFormattedTextField txtDataNascCli;
    private javax.swing.JTextField txtEndereçoCli;
    private javax.swing.JFormattedTextField txtEstadoCivilCli;
    private javax.swing.JFormattedTextField txtFoneCli;
    private javax.swing.JTextField txtIdCli;
    private javax.swing.JTextField txtNomeCli;
    private javax.swing.JTextField txtPesquisaCli;
    private javax.swing.JTextField txtRgCli;
    // End of variables declaration//GEN-END:variables
}
