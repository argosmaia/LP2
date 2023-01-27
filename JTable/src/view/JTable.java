package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTable extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btn_Limpar;
	private JButton btnEnviar;
	private JScrollPane scrollPane;
	private JTable tableNome;
	private DefaultTableModel modelo;
	private javax.swing.JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTable frame = new JTable();
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
	public JTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(155, 12, 70, 15);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(26, 39, 315, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn_Limpar = new JButton("Limpar");
		btn_Limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btn_Limpar.setBounds(46, 91, 117, 25);
		contentPane.add(btn_Limpar);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = textField.getText();
				if(nome.isEmpty()) {
					JOptionPane.showMessageDialog(getContentPane(), "Nome vazio", "Erro", JOptionPane.ERROR_MESSAGE);
				}else {
					adicionarNome(nome);
					limpar();
				}
			}
		});
		btnEnviar.setBounds(205, 91, 117, 25);
		contentPane.add(btnEnviar);
		
		definirModeloJTable();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 141, 315, 123);
		contentPane.add(scrollPane);
		
		table = new javax.swing.JTable();
		scrollPane.setColumnHeaderView(table);
	}
	
	public void definirModeloJTable() {
		modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		tableNome = new JTable();
	}
	
	public void adicionarNome(String nome) {
		Object[] dados = {nome};
		modelo.addRow(dados);
	}
	
	public void limpar() {
		textField.setText("");
	}
}
