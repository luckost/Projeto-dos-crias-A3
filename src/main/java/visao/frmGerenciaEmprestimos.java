
package visao;

import modelo.Emprestimo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
public class frmGerenciaEmprestimos extends javax.swing.JFrame {
 
  private Emprestimo objetoEmprestimo;
    private SimpleDateFormat dateFormat;

    /**
     * Creates new form frmGerenciaEmprestimo
     */
    public frmGerenciaEmprestimos() {
        initComponents();
        this.objetoEmprestimo = new Emprestimo();
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.carregaTabela();
    }

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEmprestimo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jNomeEmprestimo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jNomeFerramenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JBAlterar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        jDateEmprestimo = new com.toedter.calendar.JDateChooser();
        jDateDevolucao = new com.toedter.calendar.JDateChooser();
        JBCancelar = new javax.swing.JButton();
        JStatus = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emprestimos");
        setMinimumSize(new java.awt.Dimension(600, 365));
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
        jScrollPane1.setBounds(6, 6, 572, 107);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Nome: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 150, 50, 18);
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
        getContentPane().add(jNomeFerramenta);
        jNomeFerramenta.setBounds(110, 210, 210, 26);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Data de Devoluçao:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 210, 140, 18);

        JBAlterar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBAlterar.setForeground(new java.awt.Color(51, 255, 51));
        JBAlterar.setText("Alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(JBAlterar);
        JBAlterar.setBounds(320, 270, 110, 40);

        JBApagar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBApagar.setForeground(new java.awt.Color(255, 0, 0));
        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });
        getContentPane().add(JBApagar);
        JBApagar.setBounds(180, 270, 110, 40);
        getContentPane().add(jDateEmprestimo);
        jDateEmprestimo.setBounds(470, 150, 100, 26);
        getContentPane().add(jDateDevolucao);
        jDateDevolucao.setBounds(460, 210, 110, 26);

        JBCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelar);
        JBCancelar.setBounds(40, 270, 100, 40);

        JStatus.setText("Entregue");
        JStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JStatusActionPerformed(evt);
            }
        });
        getContentPane().add(JStatus);
        JStatus.setBounds(470, 280, 72, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            status = this.JStatus.isSelected(); // Alteração feita aqui

            if (this.objetoEmprestimo.updateEmprestimoBD(id, nomeAmigo, nomeFerramenta, dataEmprestimo, dataDevolucao, status)) {
                this.jNomeEmprestimo.setText("");
                this.jNomeFerramenta.setText("");
                this.jDateEmprestimo.setDate(null);
                this.jDateDevolucao.setDate(null);
                this.JStatus.setSelected(false);
                JOptionPane.showMessageDialog(rootPane, "Empréstimo alterado com sucesso!");
            }

            System.out.println(this.objetoEmprestimo.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            carregaTabela();
        }
    
    // TODO add your handling code here:
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
    try {
            int id = 0;
            if (this.JTableEmprestimo.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro selecione um empréstimo para apagar.");
            } else {
                id = Integer.parseInt(this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 0).toString());
            }

            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este empréstimo?");
            if (respostaUsuario == 0) { // Clicou em SIM
                if (this.objetoEmprestimo.deleteEmprestimoBD(id)) {
                    JOptionPane.showMessageDialog(rootPane, "Empréstimo apagado com sucesso!");
                }
            }

            System.out.println(this.objetoEmprestimo.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela();
        }
   // TODO add your handling code here:
    }//GEN-LAST:event_JBApagarActionPerformed

    private void JTableEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEmprestimoMouseClicked
    if (this.JTableEmprestimo.getSelectedRow() != -1) {
            String nomeAmigo = this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 1).toString();
            String nomeFerramenta = this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 2).toString();
            String dataEmprestimoStr = this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 3).toString();
            String dataDevolucaoStr = this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 4).toString();
            boolean status = this.JTableEmprestimo.getValueAt(this.JTableEmprestimo.getSelectedRow(), 5).toString().equals("Entregue"); // Alteração feita aqui

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
            this.JStatus.setSelected(status); // Alteração feita aqui
        }                    
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableEmprestimoMouseClicked

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
 this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
