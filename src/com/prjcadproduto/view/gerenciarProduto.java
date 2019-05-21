package com.prjcadproduto.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class gerenciarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gerenciarProduto frame = new gerenciarProduto();
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
	public gerenciarProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome Produto");
		lblNome.setBounds(10, 56, 79, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 75, 180, 20);
		contentPane.add(textField);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 11, 79, 14);
		contentPane.add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 25, 180, 20);
		contentPane.add(textField_1);
		
		JLabel lblFabricante = new JLabel("Fabricante");
		lblFabricante.setBounds(20, 186, 79, 14);
		contentPane.add(lblFabricante);
	}
}
