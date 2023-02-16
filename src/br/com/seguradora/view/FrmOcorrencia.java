/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.seguradora.view;

/**
 *
 * @author Jon
 */
public class FrmOcorrencia extends javax.swing.JFrame {

    /**
     * Creates new form FrmOcorrencia
     */
    public FrmOcorrencia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLCodOcorrencia = new javax.swing.JLabel();
        jLDataAutomovel = new javax.swing.JLabel();
        jLLocalOcorrencia = new javax.swing.JLabel();
        jTCodigoAutomovel = new javax.swing.JTextField();
        jTLocalOcorrencia = new javax.swing.JTextField();
        jBCadastrarOcorrencia = new javax.swing.JButton();
        jBPesquisarOcorrencia = new javax.swing.JButton();
        jBEditarOcorrencia = new javax.swing.JButton();
        jBExcluirOcorrencia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jBImprimirCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jFDataOcorrencia = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(670, 570));
        setPreferredSize(new java.awt.Dimension(670, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stylus BT", 0, 36)); // NOI18N
        jLabel1.setText("Ocorrência");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLCodOcorrencia.setText("Código:");
        getContentPane().add(jLCodOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, 25));

        jLDataAutomovel.setText("Data:");
        getContentPane().add(jLDataAutomovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, 25));

        jLLocalOcorrencia.setText("Local:");
        getContentPane().add(jLLocalOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 110, 25));
        getContentPane().add(jTCodigoAutomovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 100, 25));
        getContentPane().add(jTLocalOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, 25));

        jBCadastrarOcorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-adicionar-marcador-48.png"))); // NOI18N
        jBCadastrarOcorrencia.setText("Cadastrar");
        jBCadastrarOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarOcorrenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jBCadastrarOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 140, 70));

        jBPesquisarOcorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-search-48.png"))); // NOI18N
        jBPesquisarOcorrencia.setText("Pesquisar");
        jBPesquisarOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarOcorrenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jBPesquisarOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 140, 70));

        jBEditarOcorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-update-48.png"))); // NOI18N
        jBEditarOcorrencia.setText("Editar");
        jBEditarOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarOcorrenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jBEditarOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 140, 70));

        jBExcluirOcorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/icons8-delete-bookmark-48.png"))); // NOI18N
        jBExcluirOcorrencia.setText("Excluir");
        jBExcluirOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirOcorrenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jBExcluirOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 140, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/projeto/userPesquisar.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 70, 50));

        jTextArea2.setColumns(20);
        jTextArea2.setTabSize(0);
        jTextArea2.setText("Descreva a ocorrência aqui .....");
        jTextArea2.setAlignmentX(0.0F);
        jTextArea2.setAlignmentY(0.0F);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(" Descrição "));
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 610, 150));

        jBImprimirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/seguradora/imagens/printer.png"))); // NOI18N
        jBImprimirCliente.setText("Imprimir");
        jBImprimirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jBImprimirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 140, 70));

        jLabel3.setText("_______________________________");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        try {
            jFDataOcorrencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFDataOcorrencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFDataOcorrencia.setToolTipText("");
        jFDataOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFDataOcorrenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jFDataOcorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 110, 25));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarOcorrenciaActionPerformed

    }//GEN-LAST:event_jBCadastrarOcorrenciaActionPerformed

    private void jBPesquisarOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarOcorrenciaActionPerformed

    }//GEN-LAST:event_jBPesquisarOcorrenciaActionPerformed

    private void jBEditarOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarOcorrenciaActionPerformed
 
    }//GEN-LAST:event_jBEditarOcorrenciaActionPerformed

    private void jBExcluirOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirOcorrenciaActionPerformed
      
    }//GEN-LAST:event_jBExcluirOcorrenciaActionPerformed

    private void jBImprimirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirClienteActionPerformed

    }//GEN-LAST:event_jBImprimirClienteActionPerformed

    private void jFDataOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFDataOcorrenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFDataOcorrenciaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOcorrencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarOcorrencia;
    private javax.swing.JButton jBEditarOcorrencia;
    private javax.swing.JButton jBExcluirOcorrencia;
    private javax.swing.JButton jBImprimirCliente;
    private javax.swing.JButton jBPesquisarOcorrencia;
    private javax.swing.JFormattedTextField jFDataOcorrencia;
    private javax.swing.JLabel jLCodOcorrencia;
    private javax.swing.JLabel jLDataAutomovel;
    private javax.swing.JLabel jLLocalOcorrencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTCodigoAutomovel;
    private javax.swing.JTextField jTLocalOcorrencia;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
