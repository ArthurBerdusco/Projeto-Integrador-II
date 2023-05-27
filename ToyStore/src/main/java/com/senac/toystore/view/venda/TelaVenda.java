package com.senac.toystore.view.venda;

import com.senac.toystore.model.Cliente;
import com.senac.toystore.model.Produto;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.senac.toystore.DAO.*;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TelaVenda extends javax.swing.JInternalFrame {

    ArrayList<Produto> listaProduto = new ArrayList<>();
    ArrayList<Cliente> listaCliente = new ArrayList<>();

    public TelaVenda(String nomeVendedor) {
        try {
            initComponents();
            txtNomeVendedor.setText(nomeVendedor);
            setMaximum(true);
            listaProduto = ProdutoDAO.listar();
            listaCliente = ClienteDAO.listar();
            jcbNomeCliente.addItem("<Selecione o Cliente>");
            jcbNomeProduto.addItem("<Selecione o produto>");
            for (int i = 0; i < listaCliente.size(); i++) {
                jcbNomeCliente.addItem(listaCliente.get(i).getNome());
            }

            for (int i = 0; i < listaProduto.size(); i++) {
                jcbNomeProduto.addItem(listaProduto.get(i).getDescricao());
            }

        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcbNomeCliente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbNomeProduto = new javax.swing.JComboBox<>();
        btdAdicionarProduto = new javax.swing.JButton();
        btdBuscarCliente = new javax.swing.JButton();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroVenda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jblHora = new javax.swing.JLabel();
        txtDesconto1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnExcluirProduto = new javax.swing.JButton();
        txtCancelarVenda = new javax.swing.JButton();
        btnConcluirVenda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        pnIcon = new javax.swing.JPanel();
        imgVenda = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeVendedor = new javax.swing.JTextField();

        setTitle("Vendas");
        setPreferredSize(new java.awt.Dimension(1350, 780));

        tblProdutos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tblProdutos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Qtd", "Valor unitario", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.setRowHeight(35);
        tblProdutos.setShowGrid(false);
        jScrollPane2.setViewportView(tblProdutos);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CPF Cliente");

        jcbNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeClienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nome Cliente");

        txtProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });
        txtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProdutoKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Buscar produto");

        jcbNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeProdutoActionPerformed(evt);
            }
        });

        btdAdicionarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btdAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venda/adicionar-ao-carrinho.png"))); // NOI18N
        btdAdicionarProduto.setText("Adicionar Produto");
        btdAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdAdicionarProdutoActionPerformed(evt);
            }
        });

        btdBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btdBuscarCliente.setText("Buscar Cliente");
        btdBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdBuscarClienteActionPerformed(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome Produto");

        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuantidade.setText("1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Quantidade");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuantidade))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btdAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(btdBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btdBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jcbNomeProduto)
                            .addComponent(txtQuantidade)))
                    .addComponent(btdAdicionarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );

        txtNumeroVenda.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtNumeroVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumeroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroVendaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("NF:");

        txtValorTotal.setBackground(new java.awt.Color(0, 0, 0));
        txtValorTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtValorTotal.setText("R$0");
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Valor Total");

        txtDesconto.setBackground(new java.awt.Color(0, 0, 0));
        txtDesconto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDesconto.setForeground(new java.awt.Color(255, 255, 255));
        txtDesconto.setText("%--");
        txtDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescontoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Desconto");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Vendedor:");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jblHora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        txtDesconto1.setBackground(new java.awt.Color(0, 0, 0));
        txtDesconto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDesconto1.setForeground(new java.awt.Color(255, 255, 255));
        txtDesconto1.setText("R$");
        txtDesconto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesconto1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("SubTotal");

        btnExcluirProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venda/excluir (1).png"))); // NOI18N
        btnExcluirProduto.setText("Excluir Produto");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        txtCancelarVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCancelarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venda/cancelamento (1).png"))); // NOI18N
        txtCancelarVenda.setText("Cancelar Venda");
        txtCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancelarVendaActionPerformed(evt);
            }
        });

        btnConcluirVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConcluirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venda/forma-de-pagamento (1).png"))); // NOI18N
        btnConcluirVenda.setText("Pagamento");
        btnConcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCancelarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConcluirVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto/add-img.png"))); // NOI18N
        lblImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnIcon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        imgVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venda/vendas.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Venda");

        javax.swing.GroupLayout pnIconLayout = new javax.swing.GroupLayout(pnIcon);
        pnIcon.setLayout(pnIconLayout);
        pnIconLayout.setHorizontalGroup(
            pnIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIconLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pnIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(imgVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnIconLayout.setVerticalGroup(
            pnIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIconLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(imgVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        txtNomeVendedor.setEditable(false);
        txtNomeVendedor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNomeVendedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(175, 175, 175)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNumeroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNumeroVenda)
                                            .addComponent(txtNomeVendedor))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jblHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pnIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeClienteActionPerformed

    }//GEN-LAST:event_jcbNomeClienteActionPerformed

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void jcbNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNomeProdutoActionPerformed

    private void btdAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdAdicionarProdutoActionPerformed

        DefaultTableModel dtmProdutos = (DefaultTableModel) tblProdutos.getModel();
        Object[] dados = {txtProduto.getText(), txtQuantidade.getText()};
        dtmProdutos.addRow(dados);

        txtProduto.setText("");
        txtQuantidade.setText("");

        txtProduto.requestFocus();
    }//GEN-LAST:event_btdAdicionarProdutoActionPerformed

    private void btdBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdBuscarClienteActionPerformed

    }//GEN-LAST:event_btdBuscarClienteActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtNumeroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroVendaActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed

    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void txtDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescontoActionPerformed

    private void txtDesconto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesconto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesconto1ActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        ((DefaultTableModel) tblProdutos.getModel()).removeRow(tblProdutos.getSelectedRow());
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void txtCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelarVendaActionPerformed
        JOptionPane.showMessageDialog(this, "Função em desenvolvimento !");
        Administrador cancelar = new Administrador();
        cancelar.setVisible(true);
    }//GEN-LAST:event_txtCancelarVendaActionPerformed

    private void txtCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyReleased
        String cpf = txtCpf.getText().trim().replace(".", "").replace("-", "");

        if (cpf.length() == 11) {

            for (Cliente cliente : listaCliente) {
                if (cpf.equals(cliente.getCpf())) {
                    jcbNomeCliente.setSelectedItem(cliente.getNome());
                    return;
                }
            }
        }
    }//GEN-LAST:event_txtCpfKeyReleased

    private void txtProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyReleased
        String codBarras = txtProduto.getText().trim();

        if (codBarras.length() == 10) {

            for (Produto produto : listaProduto) {
                if (codBarras.equals(produto.getCod_barras())) {

                    jcbNomeProduto.setSelectedItem(produto.getDescricao());

                    DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();

                    modelo.addRow(new String[]{
                        produto.getCod_barras(),
                        produto.getDescricao(),
                        txtQuantidade.getText(),
                        String.valueOf(produto.getValorVenda()),
                        String.valueOf(produto.getValorVenda() * Integer.parseInt(txtQuantidade.getText())),});
                    txtProduto.setText("");
                    jcbNomeProduto.setSelectedItem("");

                    if (produto.getFoto() != null) {
                        lblImg.setIcon(getImagemProduto(produto));
                    }else{
                        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto/add-img.png")));
                    }

                    float valorTotal = produto.getValorVenda() * Integer.parseInt(txtQuantidade.getText());
                    txtValorTotal.setText("R$" + String.valueOf(Float.parseFloat(txtValorTotal.getText().trim().replace("R$", "")) + valorTotal));
                    return;
                }
            }
        }
    }//GEN-LAST:event_txtProdutoKeyReleased

    private void btnConcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirVendaActionPerformed
        new TelaPagamento().setVisible(true);
    }//GEN-LAST:event_btnConcluirVendaActionPerformed

    public ImageIcon getImagemProduto(Produto produto) {
        ImageIcon imageIcon = null;
        Blob blob = produto.getFoto();

        try {
            byte[] imageBytes = blob.getBytes(1, (int) blob.length());
            InputStream inputStream = new ByteArrayInputStream(imageBytes);
            try {
                Image image = ImageIO.read(inputStream);
                Image resizedImage = image.getScaledInstance(170, 220, Image.SCALE_SMOOTH);
                imageIcon = new ImageIcon(resizedImage);
            } catch (IOException ex) {
                System.out.println("Erro ao ler imagem");
            }
        } catch (SQLException ex) {
            System.out.println("Erro no blob");
        }
        return imageIcon;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdAdicionarProduto;
    private javax.swing.JButton btdBuscarCliente;
    private javax.swing.JButton btnConcluirVenda;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JLabel imgVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jblHora;
    private javax.swing.JComboBox<String> jcbNomeCliente;
    private javax.swing.JComboBox<String> jcbNomeProduto;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblImg;
    private javax.swing.JPanel pnIcon;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JButton txtCancelarVenda;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtDesconto1;
    private javax.swing.JTextField txtNomeVendedor;
    private javax.swing.JTextField txtNumeroVenda;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
