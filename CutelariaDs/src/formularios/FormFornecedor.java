
package formularios;

import dao.FornecedorDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import regrasDeNegocios.Fornecedor;

public class FormFornecedor extends javax.swing.JDialog {
    FornecedorDao fnDao = new FornecedorDao();
    Fornecedor f = new Fornecedor();
    String sql = "null";
    /**
     * Creates new form FormFornecedor
     */
    public FormFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela(sql);
         

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        paineGeralFornecedor = new javax.swing.JTabbedPane();
        painelListar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        painelCadastrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeForn = new javax.swing.JTextField();
        txtEnderecoForn = new javax.swing.JTextField();
        txtIdForn = new javax.swing.JTextField();
        lbCadastrar = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btAtalizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtTelefoneForn = new javax.swing.JFormattedTextField();
        txtCnpjForn = new javax.swing.JFormattedTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        paineGeralFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        painelListar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        painelListar.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\facat.png")); // NOI18N
        jLabel4.setText("jLabel4");
        painelListar.add(jLabel4);
        jLabel4.setBounds(0, 20, 630, 420);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nome:");
        painelListar.add(jLabel8);
        jLabel8.setBounds(10, 40, 38, 15);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CNPJ", "Telefone", "Endereço"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        painelListar.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 452, 402);

        jButton1.setText("jButton1");
        painelListar.add(jButton1);
        jButton1.setBounds(440, 190, 73, 23);

        jCheckBox1.setText("jCheckBox1");
        painelListar.add(jCheckBox1);
        jCheckBox1.setBounds(410, 230, 81, 23);

        paineGeralFornecedor.addTab("Lista De Fornecedores", painelListar);

        painelCadastrar.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");
        painelCadastrar.add(jLabel1);
        jLabel1.setBounds(30, 85, 38, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("CNPJ:");
        painelCadastrar.add(jLabel2);
        jLabel2.setBounds(30, 135, 40, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Telefone:");
        painelCadastrar.add(jLabel3);
        jLabel3.setBounds(270, 140, 56, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Endereço:");
        painelCadastrar.add(jLabel5);
        jLabel5.setBounds(10, 170, 60, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("ID:");
        painelCadastrar.add(jLabel7);
        jLabel7.setBounds(40, 50, 18, 20);
        painelCadastrar.add(txtNomeForn);
        txtNomeForn.setBounds(80, 90, 400, 25);
        painelCadastrar.add(txtEnderecoForn);
        txtEnderecoForn.setBounds(80, 170, 400, 30);

        txtIdForn.setEditable(false);
        painelCadastrar.add(txtIdForn);
        txtIdForn.setBounds(80, 50, 100, 25);

        lbCadastrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbCadastrar.setText("Cadastrar Fornecedor");
        painelCadastrar.add(lbCadastrar);
        lbCadastrar.setBounds(150, 10, 270, 29);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        painelCadastrar.add(btSalvar);
        btSalvar.setBounds(90, 350, 100, 40);

        btAtalizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAtalizar.setText("Atalizar");
        btAtalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtalizarActionPerformed(evt);
            }
        });
        painelCadastrar.add(btAtalizar);
        btAtalizar.setBounds(230, 350, 100, 40);

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        painelCadastrar.add(btCancelar);
        btCancelar.setBounds(370, 350, 100, 40);

        try {
            txtTelefoneForn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        painelCadastrar.add(txtTelefoneForn);
        txtTelefoneForn.setBounds(340, 130, 130, 30);

        try {
            txtCnpjForn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        painelCadastrar.add(txtCnpjForn);
        txtCnpjForn.setBounds(80, 130, 130, 30);

        paineGeralFornecedor.addTab("Cadastrar", painelCadastrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineGeralFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(paineGeralFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
        f.setNome_for(txtNomeForn.getText());
        f.setCnpj_for(txtCnpjForn.getText());
        f.setTelefone_for(txtTelefoneForn.getText());
        f.setEndereco_for(txtEnderecoForn.getText());
        fnDao.cadastrar(f);
        preencherTabela(sql);
        btCancelarActionPerformed(evt);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
       txtIdForn.setText(null);
       txtNomeForn.setText(null);
       txtCnpjForn.setText(null);
       txtTelefoneForn.setText(null);
       txtEnderecoForn.setText(null);
       paineGeralFornecedor.setSelectedIndex(0);
    
       btSalvar.setVisible(true);
       btAtalizar.setVisible(false);
       
    
       
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAtalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtalizarActionPerformed
        
        f.setId_fornecedor(Integer.parseInt(txtIdForn.getText()));
        f.setNome_for(txtNomeForn.getText());
        f.setCnpj_for(txtCnpjForn.getText());
        f.setTelefone_for(txtTelefoneForn.getText());
        f.setEndereco_for(txtEnderecoForn.getText());
        
        fnDao.atualiza(f);
        preencherTabela(sql);
        paineGeralFornecedor.setSelectedIndex(0);
        
    }//GEN-LAST:event_btAtalizarActionPerformed

   public void preencherTabela(String sql){
       
       List<Fornecedor> lista = fnDao.listarTodos(sql);
       DefaultTableModel modeloTabela = (DefaultTableModel)tabela.getModel();
       modeloTabela.setRowCount(0);
       for(Fornecedor f : lista){
           modeloTabela.addRow(new Object[]{f.getId_fornecedor(), f.getNome_for(), f.getCnpj_for(), f.getTelefone_for(), f.getEndereco_for()});
       }
       
   }
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormFornecedor dialog = new FormFornecedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAtalizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCadastrar;
    private javax.swing.JTabbedPane paineGeralFornecedor;
    private javax.swing.JPanel painelCadastrar;
    private javax.swing.JPanel painelListar;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField txtCnpjForn;
    private javax.swing.JTextField txtEnderecoForn;
    private javax.swing.JTextField txtIdForn;
    private javax.swing.JTextField txtNomeForn;
    private javax.swing.JFormattedTextField txtTelefoneForn;
    // End of variables declaration//GEN-END:variables
}
