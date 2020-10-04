package br.com.paulobc.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class MainWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1236244554788030827L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		getContentPane().setBackground(Color.BLACK);
		setTitle("SavePass");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 800, 600);
		this.setExtendedState(MAXIMIZED_BOTH);
	}

}
