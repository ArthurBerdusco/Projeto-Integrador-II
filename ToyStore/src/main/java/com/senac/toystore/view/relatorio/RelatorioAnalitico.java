/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.senac.toystore.view.relatorio;

import com.senac.toystore.model.ItemNota;
import com.senac.toystore.model.NotaFiscal;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kayke
 */
public class RelatorioAnalitico extends javax.swing.JFrame {

    NotaFiscal nota = new NotaFiscal();

    /**
     * Creates new form RelatorioAnalitico
     */
    public RelatorioAnalitico(NotaFiscal nota) {
        initComponents();
        this.nota = nota;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataNotaFormatada = dateFormat.format(nota.getDataNota());

        txtNomeCliente.setText(nota.getNomeCliente());
        txtNotaFiscal.setText(String.valueOf(nota.getNumeroNota()));
        txtValorTotal.setText(String.valueOf(nota.getValorTotal()));
        txtData.setText(dataNotaFormatada);

        DefaultTableModel modelo = (DefaultTableModel) tbRelatorioAnalitico.getModel();
        modelo.setRowCount(0);

        for (ItemNota item : nota.getListaItens()) {
            modelo.addRow(new String[]{
                String.valueOf(item.getDescricaoProduto()),
                String.valueOf(item.getQtdProduto()),
                String.valueOf(item.getVlrProduto()),
                String.valueOf(item.valorTotal())

            });

        }

    }

    public RelatorioAnalitico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnRelatorioAnalitico = new javax.swing.JPanel();
        pnTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRelatorioAnalitico = new javax.swing.JTable();
        lbValorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        txtNotaFiscal = new javax.swing.JTextField();
        lbIcon = new javax.swing.JLabel();
        lbRelatorio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 780));
        setResizable(false);

        pnRelatorioAnalitico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbRelatorioAnalitico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbRelatorioAnalitico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição Produto", "Quantidade", "Valor Unitário", "Valor  Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRelatorioAnalitico.setRowHeight(30);
        jScrollPane1.setViewportView(tbRelatorioAnalitico);

        javax.swing.GroupLayout pnTabelaLayout = new javax.swing.GroupLayout(pnTabela);
        pnTabela.setLayout(pnTabelaLayout);
        pnTabelaLayout.setHorizontalGroup(
            pnTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)
        );
        pnTabelaLayout.setVerticalGroup(
            pnTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbValorTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbValorTotal.setText("Total NF: R$");

        txtValorTotal.setEditable(false);
        txtValorTotal.setBackground(new java.awt.Color(0, 0, 0));
        txtValorTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtValorTotal.setText("0");

        txtNomeCliente.setEditable(false);
        txtNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNomeCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNotaFiscal.setEditable(false);
        txtNotaFiscal.setBackground(new java.awt.Color(255, 255, 255));
        txtNotaFiscal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNotaFiscal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaFiscalActionPerformed(evt);
            }
        });

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/report.png"))); // NOI18N

        lbRelatorio.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRelatorio.setText("Relatório");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nome Cliente:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nota Fiscal:");

        txtData.setEditable(false);
        txtData.setBackground(new java.awt.Color(255, 255, 255));
        txtData.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Data Compra:");

        javax.swing.GroupLayout pnRelatorioAnaliticoLayout = new javax.swing.GroupLayout(pnRelatorioAnalitico);
        pnRelatorioAnalitico.setLayout(pnRelatorioAnaliticoLayout);
        pnRelatorioAnaliticoLayout.setHorizontalGroup(
            pnRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRelatorioAnaliticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRelatorioAnaliticoLayout.createSequentialGroup()
                        .addGroup(pnRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnRelatorioAnaliticoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTotal))
                    .addComponent(pnTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIcon)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRelatorioAnaliticoLayout.createSequentialGroup()
                        .addComponent(lbRelatorio)
                        .addGap(11, 11, 11)))
                .addGap(26, 26, 26))
        );
        pnRelatorioAnaliticoLayout.setVerticalGroup(
            pnRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRelatorioAnaliticoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRelatorioAnaliticoLayout.createSequentialGroup()
                        .addComponent(lbRelatorio)
                        .addGap(2, 2, 2)
                        .addComponent(lbIcon))
                    .addGroup(pnRelatorioAnaliticoLayout.createSequentialGroup()
                        .addGroup(pnRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnRelatorioAnaliticoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(2, 2, 2)
                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnRelatorioAnaliticoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(2, 2, 2)
                                .addComponent(txtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnRelatorioAnaliticoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnRelatorioAnaliticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(pnTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRelatorioAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnRelatorioAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaFiscalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotaFiscalActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioAnalitico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbRelatorio;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JPanel pnRelatorioAnalitico;
    private javax.swing.JPanel pnTabela;
    private javax.swing.JTable tbRelatorioAnalitico;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNotaFiscal;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
