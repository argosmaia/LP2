package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroUsuarioGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JLabel lbllogin;
	private JTextField txtLogin;
	private JLabel lblSenha;
	private JTextField txtSenha;
	private JLabel lblNewLabel;
	private JTextField txtConfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuarioGUI frame = new CadastroUsuarioGUI();
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
	public CadastroUsuarioGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(143, 6, 61, 16);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(19, 24, 344, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lbllogin = new JLabel("LOGIN");
		lbllogin.setBounds(143, 62, 61, 16);
		contentPane.add(lbllogin);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(19, 73, 344, 26);
		contentPane.add(txtLogin);
		
		lblSenha = new JLabel("SENHA");
		lblSenha.setBounds(138, 111, 61, 16);
		contentPane.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(19, 125, 344, 26);
		contentPane.add(txtSenha);
		
		lblNewLabel = new JLabel("CONFIRMAR SENHA");
		lblNewLabel.setBounds(98, 155, 135, 16);
		contentPane.add(lblNewLabel);
		
		txtConfSenha = new JTextField();
		txtConfSenha.setColumns(10);
		txtConfSenha.setBounds(19, 173, 344, 26);
		contentPane.add(txtConfSenha);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(19, 218, 344, 12);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(19, 239, 344, 169);
		contentPane.add(scrollPane);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaTela();
			}
		});
		btnLimpar.setBounds(138, 429, 117, 29);
		contentPane.add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CursoGUI cursogui = new CursoGUI();
				cursogui.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(19, 429, 117, 29);
		contentPane.add(btnVoltar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(256, 429, 117, 29);
		contentPane.add(btnCadastrar);
	}
	
	public void limpaTela() {
		txtNome.setText("");
		txtLogin.setText("");
		txtSenha.setText("");
		txtConfSenha.setText("");
	}
}
