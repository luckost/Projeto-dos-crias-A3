
package visao;

import dao.EmprestimoDAO;
import modelo.Emprestimo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Interface gráfica para gerenciamento de empréstimos.
 */
public class frmGerenciaEmprestimos extends javax.swing.JFrame {
 
  private Emprestimo objetoEmprestimo;
  private EmprestimoDAO emprestimoDAO;
    private SimpleDateFormat dateFormat;


    /**
     * Cria uma nova instância de frmGerenciaEmprestimos.
     */
    public frmGerenciaEmprestimos() {
        initComponents();
        this.objetoEmprestimo = new Emprestimo();
        this.emprestimoDAO = new EmprestimoDAO(); // Adicionando inicialização do emprestimoDAO
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.carregaTabela(); // Passando um nome de amigo "fixo"
    }
/**
     * Carrega a tabela de empréstimos com os dados da lista de empréstimos.
     */
      public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableEmprestimo.getModel();
        modelo.setNumRows(0);

        ArrayList<Emprestimo> listaEmprestimos = objetoEmprestimo.getMinhaLista();

        for (Emprestimo emprestimo : listaEmprestimos) {
            modelo.addRow(new Object[]{
                emprestimo.getId(),
                emprestimo.getNomeAmigo(),
                emprestimo.getNomeFerramenta(),
                dateFormat.format(emprestimo.getDataEmprestimo()),
                dateFormat.format(emprestimo.getDataDevolucao()),
                emprestimo.getStatus() ? "Entregue" : "Aberto"
            });
        }
    }
 /**
     * Método gerado automaticamente pelo NetBeans para inicialização dos componentes.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEmprestimo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jNomeEmprestimo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jNomeFerramenta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        JStatus = new javax.swing.JCheckBox();
        JBAlterar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jDateEmprestimo = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jDateDevolucao = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emprestimos");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(790, 380));
        getContentPane().setLayout(null);

        JTableEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Amigo", "Ferramenta", "Data do Emprestimo", "Devolução", "Status"
            }
        ));
        JTableEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableEmprestimoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableEmprestimo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(16, 13, 750, 100);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 150, 50, 18);
        getContentPane().add(jNomeEmprestimo);
        jNomeEmprestimo.setBounds(60, 150, 360, 26);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ferramentas:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 210, 100, 18);
        getContentPane().add(jNomeFerramenta);
        jNomeFerramenta.setBounds(110, 210, 320, 26);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        JStatus.setForeground(new java.awt.Color(255, 255, 255));
        JStatus.setText("Entregue");
        JStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JStatusActionPerformed(evt);
            }
        });
        jPanel1.add(JStatus);
        JStatus.setBounds(650, 270, 72, 20);

        JBAlterar.setBackground(new java.awt.Color(0, 255, 0));
        JBAlterar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBAlterar.setForeground(new java.awt.Color(255, 255, 255));
        JBAlterar.setText("Atualizar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(JBAlterar);
        JBAlterar.setBounds(440, 260, 110, 40);

        JBApagar.setBackground(new java.awt.Color(255, 0, 0));
        JBApagar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBApagar.setForeground(new java.awt.Color(255, 255, 255));
        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });
        jPanel1.add(JBApagar);
        JBApagar.setBounds(320, 260, 110, 40);

        JBCancelar.setBackground(new java.awt.Color(255, 153, 0));
        JBCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        JBCancelar.setText("Voltar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(JBCancelar);
        JBCancelar.setBounds(190, 260, 110, 40);
        jPanel1.add(jDateEmprestimo);
        jDateEmprestimo.setBounds(640, 140, 100, 26);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data de Emprestimo:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(500, 140, 140, 18);
        jPanel1.add(jDateDevolucao);
        jDateDevolucao.setBounds(630, 190, 110, 26);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data de Devoluçao:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 190, 140, 18);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 760, 310);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, -30, 780, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /**
     * Método para atualizar um empréstimo existente.
     */
    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
  try {
            int id = 0;
            String nomeAmigo = "";
            String nomeFerramenta = "";
            Date dataEmprestimo = null;
            Date dataDevolucao = null;
            boolean status = false;

            if (this.JTableEmprestimo.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro selecione um empréstimo para alterar.");
            } else {
                id = Integer.parseInt(this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 0).toString());
            }

            nomeAmigo = this.jNomeEmprestimo.getText();
            nomeFerramenta = this.jNomeFerramenta.getText();
            dataEmprestimo = this.jDateEmprestimo.getDate();
            dataDevolucao = this.jDateDevolucao.getDate();
            status = this.JStatus.isSelected();

            if (this.objetoEmprestimo.updateEmprestimoBD(id, nomeAmigo, nomeFerramenta, dataEmprestimo, dataDevolucao, status)) {
                this.jNomeEmprestimo.setText("");
                this.jNomeFerramenta.setText("");
                this.jDateEmprestimo.setDate(null);
                this.jDateDevolucao.setDate(null);
                this.JStatus.setSelected(false);
                JOptionPane.showMessageDialog(rootPane, "Empréstimo alterado com sucesso!");
            }

            carregaTabela();
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        }
    }//GEN-LAST:event_JBAlterarActionPerformed
