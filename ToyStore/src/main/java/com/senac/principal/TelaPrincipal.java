package com.senac.principal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        focarVenda();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teste = new javax.swing.ButtonGroup();
        AbasPainel = new javax.swing.JTabbedPane();
        Venda = new javax.swing.JPanel();
        Produto = new javax.swing.JPanel();
        telaProduto2 = new com.senac.produto.TelaProduto();
        Cliente = new javax.swing.JPanel();
        telaCliente1 = new com.senac.cliente.TelaCliente();
        Relatorio = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnVenda = new javax.swing.JLabel();
        btnProduto = new javax.swing.JLabel();
        btnCliente = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AbasPainel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AbasPainel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout VendaLayout = new javax.swing.GroupLayout(Venda);
        Venda.setLayout(VendaLayout);
        VendaLayout.setHorizontalGroup(
            VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1316, Short.MAX_VALUE)
        );
        VendaLayout.setVerticalGroup(
            VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        AbasPainel.addTab("Venda", Venda);

        javax.swing.GroupLayout ProdutoLayout = new javax.swing.GroupLayout(Produto);
        Produto.setLayout(ProdutoLayout);
        ProdutoLayout.setHorizontalGroup(
            ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdutoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(telaProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ProdutoLayout.setVerticalGroup(
            ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdutoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(telaProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AbasPainel.addTab("Produto", Produto);

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente);
        Cliente.setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, 1310, Short.MAX_VALUE))
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AbasPainel.addTab("Cliente", Cliente);

        javax.swing.GroupLayout RelatorioLayout = new javax.swing.GroupLayout(Relatorio);
        Relatorio.setLayout(RelatorioLayout);
        RelatorioLayout.setHorizontalGroup(
            RelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1316, Short.MAX_VALUE)
        );
        RelatorioLayout.setVerticalGroup(
            RelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        AbasPainel.addTab("Relatório", Relatorio);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 803));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVenda.setBackground(new java.awt.Color(64, 64, 64));
        btnVenda.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVenda.setText("Venda");
        btnVenda.setName("Venda"); // NOI18N
        btnVenda.setOpaque(true);
        btnVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendaMouseClicked(evt);
            }
        });
        jPanel1.add(btnVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 60));

        btnProduto.setBackground(new java.awt.Color(64, 64, 64));
        btnProduto.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProduto.setText("Produto");
        btnProduto.setName("Produto"); // NOI18N
        btnProduto.setOpaque(true);
        btnProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdutoMouseClicked(evt);
            }
        });
        jPanel1.add(btnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 60));

        btnCliente.setBackground(new java.awt.Color(64, 64, 64));
        btnCliente.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCliente.setText("Cliente");
        btnCliente.setName("Cliente"); // NOI18N
        btnCliente.setOpaque(true);
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });
        jPanel1.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 60));

        btnRelatorio.setBackground(new java.awt.Color(64, 64, 64));
        btnRelatorio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setText("Relatorio");
        btnRelatorio.setName("Relatorio"); // NOI18N
        btnRelatorio.setOpaque(true);
        btnRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRelatorioMouseClicked(evt);
            }
        });
        jPanel1.add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 60));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbasPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AbasPainel)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void focarVenda() {
        Color azulMarinho = new Color(26, 187, 156);
        btnVenda.setBackground(azulMarinho);
        btnVenda.setBorder(BorderFactory.createMatteBorder(0, 8, 0, 0, Color.WHITE)); // Adiciona uma margem à esquerda para a borda  
    }
    private void btnVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendaMouseClicked
        focarBotaoMenu(btnVenda);
        AbasPainel.setSelectedIndex(0);
    }//GEN-LAST:event_btnVendaMouseClicked

    private void btnProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutoMouseClicked
        focarBotaoMenu(btnProduto);
        AbasPainel.setSelectedIndex(1);
    }//GEN-LAST:event_btnProdutoMouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        focarBotaoMenu(btnCliente);
        AbasPainel.setSelectedIndex(2);
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatorioMouseClicked
        focarBotaoMenu(btnRelatorio);
        AbasPainel.setSelectedIndex(3);
    }//GEN-LAST:event_btnRelatorioMouseClicked

    protected void focarBotaoMenu(JLabel btn) {
        Color azulMarinho = new Color(26, 187, 156);
        if (btn.getName() == "Venda") {
            btnVenda.setBackground(azulMarinho);
            btnProduto.setBackground(Color.DARK_GRAY);
            btnCliente.setBackground(Color.DARK_GRAY);
            btnRelatorio.setBackground(Color.DARK_GRAY);
            btnVenda.setBorder(BorderFactory.createMatteBorder(0, 8, 0, 0, Color.WHITE)); // Adiciona uma margem à esquerda para a borda  
            btnProduto.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnCliente.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnRelatorio.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        } else if (btn.getName() == "Produto") {
            btnProduto.setBackground(azulMarinho);
            btnVenda.setBackground(Color.DARK_GRAY);
            btnCliente.setBackground(Color.DARK_GRAY);
            btnRelatorio.setBackground(Color.DARK_GRAY);
            btnProduto.setBorder(BorderFactory.createMatteBorder(0, 8, 0, 0, Color.WHITE)); // Adiciona uma margem à esquerda para a borda  
            btnVenda.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnCliente.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnRelatorio.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        } else if (btn.getName() == "Cliente") {
            btnCliente.setBackground(azulMarinho);
            btnVenda.setBackground(Color.DARK_GRAY);
            btnProduto.setBackground(Color.DARK_GRAY);
            btnRelatorio.setBackground(Color.DARK_GRAY);
            btnCliente.setBorder(BorderFactory.createMatteBorder(0, 8, 0, 0, Color.WHITE)); // Adiciona uma margem à esquerda para a borda  
            btnVenda.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnProduto.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
            btnRelatorio.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        } else if (btn.getName() == "Relatorio") {
            btnRelatorio.setBackground(azulMarinho);
            btnVenda.setBackground(Color.DARK_GRAY);
            btnCliente.setBackground(Color.DARK_GRAY);
            btnProduto.setBackground(Color.DARK_GRAY);
            btnRelatorio.setBorder(BorderFactory.createMatteBorder(0, 8, 0, 0, Color.WHITE)); // Adiciona uma margem à esquerda para a borda  
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
    private javax.swing.JTabbedPane AbasPainel;
    private javax.swing.JPanel Cliente;
    private javax.swing.JPanel Produto;
    private javax.swing.JPanel Relatorio;
    private javax.swing.JPanel Venda;
    private javax.swing.JLabel btnCliente;
    private javax.swing.JLabel btnProduto;
    private javax.swing.JLabel btnRelatorio;
    private javax.swing.JLabel btnVenda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private com.senac.cliente.TelaCliente telaCliente1;
    private com.senac.produto.TelaProduto telaProduto2;
    private javax.swing.ButtonGroup teste;
    // End of variables declaration//GEN-END:variables
}
