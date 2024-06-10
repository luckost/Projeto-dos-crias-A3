package visao;

/**
 * Classe responsável por exibir informações sobre o sistema.
 */
public class frmSobre extends javax.swing.JFrame {

   /**
     * Cria uma nova instância de frmSobre.
     */
    public frmSobre() {
        initComponents();
    }

    /**
     * Este método é chamado a partir do construtor para inicializar o formulário.
     * ATENÇÃO: Não modifique este código. O conteúdo deste método é sempre
     * regenerado pelo Editor de Formulários.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JBX = new javax.swing.JButton();

        JBVoltar.setBackground(new java.awt.Color(255, 51, 51));
        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Sistema de Gerenciamento de Empréstimo de Ferramentas\n\nEste software foi desenvolvido para atender às necessidades de gerenciamento de empréstimo de ferramentas do dia a dia. Projetado para ser executado localmente no computador do usuário, nosso programa oferece uma solução simples e eficaz para acompanhar empréstimos de ferramentas entre amigos e familiares.\n\nRecursos Principais:\n\nCadastro de Ferramentas: Registre informações detalhadas sobre suas ferramentas, incluindo nome, marca e custo de aquisição.\nCadastro de Amigos: Mantenha um registro organizado dos amigos e familiares que estão emprestando suas ferramentas, incluindo seus nomes e números de telefone.\nRegistro de Empréstimos: Registre os empréstimos de ferramentas a um determinado amigo, com datas de empréstimo e devolução para fácil acompanhamento.\nRelatórios Detalhados: Acesse relatórios que mostram o custo total das ferramentas adquiridas, bem como os empréstimos ativos e históricos de todos os empréstimos realizados.\nAlertas de Devolução: Receba alertas automáticos quando um amigo ainda tiver ferramentas emprestadas, ajudando a garantir que nada seja esquecido ou perdido.\nObjetivo:\n\nNosso objetivo é fornecer uma solução conveniente e intuitiva para o gerenciamento de empréstimos de ferramentas, simplificando o processo e permitindo que os usuários mantenham um controle eficaz sobre seus pertences e empréstimos.\n\nDesenvolvedores:\n\nEste software foi desenvolvido por Lucas, Bryan, Rafael e Vitor, dedicados a criar ferramentas úteis e práticas para simplificar a vida cotidiana.");
        jScrollPane1.setViewportView(jTextArea1);

        JBX.setBackground(new java.awt.Color(255, 51, 51));
        JBX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBX.setText("X");
        JBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBX, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(JBX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Método de ação do botão "Voltar".
     * Fecha a janela atual.
     * @param evt O evento associado ao clique do botão "Voltar".
     */
    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_JBVoltarActionPerformed
 /**
     * Método de ação do botão "X".
     * Fecha a janela atual.
     * @param evt O evento associado ao clique do botão "X".
     */
    private void JBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBXActionPerformed
    this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_JBXActionPerformed

   /**
     * Método principal responsável por iniciar a aplicação.
     * Cria e exibe uma instância da classe frmSobre.
     * @param args Os argumentos da linha de comando.
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
            java.util.logging.Logger.getLogger(frmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBVoltar;
    private javax.swing.JButton JBX;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}


