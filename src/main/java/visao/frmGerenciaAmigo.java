package visao;

import modelo.Amigo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Esta classe representa a interface gráfica para a gestão de amigos no sistema.
 * Permite ao usuário visualizar, editar, adicionar e excluir amigos da lista.
 */
public class frmGerenciaAmigo extends javax.swing.JFrame {

    private Amigo objetoAmigo;

    /**
     * Cria uma nova instância do formulário de gestão de amigos.
     * Inicializa os componentes visuais e o objeto `Amigo` para interação
     * com a lista de amigos.
     */
    public frmGerenciaAmigo() {
        initComponents();
        this.objetoAmigo = new Amigo();
        this.carregaTabela();
    }
 /**
     * Método responsável por carregar os dados dos amigos na tabela.
     * Percorre a lista de amigos e atualiza a tabela com os dados.
     */
   public void carregaTabela() {
    DefaultTableModel modelo = (DefaultTableModel) this.jTableAmigo.getModel();
    modelo.setNumRows(0); // Limpa a tabela

    // Carrega a lista de amigos
    ArrayList<Amigo> listaAmigos = objetoAmigo.getMinhaLista();

    // Percorre a lista de amigos e adiciona na tabela
    for (Amigo amigo : listaAmigos) {
        modelo.addRow(new Object[]{
            amigo.getId(),
            amigo.getNome(),
            amigo.getTelefone()
        });
    }
}


    /**
     * Método gerado automaticamente pelo NetBeans para inicializar todos os
     * componentes visuais do formulário.
     */
    // Código gerado pelo NetBeans IDE oculto para economizar espaço
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBApagarTab2 = new javax.swing.JButton();
        JBCancelarTab2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAmigo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFNomeTab2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFTelefoneTab2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JBAlterarTab2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabela de Amigos");
        setMinimumSize(new java.awt.Dimension(600, 370));
        getContentPane().setLayout(null);

        JBApagarTab2.setBackground(new java.awt.Color(255, 0, 51));
        JBApagarTab2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBApagarTab2.setForeground(new java.awt.Color(255, 255, 255));
        JBApagarTab2.setText("Apagar");
        JBApagarTab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarTab2ActionPerformed(evt);
            }
        });
        getContentPane().add(JBApagarTab2);
        JBApagarTab2.setBounds(231, 278, 110, 30);

        JBCancelarTab2.setBackground(new java.awt.Color(255, 153, 0));
        JBCancelarTab2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBCancelarTab2.setForeground(new java.awt.Color(255, 255, 255));
        JBCancelarTab2.setText("Voltar");
        JBCancelarTab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarTab2ActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelarTab2);
        JBCancelarTab2.setBounds(62, 278, 110, 30);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jTableAmigo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jTableAmigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone"
            }
        ));
        jTableAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAmigoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAmigo);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 540, 118);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Editar Amigos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 130, 130, 35);
        jPanel1.add(JTFNomeTab2);
        JTFNomeTab2.setBounds(70, 180, 320, 26);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 180, 60, 24);
        jPanel1.add(JTFTelefoneTab2);
        JTFTelefoneTab2.setBounds(100, 230, 290, 26);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefone:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 230, 81, 24);

        JBAlterarTab2.setBackground(new java.awt.Color(0, 255, 51));
        JBAlterarTab2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBAlterarTab2.setForeground(new java.awt.Color(255, 255, 255));
        JBAlterarTab2.setText("Alterar");
        JBAlterarTab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarTab2ActionPerformed(evt);
            }
        });
        jPanel1.add(JBAlterarTab2);
        JBAlterarTab2.setBounds(400, 270, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 560, 310);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 590, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Trata o evento de clique no botão "Cancelar".
     * Fecha o formulário de gestão de amigos.
     * @param evt o evento de clique do botão
     */
    private void JBCancelarTab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarTab2ActionPerformed
    this.dispose();
    }//GEN-LAST:event_JBCancelarTab2ActionPerformed
