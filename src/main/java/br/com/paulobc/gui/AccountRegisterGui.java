package br.com.paulobc.gui;

import java.awt.Color;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AccountRegisterGui extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4249557425035790590L;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public AccountRegisterGui() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(122, 103, 286, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome de usu\u00E1rio");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(26, 106, 86, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(66, 134, 46, 14);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(122, 72, 286, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("T\u00EDtulo");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(66, 75, 46, 14);
		add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 131, 286, 20);
		add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(122, 162, 286, 20);
		add(passwordField_1);
		
		JLabel lblNewLabel_4 = new JLabel("Repetir senha");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(45, 165, 67, 14);
		add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(122, 224, 286, 168);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setTabSize(4);
		textArea.setRows(30);
		textArea.setLineWrap(true);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 193, 286, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("URL");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(66, 196, 46, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Anota\u00E7\u00F5es");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setBounds(45, 230, 67, 14);
		add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(319, 424, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.setBounds(220, 424, 89, 23);
		add(btnNewButton_1);
		
		Panel panel = new Panel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 456, 57);
		add(panel);

	}
}
