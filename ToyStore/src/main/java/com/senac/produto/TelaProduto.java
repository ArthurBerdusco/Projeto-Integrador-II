package com.senac.produto;

import java.awt.Color;

public class TelaProduto extends javax.swing.JPanel {

    public TelaProduto() {
        initComponents();
        pnlCadastroProduto.setVisible(false);
        pnlDefault.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProdutos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblFiltrar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        cboFiltro = new javax.swing.JComboBox<>();
        LayerProduto = new javax.swing.JLayeredPane();
        pnlCadastroProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlDefault = new javax.swing.JPanel();
        imgProduto = new javax.swing.JLabel();
        lblDescPnl = new javax.swing.JLabel();
        lblDescEdit = new javax.swing.JLabel();
        lblDescAdd = new javax.swing.JLabel();
        pnlNovoProduto = new javax.swing.JPanel();
        lblNovoProduto = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1350, 780));

        lblProdutos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProdutos.setText("PRODUTOS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(784, 713));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblFiltrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFiltrar.setText("FILTRAR POR:");

        lblBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBuscar.setText("BUSCAR:");

        txtBusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cboFiltro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFiltrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBusca)
                    .addComponent(cboFiltro, 0, 298, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiltrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBusca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LayerProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LayerProduto.setPreferredSize(new java.awt.Dimension(548, 761));

        pnlCadastroProduto.setBackground(new java.awt.Color(255, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("INFORMAÇÕES DO PRODUTO");

        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroProdutoLayout = new javax.swing.GroupLayout(pnlCadastroProduto);
        pnlCadastroProduto.setLayout(pnlCadastroProdutoLayout);
        pnlCadastroProdutoLayout.setHorizontalGroup(
            pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(201, 201, 201))
        );
        pnlCadastroProdutoLayout.setVerticalGroup(
            pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(152, 152, 152))
        );

        pnlDefault.setBackground(new java.awt.Color(255, 255, 255));
        pnlDefault.setPreferredSize(new java.awt.Dimension(526, 764));

        imgProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto2.jpg"))); // NOI18N
        imgProduto.setPreferredSize(new java.awt.Dimension(520, 520));

        lblDescPnl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDescPnl.setText("GERENCIE SEUS PRODUTOS AO LADO");

        lblDescEdit.setBackground(new java.awt.Color(102, 102, 102));
        lblDescEdit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblDescEdit.setText("SELECIONE PARA EDITAR OU ");

        lblDescAdd.setBackground(new java.awt.Color(102, 102, 102));
        lblDescAdd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblDescAdd.setText("ADICIONE UM NOVO");

        javax.swing.GroupLayout pnlDefaultLayout = new javax.swing.GroupLayout(pnlDefault);
        pnlDefault.setLayout(pnlDefaultLayout);
        pnlDefaultLayout.setHorizontalGroup(
            pnlDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(imgProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblDescPnl)
                .addComponent(lblDescEdit)
                .addComponent(lblDescAdd))
        );
        pnlDefaultLayout.setVerticalGroup(
            pnlDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDefaultLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(imgProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDescPnl)
                .addGap(18, 18, 18)
                .addComponent(lblDescEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescAdd)
                .addGap(40, 40, 40))
        );

        LayerProduto.setLayer(pnlCadastroProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayerProduto.setLayer(pnlDefault, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayerProdutoLayout = new javax.swing.GroupLayout(LayerProduto);
        LayerProduto.setLayout(LayerProdutoLayout);
        LayerProdutoLayout.setHorizontalGroup(
            LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlDefault, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LayerProdutoLayout.setVerticalGroup(
            LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlDefault, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlNovoProduto.setBackground(new java.awt.Color(52, 134, 242));
        pnlNovoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlNovoProduto.setPreferredSize(new java.awt.Dimension(120, 37));
        pnlNovoProduto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlNovoProdutoMouseMoved(evt);
            }
        });
        pnlNovoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNovoProdutoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNovoProdutoMouseExited(evt);
            }
        });

        lblNovoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNovoProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblNovoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNovoProduto.setText("NOVO PRODUTO");
        lblNovoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 134, 242)));
        lblNovoProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlNovoProdutoLayout = new javax.swing.GroupLayout(pnlNovoProduto);
        pnlNovoProduto.setLayout(pnlNovoProdutoLayout);
        pnlNovoProdutoLayout.setHorizontalGroup(
            pnlNovoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNovoProdutoLayout.createSequentialGroup()
                .addComponent(lblNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlNovoProdutoLayout.setVerticalGroup(
            pnlNovoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoProdutoLayout.createSequentialGroup()
                .addComponent(lblNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LayerProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LayerProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblProdutos)
                            .addComponent(pnlNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pnlCadastroProduto.setVisible(false);
        pnlDefault.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pnlNovoProdutoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNovoProdutoMouseMoved
        Color corPersonalizada = new Color(255, 255, 255);
        Color corLabel = new Color(56, 134, 242);
        pnlNovoProduto.setBackground(corPersonalizada);
        lblNovoProduto.setForeground(corLabel);
    }//GEN-LAST:event_pnlNovoProdutoMouseMoved

    private void pnlNovoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNovoProdutoMouseClicked
        pnlCadastroProduto.setVisible(true);
        pnlDefault.setVisible(false);
    }//GEN-LAST:event_pnlNovoProdutoMouseClicked

    private void pnlNovoProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNovoProdutoMouseExited
        Color corPersonalizada = new Color(56, 134, 242);
        pnlNovoProduto.setBackground(corPersonalizada);
        lblNovoProduto.setForeground(Color.white);
    }//GEN-LAST:event_pnlNovoProdutoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LayerProduto;
    private javax.swing.JComboBox<String> cboFiltro;
    private javax.swing.JLabel imgProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblDescAdd;
    private javax.swing.JLabel lblDescEdit;
    private javax.swing.JLabel lblDescPnl;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JLabel lblNovoProduto;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JPanel pnlCadastroProduto;
    private javax.swing.JPanel pnlDefault;
    private javax.swing.JPanel pnlNovoProduto;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
