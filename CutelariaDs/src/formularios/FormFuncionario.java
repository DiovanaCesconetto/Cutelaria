
package formularios;

import dao.FuncionarioDao;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import regrasDeNegocios.Funcionario;



public class FormFuncionario extends javax.swing.JFrame {
    boolean flag = false;
    FuncionarioDao fcdao= new FuncionarioDao();
    Funcionario fc = new Funcionario();
    String sql = "null";
    public FormFuncionario() {
        initComponents();
        preencherTabela(sql);
        this.setIconImage(new ImageIcon("logo-ifro.png").getImage());
     
    }

    FormFuncionario(FormMenu aThis, boolean rootPaneCheckingEnabled) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGeralFuncionario = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtIdFunc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRgFunc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEstadoCivilFunc = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNomeFunc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbSexoFunc = new javax.swing.JComboBox<>();
        btSalvar = new javax.swing.JButton();
        brAtualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtFuncaoFunc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSenhafunc = new javax.swing.JPasswordField();
        txtConfirmSenhafunc = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        txtCpfFunc = new javax.swing.JFormattedTextField();
        txtFoneFunc = new javax.swing.JFormattedTextField();
        txtDataNascFunc = new javax.swing.JFormattedTextField();
        txtEnderecoFunc = new javax.swing.JTextField();
        txtSalarioFunc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtPesquisaFunc = new javax.swing.JTextField();
        btNovoCli = new javax.swing.JButton();
        btEditarFunc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Funcionario = new javax.swing.JTable();
        btPesquisarFunc = new javax.swing.JButton();
        btExcluirFunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ID:");

        txtIdFunc.setEditable(false);
        txtIdFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFuncActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("RG:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("FONE:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Endereço");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nascimento");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("SEXO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("estado civil");

        cbSexoFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        cbSexoFunc.setSelectedIndex(-1);

        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        brAtualizar.setText("Atualizar");
        brAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brAtualizarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Função");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Salario");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Senha");

