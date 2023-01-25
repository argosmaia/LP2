package pacote.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 12, 70, 15);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setText("Nome");
		txtNome.setBounds(12, 35, 114, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String nome = txtNome.getText();
						if(nome.isEmpty() || nome.isBlank()) {
							JOptionPane.showMessageDialog(getParent(), "Preencha seu nome!");
						}else {
							JOptionPane.showMessageDialog(getContentPane(), "Olá"+txtNome.getText());
						}
					}
		});
		
		btnEntrar.setBounds(12, 98, 117, 25);
		contentPane.add(btnEntrar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(141, 98, 117, 25);
		contentPane.add(btnCadastrar);
	}

}
