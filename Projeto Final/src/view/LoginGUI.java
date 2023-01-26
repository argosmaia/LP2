package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField pwdField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	@SuppressWarnings("deprecation")
	public LoginGUI() {
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_login = new JLabel("Login");
		lbl_login.setBounds(124, 19, 90, 27);
		contentPane.add(lbl_login);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(29, 47, 275, 26);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lbl_senha = new JLabel("Senha");
		lbl_senha.setBounds(123, 85, 61, 16);
		contentPane.add(lbl_senha);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(29, 104, 275, 26);
		contentPane.add(pwdField);
		
		//TAMANHO DA SENHA
		String pass = new String(pwdField.getPassword());
		
		JButton btn_limpar = new JButton("Limpar");
		btn_limpar.setBounds(17, 168, 117, 29);
		contentPane.add(btn_limpar);
		
		
		
		JButton btn_evniar = new JButton("Enviar");
		btn_evniar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						if(txtLogin.getText().isEmpty() || pwdField.getPassword().length < 0) {
							JOptionPane.showMessageDialog(getContentPane(), "Nome ou senha inválido","Erro", JOptionPane.ERROR_MESSAGE);
						}else {
						
							if(txtLogin.getText() == "user" && pass.equals("12345")) {
								CursoGUI cursogui = new CursoGUI();
								cursogui.show();
								dispose();
							} /*else {
								JOptionPane.showMessageDialog(getContentPane(), "Nome ou senha inválido","Erro", JOptionPane.ERROR_MESSAGE);
							}*/
						}
					}
		});
		btn_evniar.setBounds(161, 168, 117, 29);
		contentPane.add(btn_evniar);
	}
}
