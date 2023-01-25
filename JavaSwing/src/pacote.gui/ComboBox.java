package pacote.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class ComboBox extends JFrame {

	private JPanel contentPane;
	private JTextField textField;package pacote.gui;

import java.awt.EventQueue;

public class ComboBox extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox frame = new ComboBox();
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
	public ComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(177, 15, 70, 15);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(102, 42, 202, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCursoDeInteresse = new JLabel("Curso de interesse");
		lblCursoDeInteresse.setBounds(134, 71, 146, 15);
		contentPane.add(lblCursoDeInteresse);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Matemática", "Ciência da Computação", "Ciências Atuariais", "Estatística"}));
		comboBox.setBounds(102, 98, 202, 24);
		contentPane.add(comboBox);
		
		JButton btnSelecionarCurso = new JButton("Selecionar Curso");
		btnSelecionarCurso.setBounds(109, 226, 171, 25);
		contentPane.add(btnSelecionarCurso);
	}
}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox frame = new ComboBox();
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
	public ComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(177, 15, 70, 15);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(102, 42, 202, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCursoDeInteresse = new JLabel("Curso de interesse");
		lblCursoDeInteresse.setBounds(134, 71, 146, 15);
		contentPane.add(lblCursoDeInteresse);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Matemática", "Ciência da Computação", "Ciências Atuariais", "Estatística"}));
		comboBox.setBounds(102, 98, 202, 24);
		contentPane.add(comboBox);
		
		JButton btnSelecionarCurso = new JButton("Selecionar Curso");
		btnSelecionarCurso.setBounds(109, 226, 171, 25);
		contentPane.add(btnSelecionarCurso);
	}
}
