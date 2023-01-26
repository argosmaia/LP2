package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class CursoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		setBounds(100, 100, 450, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("CÓDIGO");
		lblCodigo.setBounds(157, 6, 61, 16);
		contentPane.add(lblCodigo);
		
		textField = new JTextField();
		textField.setBounds(20, 34, 402, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(157, 84, 61, 16);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(20, 112, 402, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCargaHoraria = new JLabel("CARGA HORÁRIA");
		lblCargaHoraria.setBounds(135, 150, 112, 16);
		contentPane.add(lblCargaHoraria);
		
		textField_2 = new JTextField();
		textField_2.setBounds(20, 178, 402, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
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
		
		textField_3 = new JTextField();
		textField_3.setBounds(20, 316, 402, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(20, 369, 117, 57);
		contentPane.add(btnLimpar);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(237, 369, 117, 57);
		contentPane.add(btnEnviar);
	}
}
