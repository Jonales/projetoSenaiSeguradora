/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.seguradora.view;

import br.com.seguradora.controller.ControllerMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author jonatas.meireles
 */
public class FrmMenu extends javax.swing.JFrame {
    private final ControllerMenu controller;

    /**
     * Creates new form Tela02
     */
    public FrmMenu() {
        initComponents();
        controller =  new ControllerMenu(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopMenu = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCadastrarCliente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMPesquisarCliente = new javax.swing.JMenuItem();
        jMAtualizarCliente = new javax.swing.JMenuItem();
        jMExcluirCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMcadastrarAutomovel = new javax.swing.JMenuItem();
        jMPesquisarAutomovel = new javax.swing.JMenuItem();
        jMAtualizarAutomovel = new javax.swing.JMenuItem();
        jMExcluirAutomovel = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMCadastrarOcorrencia = new javax.swing.JMenuItem();
        jMPesquisarOcorrencia = new javax.swing.JMenuItem();
        jMAtualizarOcorrencia = new javax.swing.JMenuItem();
        jMExcluirOcorrencia = new javax.swing.JMenuItem();
        jMRelatorios = new javax.swing.JMenu();
        jMSobre = new javax.swing.JMenu();
        jMAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seguradora de Automóveis - SENAI para Todos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frmMenu"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/img_fundo.jpg"))); // NOI18N
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jDesktopMenu.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopMenuLayout = new javax.swing.GroupLayout(jDesktopMenu);
        jDesktopMenu.setLayout(jDesktopMenuLayout);
        jDesktopMenuLayout.setHorizontalGroup(
            jDesktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jDesktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopMenuLayout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDesktopMenuLayout.setVerticalGroup(
            jDesktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(jDesktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopMenuLayout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        getContentPane().add(jDesktopMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

        jMCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-myspace-48.png"))); // NOI18N
        jMCadastrarCliente.setText("Cliente");
        jMCadastrarCliente.setAutoscrolls(true);
        jMCadastrarCliente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jMCadastrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMCadastrarCliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMCadastrarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-adicionar-marcador-48.png"))); // NOI18N
        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMCadastrarCliente.add(jMenuItem1);

        jMPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-search-48.png"))); // NOI18N
        jMPesquisarCliente.setText("Pesquisar");
        jMPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPesquisarClienteActionPerformed(evt);
            }
        });
        jMCadastrarCliente.add(jMPesquisarCliente);

        jMAtualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-update-48.png"))); // NOI18N
        jMAtualizarCliente.setText("Atualizar");
        jMCadastrarCliente.add(jMAtualizarCliente);

        jMExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-delete-bookmark-48.png"))); // NOI18N
        jMExcluirCliente.setText("Excluir");
        jMCadastrarCliente.add(jMExcluirCliente);

        jMenuBar1.add(jMCadastrarCliente);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-traffic-jam-48.png"))); // NOI18N
        jMenu2.setText("Automóvel");
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMcadastrarAutomovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-adicionar-marcador-48.png"))); // NOI18N
        jMcadastrarAutomovel.setText("Cadastrar");
        jMenu2.add(jMcadastrarAutomovel);

        jMPesquisarAutomovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-search-48.png"))); // NOI18N
        jMPesquisarAutomovel.setText("Pesquisar");
        jMenu2.add(jMPesquisarAutomovel);

        jMAtualizarAutomovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-update-48.png"))); // NOI18N
        jMAtualizarAutomovel.setText("Atualizar");
        jMenu2.add(jMAtualizarAutomovel);

        jMExcluirAutomovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-delete-bookmark-48.png"))); // NOI18N
        jMExcluirAutomovel.setText("Excluir");
        jMenu2.add(jMExcluirAutomovel);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-privacy-policy-48.png"))); // NOI18N
        jMenu3.setText("Ocorrências");
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMCadastrarOcorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-adicionar-marcador-48.png"))); // NOI18N
        jMCadastrarOcorrencia.setText("Cadastrar");
        jMenu3.add(jMCadastrarOcorrencia);

        jMPesquisarOcorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-search-48.png"))); // NOI18N
        jMPesquisarOcorrencia.setText("Pesquisar");
        jMenu3.add(jMPesquisarOcorrencia);

        jMAtualizarOcorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-update-48.png"))); // NOI18N
        jMAtualizarOcorrencia.setText("Atualizar");
        jMenu3.add(jMAtualizarOcorrencia);

        jMExcluirOcorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-delete-bookmark-48.png"))); // NOI18N
        jMExcluirOcorrencia.setText("Excluir");
        jMExcluirOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExcluirOcorrenciaActionPerformed(evt);
            }
        });
        jMenu3.add(jMExcluirOcorrencia);

        jMenuBar1.add(jMenu3);

        jMRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-download-pie-chart-report-48.png"))); // NOI18N
        jMRelatorios.setText("Relatórios");
        jMRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMRelatorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMRelatorios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMRelatorios);

        jMSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-info-48.png"))); // NOI18N
        jMSobre.setText("Sobre");
        jMSobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMSobre);

        jMAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-help-48.png"))); // NOI18N
        jMAjuda.setText("Ajuda");
        jMAjuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMAjuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMAjuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAjudaActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMAjuda);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.controller.CadastrarCliente();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMExcluirOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExcluirOcorrenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMExcluirOcorrenciaActionPerformed

    private void jMSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSobreActionPerformed
        // TODO add your handling code here:
        this.controller.OpcaoMenuSobre();
    }//GEN-LAST:event_jMSobreActionPerformed

    private void jMAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAjudaActionPerformed
        // TODO add your handling code here:
        this.controller.OpcaoMenuAjuda();
    }//GEN-LAST:event_jMAjudaActionPerformed

    private void jMPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPesquisarClienteActionPerformed
        // TODO add your handling code here:
        this.controller.PesquisarCliente();
        
    }//GEN-LAST:event_jMPesquisarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMAjuda;
    private javax.swing.JMenuItem jMAtualizarAutomovel;
    private javax.swing.JMenuItem jMAtualizarCliente;
    private javax.swing.JMenuItem jMAtualizarOcorrencia;
    private javax.swing.JMenu jMCadastrarCliente;
    private javax.swing.JMenuItem jMCadastrarOcorrencia;
    private javax.swing.JMenuItem jMExcluirAutomovel;
    private javax.swing.JMenuItem jMExcluirCliente;
    private javax.swing.JMenuItem jMExcluirOcorrencia;
    private javax.swing.JMenuItem jMPesquisarAutomovel;
    private javax.swing.JMenuItem jMPesquisarCliente;
    private javax.swing.JMenuItem jMPesquisarOcorrencia;
    private javax.swing.JMenu jMRelatorios;
    private javax.swing.JMenu jMSobre;
    private javax.swing.JMenuItem jMcadastrarAutomovel;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
