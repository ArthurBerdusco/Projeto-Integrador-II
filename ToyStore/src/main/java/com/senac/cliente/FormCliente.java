package com.senac.cliente;

import com.senac.utils.CampoTextoPadrao;
import javax.swing.JOptionPane;

public class FormCliente extends javax.swing.JFrame {

    public FormCliente() {
        initComponents();
    }

    public FormCliente(Cliente cliente) {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cadastro = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        PainelIdentificacao = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rbtMasc = new javax.swing.JRadioButton();
        rbtFem = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCivil = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        PainelEndereco = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Cadastro.setBackground(new java.awt.Color(255, 255, 255));
        Cadastro.setPreferredSize(new java.awt.Dimension(862, 710));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        PainelIdentificacao.setBackground(new java.awt.Color(255, 255, 255));
        PainelIdentificacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificação", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nome Completo:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("E-Mail:");

        txtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Sexo:");

        rbtMasc.setBackground(new java.awt.Color(255, 255, 255));
        rbtMasc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtMasc.setText("MASCULINO");

        rbtFem.setBackground(new java.awt.Color(255, 255, 255));
        rbtFem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtFem.setText("FEMININO");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("CPF:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("ESTADO CÍVIL");

        txtCivil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCivil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        txtCivil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCivilFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCivilFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Data de Nascimento:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });

        javax.swing.GroupLayout PainelIdentificacaoLayout = new javax.swing.GroupLayout(PainelIdentificacao);
        PainelIdentificacao.setLayout(PainelIdentificacaoLayout);
        PainelIdentificacaoLayout.setHorizontalGroup(
            PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                        .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                                .addComponent(rbtMasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtFem)))
                        .addGap(166, 166, 166)
                        .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCivil)
                            .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelIdentificacaoLayout.createSequentialGroup()
                        .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
        );
        PainelIdentificacaoLayout.setVerticalGroup(
            PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtFem)
                            .addComponent(rbtMasc)
                            .addComponent(txtCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
        );

        PainelEndereco.setBackground(new java.awt.Color(255, 255, 255));
        PainelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Endereço:");

        txtRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        txtRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRuaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRuaFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Número:");

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        txtNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Complemento:");

        txtComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtComplemento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        txtComplemento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtComplementoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtComplementoFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Telefone:");

        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });

        javax.swing.GroupLayout PainelEnderecoLayout = new javax.swing.GroupLayout(PainelEndereco);
        PainelEndereco.setLayout(PainelEnderecoLayout);
        PainelEnderecoLayout.setHorizontalGroup(
            PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(28, 28, 28))
        );
        PainelEnderecoLayout.setVerticalGroup(
            PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CadastroLayout = new javax.swing.GroupLayout(Cadastro);
        Cadastro.setLayout(CadastroLayout);
        CadastroLayout.setHorizontalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PainelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PainelIdentificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        CadastroLayout.setVerticalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        CampoTextoPadrao.focar(txtCpf);
    }//GEN-LAST:event_txtCpfFocusGained

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        CampoTextoPadrao.desfocar(txtCpf);
    }//GEN-LAST:event_txtCpfFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        CampoTextoPadrao.focar(txtEmail);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        CampoTextoPadrao.desfocar(txtEmail);
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtCivilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCivilFocusGained
        CampoTextoPadrao.focar(txtCivil);
    }//GEN-LAST:event_txtCivilFocusGained

    private void txtCivilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCivilFocusLost
        CampoTextoPadrao.desfocar(txtCivil);
    }//GEN-LAST:event_txtCivilFocusLost

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        CampoTextoPadrao.focar(txtNome);
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        CampoTextoPadrao.desfocar(txtNome);
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtRuaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRuaFocusGained
        CampoTextoPadrao.focar(txtRua);
    }//GEN-LAST:event_txtRuaFocusGained

    private void txtRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRuaFocusLost
       CampoTextoPadrao.desfocar(txtRua);
    }//GEN-LAST:event_txtRuaFocusLost

    private void txtNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusGained
        CampoTextoPadrao.focar(txtNumero);
    }//GEN-LAST:event_txtNumeroFocusGained

    private void txtNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusLost
        CampoTextoPadrao.desfocar(txtNumero);
    }//GEN-LAST:event_txtNumeroFocusLost

    private void txtComplementoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtComplementoFocusGained
        CampoTextoPadrao.focar(txtComplemento);
    }//GEN-LAST:event_txtComplementoFocusGained

    private void txtComplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtComplementoFocusLost
        CampoTextoPadrao.desfocar(txtComplemento);
    }//GEN-LAST:event_txtComplementoFocusLost

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
        CampoTextoPadrao.focar(txtTelefone);
    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        CampoTextoPadrao.desfocar(txtTelefone);
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        JOptionPane.showMessageDialog(this, "Função em produção");
    }//GEN-LAST:event_btnSalvarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cadastro;
    private javax.swing.JPanel PainelEndereco;
    private javax.swing.JPanel PainelIdentificacao;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbtFem;
    private javax.swing.JRadioButton rbtMasc;
    private javax.swing.JTextField txtCivil;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
