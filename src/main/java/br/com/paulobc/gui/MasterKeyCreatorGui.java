package br.com.paulobc.gui;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class MasterKeyCreatorGui extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2788032171500625236L;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Create the panel.
	 */
	public MasterKeyCreatorGui() {
		setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 172, 286, 20);
		add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Chave mestra");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 172, 102, 14);
		add(lblNewLabel);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(122, 203, 286, 20);
		add(passwordField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Repetir chave");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 206, 102, 14);
		add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 450, 57);
		add(panel);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(319, 424, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.setBounds(220, 424, 89, 23);
		add(btnNewButton_1);

	}
}
