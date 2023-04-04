package com.senac.principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        focarVenda();
        trocarPainel("pnlVenda");

//        Venda.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teste = new javax.swing.ButtonGroup();
        PaineisAjustaveis = new javax.swing.JSplitPane();
        PainelMenu = new javax.swing.JPanel();
        btnVenda = new javax.swing.JLabel();
        btnProduto = new javax.swing.JLabel();
        btnCliente = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JLabel();
        LayerPaineis = new javax.swing.JLayeredPane();
        pnlCliente = new com.senac.cliente.TelaCliente();
        pnlProduto = new com.senac.produto.TelaProduto();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PaineisAjustaveis.setDividerSize(0);

        PainelMenu.setBackground(java.awt.Color.darkGray);
        PainelMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PainelMenu.setPreferredSize(new java.awt.Dimension(70, 803));
        PainelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVenda.setBackground(new java.awt.Color(64, 64, 64));
        btnVenda.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVenda.setText("Venda");
        btnVenda.setName("Venda"); // NOI18N
        btnVenda.setOpaque(true);
        btnVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVendaMousePressed(evt);
            }
        });
        PainelMenu.add(btnVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 190, 60));

        btnProduto.setBackground(new java.awt.Color(64, 64, 64));
        btnProduto.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProduto.setText("Produtos");
        btnProduto.setName("Produto"); // NOI18N
        btnProduto.setOpaque(true);
        btnProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProdutoMousePressed(evt);
            }
        });
        PainelMenu.add(btnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 190, 60));

        btnCliente.setBackground(new java.awt.Color(64, 64, 64));
        btnCliente.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCliente.setText("Clientes");
        btnCliente.setName("Cliente"); // NOI18N
        btnCliente.setOpaque(true);
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClienteMousePressed(evt);
            }
        });
        PainelMenu.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 190, 60));

        btnRelatorio.setBackground(new java.awt.Color(64, 64, 64));
        btnRelatorio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setText("Relatorio");
        btnRelatorio.setName("Relatorio"); // NOI18N
        btnRelatorio.setOpaque(true);
        btnRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRelatorioMousePressed(evt);
            }
        });
        PainelMenu.add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 190, 60));

        PaineisAjustaveis.setLeftComponent(PainelMenu);

        LayerPaineis.setLayer(pnlCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayerPaineis.setLayer(pnlProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayerPaineisLayout = new javax.swing.GroupLayout(LayerPaineis);
        LayerPaineis.setLayout(LayerPaineisLayout);
        LayerPaineisLayout.setHorizontalGroup(
            LayerPaineisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayerPaineisLayout.createSequentialGroup()
                .addComponent(pnlProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 1356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LayerPaineisLayout.setVerticalGroup(
            LayerPaineisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayerPaineisLayout.createSequentialGroup()
                .addGroup(LayerPaineisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 150, Short.MAX_VALUE))
        );

        PaineisAjustaveis.setRightComponent(LayerPaineis);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineisAjustaveis, javax.swing.GroupLayout.PREFERRED_SIZE, 2308, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineisAjustaveis, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void trocarPainel(String selecionarPainel) {
        if (selecionarPainel == "pnlVenda") {
            pnlCliente.setVisible(false);
            pnlProduto.setVisible(false);
        } else if (selecionarPainel == "pnlProdutos") {
            pnlCliente.setVisible(false);
            pnlProduto.setVisible(true);
        } else if (selecionarPainel == "pnlClientes") {
            pnlCliente.setVisible(true);
            pnlProduto.setVisible(false);
        } else if (selecionarPainel == "pnlRelatorio") {
            pnlCliente.setVisible(false);
            pnlProduto.setVisible(false);
        }
    }

    public void focarVenda() {
        Color azulMarinho = new Color(255, 12, 120);
        btnVenda.setBackground(azulMarinho);
        btnVenda.setBorder(BorderFactory.createMatteBorder(0, 6, 0, 0, Color.WHITE)); // Adiciona uma margem à esquerda para a borda  
    }
    private void btnVendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendaMousePressed
        focarBotaoMenu(btnVenda);
        trocarPainel("pnlVenda");
    }//GEN-LAST:event_btnVendaMousePressed

    private void btnProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutoMousePressed
        focarBotaoMenu(btnProduto);
        trocarPainel("pnlProdutos");
//        Venda.setVisible(false);

    }//GEN-LAST:event_btnProdutoMousePressed

    private void btnClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMousePressed
        focarBotaoMenu(btnCliente);
        trocarPainel("pnlClientes");
//        Venda.setVisible(false);


    }//GEN-LAST:event_btnClienteMousePressed

    private void btnRelatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatorioMousePressed
        focarBotaoMenu(btnRelatorio);
        trocarPainel("pnlRelatorio");
    }//GEN-LAST:event_btnRelatorioMousePressed

    protected void focarBotaoMenu(JLabel btn) {
        //Color azulMarinho = new Color(26, 187, 156);
        Color azulMarinho = new Color(255, 12, 120);
        if (btn.getName() == "Venda") {
            btnVenda.setBackground(azulMarinho);
            btnProduto.setBackground(Color.DARK_GRAY);
            btnCliente.setBackground(Color.DARK_GRAY);
            btnRelatorio.setBackground(Color.DARK_GRAY);
            btnVenda.setBorder(BorderFactory.createMatteBorder(0, 6, 0, 0, Color.WHITE)); // Adiciona uma margem à esquerda para a borda  
            btnProduto.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnCliente.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnRelatorio.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        } else if (btn.getName() == "Produto") {
            btnProduto.setBackground(azulMarinho);
            btnVenda.setBackground(Color.DARK_GRAY);
            btnCliente.setBackground(Color.DARK_GRAY);
            btnRelatorio.setBackground(Color.DARK_GRAY);
            btnProduto.setBorder(BorderFactory.createMatteBorder(0, 6, 0, 0, Color.WHITE)); // Adiciona uma margem à esquerda para a borda  
            btnVenda.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnCliente.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnRelatorio.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        } else if (btn.getName() == "Cliente") {
            btnCliente.setBackground(azulMarinho);
            btnVenda.setBackground(Color.DARK_GRAY);
            btnProduto.setBackground(Color.DARK_GRAY);
            btnRelatorio.setBackground(Color.DARK_GRAY);
            btnCliente.setBorder(BorderFactory.createMatteBorder(0, 6, 0, 0, Color.WHITE)); // Adiciona uma margem à esquerda para a borda  
            btnVenda.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnProduto.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnRelatorio.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        } else if (btn.getName() == "Relatorio") {
            btnRelatorio.setBackground(azulMarinho);
            btnVenda.setBackground(Color.DARK_GRAY);
            btnCliente.setBackground(Color.DARK_GRAY);
            btnProduto.setBackground(Color.DARK_GRAY);
            btnRelatorio.setBorder(BorderFactory.createMatteBorder(0, 6, 0, 0, Color.WHITE)); // Adiciona uma margem à esquerda para a borda  
            btnVenda.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnCliente.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnProduto.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LayerPaineis;
    private javax.swing.JSplitPane PaineisAjustaveis;
    private javax.swing.JPanel PainelMenu;
    private javax.swing.JLabel btnCliente;
    private javax.swing.JLabel btnProduto;
    private javax.swing.JLabel btnRelatorio;
    private javax.swing.JLabel btnVenda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private com.senac.cliente.TelaCliente pnlCliente;
    private com.senac.produto.TelaProduto pnlProduto;
    private javax.swing.ButtonGroup teste;
    // End of variables declaration//GEN-END:variables
}
