package com.senac.toystore.view.venda;

import com.senac.toystore.DAO.NotaFiscalDAO;
import com.senac.toystore.model.ItemNota;
import com.senac.toystore.model.NotaFiscal;
import java.util.ArrayList;

public class TelaPagamento extends javax.swing.JFrame {

    ArrayList<ItemNota> listaItens = new ArrayList<>();
    int idCliente;
    String nomeVendedor;
    static float valor_total;

    public TelaPagamento(float valorTotal) {
        this.valor_total = valorTotal;
        initComponents();
        txtValorTotal.setText(String.valueOf(valorTotal));
        btnPagamento.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgPagamento = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        rdButtonCredito_Debito = new javax.swing.JRadioButton();
        rdBtnPix = new javax.swing.JRadioButton();
        rdBtnDinheiro = new javax.swing.JRadioButton();
        rdButtonCredito_Debito1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btnPagamento = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtValorTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValorPago = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btgPagamento.add(rdButtonCredito_Debito);
        rdButtonCredito_Debito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdButtonCredito_Debito.setText("Debito");
        rdButtonCredito_Debito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdButtonCredito_DebitoActionPerformed(evt);
            }
        });

        btgPagamento.add(rdBtnPix);
        rdBtnPix.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdBtnPix.setText("Pix(QrCode)");
        rdBtnPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnPixActionPerformed(evt);
            }
        });

        btgPagamento.add(rdBtnDinheiro);
        rdBtnDinheiro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdBtnDinheiro.setText("Dinheiro");
        rdBtnDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnDinheiroActionPerformed(evt);
            }
        });

        btgPagamento.add(rdButtonCredito_Debito1);
        rdButtonCredito_Debito1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdButtonCredito_Debito1.setText("Credito");
        rdButtonCredito_Debito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdButtonCredito_Debito1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Forma de Pagamento");

        btnPagamento.setBackground(new java.awt.Color(46, 139, 87));
        btnPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venda/dinheiro.png"))); // NOI18N
        btnPagamento.setText("Finalizar Compra");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        txtValorTotal.setEditable(false);
        txtValorTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Valor total");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Troco");

        txtTroco.setEditable(false);
        txtTroco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrocoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Valor pago");

        txtValorPago.setEditable(false);
        txtValorPago.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtValorPago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorPagoFocusLost(evt);
            }
        });
        txtValorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorPagoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("R$");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("R$");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("R$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorTotal)
                            .addComponent(txtValorPago)
                            .addComponent(txtTroco, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rdButtonCredito_Debito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdBtnPix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdButtonCredito_Debito1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdBtnDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPagamento)
                .addGap(119, 119, 119))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(rdBtnDinheiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdButtonCredito_Debito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdButtonCredito_Debito1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdBtnPix))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        NotaFiscal nota = new NotaFiscal();
        
        nota.setNomeVendedor(nomeVendedor);
        nota.setIdCliente(idCliente);
        nota.setValorTotal(valor_total);
        nota.setListaItens(listaItens);
        
        NotaFiscalDAO.salvar(nota);
        
        this.dispose();
    }//GEN-LAST:event_btnPagamentoActionPerformed

    private void rdBtnDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnDinheiroActionPerformed
        btnPagamento.setEnabled(false);
        txtValorPago.setText("");
        txtValorPago.setEditable(true);
    }//GEN-LAST:event_rdBtnDinheiroActionPerformed

    private void txtTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrocoActionPerformed

    private void rdButtonCredito_DebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdButtonCredito_DebitoActionPerformed
        txtValorPago.setEditable(false);
        txtValorPago.setText(txtValorTotal.getText());
        btnPagamento.setEnabled(true);
    }//GEN-LAST:event_rdButtonCredito_DebitoActionPerformed

    private void rdButtonCredito_Debito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdButtonCredito_Debito1ActionPerformed
        txtValorPago.setEditable(false);
        txtValorPago.setText(txtValorTotal.getText());
        btnPagamento.setEnabled(true);
    }//GEN-LAST:event_rdButtonCredito_Debito1ActionPerformed

    private void rdBtnPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnPixActionPerformed
        txtValorPago.setEditable(false);
        txtValorPago.setText(txtValorTotal.getText());
        btnPagamento.setEnabled(true);
    }//GEN-LAST:event_rdBtnPixActionPerformed

    private void txtValorPagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPagoFocusLost
        float valorPago = Float.parseFloat(txtValorPago.getText());
        float valorTotal = Float.parseFloat(txtValorTotal.getText());

        txtTroco.setText(String.valueOf(valorPago - valorTotal));

        if (valorPago >= valorTotal) {
            btnPagamento.setEnabled(true);
        } else {
            btnPagamento.setEnabled(false);
        }

    }//GEN-LAST:event_txtValorPagoFocusLost

    private void txtValorPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorPagoActionPerformed

    }//GEN-LAST:event_txtValorPagoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPagamento(valor_total).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgPagamento;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdBtnDinheiro;
    private javax.swing.JRadioButton rdBtnPix;
    private javax.swing.JRadioButton rdButtonCredito_Debito;
    private javax.swing.JRadioButton rdButtonCredito_Debito1;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JTextField txtValorPago;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
