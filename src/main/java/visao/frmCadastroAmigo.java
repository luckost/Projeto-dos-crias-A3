/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import javax.swing.JOptionPane;
import modelo.Amigo;
import dao.AmigoDAO;

/**
 *
 * @author User
 */
public class frmCadastroAmigo extends javax.swing.JFrame {

    private Amigo objetoAmigo;
    private AmigoDAO amigoDAO;

    /**
     * Creates new form frmGerenciaAmigos
     */
    public frmCadastroAmigo() {
        initComponents();
        this.objetoAmigo = new Amigo();
        this.amigoDAO = new AmigoDAO();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTituloCadastroAmigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFTelefone = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Amigo");
        setMinimumSize(new java.awt.Dimension(590, 365));
        getContentPane().setLayout(null);

        jTituloCadastroAmigo.setFont(new java.awt.Font("Trebuchet MS", 1, 25)); // NOI18N
        jTituloCadastroAmigo.setText("Cadastrar Amigo");
        getContentPane().add(jTituloCadastroAmigo);
        jTituloCadastroAmigo.setBounds(182, 31, 200, 30);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 106, 50, 18);

        JTFNome.setForeground(new java.awt.Color(204, 204, 204));
        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });
        getContentPane().add(JTFNome);
        JTFNome.setBounds(6, 130, 450, 30);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Telefone:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(6, 173, 70, 18);

        JTFTelefone.setForeground(new java.awt.Color(204, 204, 204));
        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(JTFTelefone);
        JTFTelefone.setBounds(6, 197, 430, 30);

        JBCancelar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBCancelar.setForeground(new java.awt.Color(255, 0, 0));
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelar);
        JBCancelar.setBounds(365, 280, 110, 40);

        JBCadastrar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBCadastrar.setForeground(new java.awt.Color(0, 204, 0));
        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCadastrar);
        JBCadastrar.setBounds(89, 280, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed

            try {
            String nome = "";
            String fone = "";
            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }
            if (this.JTFTelefone.getText().length() < 2) {
                throw new Mensagens("Telefone deve conter ao menos 2 caracteres.");
            } else {
                fone = this.JTFTelefone.getText();
            }
            // envia os dados para o Controlador cadastrar
            Amigo novoAmigo = new Amigo();
            novoAmigo.setNome(nome);
            novoAmigo.setTelefone(fone);

            AmigoDAO amigoDAO = new AmigoDAO();
            boolean inserido = amigoDAO.inserirAmigoBD(novoAmigo);

            if (inserido) {
                JOptionPane.showMessageDialog(null, "Amigo Cadastrado com Sucesso!");
                // limpa campos da interface
                this.JTFNome.setText("");
                this.JTFTelefone.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar amigo.");
            }
            // Exibindo no console o amigo cadastrado
            System.out.println(this.objetoAmigo.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTelefoneActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jTituloCadastroAmigo;
    // End of variables declaration//GEN-END:variables
}