        txtSenhafunc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhafuncFocusGained(evt);
            }
        });
        txtSenhafunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhafuncActionPerformed(evt);
            }
        });

        txtConfirmSenhafunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmSenhafuncKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("confirmar senha");

        try {
            txtCpfFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFoneFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataNascFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addComponent(brAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11))
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtDataNascFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtRgFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSenhafunc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtConfirmSenhafunc))
                                    .addComponent(txtEnderecoFunc)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel10))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFoneFunc)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstadoCivilFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cbSexoFunc, 0, 163, Short.MAX_VALUE)
                                            .addComponent(txtCpfFunc)
                                            .addComponent(txtNomeFunc, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSalarioFunc))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFuncaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel8)
                    .addContainerGap(506, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRgFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstadoCivilFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFoneFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbSexoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtFuncaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtSalarioFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEnderecoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSenhafunc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmSenhafunc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8)
                    .addContainerGap(454, Short.MAX_VALUE)))
        );

        painelGeralFuncionario.addTab("Cadastrar", jPanel1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Pesquisa por nome:");

        btNovoCli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNovoCli.setText("Novo");
        btNovoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoCliActionPerformed(evt);
            }
        });

        btEditarFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEditarFunc.setText("Editar");
        btEditarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarFuncActionPerformed(evt);
            }
        });

        tabela_Funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "RG", "estado civil", "Sexo", "Data Nas", "salario", "Telefone", "função", "endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_Funcionario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tabela_Funcionario);

        btPesquisarFunc.setText("ok");
        btPesquisarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarFuncActionPerformed(evt);
            }
        });

        btExcluirFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btExcluirFunc.setText("Excluir");
        btExcluirFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btNovoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEditarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btExcluirFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisarFunc))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisarFunc))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditarFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btNovoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );

        painelGeralFuncionario.addTab("Listar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGeralFuncionario)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelGeralFuncionario)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
         
        if(flag == true){
        fc.setNome_func(txtNomeFunc.getText());
        fc.setCpf_func(txtCpfFunc.getText());
        fc.setRg_func(txtRgFunc.getText());
        fc.setEstadoCivil_func(txtEstadoCivilFunc.getText());
        fc.setSexo_func(cbSexoFunc.getSelectedItem().toString());
        fc.setDataNascimento_func(txtDataNascFunc.getText());
        fc.setSalario_func(txtSalarioFunc.getText());
        fc.setTelefone_func(txtFoneFunc.getText());
        fc.setFuncao_func(txtFuncaoFunc.getText());
        fc.setEndereco_func(txtEnderecoFunc.getText());
        fc.setSenha_func(String.valueOf(txtSenhafunc.getPassword()));

        fcdao.inserir(fc);
        preencherTabela(sql);
        btCancelarActionPerformed(evt);
        painelGeralFuncionario.setSelectedIndex(1); 
        }else{
        JOptionPane.showMessageDialog(this, "senhas nao sao iguais");
        }
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void brAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brAtualizarActionPerformed
        fc.setId_funcionario(Integer.parseInt(txtIdFunc.getText()));    
        fc.setNome_func(txtNomeFunc.getText());
        fc.setCpf_func(txtCpfFunc.getText());
        fc.setRg_func(txtRgFunc.getText());
        fc.setEstadoCivil_func(txtEstadoCivilFunc.getText());
        fc.setSexo_func(cbSexoFunc.getSelectedItem().toString());
        fc.setDataNascimento_func(txtDataNascFunc.getText());
        fc.setSalario_func(txtSalarioFunc.getText());
        fc.setTelefone_func(txtFoneFunc.getText());
        fc.setFuncao_func(txtFuncaoFunc.getText());
        fc.setEndereco_func(txtEnderecoFunc.getText());
        fcdao.atualizar(fc);
        preencherTabela(sql);
        painelGeralFuncionario.setSelectedIndex(1);
      
        btSalvar.setEnabled(true);
    }//GEN-LAST:event_brAtualizarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        txtIdFunc.setText(null);
        txtNomeFunc.setText(null);
        txtCpfFunc.setText(null);
        txtRgFunc.setText(null);
        txtEstadoCivilFunc.setText(null);
        txtDataNascFunc.setText(null);
        txtSalarioFunc.setText(null);
        txtFoneFunc.setText(null);
        txtFuncaoFunc.setText(null);
        txtEstadoCivilFunc.setText(null);
        txtEnderecoFunc.setText(null);
        txtSenhafunc.setText(null);
        txtConfirmSenhafunc.setText(null);
        cbSexoFunc.setSelectedIndex(-1);

    
        painelGeralFuncionario.setSelectedIndex(0);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void txtConfirmSenhafuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmSenhafuncKeyReleased
      
        
        if (String.valueOf(txtSenhafunc.getPassword()).equals(String.valueOf(txtConfirmSenhafunc.getPassword()))){
           lbSenha.setText("senhas sao iguais");
           flag =  true;
       }
        else{
            lbSenha.setText("senhas digitadas sao diferentes");
            flag =  false;
        } 
           
    }//GEN-LAST:event_txtConfirmSenhafuncKeyReleased

    private void txtSenhafuncFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhafuncFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhafuncFocusGained

    private void btNovoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoCliActionPerformed
        btCancelarActionPerformed(evt);
        painelGeralFuncionario.setSelectedIndex(0);
    }//GEN-LAST:event_btNovoCliActionPerformed

    private void btEditarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarFuncActionPerformed

        int opcao = tabela_Funcionario.getSelectedRow();
        if (opcao >= 0) {
            txtIdFunc.setText(tabela_Funcionario.getValueAt(opcao, 0).toString());
            txtNomeFunc.setText(tabela_Funcionario.getValueAt(opcao, 1).toString());
            txtCpfFunc.setText(tabela_Funcionario.getValueAt(opcao, 2).toString());
            txtRgFunc.setText(tabela_Funcionario.getValueAt(opcao, 3).toString());
            txtEstadoCivilFunc.setText(tabela_Funcionario.getValueAt(opcao, 4).toString());
            cbSexoFunc.setSelectedItem(tabela_Funcionario.getValueAt(opcao, 5));
            txtDataNascFunc.setText(tabela_Funcionario.getValueAt(opcao, 6).toString());
            txtSalarioFunc.setText(tabela_Funcionario.getValueAt(opcao, 7).toString());
            txtFoneFunc.setText(tabela_Funcionario.getValueAt(opcao, 8).toString()); 
            txtFuncaoFunc.setText(tabela_Funcionario.getValueAt(opcao, 9).toString());
            txtEnderecoFunc.setText(tabela_Funcionario.getValueAt(opcao, 10).toString());
            
        
            painelGeralFuncionario.setSelectedIndex(0);

        } else {
            JOptionPane.showMessageDialog(null, "selecione uma linha");
        }
    }//GEN-LAST:event_btEditarFuncActionPerformed

    private void btPesquisarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarFuncActionPerformed
        preencherTabela("SELECT * FROM Funcionario where nome_func like '%"+txtPesquisaFunc.getText()+"%'");
    }//GEN-LAST:event_btPesquisarFuncActionPerformed

    private void btExcluirFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirFuncActionPerformed

        int opcao = tabela_Funcionario.getSelectedRow();
        if (opcao >= 0) {
            
            fc.setId_funcionario(Integer.parseInt(tabela_Funcionario.getValueAt(opcao, 0).toString()));
            fc.setNome_func(tabela_Funcionario.getValueAt(opcao, 1).toString());
            fc.setCpf_func(tabela_Funcionario.getValueAt(opcao, 2).toString());  
            fcdao.deleter(fc);
            preencherTabela(sql);

        } else {
            JOptionPane.showMessageDialog(null, "selecione uma linha");
        }
    }//GEN-LAST:event_btExcluirFuncActionPerformed

    private void txtSenhafuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhafuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhafuncActionPerformed

    private void txtIdFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFuncActionPerformed
 public void preencherTabela(String sql) {
        List<Funcionario> lista = fcdao.listarTodos(sql);
        DefaultTableModel tabela = (DefaultTableModel) tabela_Funcionario.getModel();
        tabela.setRowCount(0);
        for (Funcionario f : lista) {
            tabela.addRow(new Object[]{f.getId_funcionario(), f.getNome_func(), f.getCpf_func(),f.getRg_func(),f.getEstadoCivil_func(),f.getSexo_func(), f.getDataNascimento_func(),f.getSalario_func(),  f.getTelefone_func(),f.getFuncao_func() ,f.getEndereco_func()});
        }
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditarFunc;
    private javax.swing.JButton btExcluirFunc;
    private javax.swing.JButton btNovoCli;
    private javax.swing.JButton btPesquisarFunc;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbSexoFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JTabbedPane painelGeralFuncionario;
    private javax.swing.JTable tabela_Funcionario;
    private javax.swing.JPasswordField txtConfirmSenhafunc;
    private javax.swing.JFormattedTextField txtCpfFunc;
    private javax.swing.JFormattedTextField txtDataNascFunc;
    private javax.swing.JTextField txtEnderecoFunc;
    private javax.swing.JFormattedTextField txtEstadoCivilFunc;
    private javax.swing.JFormattedTextField txtFoneFunc;
    private javax.swing.JTextField txtFuncaoFunc;
    private javax.swing.JTextField txtIdFunc;
    private javax.swing.JTextField txtNomeFunc;
    private javax.swing.JTextField txtPesquisaFunc;
    private javax.swing.JTextField txtRgFunc;
    private javax.swing.JTextField txtSalarioFunc;
    private javax.swing.JPasswordField txtSenhafunc;
    // End of variables declaration//GEN-END:variables
}
