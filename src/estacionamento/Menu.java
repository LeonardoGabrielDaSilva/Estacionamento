/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import Main.NewJFrame;

/**
 *
 * @author Venrar
 */
public class Menu extends javax.swing.JFrame {

	
	
    public Menu() {
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

     
        jPanel1 = new javax.swing.JPanel();
        BotaoCadastrarProprietario = new javax.swing.JButton();
        BotaoCadastrarVeiculo = new javax.swing.JButton();
        BotaoGerenciamentoEntradaSaida = new javax.swing.JToggleButton();
        BotaoCadastrarVaga = new javax.swing.JButton();
        BotaoRelatorios = new javax.swing.JButton();
        BotaoCadastrarValor = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        Texto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoCadastrarProprietario.setText("Cadastrar Proprietario");
        BotaoCadastrarProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarProprietarioActionPerformed(evt);
            }
        });

        BotaoCadastrarVeiculo.setText("Cadastrar Veiculo");
        BotaoCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarVeiculoActionPerformed(evt);
            }
        });

        BotaoGerenciamentoEntradaSaida.setText("Gerenciamento de Entrada e Saida");
        BotaoGerenciamentoEntradaSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGerenciamentoEntradaSaidaActionPerformed(evt);
            }
        });

        BotaoCadastrarVaga.setText("Gerenciar Vagas");
        BotaoCadastrarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarVagaActionPerformed(evt);
            }
        });

        BotaoRelatorios.setText("Relatorios");
        BotaoRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRelatoriosActionPerformed(evt);
            }
        });

        BotaoCadastrarValor.setText("Gerenciamento Valor");
        BotaoCadastrarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarValorActionPerformed(evt);
            }
        });

        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        Texto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoRelatorios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoSair))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotaoCadastrarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoCadastrarValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotaoCadastrarProprietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoCadastrarVaga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoGerenciamentoEntradaSaida)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BotaoCadastrarProprietario, BotaoCadastrarVaga, BotaoCadastrarValor, BotaoCadastrarVeiculo, BotaoGerenciamentoEntradaSaida, BotaoRelatorios, BotaoSair});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoCadastrarProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastrarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCadastrarVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoGerenciamentoEntradaSaida)
                    .addComponent(BotaoCadastrarVaga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSair)
                    .addComponent(BotaoRelatorios))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BotaoCadastrarProprietario, BotaoCadastrarVaga, BotaoCadastrarValor, BotaoCadastrarVeiculo, BotaoGerenciamentoEntradaSaida, BotaoRelatorios, BotaoSair});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarProprietarioActionPerformed
       CadastrarProprietario tela1 = new CadastrarProprietario();
       tela1.setVisible(true);
       dispose();
    }//GEN-LAST:event_BotaoCadastrarProprietarioActionPerformed

    private void BotaoGerenciamentoEntradaSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGerenciamentoEntradaSaidaActionPerformed
        EntradaSaida entrada = new EntradaSaida();
        entrada.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoGerenciamentoEntradaSaidaActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        // TODO add your handling code here:
        NewJFrame newJ = new NewJFrame();
        newJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarVeiculoActionPerformed
        // TODO add your handling code here:
        CadastrarVeiculo tela = new CadastrarVeiculo();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoCadastrarVeiculoActionPerformed

    private void BotaoCadastrarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarValorActionPerformed
        // TODO add your handling code here:
        GerenciamentoValor tela = new GerenciamentoValor();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoCadastrarValorActionPerformed

    private void BotaoCadastrarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarVagaActionPerformed
        Vagas tela = new Vagas();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoCadastrarVagaActionPerformed

    private void BotaoRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRelatoriosActionPerformed
        Relatorios tela = new Relatorios();
        tela.setVisible(true);
        dispose();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	
    	
    	
       
        try {
        
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrarProprietario;
    private javax.swing.JButton BotaoCadastrarVaga;
    private javax.swing.JButton BotaoCadastrarValor;
    private javax.swing.JButton BotaoCadastrarVeiculo;
    private javax.swing.JToggleButton BotaoGerenciamentoEntradaSaida;
    private javax.swing.JButton BotaoRelatorios;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel Texto;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
