package visao;

import javax.swing.JOptionPane;
import modelo.Amigo;
import dao.AmigoDAO;

/**
 * Esta classe representa a interface gráfica para o cadastro de amigos no sistema.
 * Permite ao usuário inserir novos amigos no banco de dados, fornecendo seus
 * nomes e números de telefone.
 */
public class frmCadastroAmigo extends javax.swing.JFrame {

    private Amigo objetoAmigo;
    private AmigoDAO amigoDAO;

   /**
     * Cria uma nova instância do formulário de cadastro de amigos.
     * Inicializa os componentes visuais e os objetos necessários para interação
     * com a classe `Amigo` e `AmigoDAO`.
     */
    public frmCadastroAmigo() {
        initComponents();
        this.objetoAmigo = new Amigo();
        this.amigoDAO = new AmigoDAO();

    }
 /**
     * Método gerado automaticamente pelo NetBeans para inicializar todos os
     * componentes visuais do formulário.
     */
    // Código gerado pelo NetBeans IDE oculto para economizar espaço
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        JBCadastrar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        JTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFTelefone = new javax.swing.JTextField();
        jTituloCadastroAmigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Amigo");
        setMinimumSize(new java.awt.Dimension(595, 365));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(583, 330));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(null);

        JBCadastrar.setBackground(new java.awt.Color(51, 255, 0));
        JBCadastrar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(JBCadastrar);
        JBCadastrar.setBounds(430, 260, 110, 40);

        JBCancelar.setBackground(new java.awt.Color(255, 153, 0));
        JBCancelar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        JBCancelar.setText("Voltar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(JBCancelar);
        JBCancelar.setBounds(30, 260, 110, 40);

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });
        jPanel2.add(JTFNome);
        JTFNome.setBounds(10, 130, 450, 30);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 100, 60, 21);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefone:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 170, 90, 21);

        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(JTFTelefone);
        JTFTelefone.setBounds(10, 200, 450, 30);

        jTituloCadastroAmigo.setFont(new java.awt.Font("Trebuchet MS", 1, 25)); // NOI18N
        jTituloCadastroAmigo.setForeground(new java.awt.Color(255, 204, 0));
        jTituloCadastroAmigo.setText("Cadastrar Amigo");
        jPanel2.add(jTituloCadastroAmigo);
        jTituloCadastroAmigo.setBounds(160, 30, 200, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 560, 310);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_JBCancelarActionPerformed
 /**
     * Trata o evento de clique no botão "Cadastrar".
     * Este método é chamado quando o usuário clica no botão "Cadastrar"
     * e valida os dados inseridos pelo usuário. Em seguida, tenta inserir
     * um novo amigo no banco de dados e exibe uma mensagem de sucesso ou erro.
     * @param evt o evento de clique do botão
     */
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

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed
     
    }//GEN-LAST:event_JTFTelefoneActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
  
    }//GEN-LAST:event_JTFNomeActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jTituloCadastroAmigo;
    // End of variables declaration//GEN-END:variables
}
