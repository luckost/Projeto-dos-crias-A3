package visao;

import modelo.Ferramenta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class frmGerenciaFerramentas extends javax.swing.JFrame {

    private final Ferramenta objetoferramenta;

    public frmGerenciaFerramentas() {
        initComponents();
        this.objetoferramenta = new Ferramenta();
        this.carregaTabela();
        
    }

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableFerramentas.getModel();
        modelo.setNumRows(0); // Limpa a tabela

        // Carrega a lista de ferramentas
        ArrayList<Ferramenta> listaFerramentas = objetoferramenta.getListaFerramenta();

        // Percorre a lista de ferramentas e adiciona na tabela
        for (Ferramenta ferramenta : listaFerramentas) {
            modelo.addRow(new Object[]{
                ferramenta.getId(),
                ferramenta.getNome(),
                ferramenta.getMarca(),
                ferramenta.getCusto()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBCancelarTab = new javax.swing.JButton();
        JBApagarTab = new javax.swing.JButton();
        JBAlterarTab = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFerramentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFNomeTab = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFMarcaTab = new javax.swing.JTextField();
        JTFCustoTab = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TabeladeFerramentas");
        setMinimumSize(new java.awt.Dimension(580, 370));
        getContentPane().setLayout(null);

        JBCancelarTab.setBackground(new java.awt.Color(255, 153, 0));
        JBCancelarTab.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBCancelarTab.setForeground(new java.awt.Color(255, 255, 255));
        JBCancelarTab.setText("Voltar");
        JBCancelarTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarTabActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelarTab);
        JBCancelarTab.setBounds(61, 289, 100, 30);

        JBApagarTab.setBackground(new java.awt.Color(255, 0, 0));
        JBApagarTab.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBApagarTab.setForeground(new java.awt.Color(255, 255, 255));
        JBApagarTab.setText("Apagar");
        JBApagarTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarTabActionPerformed(evt);
            }
        });
        getContentPane().add(JBApagarTab);
        JBApagarTab.setBounds(244, 289, 100, 30);

        JBAlterarTab.setBackground(new java.awt.Color(51, 255, 0));
        JBAlterarTab.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBAlterarTab.setForeground(new java.awt.Color(255, 255, 255));
        JBAlterarTab.setText("Alterar");
        JBAlterarTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarTabActionPerformed(evt);
            }
        });
        getContentPane().add(JBAlterarTab);
        JBAlterarTab.setBounds(420, 289, 100, 30);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jTableFerramentas.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jTableFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id ", "Nome", "Marca", "Custo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableFerramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFerramentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFerramentas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 550, 120);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Editar Ferramentas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 140, 170, 27);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 180, 54, 27);
        jPanel1.add(JTFNomeTab);
        JTFNomeTab.setBounds(70, 180, 200, 26);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 180, 60, 27);
        jPanel1.add(JTFMarcaTab);
        JTFMarcaTab.setBounds(340, 180, 200, 26);
        jPanel1.add(JTFCustoTab);
        JTFCustoTab.setBounds(70, 240, 200, 26);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Custo:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 240, 54, 27);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 570, 320);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 590, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarTabActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarTabActionPerformed

    private void JBApagarTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarTabActionPerformed
        int selectedRow = jTableFerramentas.getSelectedRow();
        if (selectedRow >= 0) {
            int ferramentaId = (int) jTableFerramentas.getValueAt(selectedRow, 0);

            int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir esta ferramenta?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                boolean sucesso = objetoferramenta.deletarFerramenta(ferramentaId);
                if (sucesso) {
                    this.carregaTabela();
                    JOptionPane.showMessageDialog(this, "Ferramenta removida com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao remover a ferramenta.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma ferramenta para remover.");
        }
    }//GEN-LAST:event_JBApagarTabActionPerformed

    private void JBAlterarTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarTabActionPerformed
        try {
            // Recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            String marca = "";
            double custo = 0.0;

            if (this.JTFNomeTab.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNomeTab.getText();
            }

            if (this.JTFMarcaTab.getText().length() < 2) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.JTFMarcaTab.getText();
            }

            try {
                custo = Double.parseDouble(this.JTFCustoTab.getText());
            } catch (NumberFormatException erro2) {
                throw new Mensagens("Informe um custo válido.");
            }

            if (this.jTableFerramentas.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro selecione uma ferramenta para alterar.");
            } else {
                id = Integer.parseInt(this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 0).toString());
            }

            // Envia os dados para o Ferramenta processar
            if (this.objetoferramenta.atualizarFerramenta(id, nome, marca, custo)) {
                // Limpa os campos
                this.JTFNomeTab.setText("");
                this.JTFMarcaTab.setText("");
                this.JTFCustoTab.setText("");
                // JOptionPane.showMessageDialog(rootPane, "Ferramenta alterada com sucesso!");
            }

            // Exibe no console as ferramentas cadastradas
            //System.out.println(this.objetoferramenta.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // Atualiza a tabela
            carregaTabela();
        }
    }//GEN-LAST:event_JBAlterarTabActionPerformed

    private void JTFNomeTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeTabActionPerformed


    }//GEN-LAST:event_JTFNomeTabActionPerformed

    private void jTableFerramentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFerramentasMouseClicked
    if (this.jTableFerramentas.getSelectedRow() != -1) {
    String nome = this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 1).toString();
    String marca = this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 2).toString();
    String custo = this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 3).toString();
    // Aqui você pode obter o ID se precisar
    // String id = this.jTableAmigo.getValueAt(this.jTableAmigo.getSelectedRow(), 0).toString();

    this.JTFNomeTab.setText(nome);
   this.JTFMarcaTab.setText(marca);
   this.JTFCustoTab.setText(custo);

}    // TODO add your handling code here: 
    }//GEN-LAST:event_jTableFerramentasMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(frmGerenciaFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Adicione o código de inicialização do formulário aqui
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGerenciaFerramentas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterarTab;
    private javax.swing.JButton JBApagarTab;
    private javax.swing.JButton JBCancelarTab;
    private javax.swing.JTextField JTFCustoTab;
    private javax.swing.JTextField JTFMarcaTab;
    private javax.swing.JTextField JTFNomeTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableFerramentas;
    // End of variables declaration//GEN-END:variables
 }
