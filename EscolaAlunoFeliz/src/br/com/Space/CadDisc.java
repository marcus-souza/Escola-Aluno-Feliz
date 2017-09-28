package br.com.Space;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import br.com.ClassesInternas.Aluno;
import br.com.ClassesInternas.Curso;
import br.com.ClassesInternas.Disciplina;
import br.com.ClassesInternas.Solicita��o;
import br.com.Conex�o.BancoDeDados;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
@SuppressWarnings("all")
public class CadDisc extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadDisc frame = new CadDisc(new Aluno("NomeAluno", "cpf", "telefone", "Endere�o", "usuario", "senha", new Curso("NomeCurso",8), null));
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
	public CadDisc(Aluno aluno) {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(0, 0, 434, 43);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblDisciplina = new JLabel("Disciplinas");
		lblDisciplina.setFont(new Font("Traditional Arabic", Font.PLAIN, 16));
		lblDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplina.setBounds(10, 11, 91, 25);
		panel_1.add(lblDisciplina);
		
		JLabel lblFiltro = new JLabel("Filtro");
		lblFiltro.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiltro.setBounds(301, 16, 46, 14);
		panel_1.add(lblFiltro);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 54, 414, 169);
		contentPane.add(scrollPane);
		
		DefaultTableModel modelo = new DefaultTableModel();
		table = new JTable(modelo);
		scrollPane.setColumnHeaderView(table);
		
		String[] sem = new String[1+aluno.getCurso().getQtdSemestres()];
		sem[0] = "";
		for(int i = 1; i<=aluno.getCurso().getQtdSemestres(); i++){
			sem[i] = "" + (i) +"� Semestre";
		}
		JComboBox comboBox = new JComboBox(sem);
		comboBox.setSelectedIndex(0);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 1; i<=aluno.getCurso().getQtdSemestres(); i++){
					if(comboBox.getSelectedItem().equals(sem[i])){
						DefaultTableModel modelo = new DefaultTableModel();
						table = new JTable(modelo);
						scrollPane.setViewportView(table);
						
						//TODO retirar a parte de teste e descomentar esta parte
//						ArrayList<Disciplina> lista = BancoDeDados.getDisciplinas(aluno.getCurso().getNome(),i);
//						modelo.addColumn("C�digo");
//						modelo.addColumn("Nome");
//						modelo.addColumn("Professor");						for(Disciplina d:lista){
//							modelo.addRow(new Object[]{d.getCodigo(),d.getNome(),d.getProfessor()});
//						}
							///teste
							modelo.addColumn("C�digo");
							modelo.addColumn("Nome");
							modelo.addColumn("Professor");
							for(int j = 0; j<20; j++){
								modelo.addRow(new Object[]{"1234"+i,"Bando De Dados" +i,"Jos�"});
								modelo.addRow(new Object[]{"2333"+i,"Programas" +i,"Paulo"});
							}
					}
				}
			}
		});
		comboBox.setBounds(357, 13, 67, 20);
		panel_1.add(comboBox);
		
		JLabel lblDigiteOCdigo = new JLabel("Digite o c\u00F3digo da disciplina em que deseja se cadastrar:");
		lblDigiteOCdigo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDigiteOCdigo.setBounds(10, 234, 286, 14);
		contentPane.add(lblDigiteOCdigo);
		
		textField = new JTextField();
		textField.setBounds(290, 234, 72, 14);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disciplina d = BancoDeDados.getDisciplina(textField.getText());
				if(d!=null){
					JOptionPane.showConfirmDialog(null,
							BancoDeDados.inserir(new Solicita��o(null,"Cadastro",null,aluno,d)),
							null,2);
				}
				else
					JOptionPane.showConfirmDialog(null, "C�digo incorreto!",null,2);
			}
		});
		btnNewButton.setBounds(372, 230, 52, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
