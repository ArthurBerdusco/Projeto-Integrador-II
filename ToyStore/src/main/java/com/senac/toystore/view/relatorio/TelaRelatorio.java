package com.senac.toystore.view.relatorio;

import com.senac.toystore.utils.CampoTextoPadrao;
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
        tabela = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        lbValorTotal = new javax.swing.JLabel();
        txtValorTotalVender = new javax.swing.JTextField();
        PainelFiltro = new javax.swing.JPanel();
        DataInicial = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtDataNasc = new com.toedter.calendar.JDateChooser();
        btnLimpar = new javax.swing.JButton();
        lbCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        pnIcon = new javax.swing.JPanel();
        lblProdutos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Relatorio");
        setPreferredSize(new java.awt.Dimension(1350, 780));

        PainelRelatorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelaRelatorio.setAutoCreateRowSorter(true);
        tabelaRelatorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaRelatorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "DATA", "CLIENTES", "VALOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaRelatorio.setShowGrid(true);
        tabelaRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaRelatorioMousePressed(evt);
            }
        });
        tabela.setViewportView(tabelaRelatorio);

        lbValorTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbValorTotal.setText("Valor Total:");

        txtValorTotalVender.setEditable(false);
        txtValorTotalVender.setBackground(new java.awt.Color(0, 0, 0));
        txtValorTotalVender.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtValorTotalVender.setForeground(new java.awt.Color(255, 255, 255));
        txtValorTotalVender.setText("R$--");

        javax.swing.GroupLayout PainelRelatorioLayout = new javax.swing.GroupLayout(PainelRelatorio);
        PainelRelatorio.setLayout(PainelRelatorioLayout);
        PainelRelatorioLayout.setHorizontalGroup(
            PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRelatorioLayout.createSequentialGroup()
                .addContainerGap(982, Short.MAX_VALUE)
                .addComponent(lbValorTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorTotalVender, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(tabela, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PainelRelatorioLayout.setVerticalGroup(
            PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelatorioLayout.createSequentialGroup()
                .addComponent(tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotalVender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PainelFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PainelFiltro.setPreferredSize(new java.awt.Dimension(1336, 217));

        DataInicial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DataInicial.setText("Data:");

        lbValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbValor.setText("Valor:");

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNome.setText("Nome:");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venda/excluir (1).png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lbCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCpf.setText("Cpf:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout PainelFiltroLayout = new javax.swing.GroupLayout(PainelFiltro);
        PainelFiltro.setLayout(PainelFiltroLayout);
        PainelFiltroLayout.setHorizontalGroup(
            PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelFiltroLayout.createSequentialGroup()
                        .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PainelFiltroLayout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelFiltroLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(DataInicial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(117, 117, 117)
                        .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbValor)
                            .addComponent(lbCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 292, Short.MAX_VALUE))
                    .addGroup(PainelFiltroLayout.createSequentialGroup()
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PainelFiltroLayout.setVerticalGroup(
            PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFiltroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataInicial)
                    .addGroup(PainelFiltroLayout.createSequentialGroup()
                        .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCpf)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pnIcon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblProdutos.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutos.setText("Relatório");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/report.png"))); // NOI18N

        javax.swing.GroupLayout pnIconLayout = new javax.swing.GroupLayout(pnIcon);
        pnIcon.setLayout(pnIconLayout);
        pnIconLayout.setHorizontalGroup(
            pnIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIconLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProdutos))
                .addGap(24, 24, 24))
        );
        pnIconLayout.setVerticalGroup(
            pnIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIconLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 1134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(pnIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tabelaRelatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRelatorioMousePressed
        if(evt.getClickCount() == 2){
            RelatorioAnalitico analitico = new RelatorioAnalitico();
            analitico.setVisible(true);
        }
    }//GEN-LAST:event_tabelaRelatorioMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataInicial;
    private javax.swing.JPanel PainelFiltro;
    private javax.swing.JPanel PainelRelatorio;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbValor;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JPanel pnIcon;
    private javax.swing.JScrollPane tabela;
    private javax.swing.JTable tabelaRelatorio;
    private javax.swing.JFormattedTextField txtCpf;
    private com.toedter.calendar.JDateChooser txtDataNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorTotalVender;
    // End of variables declaration//GEN-END:variables
}
