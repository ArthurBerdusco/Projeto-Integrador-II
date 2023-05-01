package com.senac.produto;

import com.senac.utils.CampoTextoPadrao;
import com.senac.utils.Validador;
import java.awt.Color;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FormProduto extends javax.swing.JFrame {

    public FormProduto() {
        initComponents();
    }
    
    public FormProduto(Produto produto){
        initComponents();
        txtDescProd.setText(produto.getDescricao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
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
        cboProdPratileira = new javax.swing.JComboBox<>();
        cboProdCorredor = new javax.swing.JComboBox<>();
        lblPratileira = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        cboProdCategoria = new javax.swing.JComboBox<>();
        spnQntProd = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 810));

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        pnlIdentAdd.setBackground(new java.awt.Color(255, 255, 255));
        pnlIdentAdd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identifificação", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        lblCodBarras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodBarras.setText("Código de Barras:");

        lblDescr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescr.setText("Descrição:");

        txtCodBarras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodBarras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        txtCodBarras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodBarrasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodBarrasFocusLost(evt);
            }
        });

        txtDescProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        txtDescProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescProdFocusLost(evt);
            }
        });

        imgProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        imgProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto/add-img.png"))); // NOI18N
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
                .addGroup(pnlIdentAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDescr)
                    .addComponent(lblCodBarras)
                    .addComponent(txtDescProd, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(txtCodBarras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlValores.setBackground(new java.awt.Color(255, 255, 255));
        pnlValores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        lblValorCusto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorCusto.setText("Valor de Custo:");

        lblValorVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorVenda.setText("Valor de Venda:");

        lblMargemLucro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMargemLucro.setText("Mangem de Lucro:");

        txtMargemLucro.setEditable(false);
        txtMargemLucro.setBackground(java.awt.Color.lightGray);
        txtMargemLucro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtMargemLucro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));

        txtProdValorVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProdValorVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        txtProdValorVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProdValorVendaFocusGained(evt);
            }
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
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProdValorCustoFocusGained(evt);
            }
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
                    .addComponent(lblMargemLucro)
                    .addComponent(lblValorVenda)
                    .addComponent(txtProdValorVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(txtMargemLucro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProdValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorCusto))
                .addGap(15, 15, 15))
        );
        pnlValoresLayout.setVerticalGroup(
            pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorCusto)
                    .addComponent(lblValorVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProdValorVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(txtProdValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMargemLucro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMargemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pnlArmazem.setBackground(new java.awt.Color(255, 255, 255));
        pnlArmazem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        txtCorredor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCorredor.setText("Corredor:");

        cboProdPratileira.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboProdPratileira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "1", "2" }));
        cboProdPratileira.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        cboProdPratileira.setName("Pratileira"); // NOI18N

        cboProdCorredor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboProdCorredor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "A", "B", "C" }));
        cboProdCorredor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        cboProdCorredor.setName("Corredor"); // NOI18N

        lblPratileira.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPratileira.setText("Pratileira:");

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategoria.setText("Categoria:");

        cboProdCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboProdCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Bebês", "Tabuleiro e cartas", "Educacionais", "Véiculos", "Ação e aventura", "Esporte e atividade ar livre", "Musicais", "Fantasia", "Eletrônicos" }));
        cboProdCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        cboProdCategoria.setName("Categoria"); // NOI18N

        spnQntProd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        spnQntProd.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Quantidade:");

        javax.swing.GroupLayout pnlArmazemLayout = new javax.swing.GroupLayout(pnlArmazem);
        pnlArmazem.setLayout(pnlArmazemLayout);
        pnlArmazemLayout.setHorizontalGroup(
            pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArmazemLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorredor)
                    .addComponent(lblCategoria)
                    .addComponent(cboProdCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboProdCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(spnQntProd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cboProdPratileira, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPratileira))
                .addGap(17, 17, 17))
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
                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnQntProd)
                    .addGroup(pnlArmazemLayout.createSequentialGroup()
                        .addComponent(cboProdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlArmazem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlIdentAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlIdentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlArmazem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void lblAddImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddImgMouseEntered
        lblAddImg.setBackground(Color.BLACK.white);
        lblAddImg.setForeground(Color.black);
    }//GEN-LAST:event_lblAddImgMouseEntered

    private void lblAddImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddImgMouseExited
        lblAddImg.setBackground(new Color(52, 134, 242));
        lblAddImg.setForeground(Color.white);
    }//GEN-LAST:event_lblAddImgMouseExited

    private void lblAddImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddImgMousePressed
