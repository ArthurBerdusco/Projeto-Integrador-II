package com.senac.produto;

import java.awt.Color;

public class TelaProduto extends javax.swing.JPanel {

    public TelaProduto() {
        initComponents();
        pnlAdicionarProd.setVisible(false);
        pnlDefault.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LayerProduto = new javax.swing.JLayeredPane();
        pnlAdicionarProd = new javax.swing.JPanel();
        lblInfoProduto = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        pnlAddProduto = new javax.swing.JPanel();
        imgProd = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblCodBarras = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblDescr = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCodBarras = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtFabric = new javax.swing.JLabel();
        txtFrabric = new javax.swing.JTextField();
        pnlValores = new javax.swing.JPanel();
        lblValorCusto = new javax.swing.JLabel();
        lblValorVenda = new javax.swing.JLabel();
        lblMargemLucro = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JTextField();
        txtValorCusto = new javax.swing.JTextField();
        txtMargemLucro = new javax.swing.JTextField();
        pnlArmazem = new javax.swing.JPanel();
        txtCorredor = new javax.swing.JLabel();
        cboCorredor = new javax.swing.JComboBox<>();
        lblGondola = new javax.swing.JLabel();
        cboPratileira = new javax.swing.JComboBox<>();
        lblPratileira = new javax.swing.JLabel();
        cboGondola = new javax.swing.JComboBox<>();
        btnGerenciar = new javax.swing.JToggleButton();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JComboBox<>();
        pnlFornecedor = new javax.swing.JPanel();
        lblNomeForn = new javax.swing.JLabel();
        txtNomeForn = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        pnlDefault = new javax.swing.JPanel();
        imgProduto = new javax.swing.JLabel();
        lblDescPnl = new javax.swing.JLabel();
        lblDescEdit = new javax.swing.JLabel();
        lblDescAdd = new javax.swing.JLabel();
        pnlCadastrarProd = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnlAddProduto1 = new javax.swing.JPanel();
        imgProd1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblID1 = new javax.swing.JLabel();
        lblCodBarras1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblDescr1 = new javax.swing.JLabel();
        txtId1 = new javax.swing.JTextField();
        txtCodBarras1 = new javax.swing.JTextField();
        txtNome1 = new javax.swing.JTextField();
        txtDesc1 = new javax.swing.JTextField();
        txtFabric1 = new javax.swing.JLabel();
        txtFrabric1 = new javax.swing.JTextField();
        pnlFornecedor1 = new javax.swing.JPanel();
        lblNomeForn1 = new javax.swing.JLabel();
        lblTelefone1 = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        txtTelefone1 = new javax.swing.JTextField();
        lblEndereco1 = new javax.swing.JLabel();
        txtEndereco1 = new javax.swing.JTextField();
        lblNumero1 = new javax.swing.JLabel();
        txtNumero1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pnlArmazem1 = new javax.swing.JPanel();
        txtCorredor1 = new javax.swing.JLabel();
        cboCorredor1 = new javax.swing.JComboBox<>();
        lblGondola1 = new javax.swing.JLabel();
        cboPratileira1 = new javax.swing.JComboBox<>();
        lblPratileira1 = new javax.swing.JLabel();
        cboGondola1 = new javax.swing.JComboBox<>();
        lblCategoria1 = new javax.swing.JLabel();
        txtCategoria1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        tabPainel = new javax.swing.JTabbedPane();
        tabDispVenda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblFiltrar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        cboFiltro = new javax.swing.JComboBox<>();
        btnExpandCollapse = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAddProduto = new javax.swing.JPanel();
        lblAddProduto = new javax.swing.JLabel();
        tabEstoqueVenda = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos1 = new javax.swing.JTable();
        lblFiltrar1 = new javax.swing.JLabel();
        lblBuscar1 = new javax.swing.JLabel();
        txtBusca1 = new javax.swing.JTextField();
        cboFiltro1 = new javax.swing.JComboBox<>();
        btnExpandCollapse1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCadastroBrinquedo = new javax.swing.JPanel();
        lblCadastrarBrinquedo = new javax.swing.JLabel();
        tabCadasFornec = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1350, 780));

        LayerProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LayerProduto.setPreferredSize(new java.awt.Dimension(548, 761));

        pnlAdicionarProd.setBackground(new java.awt.Color(255, 255, 255));

        lblInfoProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInfoProduto.setText("INFORMAÇÕES DO BRINQUEDO");

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        pnlAddProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificação"));

        imgProd.setBackground(new java.awt.Color(204, 204, 255));
        imgProd.setOpaque(true);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("add");
        jButton2.setPreferredSize(new java.awt.Dimension(36, 36));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("X");

        lblID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblID.setText("ID:");

        lblCodBarras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodBarras.setText("CÓDIGO DE BARRAS:");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNome.setText("NOME:");

        lblDescr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescr.setText("DESCRIÇÃO:");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCodBarras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtFabric.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFabric.setText("FABRICANTE:");

        javax.swing.GroupLayout pnlAddProdutoLayout = new javax.swing.GroupLayout(pnlAddProduto);
        pnlAddProduto.setLayout(pnlAddProdutoLayout);
        pnlAddProdutoLayout.setHorizontalGroup(
            pnlAddProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFabric)
                    .addComponent(txtFrabric, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescr)
                    .addGroup(pnlAddProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCodBarras, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCodBarras, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addGroup(pnlAddProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pnlAddProdutoLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3))
                    .addComponent(imgProd, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAddProdutoLayout.setVerticalGroup(
            pnlAddProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddProdutoLayout.createSequentialGroup()
                .addComponent(lblID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddProdutoLayout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodBarras)
                        .addGap(3, 3, 3)
                        .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDescr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFabric)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFrabric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddProdutoLayout.createSequentialGroup()
                        .addComponent(imgProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlAddProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        pnlValores.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));

        lblValorCusto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorCusto.setText("VALOR DE CUSTO:");

        lblValorVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorVenda.setText("VALOR DE VENDA:");

        lblMargemLucro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMargemLucro.setText("MARGEM LUCRO:");

        txtValorVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtValorCusto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtMargemLucro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlValoresLayout = new javax.swing.GroupLayout(pnlValores);
        pnlValores.setLayout(pnlValoresLayout);
        pnlValoresLayout.setHorizontalGroup(
            pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorVenda))
                .addGap(96, 96, 96)
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorCusto)
                    .addComponent(txtValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMargemLucro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMargemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlValoresLayout.setVerticalGroup(
            pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresLayout.createSequentialGroup()
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorVenda)
                    .addComponent(lblValorCusto)
                    .addComponent(lblMargemLucro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMargemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pnlArmazem.setBorder(javax.swing.BorderFactory.createTitledBorder("Armazenamento"));

        txtCorredor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCorredor.setText("CORREDOR:");

        cboCorredor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboCorredor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "1", "2", "3" }));

        lblGondola.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGondola.setText("GONDOLA:");

        cboPratileira.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboPratileira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "A", "B", "C", "D", "E" }));

        lblPratileira.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPratileira.setText("PRATILEIRA:");

        cboGondola.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboGondola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "1", "2" }));

        btnGerenciar.setText("GERENCIAR ESTOQUE");

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategoria.setText("CATEGORIA:");

        txtCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Bebês", "Tabuleiro e cartas", "Educacionais", "Véiculos", "Ação e aventura", "Esporte e atividade ao ar livre", "Musicais", "Fantasia", "Eletrônicos" }));

        javax.swing.GroupLayout pnlArmazemLayout = new javax.swing.GroupLayout(pnlArmazem);
        pnlArmazem.setLayout(pnlArmazemLayout);
        pnlArmazemLayout.setHorizontalGroup(
            pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArmazemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorredor)
                    .addComponent(lblGondola)
                    .addComponent(cboCorredor, 0, 157, Short.MAX_VALUE)
                    .addComponent(cboGondola, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlArmazemLayout.createSequentialGroup()
                        .addComponent(lblPratileira)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlArmazemLayout.createSequentialGroup()
                        .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlArmazemLayout.createSequentialGroup()
                                .addComponent(cboPratileira, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(44, 44, 44))
                            .addGroup(pnlArmazemLayout.createSequentialGroup()
                                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCategoria))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnGerenciar)
                        .addGap(22, 22, 22))))
        );
        pnlArmazemLayout.setVerticalGroup(
            pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArmazemLayout.createSequentialGroup()
                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPratileira)
                    .addComponent(txtCorredor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlArmazemLayout.createSequentialGroup()
                        .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPratileira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGondola)
                            .addComponent(lblCategoria))
                        .addGap(3, 3, 3)
                        .addGroup(pnlArmazemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboGondola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor"));

        lblNomeForn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNomeForn.setText("NOME:");

        txtNomeForn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTelefone.setText("TELEFONE:");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("E-MAIL:");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEndereco.setText("ENDEREÇO:");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumero.setText("NUMERO:");

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlFornecedorLayout = new javax.swing.GroupLayout(pnlFornecedor);
        pnlFornecedor.setLayout(pnlFornecedorLayout);
        pnlFornecedorLayout.setHorizontalGroup(
            pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFornecedorLayout.createSequentialGroup()
                        .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNomeForn)
                            .addComponent(lblEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(txtNomeForn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEmail)
                            .addComponent(lblTelefone)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(txtTelefone)))
                    .addGroup(pnlFornecedorLayout.createSequentialGroup()
                        .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFornecedorLayout.setVerticalGroup(
            pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFornecedorLayout.createSequentialGroup()
                .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeForn)
                    .addComponent(lblTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lblNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAdicionarProdLayout = new javax.swing.GroupLayout(pnlAdicionarProd);
        pnlAdicionarProd.setLayout(pnlAdicionarProdLayout);
        pnlAdicionarProdLayout.setHorizontalGroup(
            pnlAdicionarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdicionarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAddProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdicionarProdLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(pnlValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlAdicionarProdLayout.createSequentialGroup()
                        .addComponent(lblInfoProduto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlArmazem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAdicionarProdLayout.setVerticalGroup(
            pnlAdicionarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlArmazem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pnlDefault.setBackground(new java.awt.Color(255, 255, 255));
        pnlDefault.setPreferredSize(new java.awt.Dimension(526, 764));

        imgProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto2.jpg"))); // NOI18N

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
                .addComponent(imgProduto)
                .addComponent(lblDescPnl)
                .addComponent(lblDescEdit)
                .addComponent(lblDescAdd))
        );
        pnlDefaultLayout.setVerticalGroup(
            pnlDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDefaultLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(imgProduto)
                .addGap(18, 18, 18)
                .addComponent(lblDescPnl)
                .addGap(18, 18, 18)
                .addComponent(lblDescEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescAdd)
                .addGap(40, 40, 40))
        );

        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pnlAddProduto1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificação"));

        imgProd1.setBackground(new java.awt.Color(204, 204, 255));
        imgProd1.setOpaque(true);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("add");
        jButton4.setPreferredSize(new java.awt.Dimension(36, 36));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("X");

        lblID1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblID1.setText("ID_PROD:");

        lblCodBarras1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodBarras1.setText("CÓDIGO DE BARRAS:");

        lblNome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNome1.setText("NOME:");

        lblDescr1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescr1.setText("DESCRIÇÃO:");

        txtId1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCodBarras1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDesc1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtFabric1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFabric1.setText("FABRICANTE:");

        javax.swing.GroupLayout pnlAddProduto1Layout = new javax.swing.GroupLayout(pnlAddProduto1);
        pnlAddProduto1.setLayout(pnlAddProduto1Layout);
        pnlAddProduto1Layout.setHorizontalGroup(
            pnlAddProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddProduto1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFabric1)
                    .addComponent(txtFrabric1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescr1)
                    .addGroup(pnlAddProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDesc1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                        .addComponent(txtId1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCodBarras1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNome1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCodBarras1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblID1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNome1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addGroup(pnlAddProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pnlAddProduto1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton5))
                    .addComponent(imgProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlAddProduto1Layout.setVerticalGroup(
            pnlAddProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddProduto1Layout.createSequentialGroup()
                .addComponent(lblID1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddProduto1Layout.createSequentialGroup()
                        .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodBarras1)
                        .addGap(3, 3, 3)
                        .addComponent(txtCodBarras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDescr1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFabric1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFrabric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddProduto1Layout.createSequentialGroup()
                        .addComponent(imgProd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlAddProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        pnlFornecedor1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor"));

        lblNomeForn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNomeForn1.setText("NOME:");

        lblTelefone1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTelefone1.setText("TELEFONE:");

        lblEmail1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail1.setText("E-MAIL:");

        txtEmail1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelefone1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblEndereco1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEndereco1.setText("ENDEREÇO:");

        txtEndereco1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblNumero1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumero1.setText("NUMERO:");

        txtNumero1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "KB BRINQUEDOS LTDA", "BRINCOLÂNDIA SA", "TOYVILLE BRASIL SA", "FUNTOPIA LTDA", "KIDZ KINGDOM LTDA", "HAPPYTIME TOYS SA " }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID_FORN:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlFornecedor1Layout = new javax.swing.GroupLayout(pnlFornecedor1);
        pnlFornecedor1.setLayout(pnlFornecedor1Layout);
        pnlFornecedor1Layout.setHorizontalGroup(
            pnlFornecedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFornecedor1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFornecedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeForn1)
                    .addComponent(lblEndereco1)
                    .addComponent(txtEndereco1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFornecedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero1)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFornecedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblEmail1)
                        .addComponent(lblTelefone1)
                        .addComponent(txtEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addComponent(txtTelefone1)))
                .addContainerGap())
        );
        pnlFornecedor1Layout.setVerticalGroup(
            pnlFornecedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFornecedor1Layout.createSequentialGroup()
                .addGroup(pnlFornecedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFornecedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFornecedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail1)
                    .addComponent(lblNomeForn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFornecedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFornecedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero1)
                    .addComponent(lblEndereco1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFornecedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlArmazem1.setBorder(javax.swing.BorderFactory.createTitledBorder("Armazenamento"));

        txtCorredor1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCorredor1.setText("CORREDOR:");

        cboCorredor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboCorredor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "1", "2", "3" }));

        lblGondola1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGondola1.setText("GONDOLA:");

        cboPratileira1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboPratileira1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "A", "B", "C", "D", "E" }));

        lblPratileira1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPratileira1.setText("PRATILEIRA:");

        cboGondola1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboGondola1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "1", "2" }));

        lblCategoria1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategoria1.setText("CATEGORIA:");

        txtCategoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Bebês", "Tabuleiro e cartas", "Educacionais", "Véiculos", "Ação e aventura", "Esporte e atividade ao ar livre", "Musicais", "Fantasia", "Eletrônicos" }));

        javax.swing.GroupLayout pnlArmazem1Layout = new javax.swing.GroupLayout(pnlArmazem1);
        pnlArmazem1.setLayout(pnlArmazem1Layout);
        pnlArmazem1Layout.setHorizontalGroup(
            pnlArmazem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArmazem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlArmazem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorredor1)
                    .addComponent(lblGondola1)
                    .addComponent(cboCorredor1, 0, 252, Short.MAX_VALUE)
                    .addComponent(cboGondola1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(pnlArmazem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlArmazem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCategoria1)
                        .addComponent(txtCategoria1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 252, Short.MAX_VALUE)
                        .addComponent(cboPratileira1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblPratileira1))
                .addContainerGap())
        );
        pnlArmazem1Layout.setVerticalGroup(
            pnlArmazem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArmazem1Layout.createSequentialGroup()
                .addGroup(pnlArmazem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPratileira1)
                    .addComponent(txtCorredor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlArmazem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCorredor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPratileira1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlArmazem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGondola1)
                    .addComponent(lblCategoria1))
                .addGap(3, 3, 3)
                .addGroup(pnlArmazem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGondola1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton6.setText("SALVAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastrarProdLayout = new javax.swing.GroupLayout(pnlCadastrarProd);
        pnlCadastrarProd.setLayout(pnlCadastrarProdLayout);
        pnlCadastrarProdLayout.setHorizontalGroup(
            pnlCadastrarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastrarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAddProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFornecedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlArmazem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarProdLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlCadastrarProdLayout.setVerticalGroup(
            pnlCadastrarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastrarProdLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pnlAddProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFornecedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlArmazem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(pnlCadastrarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addGap(91, 91, 91))
        );

        LayerProduto.setLayer(pnlAdicionarProd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayerProduto.setLayer(pnlDefault, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayerProduto.setLayer(pnlCadastrarProd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayerProdutoLayout = new javax.swing.GroupLayout(LayerProduto);
        LayerProduto.setLayout(LayerProdutoLayout);
        LayerProdutoLayout.setHorizontalGroup(
            LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdicionarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlDefault, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
            .addGroup(LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlCadastrarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LayerProdutoLayout.setVerticalGroup(
            LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdicionarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlDefault, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
            .addGroup(LayerProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlCadastrarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPainel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tabPainelComponentResized(evt);
            }
        });

        tabDispVenda.setBackground(new java.awt.Color(255, 255, 255));
        tabDispVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabDispVenda.setPreferredSize(new java.awt.Dimension(784, 713));

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PRODUTOS A VENDA");

        btnAddProduto.setBackground(new java.awt.Color(52, 134, 242));
        btnAddProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProduto.setPreferredSize(new java.awt.Dimension(120, 37));
        btnAddProduto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAddProdutoMouseMoved(evt);
            }
        });
        btnAddProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddProdutoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddProdutoMouseExited(evt);
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

        javax.swing.GroupLayout tabDispVendaLayout = new javax.swing.GroupLayout(tabDispVenda);
        tabDispVenda.setLayout(tabDispVendaLayout);
        tabDispVendaLayout.setHorizontalGroup(
            tabDispVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDispVendaLayout.createSequentialGroup()
                .addGroup(tabDispVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabDispVendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE))
                    .addGroup(tabDispVendaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(tabDispVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabDispVendaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExpandCollapse))
                            .addGroup(tabDispVendaLayout.createSequentialGroup()
                                .addGroup(tabDispVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFiltrar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(tabDispVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBusca)
                                    .addComponent(cboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        tabDispVendaLayout.setVerticalGroup(
            tabDispVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabDispVendaLayout.createSequentialGroup()
                .addGroup(tabDispVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabDispVendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExpandCollapse))
                    .addGroup(tabDispVendaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(tabDispVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabDispVendaLayout.createSequentialGroup()
                        .addGroup(tabDispVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFiltrar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabDispVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBusca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAddProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPainel.addTab("PRODUTOS DISPONÍVEIS", tabDispVenda);

        tabEstoqueVenda.setBackground(new java.awt.Color(255, 255, 255));
        tabEstoqueVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabEstoqueVenda.setPreferredSize(new java.awt.Dimension(784, 713));

        tblProdutos1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblProdutos1);

        lblFiltrar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFiltrar1.setText("FILTRAR POR:");

        lblBuscar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBuscar1.setText("BUSCAR:");

        txtBusca1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cboFiltro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboFiltro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnExpandCollapse1.setBackground(new java.awt.Color(255, 255, 255));
        btnExpandCollapse1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maximize.png"))); // NOI18N
        btnExpandCollapse1.setOpaque(true);
        btnExpandCollapse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExpandCollapse1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExpandCollapse1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExpandCollapse1MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PRODUTOS CADASTRADOS");

        btnCadastroBrinquedo.setBackground(new java.awt.Color(52, 134, 242));
        btnCadastroBrinquedo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastroBrinquedo.setPreferredSize(new java.awt.Dimension(120, 37));
        btnCadastroBrinquedo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCadastroBrinquedoMouseMoved(evt);
            }
        });
        btnCadastroBrinquedo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastroBrinquedoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastroBrinquedoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastroBrinquedoMouseExited(evt);
            }
        });

        lblCadastrarBrinquedo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCadastrarBrinquedo.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrarBrinquedo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastrarBrinquedo.setText("CADASTRAR");
        lblCadastrarBrinquedo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 134, 242)));
        lblCadastrarBrinquedo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnCadastroBrinquedoLayout = new javax.swing.GroupLayout(btnCadastroBrinquedo);
        btnCadastroBrinquedo.setLayout(btnCadastroBrinquedoLayout);
        btnCadastroBrinquedoLayout.setHorizontalGroup(
            btnCadastroBrinquedoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCadastroBrinquedoLayout.createSequentialGroup()
                .addComponent(lblCadastrarBrinquedo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnCadastroBrinquedoLayout.setVerticalGroup(
            btnCadastroBrinquedoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCadastroBrinquedoLayout.createSequentialGroup()
                .addComponent(lblCadastrarBrinquedo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabEstoqueVendaLayout = new javax.swing.GroupLayout(tabEstoqueVenda);
        tabEstoqueVenda.setLayout(tabEstoqueVendaLayout);
        tabEstoqueVendaLayout.setHorizontalGroup(
            tabEstoqueVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEstoqueVendaLayout.createSequentialGroup()
                .addGroup(tabEstoqueVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabEstoqueVendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tabEstoqueVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                            .addGroup(tabEstoqueVendaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnExpandCollapse1))))
                    .addGroup(tabEstoqueVendaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(tabEstoqueVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(tabEstoqueVendaLayout.createSequentialGroup()
                                .addGroup(tabEstoqueVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBuscar1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFiltrar1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(tabEstoqueVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBusca1)
                                    .addComponent(cboFiltro1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastroBrinquedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        tabEstoqueVendaLayout.setVerticalGroup(
            tabEstoqueVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabEstoqueVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExpandCollapse1)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tabEstoqueVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabEstoqueVendaLayout.createSequentialGroup()
                        .addGroup(tabEstoqueVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboFiltro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFiltrar1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabEstoqueVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBuscar1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBusca1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCadastroBrinquedo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPainel.addTab("CADASTRO PRODUTO", tabEstoqueVenda);

        javax.swing.GroupLayout tabCadasFornecLayout = new javax.swing.GroupLayout(tabCadasFornec);
        tabCadasFornec.setLayout(tabCadasFornecLayout);
        tabCadasFornecLayout.setHorizontalGroup(
            tabCadasFornecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );
        tabCadasFornecLayout.setVerticalGroup(
            tabCadasFornecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );

        tabPainel.addTab("CADASTRAR FORNECEDOR", tabCadasFornec);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LayerProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tabPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LayerProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        pnlAdicionarProd.setVisible(false);
        pnlDefault.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAddProdutoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProdutoMouseMoved
        Color corPersonalizada = new Color(255, 255, 255);
        Color corLabel = new Color(56, 134, 242);
        btnAddProduto.setBackground(corPersonalizada);
        lblAddProduto.setForeground(corLabel);
    }//GEN-LAST:event_btnAddProdutoMouseMoved

    private void btnAddProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProdutoMouseClicked
        LayerProduto.setVisible(true);
        pnlAdicionarProd.setVisible(true);
        pnlCadastrarProd.setVisible(false);
        pnlDefault.setVisible(false);
    }//GEN-LAST:event_btnAddProdutoMouseClicked

    private void btnAddProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProdutoMouseExited
        Color corPersonalizada = new Color(56, 134, 242);
        btnAddProduto.setBackground(corPersonalizada);
        lblAddProduto.setForeground(Color.white);
    }//GEN-LAST:event_btnAddProdutoMouseExited

    private void btnCadastroBrinquedoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroBrinquedoMouseMoved

    }//GEN-LAST:event_btnCadastroBrinquedoMouseMoved

    private void btnCadastroBrinquedoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroBrinquedoMouseClicked
        LayerProduto.setVisible(true);
        pnlCadastrarProd.setVisible(true);
        pnlAdicionarProd.setVisible(false);
        pnlDefault.setVisible(false);
    }//GEN-LAST:event_btnCadastroBrinquedoMouseClicked

    private void btnCadastroBrinquedoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroBrinquedoMouseExited
        Color corPersonalizada = new Color(56, 134, 242);
        btnCadastroBrinquedo.setBackground(corPersonalizada);
        lblCadastrarBrinquedo.setForeground(Color.white);
    }//GEN-LAST:event_btnCadastroBrinquedoMouseExited

    private void btnExpandCollapse1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpandCollapse1MousePressed
        if (tabPainel.getWidth() < 900) {
            LayerProduto.setVisible(false);

        } else {
            LayerProduto.setVisible(true);
        }
    }//GEN-LAST:event_btnExpandCollapse1MousePressed

    private void btnExpandCollapse1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpandCollapse1MouseExited
        btnExpandCollapse1.setBackground(Color.white);
    }//GEN-LAST:event_btnExpandCollapse1MouseExited

    private void btnExpandCollapse1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpandCollapse1MouseEntered
        btnExpandCollapse1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnExpandCollapse1MouseEntered

    private void btnExpandCollapseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpandCollapseMousePressed
        if (tabPainel.getWidth() < 900) {
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pnlCadastrarProd.setVisible(false);
        pnlAdicionarProd.setVisible(false);
        pnlDefault.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCadastroBrinquedoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroBrinquedoMouseEntered
        Color corLabel = new Color(56, 134, 242);
        btnCadastroBrinquedo.setBackground(Color.WHITE);
        lblCadastrarBrinquedo.setForeground(corLabel);
    }//GEN-LAST:event_btnCadastroBrinquedoMouseEntered

    private void tabPainelComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabPainelComponentResized
        if (tabPainel.getWidth() < 900) {
            btnExpandCollapse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maximize.png")));
            btnExpandCollapse1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maximize.png")));
        } else {
            btnExpandCollapse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/collapse.png")));
            btnExpandCollapse1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/collapse.png")));
        }
    }//GEN-LAST:event_tabPainelComponentResized

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LayerProduto;
    private javax.swing.JPanel btnAddProduto;
    private javax.swing.JPanel btnCadastroBrinquedo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel btnExpandCollapse;
    private javax.swing.JLabel btnExpandCollapse1;
    private javax.swing.JToggleButton btnGerenciar;
    private javax.swing.JComboBox<String> cboCorredor;
    private javax.swing.JComboBox<String> cboCorredor1;
    private javax.swing.JComboBox<String> cboFiltro;
    private javax.swing.JComboBox<String> cboFiltro1;
    private javax.swing.JComboBox<String> cboGondola;
    private javax.swing.JComboBox<String> cboGondola1;
    private javax.swing.JComboBox<String> cboPratileira;
    private javax.swing.JComboBox<String> cboPratileira1;
    private javax.swing.JLabel imgProd;
    private javax.swing.JLabel imgProd1;
    private javax.swing.JLabel imgProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAddProduto;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblBuscar1;
    private javax.swing.JLabel lblCadastrarBrinquedo;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCategoria1;
    private javax.swing.JLabel lblCodBarras;
    private javax.swing.JLabel lblCodBarras1;
    private javax.swing.JLabel lblDescAdd;
    private javax.swing.JLabel lblDescEdit;
    private javax.swing.JLabel lblDescPnl;
    private javax.swing.JLabel lblDescr;
    private javax.swing.JLabel lblDescr1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JLabel lblFiltrar1;
    private javax.swing.JLabel lblGondola;
    private javax.swing.JLabel lblGondola1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblInfoProduto;
    private javax.swing.JLabel lblMargemLucro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNomeForn;
    private javax.swing.JLabel lblNomeForn1;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblPratileira;
    private javax.swing.JLabel lblPratileira1;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblValorCusto;
    private javax.swing.JLabel lblValorVenda;
    private javax.swing.JPanel pnlAddProduto;
    private javax.swing.JPanel pnlAddProduto1;
    private javax.swing.JPanel pnlAdicionarProd;
    private javax.swing.JPanel pnlArmazem;
    private javax.swing.JPanel pnlArmazem1;
    private javax.swing.JPanel pnlCadastrarProd;
    private javax.swing.JPanel pnlDefault;
    private javax.swing.JPanel pnlFornecedor;
    private javax.swing.JPanel pnlFornecedor1;
    private javax.swing.JPanel pnlValores;
    private javax.swing.JPanel tabCadasFornec;
    private javax.swing.JPanel tabDispVenda;
    private javax.swing.JPanel tabEstoqueVenda;
    private javax.swing.JTabbedPane tabPainel;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTable tblProdutos1;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtBusca1;
    private javax.swing.JComboBox<String> txtCategoria;
    private javax.swing.JComboBox<String> txtCategoria1;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtCodBarras1;
    private javax.swing.JLabel txtCorredor;
    private javax.swing.JLabel txtCorredor1;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtDesc1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEndereco1;
    private javax.swing.JLabel txtFabric;
    private javax.swing.JLabel txtFabric1;
    private javax.swing.JTextField txtFrabric;
    private javax.swing.JTextField txtFrabric1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId1;
    private javax.swing.JTextField txtMargemLucro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNomeForn;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTelefone1;
    private javax.swing.JTextField txtValorCusto;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
}
