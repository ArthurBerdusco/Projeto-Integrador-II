package com.senac.produto;

import com.senac.cliente.*;
import com.senac.utils.Validador;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class TelaProduto extends javax.swing.JPanel {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    private boolean editarCliente = false; //Atributo auxiliar para definir se é edição ou cadastro
    private int auxiliarEditCliente; //Atributo auxiliar para verificar qual indice da lista será editado

    public TelaProduto() {
        initComponents();
        Default.setVisible(true);
        Cadastro.setVisible(false);

        //Adicionando 4 clientes
        Cliente cliente1 = new Cliente("Arthur Silva", "428.193.198-82", "06/06/2000", "Masculino", "Solteiro", "arthur@gmail.com", "Rua Adelaide Braga", "81", "Bloco 4 - Ap 302", "(11)93204-5718");
        Cliente cliente2 = new Cliente("Carlos Alberto", "236.972.285-65", "25/02/1978", "Masculino", "Casado", "Carlos@hotmail.com", "Avenida Berrini", "3008", "Condominio Plaza - AP701", "(11)92797-1628");
        Cliente cliente3 = new Cliente("Arlindo Souza", "596.987.962-19", "30/09/1943", "Masculino", "Viúvo", "souza.arlindo@gmail.com", "Rua Santa Rita", "30", "", "(11)97547-8570");
        Cliente cliente4 = new Cliente("Vanessa Batista", "192.973.481-22", "02/04/1997", "Feminino", "Casada", "vanessa.bat@outlook.com", "Rua Ferreira de Araujo", "10", "", "(11)93744-0968");
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        inserirClienteTabela(listaClientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        PainelProduto = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        cboFiltroConsulta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarPor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Default = new javax.swing.JPanel();
        imgProduto = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Cadastro = new javax.swing.JPanel();
        PainelIdentificacao = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rbtMasc = new javax.swing.JRadioButton();
        rbtFem = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCivil = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        PainelEndereco = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        pnlCancelar = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();
        pnlSalvar = new javax.swing.JPanel();
        lblSalvar = new javax.swing.JLabel();
        pnlNovoProduto = new javax.swing.JPanel();
        lbNovoProduto = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1350, 742));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(1316, 742));

        PainelProduto.setBackground(new java.awt.Color(255, 255, 255));
        PainelProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "DESCRIÇÃO", "QUANTIDADE", "VALOR", "CATEGORIA", "FORNECEDOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.setDoubleBuffered(true);
        tblProduto.setRowHeight(30);
        tblProduto.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblProduto.getTableHeader().setReorderingAllowed(false);
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduto);
        tblProduto.setShowGrid(false);
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(0);
        tblProduto.getColumnModel().getColumn(5).setPreferredWidth(0);

        cboFiltroConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboFiltroConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Filtrar por:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Buscar: ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtBuscarPor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscarPor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarPorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarPorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PainelProdutoLayout = new javax.swing.GroupLayout(PainelProduto);
        PainelProduto.setLayout(PainelProdutoLayout);
        PainelProdutoLayout.setHorizontalGroup(
            PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PainelProdutoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboFiltroConsulta, 0, 325, Short.MAX_VALUE)
                    .addComponent(txtBuscarPor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelProdutoLayout.setVerticalGroup(
            PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(cboFiltroConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PainelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PRODUTOS");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Default.setBackground(new java.awt.Color(255, 255, 255));
        Default.setPreferredSize(new java.awt.Dimension(862, 710));

        imgProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produto2.jpg"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("GERENCIE SEUS PRODUTOS AO LADO");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Selecione para editar ou");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("adicione um novo");

        javax.swing.GroupLayout DefaultLayout = new javax.swing.GroupLayout(Default);
        Default.setLayout(DefaultLayout);
        DefaultLayout.setHorizontalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultLayout.createSequentialGroup()
                .addGroup(DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DefaultLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)))
                    .addComponent(imgProduto))
                .addContainerGap())
        );
        DefaultLayout.setVerticalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DefaultLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        Cadastro.setBackground(new java.awt.Color(255, 255, 255));
        Cadastro.setPreferredSize(new java.awt.Dimension(862, 710));

        PainelIdentificacao.setBackground(new java.awt.Color(255, 255, 255));
        PainelIdentificacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificação"));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("NOME COMPLETO");

        txtDataNasc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNasc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDataNasc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataNascFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataNascFocusLost(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("E-MAIL");

        txtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("SEXO");

        rbtMasc.setBackground(new java.awt.Color(255, 255, 255));
        rdgSexo.add(rbtMasc);
        rbtMasc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtMasc.setText("MASCULINO");

        rbtFem.setBackground(new java.awt.Color(255, 255, 255));
        rdgSexo.add(rbtFem);
        rbtFem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtFem.setText("FEMININO");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("CPF");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("ESTADO CÍVIL");

        txtCivil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCivil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        txtCivil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCivilFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCivilFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("NASCIMENTO");

        jLabel16.setText("dd/mm/aa");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });

        javax.swing.GroupLayout PainelIdentificacaoLayout = new javax.swing.GroupLayout(PainelIdentificacao);
        PainelIdentificacao.setLayout(PainelIdentificacaoLayout);
        PainelIdentificacaoLayout.setHorizontalGroup(
            PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                            .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                                    .addComponent(rbtMasc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbtFem)))
                            .addGap(37, 37, 37)
                            .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(txtCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel12)
                        .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(119, 119, 119)
                            .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtEmail))
                    .addComponent(jLabel4)
                    .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel16))
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelIdentificacaoLayout.setVerticalGroup(
            PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelIdentificacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtFem)
                    .addComponent(rbtMasc)
                    .addComponent(txtCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
        );

        PainelEndereco.setBackground(new java.awt.Color(255, 255, 255));
        PainelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("ENDEREÇO");

        txtRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        txtRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRuaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRuaFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("NÚMERO");

        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        txtNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("COMPLEMENTO");

        txtComplemento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtComplemento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        txtComplemento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtComplementoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtComplementoFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("TELEFONE");

        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 202, 219)));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });

        javax.swing.GroupLayout PainelEnderecoLayout = new javax.swing.GroupLayout(PainelEndereco);
        PainelEndereco.setLayout(PainelEnderecoLayout);
        PainelEnderecoLayout.setHorizontalGroup(
            PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PainelEnderecoLayout.setVerticalGroup(
            PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(153, 153, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Informações do produto");

        pnlCancelar.setBackground(new java.awt.Color(255, 255, 255));
        pnlCancelar.setPreferredSize(new java.awt.Dimension(102, 37));
        pnlCancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlCancelarMouseMoved(evt);
            }
        });
        pnlCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCancelarMouseExited(evt);
            }
        });

        lblCancelar.setBackground(new java.awt.Color(56, 134, 242));
        lblCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCancelar.setForeground(new java.awt.Color(56, 134, 242));
        lblCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancelar.setText("CANCELAR");
        lblCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56, 134, 242)));
        lblCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancelar.setPreferredSize(new java.awt.Dimension(102, 37));
        lblCancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCancelarMouseMoved(evt);
            }
        });
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlCancelarLayout = new javax.swing.GroupLayout(pnlCancelar);
        pnlCancelar.setLayout(pnlCancelarLayout);
        pnlCancelarLayout.setHorizontalGroup(
            pnlCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlCancelarLayout.setVerticalGroup(
            pnlCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlSalvar.setBackground(new java.awt.Color(255, 255, 255));
        pnlSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSalvar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlSalvarMouseMoved(evt);
            }
        });
        pnlSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSalvarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSalvarMouseExited(evt);
            }
        });

        lblSalvar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSalvar.setForeground(new java.awt.Color(52, 134, 242));
        lblSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalvar.setText("SALVAR");
        lblSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 134, 242)));
        lblSalvar.setPreferredSize(new java.awt.Dimension(102, 37));

        javax.swing.GroupLayout pnlSalvarLayout = new javax.swing.GroupLayout(pnlSalvar);
        pnlSalvar.setLayout(pnlSalvarLayout);
        pnlSalvarLayout.setHorizontalGroup(
            pnlSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSalvarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlSalvarLayout.setVerticalGroup(
            pnlSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalvarLayout.createSequentialGroup()
                .addComponent(lblSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CadastroLayout = new javax.swing.GroupLayout(Cadastro);
        Cadastro.setLayout(CadastroLayout);
        CadastroLayout.setHorizontalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(pnlCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(PainelIdentificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PainelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        CadastroLayout.setVerticalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pnlCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(Default, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Default, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addComponent(Default, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlNovoProduto.setBackground(new java.awt.Color(52, 134, 242));
        pnlNovoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        lbNovoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNovoProduto.setForeground(new java.awt.Color(255, 255, 255));
        lbNovoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNovoProduto.setText("Adicionar Produto");
        lbNovoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 134, 242)));
        lbNovoProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlNovoProdutoLayout = new javax.swing.GroupLayout(pnlNovoProduto);
        pnlNovoProduto.setLayout(pnlNovoProdutoLayout);
        pnlNovoProdutoLayout.setHorizontalGroup(
            pnlNovoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoProdutoLayout.createSequentialGroup()
                .addComponent(lbNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlNovoProdutoLayout.setVerticalGroup(
            pnlNovoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PainelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNovoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLayeredPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    //CRIAR CLIENTE

    public void cadastrarNovoCliente(ArrayList<Cliente> clientes) {
        try {
            requestFocusInWindow();
            Thread.sleep(50);

            if (validarCampos() == true) {
                String sexo = "";

                if (rbtMasc.isSelected()) {
                    sexo = "Masculino";
                } else if (rbtFem.isSelected()) {
                    sexo = "Feminino";
                }

                Cliente novoCliente = new Cliente(
                        txtNome.getText(),
                        txtCpf.getText(),
                        txtDataNasc.getText(),
                        sexo,
                        txtCivil.getText(),
                        txtEmail.getText(),
                        txtRua.getText(),
                        txtNumero.getText(),
                        txtComplemento.getText(),
                        txtTelefone.getText()
                );

                listaClientes.add(novoCliente);

                DefaultTableModel tabelaCliente = (DefaultTableModel) tblProduto.getModel();
                tabelaCliente.addRow(new Object[]{
                    novoCliente.getCpf(),
                    novoCliente.getNome(),
                    novoCliente.getDataNasc(),
                    novoCliente.getSexo(),
                    new ImageIcon("/edit.png"),
                    new ImageIcon("/delete.png"),
                    novoCliente.getEstadoCivil(),
                    novoCliente.getEmail(),
                    novoCliente.getEndereco(),
                    novoCliente.getNumero(),
                    novoCliente.getCompleto(),
                    novoCliente.getTelefone()
                });
                tblProduto.getColumnModel().getColumn(4).setCellRenderer(new ImageRender());
                tblProduto.getColumnModel().getColumn(5).setCellRenderer(new ImageRender());

                limparFormularioCadastro();
                Cadastro.setVisible(false);
                Default.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    //LER CLIENTE
    public void procurarClienteTabela(ArrayList<Cliente> clientes, ArrayList indiceProcurado) {

        DefaultTableModel tabelaCliente = (DefaultTableModel) tblProduto.getModel();

        for (int i = 0; i < indiceProcurado.size(); i++) {
            tabelaCliente.addRow(new Object[]{
                listaClientes.get((int) indiceProcurado.get(i)).getCpf(),
                listaClientes.get((int) indiceProcurado.get(i)).getNome(),
                listaClientes.get((int) indiceProcurado.get(i)).getDataNasc(),
                listaClientes.get((int) indiceProcurado.get(i)).getSexo(),
                new ImageIcon("/edit.png"),
                new ImageIcon("/delete.png"),
                listaClientes.get((int) indiceProcurado.get(i)).getEstadoCivil(),
                listaClientes.get((int) indiceProcurado.get(i)).getEmail(),
                listaClientes.get((int) indiceProcurado.get(i)).getEndereco(),
                listaClientes.get((int) indiceProcurado.get(i)).getNumero(),
                listaClientes.get((int) indiceProcurado.get(i)).getCompleto(),
                listaClientes.get((int) indiceProcurado.get(i)).getTelefone()
            });
            tblProduto.getColumnModel().getColumn(4).setCellRenderer(new ImageRender());
            tblProduto.getColumnModel().getColumn(5).setCellRenderer(new ImageRender());
        }
    }

    public void buscarComFiltro() {
        String buscarPor = txtBuscarPor.getText();

        ArrayList clientesEncontrados = new ArrayList();

        DefaultTableModel tabelaFiltrada = (DefaultTableModel) tblProduto.getModel();
        tabelaFiltrada.setRowCount(0);

        if ((cboFiltroConsulta.getSelectedItem().toString() == "Nome") && (!buscarPor.trim().isEmpty())) {
            tabelaFiltrada.setRowCount(0);
            for (int i = 0; i < listaClientes.size(); i++) {

                if (listaClientes.get(i).getNome().toLowerCase().indexOf(buscarPor.toLowerCase()) != -1) {
                    clientesEncontrados.add(i);
                }
            }
            procurarClienteTabela(listaClientes, clientesEncontrados);
        }

        if ((cboFiltroConsulta.getSelectedItem().toString() == "CPF") && (!buscarPor.trim().isEmpty())) {
            tabelaFiltrada.setRowCount(0);
            for (int i = 0; i < listaClientes.size(); i++) {

                if (listaClientes.get(i).getCpf().replace(".", "").replace("-", "").indexOf(buscarPor.replace(".", "").replace("-", "")) != -1) {
                    clientesEncontrados.add(i);
                }
            }
            procurarClienteTabela(listaClientes, clientesEncontrados);
        }
    }

    public void lerFormularioCliente(Point linhaTblClicada) {
        int linhaClicada = tblProduto.rowAtPoint(linhaTblClicada);
        editarCliente = true;
        Default.setVisible(false);
        Cadastro.setVisible(true);
        DefaultTableModel tabelaCliente = (DefaultTableModel) tblProduto.getModel();

        for (int i = 0; i < listaClientes.size(); i++) {

            if (tblProduto.getValueAt(linhaClicada, 0) == listaClientes.get(i).getCpf()) {
                String cpf = listaClientes.get(i).getCpf();
                txtNome.setText(listaClientes.get(i).getNome().toString());
                txtCpf.setText(listaClientes.get(i).getCpf());
                txtDataNasc.setText(listaClientes.get(i).getDataNasc());
                if (listaClientes.get(i).getSexo() == "Masculino") {
                    rbtMasc.setSelected(true);
                } else if (listaClientes.get(i).getSexo() == "Feminino") {
                    rbtFem.setSelected(true);
                }
                txtCivil.setText(listaClientes.get(i).getEstadoCivil());
                txtEmail.setText(listaClientes.get(i).getEmail());
                txtRua.setText(listaClientes.get(i).getEndereco());
                txtNumero.setText(listaClientes.get(i).getNumero());
                txtComplemento.setText(listaClientes.get(i).getCompleto());
                txtTelefone.setText(listaClientes.get(i).getTelefone());

                int posicao = listaClientes.indexOf(listaClientes.stream()
                        .filter(p -> p.getCpf().equals(cpf))
                        .findFirst()
                        .orElse(null));
                this.auxiliarEditCliente = posicao;
            }
        }
    }

    //EDITAR CLIENTE
    public void editarCadastroCliente(ArrayList<Cliente> clientes, int indiceCliente) {
        Cliente editCliente = clientes.get(indiceCliente);

        String sexo = "";

        if (rbtMasc.isSelected()) {
            sexo = "Masculino";
        } else if (rbtFem.isSelected()) {
            sexo = "Feminino";
        }

        editCliente.setNome(txtNome.getText());
        editCliente.setCpf(txtCpf.getText());
        editCliente.setDataNasc(txtDataNasc.getText());
        editCliente.setSexo(sexo);
        editCliente.setEstadoCivil(txtCivil.getText());
        editCliente.setEmail(txtEmail.getText());
        editCliente.setRua(txtRua.getText());
        editCliente.setNumero(txtNumero.getText());
        editCliente.setCompleto(txtComplemento.getText());
        editCliente.setTelefone(txtTelefone.getText());
        clientes.set(indiceCliente, editCliente);
        resetTabelaCliente();

    }

    //DELETAR CLIENTE
    public void deletarCliente(Point linha) {
        int linhaClicada = tblProduto.rowAtPoint(linha);
        DefaultTableModel tabelaCliente = (DefaultTableModel) tblProduto.getModel();

        for (int i = 0; i < listaClientes.size(); i++) {
            if (tabelaCliente.getValueAt(linhaClicada, 1) == listaClientes.get(i).getNome()) {
                lerFormularioCliente(linha);
                int confirmDelete = JOptionPane.showConfirmDialog(this, "Deseja deletar " + listaClientes.get(i).getNome() + "?", "Deletar cliente", JOptionPane.YES_NO_OPTION);
                if (confirmDelete == 0) {
                    listaClientes.remove(i);
                    Cadastro.setVisible(false);
                    Default.setVisible(true);
                    resetTabelaCliente();
                }
            }
        }

    }

    //REALIZA A LEITURA INICIAL DA BASE DE CLIENTES
    public void inserirClienteTabela(ArrayList<Cliente> clientes) {

        DefaultTableModel tabelaCliente = (DefaultTableModel) tblProduto.getModel();

        for (int i = 0; i < clientes.size(); i++) {
            tabelaCliente.addRow(new Object[]{
                listaClientes.get(i).getCpf(),
                listaClientes.get(i).getNome(),
                listaClientes.get(i).getDataNasc(),
                listaClientes.get(i).getSexo(),
                new ImageIcon("/edit.png"),
                new ImageIcon("/delete.png"),
                listaClientes.get(i).getEstadoCivil(),
                listaClientes.get(i).getEmail(),
                listaClientes.get(i).getEndereco(),
                listaClientes.get(i).getNumero(),
                listaClientes.get(i).getCompleto(),
                listaClientes.get(i).getTelefone()
            });
            tblProduto.getColumnModel().getColumn(4).setCellRenderer(new ImageRender());
            tblProduto.getColumnModel().getColumn(5).setCellRenderer(new ImageRender());
        }
    }

    public boolean validarCampos() {
        try {
            Validador validador = new Validador();

            //Validar campos de identificação
            validador.validarNome(txtNome);
            validador.validarCpf(txtCpf);
            validador.validarDataNasc(txtDataNasc);
            validador.validarGroupRadio(rdgSexo);
            validador.validarString(txtCivil);
            validador.validarEmail(txtEmail);
            //Validar campos de endereço
            validador.validarString(txtRua);
            validador.validarString(txtNumero);
            validador.validarTelefone(txtTelefone);

            if (validador.mensagemErro.size() >= 2) {
                throw new Exception("Preencha todos os campos.");

            } else if (validador.mensagemErro.size() == 1) {
                throw new Exception(validador.mensagemErro.get(0));
            }

            if (validador.mensagemErro.size() == 0) {
                return true;
            }
            return false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return false;
        }
    }

    //REALIZA A LIMPEZA DO FORMULÁRIO QUANDO FOR O CADASTRADO OU EDIÇÃO DO CLIENTE FOR FINALIZADO
    public void limparFormularioCadastro() {
        txtNome.setText("");
        txtCpf.setValue(null);
        txtDataNasc.setValue(null);
        rdgSexo.clearSelection();
        txtCivil.setText("");
        txtEmail.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtTelefone.setValue(null);
        Cadastro.setVisible(false);
        Default.setVisible(true);
    }

    public void resetBordasFormulario() {
        desfocarCampoTexto(txtNome);
        desfocarCampoTexto(txtCpf);
        desfocarCampoTexto(txtDataNasc);
        desfocarCampoTexto(txtCivil);
        desfocarCampoTexto(txtEmail);
        desfocarCampoTexto(txtRua);
        desfocarCampoTexto(txtNumero);
        desfocarCampoTexto(txtComplemento);
        desfocarCampoTexto(txtTelefone);

    }

    //REALIZA O RESET DA TABELA APÓS LIMPAR FILTRO OU FINALIZAR EDIÇÃO DE CADASTRO
    public void resetTabelaCliente() {
        DefaultTableModel tabelaCliente = (DefaultTableModel) tblProduto.getModel();
        tabelaCliente.setRowCount(0);
        inserirClienteTabela(listaClientes);
    }

    //CLASSE PARA REENDERIZAR OS ICONES DA TABELA (EDIÇÃO E EXCLUÇÃO) 
    private class ImageRender extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            String photoNome = value.toString();
            JLabel lblImgCelula = new JLabel();
            lblImgCelula.setIcon(new javax.swing.ImageIcon(getClass().getResource(value.toString())));
            if (hasFocus) {
                Color corPersonalizada = new Color(125, 147, 200);
                lblImgCelula.setBorder(BorderFactory.createLineBorder(corPersonalizada));
            } else {
                lblImgCelula.setBorder(null);
            }
            lblImgCelula.setHorizontalAlignment(CENTER);

            return lblImgCelula;
        }

    }

    private void focarCampoTexto(JComponent campo) {
        Color corPersonalizada = new Color(23, 102, 212);
        campo.setBorder(BorderFactory.createLineBorder(corPersonalizada));
    }

    private void desfocarCampoTexto(JComponent campo) {
        Color corPersonalizada = new Color(189, 202, 219);
        campo.setBorder(BorderFactory.createLineBorder(corPersonalizada));
    }

    private void txtRuaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRuaFocusGained
        focarCampoTexto(txtRua);
    }//GEN-LAST:event_txtRuaFocusGained

    private void txtRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRuaFocusLost
        desfocarCampoTexto(txtRua);
    }//GEN-LAST:event_txtRuaFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        focarCampoTexto(txtEmail);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        desfocarCampoTexto(txtEmail);
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtCivilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCivilFocusGained
        focarCampoTexto(txtCivil);
    }//GEN-LAST:event_txtCivilFocusGained

    private void txtCivilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCivilFocusLost
        desfocarCampoTexto(txtCivil);
    }//GEN-LAST:event_txtCivilFocusLost

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
        focarCampoTexto(txtTelefone);
    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        desfocarCampoTexto(txtTelefone);
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtDataNascFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascFocusGained
        focarCampoTexto(txtDataNasc);
    }//GEN-LAST:event_txtDataNascFocusGained

    private void txtDataNascFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascFocusLost
        desfocarCampoTexto(txtDataNasc);
    }//GEN-LAST:event_txtDataNascFocusLost

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        focarCampoTexto(txtCpf);
    }//GEN-LAST:event_txtCpfFocusGained

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        desfocarCampoTexto(txtCpf);
    }//GEN-LAST:event_txtCpfFocusLost

    private void pnlNovoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNovoProdutoMouseClicked
        limparFormularioCadastro();
        resetBordasFormulario();
        this.editarCliente = false;
        Default.setVisible(false);
        Cadastro.setVisible(true);
    }//GEN-LAST:event_pnlNovoProdutoMouseClicked

    private void pnlCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelarMouseMoved
        Color corPersonalizada = new Color(56, 134, 242);
        pnlCancelar.setBackground(corPersonalizada);
        lblCancelar.setForeground(Color.white);
    }//GEN-LAST:event_pnlCancelarMouseMoved

    private void pnlCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelarMouseExited
        Color corPersonalizada = new Color(255, 255, 255);
        Color corLabel = new Color(56, 134, 242);
        pnlCancelar.setBackground(corPersonalizada);
        lblCancelar.setForeground(corLabel);
    }//GEN-LAST:event_pnlCancelarMouseExited

    private void pnlSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalvarMouseExited
        Color corPersonalizada = new Color(255, 255, 255);
        Color corLabel = new Color(56, 134, 242);
        pnlSalvar.setBackground(corPersonalizada);
        lblSalvar.setForeground(corLabel);
    }//GEN-LAST:event_pnlSalvarMouseExited

    private void pnlSalvarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalvarMouseMoved
        Color corPersonalizada = new Color(56, 134, 242);
        pnlSalvar.setBackground(corPersonalizada);
        lblSalvar.setForeground(Color.white);
    }//GEN-LAST:event_pnlSalvarMouseMoved

    private void pnlNovoProdutoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNovoProdutoMouseMoved
        Color corPersonalizada = new Color(255, 255, 255);
        Color corLabel = new Color(56, 134, 242);
        pnlNovoProduto.setBackground(corPersonalizada);
        lbNovoProduto.setForeground(corLabel);
    }//GEN-LAST:event_pnlNovoProdutoMouseMoved

    private void pnlNovoProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNovoProdutoMouseExited
        Color corPersonalizada = new Color(56, 134, 242);
        pnlNovoProduto.setBackground(corPersonalizada);
        lbNovoProduto.setForeground(Color.white);
    }//GEN-LAST:event_pnlNovoProdutoMouseExited

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        int escolhaCancelar = JOptionPane.showConfirmDialog(this, "Deseja cancelar o cadastro?", "Cancelar cadastro", JOptionPane.YES_NO_OPTION);
        if (escolhaCancelar == 0) {
            limparFormularioCadastro();
        }
    }//GEN-LAST:event_lblCancelarMouseClicked

    private void lblCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseMoved
        Color corPersonalizada = new Color(56, 134, 242);
        pnlCancelar.setBackground(corPersonalizada);
        lblCancelar.setForeground(Color.white);
    }//GEN-LAST:event_lblCancelarMouseMoved

    private void lblCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseExited
        Color corPersonalizada = new Color(255, 255, 255);
        Color corLabel = new Color(56, 134, 242);
        pnlCancelar.setBackground(corPersonalizada);
        lblCancelar.setForeground(corLabel);
    }//GEN-LAST:event_lblCancelarMouseExited

    private void txtNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusGained
        focarCampoTexto(txtNumero);
    }//GEN-LAST:event_txtNumeroFocusGained

    private void txtNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusLost
        desfocarCampoTexto(txtNumero);
    }//GEN-LAST:event_txtNumeroFocusLost

    private void txtComplementoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtComplementoFocusGained
        focarCampoTexto(txtComplemento);
    }//GEN-LAST:event_txtComplementoFocusGained

    private void txtComplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtComplementoFocusLost
        desfocarCampoTexto(txtComplemento);
    }//GEN-LAST:event_txtComplementoFocusLost

    private void pnlSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalvarMouseClicked
        if (editarCliente == false) {
            cadastrarNovoCliente(listaClientes);
        } else if (editarCliente == true && (validarCampos() == true)) {
            editarCadastroCliente(listaClientes, this.auxiliarEditCliente);
            Cadastro.setVisible(false);
            Default.setVisible(true);
            editarCliente = false;
        }
    }//GEN-LAST:event_pnlSalvarMouseClicked

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        //CLICAR 2X NA LINHA DE ALGUM CLIENTE IRÁ ABRIR O FORMULARIO DO CLIENTE COM TODOS OS DADOS
        Point point = evt.getPoint();
        this.auxiliarEditCliente = tblProduto.rowAtPoint(point);
        if (evt.getClickCount() == 2 || (tblProduto.getSelectedColumn() == 4)) {
            resetBordasFormulario();
            lerFormularioCliente(point);
        } else if (tblProduto.getSelectedColumn() == 5) {
            deletarCliente(point);
        }


    }//GEN-LAST:event_tblProdutoMouseClicked

    private void txtBuscarPorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorKeyTyped

    }//GEN-LAST:event_txtBuscarPorKeyTyped

    private void txtBuscarPorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorKeyPressed
        buscarComFiltro();
        if (txtBuscarPor.getText().trim().isEmpty()) {
            resetTabelaCliente();
        }
    }//GEN-LAST:event_txtBuscarPorKeyPressed

    private void txtBuscarPorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorKeyReleased
        buscarComFiltro();
        if (txtBuscarPor.getText().trim().isEmpty()) {
            resetTabelaCliente();
        }
    }//GEN-LAST:event_txtBuscarPorKeyReleased

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        focarCampoTexto(txtNome);
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        desfocarCampoTexto(txtNome);
    }//GEN-LAST:event_txtNomeFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cadastro;
    private javax.swing.JPanel Default;
    private javax.swing.JPanel PainelEndereco;
    private javax.swing.JPanel PainelIdentificacao;
    private javax.swing.JPanel PainelProduto;
    private javax.swing.JComboBox<String> cboFiltroConsulta;
    private javax.swing.JLabel imgProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbNovoProduto;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblSalvar;
    private javax.swing.JPanel pnlCancelar;
    private javax.swing.JPanel pnlNovoProduto;
    private javax.swing.JPanel pnlSalvar;
    private javax.swing.JRadioButton rbtFem;
    private javax.swing.JRadioButton rbtMasc;
    private javax.swing.ButtonGroup rdgSexo;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtBuscarPor;
    private javax.swing.JTextField txtCivil;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