/**
     * Trata o evento de clique no botão "Apagar".
     * Remove o amigo selecionado da lista.
     * @param evt o evento de clique do botão
     */
    private void JBApagarTab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarTab2ActionPerformed
try {
    // Validando dados da interface gráfica.
    int id = 0;
    if (this.jTableAmigo.getSelectedRow() == -1) {
        throw new Mensagens("Primeiro selecione um amigo para apagar.");
    } else {
        id = Integer.parseInt(this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 0).toString());
    }
    
    // Retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
    int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este amigo?");
    if (respostaUsuario == 0) { // Clicou em SIM
        // Envia os dados para o Amigo processar
        if (this.objetoAmigo.deleteAmigoBD(id)) {
            // Limpa os campos
            this.JTFNomeTab2.setText("");
            this.JTFTelefoneTab2.setText("");
            JOptionPane.showMessageDialog(rootPane, "Amigo apagado com sucesso!");
        }
    }
    
    // Atualiza a tabela.
    System.out.println(this.objetoAmigo.getMinhaLista().toString());
} catch (Mensagens erro) {
    JOptionPane.showMessageDialog(null, erro.getMessage());
} finally {
    // Atualiza a tabela.
    carregaTabela();
}
    }//GEN-LAST:event_JBApagarTab2ActionPerformed
 /**
     * Trata o evento de clique no botão "Alterar".
     * Altera os dados do amigo selecionado.
     * @param evt o evento de clique do botão
     */
    private void JBAlterarTab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarTab2ActionPerformed
    try {
    // Recebendo e validando dados da interface gráfica.
    int id = 0;
    String nome = "";
    String telefone = "";
    
    if (this.JTFNomeTab2.getText().length() < 2) {
        throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
    } else {
        nome = this.JTFNomeTab2.getText();
    }
    
    if (this.JTFTelefoneTab2.getText().length() < 2) {
        throw new Mensagens("Telefone deve conter ao menos 2 caracteres.");
    } else {
        telefone = this.JTFTelefoneTab2.getText();
    }
    
    if (this.jTableAmigo.getSelectedRow() == -1) {
        throw new Mensagens("Primeiro selecione um amigo para alterar.");
    } else {
        id = Integer.parseInt(this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 0).toString());
    }
    
    // Envia os dados para o Amigo processar
    if (this.objetoAmigo.updateAmigoBD(id, nome, telefone)) {
        // Limpa os campos
        this.JTFNomeTab2.setText("");
        this.JTFTelefoneTab2.setText("");
        JOptionPane.showMessageDialog(rootPane, "Amigo alterado com sucesso!");
    }
    
    // Exibe no console os amigos cadastrados
    System.out.println(this.objetoAmigo.getMinhaLista().toString());
} catch (Mensagens erro) {
    JOptionPane.showMessageDialog(null, erro.getMessage());
} catch (NumberFormatException erro2) {
    JOptionPane.showMessageDialog(null, "Informe um número válido.");
} finally {
    // Atualiza a tabela
    carregaTabela();
}
    }//GEN-LAST:event_JBAlterarTab2ActionPerformed
/**
     * Atualiza os campos de nome e telefone quando o usuário
     * clica em um amigo na tabela.
     * @param evt o evento de clique na tabela
     */
    private void jTableAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAmigoMouseClicked
if (this.jTableAmigo.getSelectedRow() != -1) {
    String nome = this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 1).toString();
    String telefone = this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 2).toString();
    // Aqui você pode obter o ID se precisar
    // String id = this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 0).toString();
    
    this.JTFNomeTab2.setText(nome);
    this.JTFTelefoneTab2.setText(telefone);
}
    }//GEN-LAST:event_jTableAmigoMouseClicked

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
            java.util.logging.Logger.getLogger(frmGerenciaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGerenciaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGerenciaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGerenciaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGerenciaAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterarTab2;
    private javax.swing.JButton JBApagarTab2;
    private javax.swing.JButton JBCancelarTab2;
    private javax.swing.JTextField JTFNomeTab2;
    private javax.swing.JTextField JTFTelefoneTab2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAmigo;
    // End of variables declaration//GEN-END:variables
}
