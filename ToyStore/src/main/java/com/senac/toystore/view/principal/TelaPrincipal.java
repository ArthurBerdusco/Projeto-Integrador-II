package com.senac.toystore.view.principal;

import com.senac.toystore.view.cliente.TelaCliente;
import com.senac.toystore.view.produto.TelaProduto;
import com.senac.toystore.view.relatorio.TelaRelatorio;
import com.senac.toystore.view.venda.TelaVenda;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class TelaPrincipal extends javax.swing.JFrame implements IntegradorEstiloSistema {

    TelaVenda telaVenda = new TelaVenda();
    TelaProduto telaProduto = new TelaProduto();
    TelaCliente telaCliente = new TelaCliente();
    TelaRelatorio telaRelatorio = new TelaRelatorio();

    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        desktop.setSelectedFrame(telaVenda);
        desktop.add(telaVenda).setVisible(true);
        focarBotaoMenu(btnVenda);
        setIcon();
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
        imgLogoToy = new javax.swing.JLabel();
        btnConfig = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSistema = new javax.swing.JMenu();
        mnuItemVenda = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuProdutos = new javax.swing.JMenu();
        mnuAddProduto = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuClientes = new javax.swing.JMenu();
        mnuAddCliente = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuItemRelatorio = new javax.swing.JMenuItem();
        mnuEstilo = new javax.swing.JMenu();
        mnuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ToyStore");

        PaineisAjustaveis.setDividerSize(0);

        PainelMenu.setBackground(java.awt.Color.darkGray);
        PainelMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PainelMenu.setPreferredSize(new java.awt.Dimension(70, 803));
        PainelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVenda.setBackground(new java.awt.Color(64, 64, 64));
        btnVenda.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVenda.setText("Venda");
        btnVenda.setName("Venda"); // NOI18N
        btnVenda.setOpaque(true);
        btnVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVendaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVendaMousePressed(evt);
            }
        });
        PainelMenu.add(btnVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 190, 60));

        btnProduto.setBackground(new java.awt.Color(64, 64, 64));
        btnProduto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProduto.setText("Produtos");
        btnProduto.setName("Produto"); // NOI18N
        btnProduto.setOpaque(true);
        btnProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProdutoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProdutoMousePressed(evt);
            }
        });
        PainelMenu.add(btnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 190, 60));

        btnCliente.setBackground(new java.awt.Color(64, 64, 64));
        btnCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCliente.setText("Clientes");
        btnCliente.setName("Cliente"); // NOI18N
        btnCliente.setOpaque(true);
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClienteMousePressed(evt);
            }
        });
        PainelMenu.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 190, 60));

        btnRelatorio.setBackground(new java.awt.Color(64, 64, 64));
        btnRelatorio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setText("Relatorio");
        btnRelatorio.setName("Relatorio"); // NOI18N
        btnRelatorio.setOpaque(true);
        btnRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRelatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRelatorioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRelatorioMousePressed(evt);
            }
        });
        PainelMenu.add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 190, 60));

        imgLogoToy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogoToy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/ToyStoreLogo2.png"))); // NOI18N
        PainelMenu.add(imgLogoToy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 190, 120));

        btnConfig.setBackground(java.awt.Color.darkGray);
        btnConfig.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConfig.setForeground(new java.awt.Color(255, 255, 255));
        btnConfig.setText("Configurações");
        btnConfig.setBorderPainted(false);
        btnConfig.setFocusPainted(false);
        btnConfig.setOpaque(true);
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });
        PainelMenu.add(btnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 190, 40));

        PaineisAjustaveis.setLeftComponent(PainelMenu);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1362, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );

        PaineisAjustaveis.setRightComponent(desktop);

        mnuSistema.setText("Sistema");

        mnuItemVenda.setText("Venda");
        mnuSistema.add(mnuItemVenda);
        mnuSistema.add(jSeparator1);

        mnuProdutos.setText("Produtos");

        mnuAddProduto.setText("Add Produto");
        mnuProdutos.add(mnuAddProduto);

        mnuSistema.add(mnuProdutos);
        mnuSistema.add(jSeparator2);

        mnuClientes.setText("Clientes");

        mnuAddCliente.setText("Add Cliente");
        mnuClientes.add(mnuAddCliente);

        mnuSistema.add(mnuClientes);
        mnuSistema.add(jSeparator3);

        mnuItemRelatorio.setText("Relatorio");
        mnuSistema.add(mnuItemRelatorio);

        jMenuBar1.add(mnuSistema);

        mnuEstilo.setText("Estilo");
        jMenuBar1.add(mnuEstilo);

        mnuAjuda.setText("Ajuda");
        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineisAjustaveis, javax.swing.GroupLayout.DEFAULT_SIZE, 1552, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaineisAjustaveis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnVendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendaMousePressed
        desktop.removeAll();
        desktop.setSelectedFrame(telaVenda);
        desktop.add(telaVenda).setVisible(true);
        focarBotaoMenu(btnVenda);
    }//GEN-LAST:event_btnVendaMousePressed

    private void btnProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutoMousePressed
        desktop.removeAll();
        desktop.setSelectedFrame(telaProduto);
        desktop.add(telaProduto).setVisible(true);
        focarBotaoMenu(btnProduto);
    }//GEN-LAST:event_btnProdutoMousePressed

    private void btnClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMousePressed
        desktop.removeAll();
        desktop.setSelectedFrame(telaCliente);
        desktop.add(telaCliente).setVisible(true);
        focarBotaoMenu(btnCliente);
    }//GEN-LAST:event_btnClienteMousePressed

    private void btnRelatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatorioMousePressed
        desktop.removeAll();
        desktop.setSelectedFrame(telaRelatorio);
        desktop.add(telaRelatorio).setVisible(true);
        focarBotaoMenu(btnRelatorio);
    }//GEN-LAST:event_btnRelatorioMousePressed

    private void btnVendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendaMouseEntered
        //btnVenda.setBackground(new Color(135,220,255));
        if (!(btnVenda.getBackground() != Color.darkGray)) {
            btnVenda.setBorder(BorderFactory.createMatteBorder(0, 6, 0, 0, Color.WHITE));
        }

    }//GEN-LAST:event_btnVendaMouseEntered

    private void btnVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendaMouseExited
        //btnVenda.setBackground(Color.darkGray);
        if (!(btnVenda.getBackground() != Color.darkGray)) {
            btnVenda.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.WHITE));
        }

    }//GEN-LAST:event_btnVendaMouseExited

    private void btnProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutoMouseEntered
        //btnProduto.setBackground(new Color(135,220,255));
        if (!(btnProduto.getBackground() != Color.darkGray)) {
            btnProduto.setBorder(BorderFactory.createMatteBorder(0, 6, 0, 0, Color.WHITE));
        }
    }//GEN-LAST:event_btnProdutoMouseEntered

    private void btnProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutoMouseExited
        if (!(btnProduto.getBackground() != Color.darkGray)) {
            btnProduto.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.WHITE));
        }
    }//GEN-LAST:event_btnProdutoMouseExited

    private void btnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseEntered
        //btnCliente.setBackground(new Color(135, 220, 255));
        if (!(btnCliente.getBackground() != Color.darkGray)) {
            btnCliente.setBorder(BorderFactory.createMatteBorder(0, 6, 0, 0, Color.WHITE));
        }
    }//GEN-LAST:event_btnClienteMouseEntered

    private void btnClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseExited
        if (!(btnCliente.getBackground() != Color.darkGray)) {
            btnCliente.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.WHITE));
        }
    }//GEN-LAST:event_btnClienteMouseExited

    private void btnRelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatorioMouseEntered
        //btnRelatorio.setBackground(new Color(135, 220, 255));
        if (!(btnRelatorio.getBackground() != Color.darkGray)) {
            btnRelatorio.setBorder(BorderFactory.createMatteBorder(0, 6, 0, 0, Color.WHITE));
        }
    }//GEN-LAST:event_btnRelatorioMouseEntered

    private void btnRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatorioMouseExited
        if (!(btnRelatorio.getBackground() != Color.darkGray)) {
            btnRelatorio.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.WHITE));
        }
    }//GEN-LAST:event_btnRelatorioMouseExited

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        TelaConfigEstilo configEstilo = new TelaConfigEstilo();
        configEstilo.setCallBack(this);// passando uma instância de IntegradorEstiloSistema para o JFrame secundário
        configEstilo.setVisible(true);
    }//GEN-LAST:event_btnConfigActionPerformed

    @Override
    public void botaoPrecionado(String retorno) {
        try {
            UIManager.setLookAndFeel(retorno);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Impossivel definir estilo do sistema");
        }

    }

    protected void focarBotaoMenu(JLabel btn) {
        //Color vermelhoRosado = new Color(255, 12, 120);
        Color azulMarinho = new Color(56, 134, 242);
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

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/sistema/ToyStoreLogo.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane PaineisAjustaveis;
    private javax.swing.JPanel PainelMenu;
    private javax.swing.JLabel btnCliente;
    private javax.swing.JButton btnConfig;
    private javax.swing.JLabel btnProduto;
    private javax.swing.JLabel btnRelatorio;
    private javax.swing.JLabel btnVenda;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel imgLogoToy;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem mnuAddCliente;
    private javax.swing.JMenuItem mnuAddProduto;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuClientes;
    private javax.swing.JMenu mnuEstilo;
    private javax.swing.JMenuItem mnuItemRelatorio;
    private javax.swing.JMenuItem mnuItemVenda;
    private javax.swing.JMenu mnuProdutos;
    private javax.swing.JMenu mnuSistema;
    private javax.swing.ButtonGroup teste;
    // End of variables declaration//GEN-END:variables

}
