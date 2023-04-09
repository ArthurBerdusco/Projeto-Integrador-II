package com.senac.produto;

import com.senac.utils.Validador;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TelaProduto extends javax.swing.JPanel {

    public TelaProduto() {
        initComponents();
        trocarPainelForm("pnlDefault");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProdutos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblFiltrar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        cboFiltro = new javax.swing.JComboBox<>();
        btnExpandCollapse = new javax.swing.JLabel();
        LayerProduto = new javax.swing.JLayeredPane();
        pnlAdicionarProd = new javax.swing.JPanel();
        lblInfoProduto = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        pnlIdentAdd = new javax.swing.JPanel();
        lblCodBarras = new javax.swing.JLabel();
        lblDescr = new javax.swing.JLabel();
        txtCodBarras = new javax.swing.JTextField();
        txtDescProd = new javax.swing.JTextField();
        imgProduto = new javax.swing.JLabel();
        lblAddImg = new javax.swing.JLabel();
        lblRemovImg = new javax.swing.JLabel();
        pnlValores = new javax.swing.JPanel();
        lblValorCusto = new javax.swing.JLabel();
        lblValorVenda = new javax.swing.JLabel();
        lblMargemLucro = new javax.swing.JLabel();
        txtMargemLucro = new javax.swing.JTextField();
        txtProdValorVenda = new javax.swing.JTextField();
        txtProdValorCusto = new javax.swing.JTextField();
        pnlArmazem = new javax.swing.JPanel();
        txtCorredor = new javax.swing.JLabel();
        cboProdCorredor = new javax.swing.JComboBox<>();
        cboProdPratileira = new javax.swing.JComboBox<>();
        lblPratileira = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        cboProdCategoria = new javax.swing.JComboBox<>();
        btnCancelar1 = new javax.swing.JButton();
        pnlDefault = new javax.swing.JPanel();
        imgDefaultProd = new javax.swing.JLabel();
        lblDescPnl = new javax.swing.JLabel();
        lblDescEdit = new javax.swing.JLabel();
        lblDescAdd = new javax.swing.JLabel();
        lblPordutos = new javax.swing.JLabel();
        btnAddProduto = new javax.swing.JPanel();
        lblAddProduto = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1350, 780));

        pnlProdutos.setBackground(new java.awt.Color(255, 255, 255));
        pnlProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlProdutos.setPreferredSize(new java.awt.Dimension(784, 713));

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "COD_BARRAS", "NOME", "DESCRICAO", "QNT", "PREÇO_VENDA", "CORREDOR", "GONDOLA", "PRATILEIRA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        javax.swing.GroupLayout pnlProdutosLayout = new javax.swing.GroupLayout(pnlProdutos);
        pnlProdutos.setLayout(pnlProdutosLayout);
        pnlProdutosLayout.setHorizontalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutosLayout.createSequentialGroup()
                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE))
                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFiltrar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBusca)
                            .addComponent(cboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExpandCollapse)))
                .addContainerGap())
        );
        pnlProdutosLayout.setVerticalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExpandCollapse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiltrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBusca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LayerProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LayerProduto.setPreferredSize(new java.awt.Dimension(530, 768));

        pnlAdicionarProd.setBackground(new java.awt.Color(255, 255, 255));
        pnlAdicionarProd.setPreferredSize(new java.awt.Dimension(526, 764));

        lblInfoProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInfoProduto.setText("INFORMAÇÕES DO BRINQUEDO");

        btnCancelar.setText("SALVAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        pnlIdentAdd.setBackground(new java.awt.Color(255, 255, 255));
        pnlIdentAdd.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificação"));

        lblCodBarras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodBarras.setText("CÓDIGO DE BARRAS:");

        lblDescr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescr.setText("DESCRIÇÃO:");

        txtCodBarras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodBarras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));

        txtDescProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));

        imgProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        imgProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produtos/t1.png"))); // NOI18N
        imgProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAddImg.setBackground(new java.awt.Color(52, 134, 242));
        lblAddImg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddImg.setForeground(new java.awt.Color(255, 255, 255));
        lblAddImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddImg.setText("Adicionar");
        lblAddImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 129, 227)));
        lblAddImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddImg.setOpaque(true);
        lblAddImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddImgMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAddImgMousePressed(evt);
            }
        });

        lblRemovImg.setBackground(new java.awt.Color(52, 134, 242));
        lblRemovImg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRemovImg.setForeground(new java.awt.Color(255, 255, 255));
        lblRemovImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRemovImg.setText("Remover");
        lblRemovImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 129, 227)));
        lblRemovImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRemovImg.setOpaque(true);
        lblRemovImg.setVisible(false);
        lblRemovImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRemovImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRemovImgMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRemovImgMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlIdentAddLayout = new javax.swing.GroupLayout(pnlIdentAdd);
        pnlIdentAdd.setLayout(pnlIdentAddLayout);
        pnlIdentAddLayout.setHorizontalGroup(
            pnlIdentAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIdentAddLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlIdentAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescr)
                    .addComponent(lblCodBarras)
                    .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(pnlIdentAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIdentAddLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblAddImg, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblRemovImg, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlIdentAddLayout.setVerticalGroup(
            pnlIdentAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentAddLayout.createSequentialGroup()
                .addGroup(pnlIdentAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIdentAddLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblDescr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodBarras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlIdentAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlIdentAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRemovImg)
                    .addComponent(lblAddImg))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlValores.setBackground(new java.awt.Color(255, 255, 255));
        pnlValores.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));

        lblValorCusto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorCusto.setText("VALOR DE CUSTO:");

        lblValorVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorVenda.setText("VALOR DE VENDA:");

        lblMargemLucro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMargemLucro.setText("MARGEM LUCRO:");

        txtMargemLucro.setEditable(false);
        txtMargemLucro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtMargemLucro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));

        txtProdValorVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProdValorVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        txtProdValorVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProdValorVendaFocusLost(evt);
            }
        });
        txtProdValorVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProdValorVendaKeyTyped(evt);
            }
        });

        txtProdValorCusto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProdValorCusto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        txtProdValorCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProdValorCustoFocusLost(evt);
            }
        });
        txtProdValorCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProdValorCustoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlValoresLayout = new javax.swing.GroupLayout(pnlValores);
        pnlValores.setLayout(pnlValoresLayout);
        pnlValoresLayout.setHorizontalGroup(
            pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProdValorVenda)
                    .addComponent(txtMargemLucro, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lblMargemLucro)
                    .addComponent(lblValorVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorCusto)
                    .addComponent(txtProdValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        pnlValoresLayout.setVerticalGroup(
            pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorCusto)
                    .addComponent(lblValorVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlValoresLayout.createSequentialGroup()
                        .addComponent(txtProdValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(txtProdValorVenda))
                .addGap(18, 18, 18)
                .addComponent(lblMargemLucro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMargemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pnlArmazem.setBackground(new java.awt.Color(255, 255, 255));
        pnlArmazem.setBorder(javax.swing.BorderFactory.createTitledBorder("Armazenamento"));

        txtCorredor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCorredor.setText("CORREDOR:");

        cboProdCorredor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboProdCorredor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "1", "2", "3" }));
        cboProdCorredor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));

        cboProdPratileira.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboProdPratileira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "A", "B", "C", "D", "E" }));
        cboProdPratileira.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));

        lblPratileira.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPratileira.setText("PRATILEIRA:");

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategoria.setText("CATEGORIA:");

        cboProdCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboProdCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Bebês", "Tabuleiro e cartas", "Educacionais", "Véiculos", "Ação e aventura", "Esporte e atividade ao ar livre", "Musicais", "Fantasia", "Eletrônicos" }));
        cboProdCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));

        javax.swing.GroupLayout pnlArmazemLayout = new javax.swing.GroupLayout(pnlArmazem);
        pnlArmazem.setLayout(pnlArmazemLayout);
        pnlArmazemLayout.setHorizontalGroup(
            pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArmazemLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlArmazemLayout.createSequentialGroup()
                        .addComponent(lblCategoria)
                        .addGap(194, 194, 194))
                    .addGroup(pnlArmazemLayout.createSequentialGroup()
                        .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cboProdCategoria, 0, 0, Short.MAX_VALUE)
                            .addComponent(txtCorredor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboProdCorredor, 0, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboProdPratileira, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPratileira))
                        .addGap(17, 17, 17))))
        );
        pnlArmazemLayout.setVerticalGroup(
            pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArmazemLayout.createSequentialGroup()
                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPratileira)
                    .addComponent(txtCorredor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProdCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboProdPratileira, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboProdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btnCancelar1.setText("CANCELAR");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdicionarProdLayout = new javax.swing.GroupLayout(pnlAdicionarProd);
        pnlAdicionarProd.setLayout(pnlAdicionarProdLayout);
        pnlAdicionarProdLayout.setHorizontalGroup(
            pnlAdicionarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdicionarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlArmazem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlIdentAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdicionarProdLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlAdicionarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdicionarProdLayout.createSequentialGroup()
                                .addComponent(lblInfoProduto)
                                .addGap(172, 172, 172))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdicionarProdLayout.createSequentialGroup()
                                .addComponent(btnCancelar1)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)))))
                .addContainerGap())
        );
        pnlAdicionarProdLayout.setVerticalGroup(
            pnlAdicionarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlIdentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlArmazem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAdicionarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar1)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDefault.setBackground(new java.awt.Color(255, 255, 255));
        pnlDefault.setPreferredSize(new java.awt.Dimension(526, 764));

        imgDefaultProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto2.jpg"))); // NOI18N

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
            .addGroup(pnlDefaultLayout.createSequentialGroup()
                .addGroup(pnlDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(imgDefaultProd)
                    .addComponent(lblDescPnl)
                    .addComponent(lblDescEdit)
                    .addComponent(lblDescAdd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDefaultLayout.setVerticalGroup(
            pnlDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDefaultLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(imgDefaultProd)
                .addGap(18, 18, 18)
                .addComponent(lblDescPnl)
                .addGap(18, 18, 18)
                .addComponent(lblDescEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescAdd)
                .addGap(40, 40, 40))
        );

        LayerProduto.setLayer(pnlAdicionarProd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayerProduto.setLayer(pnlDefault, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayerProdutoLayout = new javax.swing.GroupLayout(LayerProduto);
        LayerProduto.setLayout(LayerProdutoLayout);
        LayerProdutoLayout.setHorizontalGroup(
            LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdicionarProd, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
            .addGroup(LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlDefault, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
        );
        LayerProdutoLayout.setVerticalGroup(
            LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdicionarProd, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
            .addGroup(LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlDefault, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE))
        );

        lblPordutos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPordutos.setText("PRODUTOS");

        btnAddProduto.setBackground(new java.awt.Color(52, 134, 242));
        btnAddProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProduto.setPreferredSize(new java.awt.Dimension(120, 37));
        btnAddProduto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAddProdutoMouseMoved(evt);
            }
        });
        btnAddProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddProdutoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddProdutoMousePressed(evt);
            }
        });

        lblAddProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAddProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblAddProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddProduto.setText("ADICIONAR");
        lblAddProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 134, 242)));
        lblAddProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnAddProdutoLayout = new javax.swing.GroupLayout(btnAddProduto);
        btnAddProduto.setLayout(btnAddProdutoLayout);
        btnAddProdutoLayout.setHorizontalGroup(
            btnAddProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddProdutoLayout.createSequentialGroup()
                .addComponent(lblAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnAddProdutoLayout.setVerticalGroup(
            btnAddProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddProdutoLayout.createSequentialGroup()
                .addComponent(lblAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPordutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LayerProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LayerProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPordutos)
                            .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void trocarPainelForm(String pnlSelecionado) {
        LayerProduto.setVisible(true);
        if (pnlSelecionado.equals("pnlAdicionarProd")) {
            pnlAdicionarProd.setVisible(true);

            pnlDefault.setVisible(false);
        } else if (pnlSelecionado.equals("pnlCadastroProd")) {
            pnlAdicionarProd.setVisible(false);

            pnlDefault.setVisible(false);
        } else if (pnlSelecionado.equals("pnlCadastroForn")) {
            pnlAdicionarProd.setVisible(false);

            pnlDefault.setVisible(false);
        } else if (pnlSelecionado.equals("pnlDefault")) {
            pnlAdicionarProd.setVisible(false);
            pnlDefault.setVisible(true);
        }
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Validador validador = new Validador();
        validador.validarNome(txtDescProd);
        validador.validarID(txtCodBarras);
        validador.validarDinheiro(txtProdValorVenda);
        validador.validarDinheiro(txtProdValorCusto);
        validador.validarComboBox(cboProdCorredor);
        validador.validarComboBox(cboProdPratileira);
        validador.validarComboBox(cboProdCorredor);

        if (validador.mensagemErro.size() == 0) {
            pnlAdicionarProd.setVisible(false);
            pnlDefault.setVisible(true);
        } else if (validador.mensagemErro.size() == 1) {
            JOptionPane.showMessageDialog(this, validador.mensagemErro.get(0), "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
        } else if (validador.mensagemErro.size() > 1) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar produto, prencha os campos corretamente", "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAddProdutoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProdutoMouseMoved
        Color corPersonalizada = new Color(255, 255, 255);
        Color corLabel = new Color(56, 134, 242);
        btnAddProduto.setBackground(corPersonalizada);
        lblAddProduto.setForeground(corLabel);
    }//GEN-LAST:event_btnAddProdutoMouseMoved

    private void btnAddProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProdutoMouseExited
        Color corPersonalizada = new Color(56, 134, 242);
        btnAddProduto.setBackground(corPersonalizada);
        lblAddProduto.setForeground(Color.white);
    }//GEN-LAST:event_btnAddProdutoMouseExited

    private void btnExpandCollapseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpandCollapseMousePressed
        if (pnlProdutos.getWidth() < 900) {
            LayerProduto.setVisible(false);

        } else {
            LayerProduto.setVisible(true);
        }
    }//GEN-LAST:event_btnExpandCollapseMousePressed

    private void btnExpandCollapseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpandCollapseMouseExited
        btnExpandCollapse.setBackground(Color.white);
    }//GEN-LAST:event_btnExpandCollapseMouseExited

    private void btnExpandCollapseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpandCollapseMouseEntered
        btnExpandCollapse.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnExpandCollapseMouseEntered

    private void btnAddProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProdutoMousePressed
        trocarPainelForm("pnlAdicionarProd");
    }//GEN-LAST:event_btnAddProdutoMousePressed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void lblAddImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddImgMousePressed
        //PROCURAR IMAGEM
        JFileChooser procurarArquivoImagem = new JFileChooser();
        //DEFINIR FILTRO SOMENTE PARA ARQUIVOS COM EXTENSAO IMAGEM
        FileNameExtensionFilter fExtImg = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        procurarArquivoImagem.addChoosableFileFilter(fExtImg); // Incre
        int janelaDialog = procurarArquivoImagem.showOpenDialog(this);
        if (janelaDialog == JFileChooser.APPROVE_OPTION) {
            File imagemSelecionada = procurarArquivoImagem.getSelectedFile();;
            String pastaImagemSelecionada = imagemSelecionada.getAbsolutePath();

            try {
                BufferedImage originalImage = ImageIO.read(imagemSelecionada);
                Image resizedImage = originalImage.getScaledInstance(150, 200, Image.SCALE_FAST);
                ImageIcon icon = new ImageIcon(resizedImage);
                imgProduto.setIcon(icon);
                lblRemovImg.setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Imagem inválida", "Erro ao adicionar imagem", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_lblAddImgMousePressed

    private void txtProdValorVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdValorVendaKeyTyped

        if (!(String.valueOf(evt.getKeyChar()).matches("[0-9-,]+"))) {
            evt.consume();
        }


    }//GEN-LAST:event_txtProdValorVendaKeyTyped

    private void txtProdValorCustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdValorCustoKeyTyped

        if (!(String.valueOf(evt.getKeyChar()).matches("[0-9-,]+"))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProdValorCustoKeyTyped

    public void calcMargemLucro(JTextField valorCusto, JTextField valorVenda) {
        if (!(txtProdValorCusto.getText().replace("R", "").replace("$", "").replace(",", ".").trim().isEmpty()) && !(txtProdValorVenda.getText().replace("R", "").replace("$", "").replace(",", ".").trim().isEmpty())) {
            Double vlrVenda = Double.parseDouble(valorVenda.getText().replace("R", "").replace("$", "").replace(".", "").replace(",", "."));
            Double vlrCusto = Double.parseDouble(valorCusto.getText().replace("R", "").replace("$", "").replace(".", "").replace(",", "."));

            float margemLucro = (float) ((vlrVenda - vlrCusto) / vlrVenda) * 100;

            DecimalFormat df = new DecimalFormat("#.##");
            df.setRoundingMode(RoundingMode.CEILING);

            if (margemLucro > 0) {
                Color verdeDegrade = new Color((int) (255 - 255 * margemLucro / 100), 255, (int) (255 - 255 * margemLucro / 100));
                txtMargemLucro.setBackground(verdeDegrade);
            } else if ((margemLucro < 0) && (margemLucro >= -100)) {
                Color vermelhoDegrade = new Color(255, (int) (255 - 255 * Math.abs(margemLucro) / 100), (int) (255 - 255 * Math.abs(margemLucro) / 100));
                txtMargemLucro.setBackground(vermelhoDegrade);
            } else if (margemLucro < -100) {
                txtMargemLucro.setBackground(Color.red);
            } else if (margemLucro == 0) {
                txtMargemLucro.setBackground(Color.LIGHT_GRAY);
            }

            txtMargemLucro.setText(String.valueOf(df.format(margemLucro)) + "%");
        }
    }

    private void txtProdValorVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdValorVendaFocusLost
        String padrao = "###,###,###.##";
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');

        DecimalFormat df = new DecimalFormat(padrao, dfs);

        if (txtProdValorVenda.getText().replace("R", "").replace("$", "").replace(",", ".").trim().isEmpty()) {
            txtProdValorVenda.setText("");
            txtMargemLucro.setText("%--");
            txtMargemLucro.setBackground(Color.LIGHT_GRAY);
        } else {
            calcMargemLucro(txtProdValorCusto, txtProdValorVenda);
            if (!(txtProdValorVenda.getText().contains("."))) {
                String valor = df.format(Double.parseDouble(txtProdValorVenda.getText().replace("R", "").replace("$", "").replace(",", ".")));
                txtProdValorVenda.setText("R$" + valor);
                calcMargemLucro(txtProdValorCusto, txtProdValorVenda);
            }

        }
    }//GEN-LAST:event_txtProdValorVendaFocusLost

    private void txtProdValorCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdValorCustoFocusLost
        String padrao = "###,###.##";
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');

        DecimalFormat df = new DecimalFormat(padrao, dfs);

        if (txtProdValorCusto.getText().replace("R", "").replace("$", "").replace(",", ".").trim().isEmpty()) {
            txtProdValorCusto.setText("");
            txtMargemLucro.setText("%--");
            txtMargemLucro.setBackground(Color.LIGHT_GRAY);
        } else {
            calcMargemLucro(txtProdValorCusto, txtProdValorVenda);
            if (!(txtProdValorCusto.getText().contains("."))) {

                String valor = df.format(Double.parseDouble(txtProdValorCusto.getText().replace("R", "").replace("$", "").replace(",", ".")));
                txtProdValorCusto.setText("R$" + valor);
            }

        }
    }//GEN-LAST:event_txtProdValorCustoFocusLost

    private void lblAddImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddImgMouseEntered
        lblAddImg.setBackground(Color.white);
        lblAddImg.setForeground(Color.black);
    }//GEN-LAST:event_lblAddImgMouseEntered

    private void lblAddImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddImgMouseExited
        lblAddImg.setBackground(new Color(52, 134, 242));
        lblAddImg.setForeground(Color.white);
    }//GEN-LAST:event_lblAddImgMouseExited

    private void lblRemovImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemovImgMouseEntered
        lblRemovImg.setBackground(Color.white);
        lblRemovImg.setForeground(Color.black);
    }//GEN-LAST:event_lblRemovImgMouseEntered

    private void lblRemovImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemovImgMouseExited
        lblRemovImg.setBackground(new Color(52, 134, 242));
        lblRemovImg.setForeground(Color.white);
    }//GEN-LAST:event_lblRemovImgMouseExited

    private void lblRemovImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemovImgMousePressed
       int escolhaRemovImg = JOptionPane.showConfirmDialog(this, "Deseja remover a imagem?", "Remover imagem", JOptionPane.YES_NO_OPTION);
       if(escolhaRemovImg == 0){
           imgProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produtos/t1.png"))); 
           lblRemovImg.setVisible(false);   
       }
    }//GEN-LAST:event_lblRemovImgMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LayerProduto;
    private javax.swing.JPanel btnAddProduto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JLabel btnExpandCollapse;
    private javax.swing.JComboBox<String> cboFiltro;
    private javax.swing.JComboBox<String> cboProdCategoria;
    private javax.swing.JComboBox<String> cboProdCorredor;
    private javax.swing.JComboBox<String> cboProdPratileira;
    private javax.swing.JLabel imgDefaultProd;
    private javax.swing.JLabel imgProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddImg;
    private javax.swing.JLabel lblAddProduto;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodBarras;
    private javax.swing.JLabel lblDescAdd;
    private javax.swing.JLabel lblDescEdit;
    private javax.swing.JLabel lblDescPnl;
    private javax.swing.JLabel lblDescr;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JLabel lblInfoProduto;
    private javax.swing.JLabel lblMargemLucro;
    private javax.swing.JLabel lblPordutos;
    private javax.swing.JLabel lblPratileira;
    private javax.swing.JLabel lblRemovImg;
    private javax.swing.JLabel lblValorCusto;
    private javax.swing.JLabel lblValorVenda;
    private javax.swing.JPanel pnlAdicionarProd;
    private javax.swing.JPanel pnlArmazem;
    private javax.swing.JPanel pnlDefault;
    private javax.swing.JPanel pnlIdentAdd;
    private javax.swing.JPanel pnlProdutos;
    private javax.swing.JPanel pnlValores;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JLabel txtCorredor;
    private javax.swing.JTextField txtDescProd;
    private javax.swing.JTextField txtMargemLucro;
    private javax.swing.JTextField txtProdValorCusto;
    private javax.swing.JTextField txtProdValorVenda;
    // End of variables declaration//GEN-END:variables
}
