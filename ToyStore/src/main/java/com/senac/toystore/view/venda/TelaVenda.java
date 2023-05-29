package com.senac.toystore.view.venda;

import com.senac.toystore.model.Cliente;
import com.senac.toystore.model.Produto;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.senac.toystore.DAO.*;
import com.senac.toystore.model.ItemNota;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class TelaVenda extends javax.swing.JInternalFrame implements SincronizarDados {

    int idCliente;
    
    public void atualizarNavegacao() {
        listaProdutos = ProdutoDAO.listar();
        listaCliente = ClienteDAO.listar();
        listaProdutos = ProdutoDAO.listar();
        listaCliente = ClienteDAO.listar();

        String clienteSelecionado = "<Selecione o Cliente>";
        String cpfCliente = "";

        if (jcbNomeCliente.getSelectedItem() != null) {
            clienteSelecionado = jcbNomeCliente.getSelectedItem().toString();
            cpfCliente = txtCpf.getText();
        }

        jcbNomeCliente.removeAllItems();
        jcbNomeProduto.removeAllItems();
        jcbNomeCliente.addItem("<Selecione o Cliente>");
        jcbNomeProduto.addItem("<Selecione o Produto>");

        jcbNomeCliente.setSelectedItem(clienteSelecionado);
        txtCpf.setText(cpfCliente);
        for (int i = 0; i < listaCliente.size(); i++) {
            jcbNomeCliente.addItem(listaCliente.get(i).getNome());
        }

        for (int i = 0; i < listaProdutos.size(); i++) {
            jcbNomeProduto.addItem(listaProdutos.get(i).getDescricao());
        }
    }
    
    

    @Override
    public void sincronizar() {
        listaProdutos = ProdutoDAO.listar();
        listaCliente = ClienteDAO.listar();
        listaItens.clear();

        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
        modelo.setRowCount(0);

        txtQuantidade.setText("1");
        txtProduto.setText("");
        txtCpf.setText("");
        txtValorTotal.setText("R$0");
        jcbNomeCliente.setSelectedItem("<Selecione o Cliente>");
        jcbNomeProduto.setSelectedItem("<Selecione o Produto>");

    }

    private void setardata() {

        //Data
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(formatador.format(data));

        //hora
        Timer timer = new Timer(1000, new Hora());
        timer.start();

    }

    class Hora implements ActionListener {

        int i = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            jblHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }

    }

    ArrayList<Produto> listaProdutos = new ArrayList<>();
    ArrayList<Cliente> listaCliente = new ArrayList<>();

    ArrayList<ItemNota> listaItens = new ArrayList<>();

    String cpfCliente;
    String nomeVendedor;

    public TelaVenda(String nomeVendedor) {
        try {
            initComponents();
            this.nomeVendedor = nomeVendedor;
            txtNomeVendedor.setText(nomeVendedor);
            setMaximum(true);
            atualizarNavegacao();
            setardata();

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
        jLabel5 = new javax.swing.JLabel();
        jcbNomeProduto = new javax.swing.JComboBox<>();
        btdAdicionarProduto = new javax.swing.JButton();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JFormattedTextField();
        txtValorTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jblHora = new javax.swing.JLabel();
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
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        tblProdutos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tblProdutos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de barras", "Descrição", "Qtd", "Valor unitario", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jcbNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbNomeCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbNomeClienteItemStateChanged(evt);
            }
        });
        jcbNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeClienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nome Cliente");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cód.Barras Produto");

        jcbNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbNomeProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbNomeProdutoItemStateChanged(evt);
            }
        });
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

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCpfMousePressed(evt);
            }
        });
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome Produto");

        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQuantidade.setText("1");
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Quantidade");

        try {
            txtProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProdutoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtProdutoMousePressed(evt);
            }
        });
        txtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdutoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProdutoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProdutoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtProduto)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuantidade)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btdAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btdAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbNomeProduto)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(txtProduto))))
                .addGap(123, 123, 123))
        );

        txtValorTotal.setEditable(false);
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

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Vendedor:");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jblHora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                    .addComponent(txtCancelarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
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
                .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        txtNomeVendedor.setBackground(new java.awt.Color(0, 0, 0));
        txtNomeVendedor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNomeVendedor.setForeground(new java.awt.Color(255, 255, 255));
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(jLabel8))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNomeVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                            .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void btdAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdAdicionarProdutoActionPerformed
        adicionarProduto();
    }//GEN-LAST:event_btdAdicionarProdutoActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed

    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed

        if (tblProdutos.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
            int linha = tblProdutos.getSelectedRow();
            for (Produto produto : listaProdutos) {
                if (tblProdutos.getValueAt(linha, 0).equals(produto.getCod_barras())) {
                    int id = produto.getId();

                    for (int i = 0; i < listaItens.size(); i++) {
                        ItemNota item = listaItens.get(i);
                        if (id == item.getIdProduto()) {
                            listaItens.remove(item);
                            txtValorTotal.setText("R$" + String.valueOf(Float.parseFloat(txtValorTotal.getText().replace("R$", "")) - item.valorTotal()));
                        }
                    }

                }
            }

            modelo.removeRow(linha);

        } else if ((tblProdutos.getRowCount() > 0) && (tblProdutos.getSelectedRow() < 0)) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para remover");
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos no pedido para remover");
        }

    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void txtCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelarVendaActionPerformed
        int escolha = JOptionPane.showConfirmDialog(this, "Deseja confirmar o cancelamento da venda?", "Cancelar venda", JOptionPane.YES_NO_OPTION);
        if (escolha == 0) {
            sincronizar();
        }
    }//GEN-LAST:event_txtCancelarVendaActionPerformed

    private void txtCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyReleased
        String cpf = txtCpf.getText().trim().replace(".", "").replace("-", "");

        if (cpf.length() == 11) {

            for (Cliente cliente : listaCliente) {
                if (cpf.equals(cliente.getCpf())) {
                    jcbNomeCliente.setSelectedItem(cliente.getNome());

                }
            }
        }
    }//GEN-LAST:event_txtCpfKeyReleased

    private void btnConcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirVendaActionPerformed

        if (idCliente != -1) {

            TelaPagamento telaPagamento = new TelaPagamento(Float.parseFloat(txtValorTotal.getText().replace("R$", "")));
            telaPagamento.setCallback(this);
            telaPagamento.idCliente = this.idCliente; // Implementar
            telaPagamento.nomeVendedor = nomeVendedor;
            telaPagamento.listaItens = listaItens;

            telaPagamento.setVisible(true);
        } else if ((jcbNomeCliente.getSelectedItem().equals("<Selecione o Cliente>"))|| (this.idCliente == -1)) {
            JOptionPane.showMessageDialog(this, "Selecione o cliente");
        } else if ((tblProdutos.getRowCount() <= 0)) {
            JOptionPane.showMessageDialog(this, "Insira pelo menos um item no pedido para prosseguir com pagamento");
        }
    }//GEN-LAST:event_btnConcluirVendaActionPerformed

    private void jcbNomeClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbNomeClienteItemStateChanged
        String nomeCliente = String.valueOf(evt.getItem());
        if (nomeCliente == "<Selecione o Cliente>") {
            txtCpf.setText(null);
            txtCpf.setValue(null);
            this.idCliente = -1;
        } else {
            for (Cliente cliente : listaCliente) {
                if (cliente.getNome() == nomeCliente) {
                    txtCpf.setText(cliente.getCpf());
                    this.idCliente = cliente.getId();
                }
            }
        }
    }//GEN-LAST:event_jcbNomeClienteItemStateChanged

    private void txtCpfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCpfMousePressed
        txtCpf.setCaretPosition(0);
    }//GEN-LAST:event_txtCpfMousePressed

    private void txtProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProdutoMouseClicked


    }//GEN-LAST:event_txtProdutoMouseClicked

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed

    }//GEN-LAST:event_txtQuantidadeKeyPressed

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        try {
            char caracter = evt.getKeyChar();
            String numero = String.valueOf(caracter);
            int numeroTeste = Integer.parseInt(numero);
        } catch (Exception ex) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantidadeKeyTyped

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        atualizarNavegacao();
    }//GEN-LAST:event_formAncestorAdded

    private void jcbNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeClienteActionPerformed

    }//GEN-LAST:event_jcbNomeClienteActionPerformed

    private void txtProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyPressed

    }//GEN-LAST:event_txtProdutoKeyPressed

    private void txtProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyTyped

        if (txtProduto.getText().trim().length() < 10) {
            jcbNomeProduto.setSelectedItem("<Selecione o Produto>");
        }


    }//GEN-LAST:event_txtProdutoKeyTyped

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void txtProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyReleased
        if (txtProduto.getText().trim().length() == 10) {
            adicionarProduto();
            txtProduto.setText(null);
            txtProduto.setValue(null);
            txtProduto.requestFocusInWindow();
        }
        
    }//GEN-LAST:event_txtProdutoKeyReleased

    private void jcbNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeProdutoActionPerformed

    }//GEN-LAST:event_jcbNomeProdutoActionPerformed

    private void txtProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProdutoMousePressed
        txtProduto.setCaretPosition(0);
    }//GEN-LAST:event_txtProdutoMousePressed

    private void jcbNomeProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbNomeProdutoItemStateChanged
        String descricao = String.valueOf(evt.getItem());
        if (descricao == "<Selecione o Produto>") {
            txtProduto.setText(null);
            txtProduto.setValue(null);
        } else {
            for (Produto produto : listaProdutos) {
                
                if (produto.getDescricao() == descricao) {
                    txtProduto.setText(produto.getCod_barras());
                }
            }
        }
    }//GEN-LAST:event_jcbNomeProdutoItemStateChanged

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

    //Lógica responsavel por adicionar os produtos e fazer verificações de negócio relacionados a saldo e validações
    public void adicionarProduto() {
        String codBarras = txtProduto.getText().trim();

        boolean itemEncontrado = false;
        if ((Integer.parseInt(txtQuantidade.getText()) > 0)) {
            this.requestFocusInWindow();

            for (int i = 0; i < listaProdutos.size(); i++) {
                Produto produto = listaProdutos.get(i);

                if ((produto.getCod_barras().equals(codBarras)) && (produto.getQuantidade() > 0) && (Integer.parseInt(txtQuantidade.getText()) <= produto.getQuantidade())) {

                    jcbNomeProduto.setSelectedItem(produto.getDescricao());

                    if (produto.getFoto() != null) {
                        lblImg.setIcon(getImagemProduto(produto));
                    } else {
                        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto/add-img.png")));
                    }

                    ItemNota novoItem = new ItemNota();
                    novoItem.setIdProduto(produto.getId());
                    novoItem.setQtdProduto(Integer.parseInt(txtQuantidade.getText()));
                    novoItem.setVlrProduto(produto.getValorVenda());

                    if (listaItens.size() <= 0) {
                        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();

                        modelo.addRow(new String[]{
                            produto.getCod_barras(),
                            produto.getDescricao(),
                            String.valueOf(novoItem.getQtdProduto()),
                            String.valueOf(produto.getValorVenda()),
                            String.valueOf(produto.getValorVenda() * Integer.parseInt(txtQuantidade.getText())),});
                        listaItens.add(novoItem);
                        i = listaProdutos.size();
                        txtValorTotal.setText("R$" + String.valueOf(Float.parseFloat(txtValorTotal.getText().trim().replace("R$", "")) + novoItem.valorTotal()));
                    } else {

                        //VERIFICO SE O PRODUTO JÁ ESTA INCLUIDO NA TABELA INCREMENTO QNT E ATUALIZO O SALDO DA LINHA
                        for (int j = 0; j < listaItens.size(); j++) {
                            if ((listaItens.get(j).getIdProduto() == novoItem.getIdProduto())) {
                                ItemNota item = listaItens.get(j);
                                itemEncontrado = true;
                                if (item.getQtdProduto() + novoItem.getQtdProduto() <= produto.getQuantidade()) {
                                    int linha = listaItens.indexOf(item);

                                    item.setQtdProduto(item.getQtdProduto() + novoItem.getQtdProduto());

                                    DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
                                    modelo.setValueAt(item.getQtdProduto(), linha, 2);
                                    modelo.setValueAt(item.valorTotal(), linha, 4);

                                    txtValorTotal.setText("R$" + String.valueOf(Float.parseFloat(txtValorTotal.getText().trim().replace("R$", "")) + novoItem.valorTotal()));
                                } else if (item.getQtdProduto() + novoItem.getQtdProduto() > produto.getQuantidade()) {
                                    j = listaItens.size();

                                    JOptionPane.showMessageDialog(this, "Estoque insuficiente", "Quantidade do produto insuficiente no estoque", JOptionPane.ERROR_MESSAGE);
                                    i = listaProdutos.size();

                                }
                            }

                        }

                        //CASO O PRODUTO NÃO SEJA ENCONTRADO NA LISTA
                        if ((itemEncontrado == false) && (novoItem.getQtdProduto() <= produto.getQuantidade())) {
                            DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
                            modelo.addRow(new String[]{
                                produto.getCod_barras(),
                                produto.getDescricao(),
                                String.valueOf(novoItem.getQtdProduto()),
                                String.valueOf(produto.getValorVenda()),
                                String.valueOf(produto.getValorVenda() * Integer.parseInt(txtQuantidade.getText())),});
                            listaItens.add(novoItem);
                            txtValorTotal.setText("R$" + String.valueOf(Float.parseFloat(txtValorTotal.getText().trim().replace("R$", "")) + novoItem.valorTotal()));
                            i = listaProdutos.size();

                        }
                    }
                } else if ((produto.getCod_barras().equals(codBarras)) && (produto.getQuantidade() <= 0)) {
                    JOptionPane.showMessageDialog(this, "Não há saldo do produto no estoque");
                } else if(Integer.parseInt(txtQuantidade.getText()) > produto.getQuantidade()){
                    i = listaProdutos.size();
                    JOptionPane.showMessageDialog(this, "Não há estoque suficiente deste produto no estoque para a quantidade selecionada");
                }

            }
        } else if (Integer.parseInt(txtQuantidade.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "Quantidade do produto inválida");
        } else if (jcbNomeProduto.getSelectedItem().equals("<Selecione o Produto>")) {
            JOptionPane.showMessageDialog(this, "Selecione o produto ou leia o código de barras para adicionar");
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdAdicionarProduto;
    private javax.swing.JButton btnConcluirVenda;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JLabel imgVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JTextField txtNomeVendedor;
    private javax.swing.JFormattedTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