/**
     * Método para apagar um empréstimo existente.
     */
    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
     try {
        int id = 0;
        if (this.JTableEmprestimo.getSelectedRow() == -1) {
            throw new Mensagens("Primeiro selecione um empréstimo para apagar.");
        } else {
            id = Integer.parseInt(this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 0).toString());
        }

        String nomeAmigo = this.jNomeEmprestimo.getText(); // Aqui obtenha o nome do amigo

        int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este empréstimo?");
        if (respostaUsuario == 0) {
            if (this.objetoEmprestimo.deleteEmprestimoBD(id)) {
                JOptionPane.showMessageDialog(rootPane, "Empréstimo apagado com sucesso!");
            }
        }

        carregaTabela(); // Utilize a variável nomeAmigo
    } catch (Mensagens erro) {
        JOptionPane.showMessageDialog(null, erro.getMessage());
    }
    }//GEN-LAST:event_JBApagarActionPerformed
  /**
     * Método para selecionar um empréstimo na tabela.
     */
    private void JTableEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEmprestimoMouseClicked
     if (this.JTableEmprestimo.getSelectedRow() != -1) {
            String nomeAmigo = this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 1).toString();
            String nomeFerramenta = this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 2).toString();
            String dataEmprestimoStr = this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 3).toString();
            String dataDevolucaoStr = this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 4).toString();
            boolean status = this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 5).toString().equals("Entregue");

            Date dataEmprestimo = null;
            Date dataDevolucao = null;
            try {
                dataEmprestimo = dateFormat.parse(dataEmprestimoStr);
                dataDevolucao = dateFormat.parse(dataDevolucaoStr);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao formatar datas: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

            this.jNomeEmprestimo.setText(nomeAmigo);
            this.jNomeFerramenta.setText(nomeFerramenta);
            this.jDateEmprestimo.setDate(dataEmprestimo);
            this.jDateDevolucao.setDate(dataDevolucao);
            this.JStatus.setSelected(status);
        }
    }//GEN-LAST:event_JTableEmprestimoMouseClicked
 /**
     * Método para cancelar a operação e fechar a janela.
     */
    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
    this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed
 /**
     * Método para marcar ou desmarcar o status de entrega do empréstimo.
     */
    private void JStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JStatusActionPerformed
     int selectedRow = JTableEmprestimo.getSelectedRow();
    if (selectedRow != -1) {
        String status = JStatus.isSelected() ? "Entregue" : "Aberto";
        JTableEmprestimo.setValueAt(status, selectedRow, 6); // Atualiza a célula na coluna de status
    } else {
        JOptionPane.showMessageDialog(this, "Selecione um empréstimo na tabela.");
    }
    }//GEN-LAST:event_JStatusActionPerformed

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
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JCheckBox JStatus;
    private javax.swing.JTable JTableEmprestimo;
    private com.toedter.calendar.JDateChooser jDateDevolucao;
    private com.toedter.calendar.JDateChooser jDateEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNomeEmprestimo;
    private javax.swing.JTextField jNomeFerramenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
