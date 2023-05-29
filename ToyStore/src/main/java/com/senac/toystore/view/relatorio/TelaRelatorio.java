package com.senac.toystore.view.relatorio;

import com.senac.toystore.DAO.NotaFiscalDAO;
import com.senac.toystore.model.NotaFiscal;
import com.senac.toystore.utils.Validador;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaRelatorio extends javax.swing.JInternalFrame {

    ArrayList<NotaFiscal> notasFiscais = new ArrayList<>();

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

        PainelFiltro = new javax.swing.JPanel();
        DataInicial = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtDataInicio = new com.toedter.calendar.JDateChooser();
        btnLimpar = new javax.swing.JButton();
        lbDataFinal = new javax.swing.JLabel();
        txtDataFim = new com.toedter.calendar.JDateChooser();
        pnIcon = new javax.swing.JPanel();
        lblProdutos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tabela = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        lbValorTotal = new javax.swing.JLabel();
        txtValorTotalVender = new javax.swing.JTextField();

        setTitle("Relatorio");
        setPreferredSize(new java.awt.Dimension(1350, 780));

        PainelFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PainelFiltro.setPreferredSize(new java.awt.Dimension(1336, 217));

        DataInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DataInicial.setText("Data início:");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtDataInicio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venda/excluir (1).png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lbDataFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDataFinal.setText("Data Final:");

        txtDataFim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout PainelFiltroLayout = new javax.swing.GroupLayout(PainelFiltro);
        PainelFiltro.setLayout(PainelFiltroLayout);
        PainelFiltroLayout.setHorizontalGroup(
            PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFiltroLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataInicial))
                .addGap(50, 50, 50)
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDataFinal)
                    .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(PainelFiltroLayout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        PainelFiltroLayout.setVerticalGroup(
            PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataInicial)
                    .addComponent(lbDataFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataFim, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
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
            .addGroup(pnIconLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(pnIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIconLayout.createSequentialGroup()
                        .addComponent(lblProdutos)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIconLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        pnIconLayout.setVerticalGroup(
            pnIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIconLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(476, Short.MAX_VALUE))
        );

        tabelaRelatorio.setAutoCreateRowSorter(true);
        tabelaRelatorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaRelatorio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Nota Físcal", "id_cliente", "Vendedor", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRelatorio.setRowHeight(30);
        tabelaRelatorio.setShowGrid(true);
        tabelaRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaRelatorioMousePressed(evt);
            }
        });
        tabela.setViewportView(tabelaRelatorio);

        lbValorTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbValorTotal.setText("Total vendas: R$");

        txtValorTotalVender.setEditable(false);
        txtValorTotalVender.setBackground(new java.awt.Color(0, 0, 0));
        txtValorTotalVender.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtValorTotalVender.setForeground(new java.awt.Color(255, 255, 255));
        txtValorTotalVender.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbValorTotal)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorTotalVender, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tabela, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PainelFiltro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tabela))
                    .addComponent(pnIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotalVender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabelaRelatorio.getModel();
        modelo.setRowCount(0);
        txtValorTotalVender.setText("0");
        txtDataInicio.setDate(null);
        txtDataFim.setDate(null);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tabelaRelatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRelatorioMousePressed

        if (evt.getClickCount() == 2) {
            int linha = tabelaRelatorio.getSelectedRow();

            int notaSelecionada = Integer.parseInt(tabelaRelatorio.getValueAt(linha, 1).toString());

            for (NotaFiscal nota : notasFiscais) {
                if (nota.getNumeroNota() == notaSelecionada) {
                    System.out.println(nota.getIdCliente());
                    RelatorioAnalitico analitico = new RelatorioAnalitico(nota);

                    analitico.setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_tabelaRelatorioMousePressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Validador validador = new Validador();

        validador.validarData(txtDataInicio);
        validador.validarData(txtDataFim);

        if (validador.mensagemErro.size() <= 0) {
            notasFiscais = NotaFiscalDAO.listar(txtDataInicio.getDate(), txtDataFim.getDate());

            DefaultTableModel modelo = (DefaultTableModel) tabelaRelatorio.getModel();
            modelo.setRowCount(0);

            for (NotaFiscal nota : notasFiscais) {

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String dataNotaFormatada = dateFormat.format(nota.getDataNota());

                modelo.addRow(new String[]{
                    dataNotaFormatada,
                    String.valueOf(nota.getNumeroNota()),
                    String.valueOf(nota.getIdCliente()),
                    nota.getNomeVendedor(),
                    String.valueOf(nota.getValorTotal())
                });

                double valorTotalVender = Double.parseDouble(txtValorTotalVender.getText());
                valorTotalVender += nota.getValorTotal();
                txtValorTotalVender.setText(String.valueOf(valorTotalVender));
            }
        }else{
            JOptionPane.showMessageDialog(this, "Erro, revise a seleção das datas e tente novamente");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataInicial;
    private javax.swing.JPanel PainelFiltro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbDataFinal;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JPanel pnIcon;
    private javax.swing.JScrollPane tabela;
    private javax.swing.JTable tabelaRelatorio;
    private com.toedter.calendar.JDateChooser txtDataFim;
    private com.toedter.calendar.JDateChooser txtDataInicio;
    private javax.swing.JTextField txtValorTotalVender;
    // End of variables declaration//GEN-END:variables
}
