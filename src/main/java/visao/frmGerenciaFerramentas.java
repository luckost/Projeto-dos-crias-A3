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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFerramentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFNomeTab = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFMarcaTab = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFCustoTab = new javax.swing.JTextField();
        JBCancelarTab = new javax.swing.JButton();
        JBApagarTab = new javax.swing.JButton();
        JBAlterarTab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TabeladeFerramentas");

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

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Editar Ferramentas");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Marca:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Custo:");

        JBCancelarTab.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBCancelarTab.setText("Cancelar");
        JBCancelarTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarTabActionPerformed(evt);
            }
        });

        JBApagarTab.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBApagarTab.setForeground(new java.awt.Color(255, 0, 0));
        JBApagarTab.setText("Apagar");
        JBApagarTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarTabActionPerformed(evt);
            }
        });

        JBAlterarTab.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        JBAlterarTab.setForeground(new java.awt.Color(51, 204, 0));
        JBAlterarTab.setText("Alterar");
        JBAlterarTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarTabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(JTFNomeTab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(JTFMarcaTab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(JBCancelarTab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)
                                        .addComponent(JBApagarTab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(JBAlterarTab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFCustoTab, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNomeTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFMarcaTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCustoTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelarTab, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(JBApagarTab, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(JBAlterarTab, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

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
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableFerramentas;
    // End of variables declaration//GEN-END:variables
 }