//        //INSTANCIANDO FILE EXPLORER SWING
//        JFileChooser procurarArquivoImagem = new JFileChooser();
//        //DEFINIR FILTRO SOMENTE PARA ARQUIVOS COM EXTENSAO IMAGEM
//        FileNameExtensionFilter fExtImg = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
//        procurarArquivoImagem.addChoosableFileFilter(fExtImg);
//
//        //ABRIR FILE EXPLORER
//        int janelaDialog = procurarArquivoImagem.showOpenDialog(this);
//
//        if (janelaDialog == JFileChooser.APPROVE_OPTION) {
//            File imagemSelecionada = procurarArquivoImagem.getSelectedFile();
//            String pastaImagemSelecionada = imagemSelecionada.getAbsolutePath();
//
//            try {
//                //OBTÉM O CAMINHO ABSOLUTO DA PASTA "RESOURCES" DENTRO DO PROJETO
//                String resourcesPath = "";
//                try {
//                    resourcesPath = new File(".").getCanonicalPath() + "\\src\\main" + File.separator + "resources";
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//                String destinationPath = resourcesPath + File.separator + "produtos";
//                File destinationDir = new File(destinationPath);
//
//                try {
//                    //COPIA O ARQUIVO DA PASTA SELECIONADA PARA PASTA RESOURSES DO PROJETO
//                    if (Files.exists(Paths.get(destinationPath).resolve(imagemSelecionada.getName()))) {
//                        Files.copy(imagemSelecionada.toPath(), Paths.get(destinationPath).resolve(listaProdutos.get(auxIndiceEditProd).getCod_barras() + imagemSelecionada.getName()));
//                    } else {
//                        Files.copy(imagemSelecionada.toPath(), Paths.get(destinationPath).resolve(imagemSelecionada.getName()));
//                    }
//                    System.out.println("Imagem copiada com sucesso!");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//                //INSERE A IMAGEM A NO FORMULARIO RENDERIZADA COM TAMANHO 200X 150
//                imagemSelecionada = new File(destinationPath + File.separator + imagemSelecionada.getName());
//                BufferedImage originalImage = ImageIO.read(imagemSelecionada);
//                Image resizedImage = originalImage.getScaledInstance(150, 200, Image.SCALE_FAST);
//                ImageIcon icon = new ImageIcon(resizedImage);
//                imgProduto.setIcon(icon);
//                lblRemovImg.setVisible(true);
//                this.auxLocalFoto = "/produtos/" + imagemSelecionada.getName();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//                JOptionPane.showMessageDialog(this, "Imagem inválida", "Erro ao adicionar imagem", JOptionPane.ERROR_MESSAGE);
//            }
//        }
    }//GEN-LAST:event_lblAddImgMousePressed

    private void lblRemovImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemovImgMouseEntered
        lblRemovImg.setBackground(Color.white);
        lblRemovImg.setForeground(Color.black);
    }//GEN-LAST:event_lblRemovImgMouseEntered

    private void lblRemovImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemovImgMouseExited
        lblRemovImg.setBackground(new Color(52, 134, 242));
        lblRemovImg.setForeground(Color.white);
    }//GEN-LAST:event_lblRemovImgMouseExited

    private void lblRemovImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemovImgMousePressed
//        int escolhaRemovImg = JOptionPane.showConfirmDialog(this, "Deseja remover a imagem?", "Remover imagem", JOptionPane.YES_NO_OPTION);
//        if (escolhaRemovImg == 0) {
//            imgProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produtos/t1.png")));
//            this.auxLocalFoto = "/produtos/t1.png";
//            listaProdutos.get(this.auxIndiceEditProd).setLocalFoto("/produtos/t1.png");
//            lblRemovImg.setVisible(false);
//        }
    }//GEN-LAST:event_lblRemovImgMousePressed

    private void txtProdValorVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdValorVendaKeyTyped

        if (!(String.valueOf(evt.getKeyChar()).matches("[0-9-,]+")) || (evt.getKeyChar() == '-')) {
            evt.consume();
        }

    }//GEN-LAST:event_txtProdValorVendaKeyTyped

    private void txtProdValorCustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdValorCustoKeyTyped

        if (!(String.valueOf(evt.getKeyChar()).matches("[0-9-,]+")) || (evt.getKeyChar() == '-')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProdValorCustoKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDescProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescProdFocusGained
        CampoTextoPadrao.focar(txtDescProd);
    }//GEN-LAST:event_txtDescProdFocusGained

    private void txtDescProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescProdFocusLost
        CampoTextoPadrao.desfocar(txtDescProd);
    }//GEN-LAST:event_txtDescProdFocusLost

    private void txtCodBarrasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodBarrasFocusGained
        CampoTextoPadrao.focar(txtCodBarras);
    }//GEN-LAST:event_txtCodBarrasFocusGained

    private void txtCodBarrasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodBarrasFocusLost
        CampoTextoPadrao.desfocar(txtCodBarras);
    }//GEN-LAST:event_txtCodBarrasFocusLost

    private void txtProdValorVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdValorVendaFocusGained
        CampoTextoPadrao.focar(txtProdValorVenda);
    }//GEN-LAST:event_txtProdValorVendaFocusGained

    private void txtProdValorVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdValorVendaFocusLost
        CampoTextoPadrao.desfocar(txtProdValorVenda);
    }//GEN-LAST:event_txtProdValorVendaFocusLost

    private void txtProdValorCustoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdValorCustoFocusGained
        CampoTextoPadrao.focar(txtProdValorCusto);
    }//GEN-LAST:event_txtProdValorCustoFocusGained

    private void txtProdValorCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdValorCustoFocusLost
        CampoTextoPadrao.desfocar(txtProdValorCusto);
    }//GEN-LAST:event_txtProdValorCustoFocusLost

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
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboProdCategoria;
    private javax.swing.JComboBox<String> cboProdCorredor;
    private javax.swing.JComboBox<String> cboProdPratileira;
    private javax.swing.JLabel imgProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddImg;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodBarras;
    private javax.swing.JLabel lblDescr;
    private javax.swing.JLabel lblMargemLucro;
    private javax.swing.JLabel lblPratileira;
    private javax.swing.JLabel lblRemovImg;
    private javax.swing.JLabel lblValorCusto;
    private javax.swing.JLabel lblValorVenda;
    private javax.swing.JPanel pnlArmazem;
    private javax.swing.JPanel pnlIdentAdd;
    private javax.swing.JPanel pnlValores;
    private javax.swing.JSpinner spnQntProd;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JLabel txtCorredor;
    private javax.swing.JTextField txtDescProd;
    private javax.swing.JTextField txtMargemLucro;
    private javax.swing.JTextField txtProdValorCusto;
    private javax.swing.JTextField txtProdValorVenda;
    // End of variables declaration//GEN-END:variables
}
