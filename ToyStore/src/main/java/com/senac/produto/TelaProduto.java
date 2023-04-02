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
        PainelProdutos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblFiltrar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        cboFiltro = new javax.swing.JComboBox<>();
        btnExpandCollapse = new javax.swing.JLabel();
        LayerProduto = new javax.swing.JLayeredPane();
        pnlCadastroProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlDefault = new javax.swing.JPanel();
        imgProduto = new javax.swing.JLabel();
        lblDescPnl = new javax.swing.JLabel();
        lblDescEdit = new javax.swing.JLabel();
        lblDescAdd = new javax.swing.JLabel();
        btnNovoProduto = new javax.swing.JPanel();
        lblNovoProduto = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1350, 780));

        lblProdutos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProdutos.setText("PRODUTOS");

        PainelProdutos.setBackground(new java.awt.Color(255, 255, 255));
        PainelProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PainelProdutos.setPreferredSize(new java.awt.Dimension(784, 713));

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProdutos);

        lblFiltrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFiltrar.setText("FILTRAR POR:");

        lblBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBuscar.setText("BUSCAR:");

        txtBusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cboFiltro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnExpandCollapse.setBackground(new java.awt.Color(255, 255, 255));
        btnExpandCollapse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maximize.png"))); // NOI18N
        btnExpandCollapse.setOpaque(true);
        btnExpandCollapse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExpandCollapseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExpandCollapseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExpandCollapseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PainelProdutosLayout = new javax.swing.GroupLayout(PainelProdutos);
        PainelProdutos.setLayout(PainelProdutosLayout);
        PainelProdutosLayout.setHorizontalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE))
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFiltrar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBusca)
                            .addComponent(cboFiltro, 0, 298, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExpandCollapse)))
                .addContainerGap())
        );
        PainelProdutosLayout.setVerticalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProdutosLayout.createSequentialGroup()
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFiltrar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExpandCollapse)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(pnlDefault, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
        );
        LayerProdutoLayout.setVerticalGroup(
            LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlDefault, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE))
        );

        btnNovoProduto.setBackground(new java.awt.Color(52, 134, 242));
        btnNovoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoProduto.setPreferredSize(new java.awt.Dimension(120, 37));
        btnNovoProduto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnNovoProdutoMouseMoved(evt);
            }
        });
        btnNovoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoProdutoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNovoProdutoMouseExited(evt);
            }
        });

        lblNovoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNovoProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblNovoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNovoProduto.setText("NOVO PRODUTO");
        lblNovoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 134, 242)));
        lblNovoProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnNovoProdutoLayout = new javax.swing.GroupLayout(btnNovoProduto);
        btnNovoProduto.setLayout(btnNovoProdutoLayout);
        btnNovoProdutoLayout.setHorizontalGroup(
            btnNovoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNovoProdutoLayout.createSequentialGroup()
                .addComponent(lblNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnNovoProdutoLayout.setVerticalGroup(
            btnNovoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNovoProdutoLayout.createSequentialGroup()
                .addComponent(lblNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PainelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LayerProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LayerProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblProdutos)
                            .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PainelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pnlCadastroProduto.setVisible(false);
        pnlDefault.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNovoProdutoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProdutoMouseMoved
        Color corPersonalizada = new Color(255, 255, 255);
        Color corLabel = new Color(56, 134, 242);
        btnNovoProduto.setBackground(corPersonalizada);
        lblNovoProduto.setForeground(corLabel);
    }//GEN-LAST:event_btnNovoProdutoMouseMoved

    private void btnNovoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProdutoMouseClicked
        LayerProduto.setVisible(true);
        pnlCadastroProduto.setVisible(true);
        pnlDefault.setVisible(false);
    }//GEN-LAST:event_btnNovoProdutoMouseClicked

    private void btnNovoProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProdutoMouseExited
        Color corPersonalizada = new Color(56, 134, 242);
        btnNovoProduto.setBackground(corPersonalizada);
        lblNovoProduto.setForeground(Color.white);
    }//GEN-LAST:event_btnNovoProdutoMouseExited

    private void btnExpandCollapseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpandCollapseMouseEntered
        btnExpandCollapse.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnExpandCollapseMouseEntered

    private void btnExpandCollapseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpandCollapseMouseExited
        btnExpandCollapse.setBackground(Color.white);
    }//GEN-LAST:event_btnExpandCollapseMouseExited

    private void btnExpandCollapseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpandCollapseMousePressed
        if (PainelProdutos.getWidth() < 900) {
            LayerProduto.setVisible(false);

        } else {
            LayerProduto.setVisible(true);
        }
    }//GEN-LAST:event_btnExpandCollapseMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LayerProduto;
    private javax.swing.JPanel PainelProdutos;
    private javax.swing.JLabel btnExpandCollapse;
    private javax.swing.JPanel btnNovoProduto;
    private javax.swing.JComboBox<String> cboFiltro;
    private javax.swing.JLabel imgProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblDescAdd;
    private javax.swing.JLabel lblDescEdit;
    private javax.swing.JLabel lblDescPnl;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JLabel lblNovoProduto;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JPanel pnlCadastroProduto;
    private javax.swing.JPanel pnlDefault;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
