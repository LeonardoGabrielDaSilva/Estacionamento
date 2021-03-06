/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author Venrar
 */
public class GerenciamentoValor extends javax.swing.JFrame {

	private ExportarImportar ex = new ExportarImportar();
	protected Valor valor = new Valor();
	private List<Valor> lista = new ArrayList<Valor>();

	/**
	 * Creates new form GerenciamentoValor
	 */
	public GerenciamentoValor() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		BotaoVoltar = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		ValorHora = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		HistoricoPreco = new javax.swing.JTextArea();
		jLabel2 = new javax.swing.JLabel();
		BotaoAdicionarValor = new javax.swing.JButton();
		BotaoGerarHistorico = new javax.swing.JButton();
		BotaoLimparHistorico = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		BotaoVoltar.setText("Voltar");
		BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BotaoVoltarActionPerformed(evt);
			}
		});

		jLabel1.setText("Novo Valor por Hora:");

		ValorHora.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ValorHoraActionPerformed(evt);
			}
		});

		HistoricoPreco.setColumns(20);
		HistoricoPreco.setRows(5);
		jScrollPane1.setViewportView(HistoricoPreco);

		jLabel2.setText("Historico de Precos:");

		BotaoAdicionarValor.setText("Adiciona Valor");
		BotaoAdicionarValor.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					BotaoAdicionarValorActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		BotaoGerarHistorico.setText("Gerar Historico");
		BotaoGerarHistorico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					BotaoGerarHistoricoActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		BotaoLimparHistorico.setText("Apagar Historico");
		BotaoLimparHistorico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BotaoLimparHistoricoActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel1).addComponent(ValorHora)
								.addComponent(BotaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(BotaoAdicionarValor, javax.swing.GroupLayout.DEFAULT_SIZE, 116,
										Short.MAX_VALUE)
								.addComponent(BotaoGerarHistorico, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(BotaoLimparHistorico, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2).addGap(0, 0,
										Short.MAX_VALUE)))
						.addContainerGap()));

		jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { BotaoAdicionarValor, BotaoVoltar });

		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1).addComponent(jLabel2))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(ValorHora, javax.swing.GroupLayout.PREFERRED_SIZE,
																31, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(BotaoAdicionarValor,
																javax.swing.GroupLayout.PREFERRED_SIZE, 36,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(BotaoGerarHistorico,
																javax.swing.GroupLayout.PREFERRED_SIZE, 33,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(BotaoLimparHistorico,
																javax.swing.GroupLayout.PREFERRED_SIZE, 33,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17,
																Short.MAX_VALUE)
														.addComponent(BotaoVoltar,
																javax.swing.GroupLayout.PREFERRED_SIZE, 32,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(jScrollPane1))
								.addContainerGap()));

		jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] { BotaoAdicionarValor,
				BotaoGerarHistorico, BotaoLimparHistorico, BotaoVoltar });

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void BotaoLimparHistoricoActionPerformed(java.awt.event.ActionEvent evt) {
		HistoricoPreco.setText("");
	}

	private void BotaoGerarHistoricoActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
		lista = ex.importarValores(lista);
		SimpleDateFormat dh = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		HistoricoPreco.setText("");
		for (Valor valor : lista) {
			String data = dh.format(valor.getData());
			HistoricoPreco.setText(HistoricoPreco.getText() + String.valueOf(valor.getCodigo()) + " - "
					+ String.valueOf(valor.getValor()) + " R$     /     " + data + "\n");
		}

	}

	private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {
		Menu tela = new Menu();
		tela.setVisible(true);
		dispose();

	}

	private void BotaoAdicionarValorActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
		lista = ex.importarValores(lista);

		try {
			valor.setValor(Long.parseLong(ValorHora.getText()));
			Date data = new Date();
			valor.setCodigo(lista.size() + 1);
			valor.setData(data);
			lista.add(valor);
			ex.exportarValores(lista);
			JOptionPane.showMessageDialog(null, "Valor adicionado com sucesso!");
			ValorHora.setText("");
			valor = new Valor();

		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Numero Invalido");
			ValorHora.setText("");
		}

	}

	private void ValorHoraActionPerformed(java.awt.event.ActionEvent evt) {

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GerenciamentoValor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GerenciamentoValor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GerenciamentoValor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GerenciamentoValor.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GerenciamentoValor().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton BotaoAdicionarValor;
	private javax.swing.JButton BotaoGerarHistorico;
	private javax.swing.JButton BotaoLimparHistorico;
	private javax.swing.JButton BotaoVoltar;
	private javax.swing.JTextArea HistoricoPreco;
	private javax.swing.JTextField ValorHora;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	// End of variables declaration//GEN-END:variables
}
