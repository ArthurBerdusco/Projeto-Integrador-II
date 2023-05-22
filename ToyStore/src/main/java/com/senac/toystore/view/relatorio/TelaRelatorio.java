package com.senac.toystore.view.relatorio;

import com.senac.toystore.utils.Validador;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;

public class TelaRelatorio extends javax.swing.JInternalFrame {

    public TelaRelatorio() {
        try {
            initComponents();
            setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelRelatorio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        PainelFiltro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DataInicial = new javax.swing.JLabel();
        DataFinal = new javax.swing.JLabel();
        txtDataInicial = new javax.swing.JFormattedTextField();
        txtDataFinal = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setTitle("Relatorio");
        setPreferredSize(new java.awt.Dimension(1350, 780));

        PainelRelatorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelaRelatorio.setAutoCreateRowSorter(true);
        tabelaRelatorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaRelatorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Produtos", "Valor", "Clientes"
            }
        ));
        tabelaRelatorio.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaRelatorio);

        javax.swing.GroupLayout PainelRelatorioLayout = new javax.swing.GroupLayout(PainelRelatorio);
        PainelRelatorio.setLayout(PainelRelatorioLayout);
        PainelRelatorioLayout.setHorizontalGroup(
            PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
        );
        PainelRelatorioLayout.setVerticalGroup(
            PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        PainelFiltro.setBackground(new java.awt.Color(255, 255, 255));
        PainelFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PainelFiltro.setPreferredSize(new java.awt.Dimension(1336, 217));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consulta Entre Datas:");

        DataInicial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DataInicial.setText("Data Inicial:");

        DataFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DataFinal.setText("Data Final:");

        txtDataInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        try {
            txtDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDataFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        try {
            txtDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDataFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataFinalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataFinalFocusLost(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(56, 134, 242));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto/search.png"))); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelFiltroLayout = new javax.swing.GroupLayout(PainelFiltro);
        PainelFiltro.setLayout(PainelFiltroLayout);
        PainelFiltroLayout.setHorizontalGroup(
            PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFiltroLayout.createSequentialGroup()
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelFiltroLayout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(DataInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(DataFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelFiltroLayout.createSequentialGroup()
                        .addGap(535, 535, 535)
                        .addComponent(jLabel1)))
                .addContainerGap(387, Short.MAX_VALUE))
        );
        PainelFiltroLayout.setVerticalGroup(
            PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFiltroLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelRelatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 1326, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataFinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFinalFocusGained
        //focarCampoTexto(txtDataFinal);
    }//GEN-LAST:event_txtDataFinalFocusGained

    private void txtDataFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFinalFocusLost
        //desfocarCampoTexto(txtDataFinal);
    }//GEN-LAST:event_txtDataFinalFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Validador validador = new Validador();
//        validador.validarData(txtDataInicial);
//        validador.validarData(txtDataFinal);
        if(validador.mensagemErro.size() == 0){
            JOptionPane.showMessageDialog(this, "Relatório indisponivel no momento");
        }else{
            JOptionPane.showMessageDialog(this, "Preencha os campos corretamente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataFinal;
    private javax.swing.JLabel DataInicial;
    private javax.swing.JPanel PainelFiltro;
    private javax.swing.JPanel PainelRelatorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaRelatorio;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicial;
    // End of variables declaration//GEN-END:variables
}
