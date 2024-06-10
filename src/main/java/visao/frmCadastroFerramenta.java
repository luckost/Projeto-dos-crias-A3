package visao;

import javax.swing.JOptionPane;
import modelo.Ferramenta;
import dao.FerramentaDAO;

/**
 * Esta classe representa a interface gráfica para o cadastro de ferramentas no sistema.
 * Permite ao usuário registrar novas ferramentas, fornecendo o nome, marca e preço de custo.
 */
public class frmCadastroFerramenta extends javax.swing.JFrame {

    private Ferramenta objetoFerramenta;
    private FerramentaDAO ferramentaDAO;

   /**
     * Cria uma nova instância do formulário de cadastro de ferramentas.
     * Inicializa os componentes visuais e os objetos necessários para interação
     * com a classe `Ferramenta` e `FerramentaDAO`.
     */
    public frmCadastroFerramenta() {
        initComponents();
        this.objetoFerramenta = new Ferramenta();
        this.ferramentaDAO = new FerramentaDAO();

    }

    /**
     * Método gerado automaticamente pelo NetBeans para inicializar todos os
     * componentes visuais do formulário.
     */
    // Código gerado pelo NetBeans IDE oculto para economizar espaço
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JBCancelar2 = new javax.swing.JButton();
        JBCadastrar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFCusto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Ferramentas");
        setMinimumSize(new java.awt.Dimension(594, 365));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        JBCancelar2.setBackground(new java.awt.Color(255, 153, 0));
        JBCancelar2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBCancelar2.setForeground(new java.awt.Color(255, 255, 255));
        JBCancelar2.setText("Voltar");
        JBCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelar2ActionPerformed(evt);
            }
        });
        jPanel1.add(JBCancelar2);
        JBCancelar2.setBounds(30, 260, 110, 40);

        JBCadastrar2.setBackground(new java.awt.Color(51, 255, 0));
        JBCadastrar2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBCadastrar2.setForeground(new java.awt.Color(255, 255, 255));
        JBCadastrar2.setText("Cadastrar");
        JBCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrar2ActionPerformed(evt);
            }
        });
        jPanel1.add(JBCadastrar2);
        JBCadastrar2.setBounds(430, 260, 110, 40);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Cadastrar Ferramenta");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 20, 248, 44);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 110, 60, 21);
        jPanel1.add(JTFNome);
        JTFNome.setBounds(10, 140, 240, 22);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 110, 60, 20);
        jPanel1.add(JTFMarca);
        JTFMarca.setBounds(290, 140, 205, 22);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Preço de Custo:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 190, 140, 21);
        jPanel1.add(JTFCusto);
        JTFCusto.setBounds(150, 190, 150, 22);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(20, 20, 560, 310);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, -10, 590, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Trata o evento de clique no botão "Cancelar".
     * Este método é chamado quando o usuário clica no botão "Cancelar"
     * e fecha o formulário de cadastro de ferramentas.
     * @param evt o evento de clique do botão
     */
    private void JBCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelar2ActionPerformed
        this.dispose();        
    }//GEN-LAST:event_JBCancelar2ActionPerformed
 /**
     * Trata o evento de clique no botão "Cadastrar".
     * Este método é chamado quando o usuário clica no botão "Cadastrar"
     * e valida os dados inseridos pelo usuário. Em seguida, tenta inserir
     * uma nova ferramenta no banco de dados e exibe uma mensagem de sucesso ou erro.
     * @param evt o evento de clique do botão
     */
    private void JBCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrar2ActionPerformed
        try {
            String nome = "";
            String marca = "";
            double custo = 0.0;

            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }
            if (this.JTFMarca.getText().length() < 2) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.JTFMarca.getText();
            }
            if (this.JTFCusto.getText().length() <= 0) {
                throw new Mensagens("Custo deve ser um número positivo.");
            } else {
                custo = Double.parseDouble(this.JTFCusto.getText());
            }

            // envia os dados para o Controlador cadastrar
            Ferramenta novaFerramenta = new Ferramenta();
            novaFerramenta.setNome(nome);
            novaFerramenta.setMarca(marca);
            novaFerramenta.setCusto(custo);

            FerramentaDAO ferramentaDAO = new FerramentaDAO();
            boolean inserido = ferramentaDAO.inserirFerramentaBD(novaFerramenta);

            if (inserido) {
                JOptionPane.showMessageDialog(null, "Ferramenta Cadastrada com Sucesso!");
                // limpa campos da interface
                this.JTFNome.setText("");
                this.JTFMarca.setText("");
                this.JTFCusto.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar ferramenta.");
            }

            // Exibindo no console a ferramenta cadastrada
            System.out.println(ferramentaDAO.getListaFerramenta().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        }

    }//GEN-LAST:event_JBCadastrar2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar2;
    private javax.swing.JButton JBCancelar2;
    private javax.swing.JTextField JTFCusto;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
