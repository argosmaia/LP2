package pacote.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JRadioButton;

public class Aula19 extends JFrame {
	private JRadioButton rdProfessorEF;
	private JRadioButton rdProfessorEM;
	private JRadioButton rdProfessorES;
	private ButtonGroup gb;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aula19 frame = new Aula19();
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
	public Aula19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecioneOCargo = new JLabel("Selecione o cargo");
		lblSelecioneOCargo.setBounds(72, 12, 163, 15);
		contentPane.add(lblSelecioneOCargo);
		
		JRadioButton rdProfessorEF = new JRadioButton("Professor - Ensino Fundamental");
		rdProfessorEF.setBounds(20, 49, 269, 23);
		contentPane.add(rdProfessorEF);
		
		JRadioButton rdProfessorEM = new JRadioButton("Professor - Ensino Médio");
		rdProfessorEM.setBounds(20, 71, 255, 23);
		contentPane.add(rdProfessorEM);
		
		JRadioButton rdProfessorES = new JRadioButton("Professor - Ensino Superior");
		rdProfessorES.setBounds(20, 93, 255, 23);
		contentPane.add(rdProfessorES);
		
		gb = new ButtonGroup();
		gb.add(rdProfessorEF);
		gb.add(rdProfessorEM);
		gb.add(rdProfessorES);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(87, 142, 117, 25);
		contentPane.add(btnEnviar);
	}
}
