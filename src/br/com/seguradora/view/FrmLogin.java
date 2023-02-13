/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.seguradora.view;


import br.com.seguradora.connection.ConectaBanco;
import br.com.seguradora.connection.ConnectionFactory;
import br.com.seguradora.controller.ControllerUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author jonatas.meireles
 */
public class FrmLogin extends javax.swing.JFrame {
   
    private final ControllerUsuario controller;
    private final ConnectionFactory conn;
    
    public FrmLogin() {
        initComponents();
        controller =  new ControllerUsuario(this);
        conn =  new ConnectionFactory();
        
        System.out.println("conexao");
        if (conn != null) {
            lblStatus1.setText("CONECTADO!!!!");
            lblStatus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/projeto/dbok.png")));
            lblStatus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/projeto/cloud-conn.png")));
            System.out.println("Conectou!");
        } else {
            lblStatus1.setText("DESCONECTADO!!!!");
            lblStatus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/projeto/dberro.png")));
            lblStatus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/projeto/cloud-disc.png")));
            System.out.println("Nao Conectou!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBAcessar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextLogin = new javax.swing.JTextField();
        jPasswordSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        lblStatus3 = new javax.swing.JLabel();
        jBSair = new javax.swing.JButton();
        lblStatus1 = new javax.swing.JLabel();
        lblStatus2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAcessar.setText("Acessar");
        jBAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcessarActionPerformed(evt);
            }
        });
        jPanel1.add(jBAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 120, 25));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/projeto/key-1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, 25));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/projeto/user.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, 25));

        jTextLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jTextLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, 25));
        jPanel1.add(jPasswordSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 120, 25));

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel4.setText("SEGURADO - lOGIN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lblStatus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/projeto/cloud-disc.png"))); // NOI18N
        jPanel1.add(lblStatus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });
        jPanel1.add(jBSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 120, 25));

        lblStatus1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblStatus1.setText("status");
        jPanel1.add(lblStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        lblStatus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/projeto/dberro.png"))); // NOI18N
        jPanel1.add(lblStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLoginActionPerformed

    private void jBAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcessarActionPerformed
        try {
            // TODO add your handling code here:
            this.controller.entrarNoSistema(); // Chama o metodo para comparar o usuario digitado
        } catch (SQLException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBAcessarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        this.controller.sairDoSistema(); // Chama o metodo para fechar o sistema
    }//GEN-LAST:event_jBSairActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold> 
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAcessar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JTextField jTextLogin;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JLabel lblStatus2;
    private javax.swing.JLabel lblStatus3;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public JPasswordField getjPasswordSenha() {
        return jPasswordSenha;
    }

    public void setjPasswordSenha(JPasswordField jPasswordSenha) {
        this.jPasswordSenha = jPasswordSenha;
    }

    public JTextField getjTextLogin() {
        return jTextLogin;
    }

    public void setjTextLogin(JTextField jTextLogin) {
        this.jTextLogin = jTextLogin;
    }
    
    


}
