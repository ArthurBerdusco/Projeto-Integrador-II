package com.senac.login;

import com.senac.cadastro.TelaCadastro;
import com.senac.principal.TelaPrincipal;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author eliseu.fsantos1
 */
public class Login extends javax.swing.JFrame {

    Usuario userAdmin = new Usuario("admin", "admin");

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToyStore = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ToyStore");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 300));
        setResizable(false);

        ToyStore.setBackground(new java.awt.Color(204, 255, 255));
        ToyStore.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ToyStore.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToyStore.setName(""); // NOI18N
        ToyStore.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        jLabel1.setBackground(new java.awt.Color(52, 134, 242));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Login");

        campoLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoLoginFocusGained(evt);
            }
        });
        campoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campoLoginMouseExited(evt);
            }
        });
        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(52, 134, 242));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Não possui Cadastro?");

        campoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoSenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campoSenhaMouseExited(evt);
            }
        });
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(52, 134, 242));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Senha");

        jLabel5.setBackground(new java.awt.Color(52, 134, 242));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("INSIRA SUAS CREDENCIAIS");

        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCadastro.setText("CADASTRAR");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirmar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(270, 270, 270))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btnCadastro)
                .addGap(188, 188, 188))
        );

        ToyStore.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 330, 330));
        ToyStore.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 130));

        jImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/ícone-e-fundo-do-brinquedo-43860074.jpg"))); // NOI18N
        jImg.setPreferredSize(new java.awt.Dimension(500, 300));
        ToyStore.add(jImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 640, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToyStore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToyStore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ToyStore.getAccessibleContext().setAccessibleName("");
        ToyStore.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(646, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed

    }//GEN-LAST:event_campoSenhaActionPerformed

    // Método para validar o login
    private void validarLogin() {
        // Neste exemplo, vamos criar um usuário para verificar as informações.
        try {
            String login = campoLogin.getText();
            String senha = campoSenha.getText();

            // Verifica se o login e senha são válidos
            if (login.equals("admin") && senha.equals("admin")) {
                // Login e senha corretos: permite acesso ao sistema
                campoLogin.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                campoSenha.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");

                TelaPrincipal tela = new TelaPrincipal();

                tela.setVisible(true);

                this.dispose();
            } else {
                // Login ou senha incorretos: pinta as bordas dos campos de texto de vermelho
                campoLogin.setBorder(BorderFactory.createLineBorder(Color.RED));
                campoSenha.setBorder(BorderFactory.createLineBorder(Color.RED));
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Insira Login e Senha Válidos!");

        }
    }
    
    public void dicaSenha(){
        JOptionPane.showMessageDialog(this, "Usuario: admin   Senha: admin", "Dica senha", JOptionPane.INFORMATION_MESSAGE);
    }

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed

    }//GEN-LAST:event_campoLoginActionPerformed

    private void campoLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoLoginFocusGained

    }//GEN-LAST:event_campoLoginFocusGained

    private void campoLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoLoginMouseEntered
        campoLogin.setBackground(Color.decode("#ffffb3"));
    }//GEN-LAST:event_campoLoginMouseEntered

    private void campoLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoLoginMouseExited
        campoLogin.setBackground(Color.WHITE);
    }//GEN-LAST:event_campoLoginMouseExited

    private void campoSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoSenhaMouseEntered
        campoSenha.setBackground(Color.decode("#ffffb3"));
    }//GEN-LAST:event_campoSenhaMouseEntered

    private void campoSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoSenhaMouseExited
        campoSenha.setBackground(Color.WHITE);
    }//GEN-LAST:event_campoSenhaMouseExited

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        validarLogin();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login tela = new Login();
                tela.setVisible(true);
                tela.dicaSenha();
            }
        });
        
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/sistema/ToyStoreLogo.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ToyStore;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
