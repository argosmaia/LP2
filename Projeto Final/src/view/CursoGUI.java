package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CursoGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtCargaHora;
	private JTextField txtCoordenador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CursoGUI frame = new CursoGUI();
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
	public CursoGUI() {
		setTitle("Cadastro de Curso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("CÓDIGO");
		lblCodigo.setBounds(157, 6, 61, 16);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(20, 34, 402, 26);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(157, 84, 61, 16);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(20, 112, 402, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCargaHoraria = new JLabel("CARGA HORÁRIA");
		lblCargaHoraria.setBounds(135, 150, 112, 16);
		contentPane.add(lblCargaHoraria);
		
		txtCargaHora = new JTextField();
		txtCargaHora.setBounds(20, 178, 402, 26);
		contentPane.add(txtCargaHora);
		txtCargaHora.setColumns(10);
		
		JLabel lblArea = new JLabel("ÁREA");
		lblArea.setBounds(157, 216, 61, 16);
		contentPane.add(lblArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ciências Exatas", "Ciências Sociais", "Ciências Naturais", "Ciências Lingüísticas"}));
		comboBox.setBounds(48, 238, 297, 27);
		contentPane.add(comboBox);
		
		JLabel lblCoordenador = new JLabel("COORDENADOR");
		lblCoordenador.setBounds(120, 277, 147, 16);
		contentPane.add(lblCoordenador);
		
		txtCoordenador = new JTextField();
		txtCoordenador.setBounds(20, 300, 402, 26);
		contentPane.add(txtCoordenador);
		txtCoordenador.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaTela();
			}
		});
		btnLimpar.setBounds(157, 369, 117, 57);
		contentPane.add(btnLimpar);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtCodigo.getText().isEmpty() || txtNome.getText().isEmpty() || txtCargaHora.getText().isEmpty() || txtCoordenador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(getContentPane(), "Impossivel conitnuar com campos vazios", "Erro", JOptionPane.ERROR_MESSAGE);
				}else {
					CadastroUsuarioGUI cadastrogui = new CadastroUsuarioGUI();
					cadastrogui.setVisible(true);
					dispose();
				}
				
			}
		});
		btnEnviar.setBounds(286, 369, 117, 57);
		contentPane.add(btnEnviar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGUI logingui = new LoginGUI();
				logingui.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(28, 369, 117, 57);
		contentPane.add(btnVoltar);
	}
	
	public void limpaTela() {
		txtCodigo.setText("");
		txtNome.setText("");
		txtCargaHora.setText("");
		txtCoordenador.setText("");
	}
}
