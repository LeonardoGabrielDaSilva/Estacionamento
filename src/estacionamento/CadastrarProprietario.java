/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 *
 * @author Venrar
 */
public class CadastrarProprietario extends javax.swing.JFrame {

	private boolean flag;
	static ExportarImportar ex = new ExportarImportar();
	protected Proprietario proprietario = new Proprietario();
	static List<Proprietario> lista = new ArrayList<Proprietario>();

	/**
	 * Creates new form CadastrarProprietario
	 */
	public CadastrarProprietario() {
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

		jPanel5 = new javax.swing.JPanel();
		CadastroNomeProprietario = new javax.swing.JTextField();
		CadastroTelefoneProprietario = new javax.swing.JTextField();
		CadastroEmailProprietario = new javax.swing.JTextField();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		BotaoVolta = new javax.swing.JButton();
		BotaoCadastrar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		CadastroNomeProprietario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CadastroNomeProprietarioActionPerformed(evt);
			}
		});

		CadastroTelefoneProprietario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CadastroTelefoneProprietarioActionPerformed(evt);
			}
		});

		CadastroEmailProprietario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CadastroEmailProprietarioActionPerformed(evt);
			}
		});

		jLabel17.setText("Email:");

		jLabel18.setText("Telefone:");

		jLabel19.setText("Nome:");

		BotaoVolta.setText("Voltar");
		BotaoVolta.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BotaoVoltaActionPerformed(evt);
			}
		});

		BotaoCadastrar.setText("Cadastrar");
		BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					BotaoCadastrarActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel5Layout.createSequentialGroup()
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel19).addComponent(jLabel18).addComponent(jLabel17))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(jPanel5Layout.createSequentialGroup()
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel5Layout.createSequentialGroup()
												.addComponent(BotaoVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 153,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE,
														146, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel5Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
														.addComponent(CadastroEmailProprietario,
																javax.swing.GroupLayout.PREFERRED_SIZE, 406,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(CadastroTelefoneProprietario,
												javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(CadastroNomeProprietario,
												javax.swing.GroupLayout.Alignment.TRAILING))
								.addContainerGap()))));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(CadastroNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel18)
						.addGap(2, 2, 2)
						.addComponent(CadastroTelefoneProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(CadastroEmailProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(28, 28, 28)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(BotaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
								.addComponent(BotaoVolta, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void CadastroNomeProprietarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CadastroNomeProprietarioActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_CadastroNomeProprietarioActionPerformed

	private void CadastroTelefoneProprietarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CadastroTelefoneProprietarioActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_CadastroTelefoneProprietarioActionPerformed

	private void CadastroEmailProprietarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CadastroEmailProprietarioActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_CadastroEmailProprietarioActionPerformed

	private void BotaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotaoVoltaActionPerformed
		Menu menu = new Menu();
		menu.setVisible(true);
		dispose();
	}// GEN-LAST:event_BotaoVoltaActionPerformed

	private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_BotaoCadastrarActionPerformed

		flag = true;
		if (!CadastroEmailProprietario.getText().equals("") && !CadastroNomeProprietario.getText().equals("")
				&& !CadastroTelefoneProprietario.getText().equals("")) {
			if (validar(CadastroEmailProprietario.getText())) {
				for (Proprietario proprietario : lista) {
					if (proprietario.getEmail().equals(CadastroEmailProprietario.getText())) {
						flag = false;
						JOptionPane.showMessageDialog(null, "Email j� registrado");
					}
				}
				if (flag) {
					proprietario.setEmail(CadastroEmailProprietario.getText());
					proprietario.setNome(CadastroNomeProprietario.getText());
					proprietario.setTelefone(CadastroTelefoneProprietario.getText());
					lista.add(proprietario);
					ex.exportarProprietario(lista);
					JOptionPane.showMessageDialog(null, "Proprietario Cadastrado com Sucesso!");
					CadastrarVeiculo tela1 = new CadastrarVeiculo();
					tela1.setVisible(true);
					dispose();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Email Invalido");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Campos Incompletos");
		}

	}// GEN-LAST:event_BotaoCadastrarActionPerformed

	/**
	 * @param args the command line arguments
	 * @throws IOException
	 */

	public static boolean validar(String email) {
		boolean isEmailIdValid = false;
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				isEmailIdValid = true;
			}
		}
		return isEmailIdValid;
	}

	public static void main(String args[]) throws IOException {

		try {
			lista = ex.importarProprietario(lista);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			java.util.logging.Logger.getLogger(CadastrarProprietario.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CadastrarProprietario.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CadastrarProprietario.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CadastrarProprietario.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CadastrarProprietario().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton BotaoCadastrar;
	private javax.swing.JButton BotaoVolta;
	private javax.swing.JTextField CadastroEmailProprietario;
	private javax.swing.JTextField CadastroNomeProprietario;
	private javax.swing.JTextField CadastroTelefoneProprietario;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JPanel jPanel5;
	// End of variables declaration//GEN-END:variables
}