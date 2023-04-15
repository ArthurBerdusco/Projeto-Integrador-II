package com.senac.relatorio;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComponent;

public class TelaRelatorio extends javax.swing.JPanel {
    public TelaRelatorio() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelFiltro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelBuscar = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JLabel();
        Lupa = new javax.swing.JLabel();
        DataInicial = new javax.swing.JLabel();
        DataFinal = new javax.swing.JLabel();
        txtDataInicial = new javax.swing.JFormattedTextField();
        txtDataFinal = new javax.swing.JFormattedTextField();
        PainelRelatorio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1350, 780));

        PainelFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CONSULTA ENTRE DATAS:");

        painelBuscar.setBackground(new java.awt.Color(52, 134, 242));
        painelBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                painelBuscarMouseMoved(evt);
            }
        });
        painelBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelBuscarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelBuscarMouseExited(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 134, 242)));
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N

        javax.swing.GroupLayout painelBuscarLayout = new javax.swing.GroupLayout(painelBuscar);
        painelBuscar.setLayout(painelBuscarLayout);
        painelBuscarLayout.setHorizontalGroup(
            painelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(11, 11, 11))
        );
        painelBuscarLayout.setVerticalGroup(
            painelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lupa, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DataInicial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DataInicial.setText("DATA INICIAL:");

        DataFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DataFinal.setText("DATA FINAL:");

        txtDataInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        try {
            txtDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDataInicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataInicialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataInicialFocusLost(evt);
            }
        });

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

        javax.swing.GroupLayout PainelFiltroLayout = new javax.swing.GroupLayout(PainelFiltro);
        PainelFiltro.setLayout(PainelFiltroLayout);
        PainelFiltroLayout.setHorizontalGroup(
            PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFiltroLayout.createSequentialGroup()
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelFiltroLayout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(DataInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(DataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelFiltroLayout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelFiltroLayout.setVerticalGroup(
            PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFiltroLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelFiltroLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFiltroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(painelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE)
        );
        PainelRelatorioLayout.setVerticalGroup(
            PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("RELATÓRIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelRelatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

      private void focarCampoTexto(JComponent campo) {
        Color corPersonalizada = new Color(23, 102, 212);
        campo.setBorder(BorderFactory.createLineBorder(corPersonalizada));
    }
       private void desfocarCampoTexto(JComponent campo) {
        Color corPersonalizada = new Color(23, 102, 212);
        campo.setBorder(BorderFactory.createLineBorder(corPersonalizada));
    }
    
    private void painelBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBuscarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_painelBuscarMouseMoved

    private void painelBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBuscarMouseClicked

    }//GEN-LAST:event_painelBuscarMouseClicked

    private void painelBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBuscarMouseExited

    }//GEN-LAST:event_painelBuscarMouseExited

    private void txtDataInicialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataInicialFocusGained
        focarCampoTexto(txtDataInicial);
    }//GEN-LAST:event_txtDataInicialFocusGained

    private void txtDataInicialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataInicialFocusLost
        desfocarCampoTexto(txtDataInicial);
    }//GEN-LAST:event_txtDataInicialFocusLost

    private void txtDataFinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFinalFocusGained
        focarCampoTexto(txtDataFinal);
    }//GEN-LAST:event_txtDataFinalFocusGained

    private void txtDataFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFinalFocusLost
        desfocarCampoTexto(txtDataFinal);
    }//GEN-LAST:event_txtDataFinalFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataFinal;
    private javax.swing.JLabel DataInicial;
    private javax.swing.JLabel Lupa;
    private javax.swing.JPanel PainelFiltro;
    private javax.swing.JPanel PainelRelatorio;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelBuscar;
    private javax.swing.JTable tabelaRelatorio;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicial;
    // End of variables declaration//GEN-END:variables
}
