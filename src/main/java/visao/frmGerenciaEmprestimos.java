/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

/**
 *
 * @author User
 */
public class frmGerenciaEmprestimos extends javax.swing.JFrame {

    /**
     * Creates new form frmGerenciaEmprestimos
     */
    public frmGerenciaEmprestimos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmprestimo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jNomeEmprestimo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JBCadastrar3 = new javax.swing.JButton();
        JBCancelar2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emprestimos");
        setMinimumSize(new java.awt.Dimension(600, 365));
        getContentPane().setLayout(null);

        jTableEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Amigo", "Ferramentas", "Data do Emprestimo", "Devoluçao"
            }
        ));
        jTableEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmprestimoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmprestimo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 6, 572, 107);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Nome: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 150, 50, 18);

        jNomeEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeEmprestimoActionPerformed(evt);
            }
        });
        getContentPane().add(jNomeEmprestimo);
        jNomeEmprestimo.setBounds(60, 150, 250, 26);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Data de Emprestimo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 150, 140, 18);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Ferramentas:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 210, 100, 18);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(110, 210, 210, 26);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Data de Devoluçao:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 210, 140, 18);

        JBCadastrar3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBCadastrar3.setForeground(new java.awt.Color(51, 255, 51));
        JBCadastrar3.setText("Atualizar");
        JBCadastrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrar3ActionPerformed(evt);
            }
        });
        getContentPane().add(JBCadastrar3);
        JBCadastrar3.setBounds(110, 270, 110, 40);

        JBCancelar2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBCancelar2.setForeground(new java.awt.Color(255, 0, 0));
        JBCancelar2.setText("Cancelar");
        JBCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelar2ActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelar2);
        JBCancelar2.setBounds(360, 270, 110, 40);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(470, 150, 100, 26);
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(460, 210, 110, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeEmprestimoActionPerformed

    private void JBCadastrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBCadastrar3ActionPerformed

    private void JBCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelar2ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_JBCancelar2ActionPerformed

    private void jTableEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmprestimoMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jTableEmprestimoMouseClicked

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
            java.util.logging.Logger.getLogger(frmGerenciaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGerenciaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGerenciaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGerenciaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGerenciaEmprestimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar3;
    private javax.swing.JButton JBCancelar2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNomeEmprestimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmprestimo;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
