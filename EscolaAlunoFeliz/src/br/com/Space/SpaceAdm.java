package br.com.Space;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import br.com.ClassesInternas.Aluno;
import br.com.ClassesInternas.Professor;
import br.com.ClassesInternas.Solicita��o;
import br.com.Conex�o.BancoDeDados;
import br.com.Login.Selection;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.Box;
import java.awt.Component;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JTable;
import javax.swing.JScrollBar;

@SuppressWarnings("all")
public class SpaceAdm extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		UIManager.put("OptionPane.cancelButtonText", "Voltar");
		UIManager.put("OptionPane.noButtonText", "Excluir");
		UIManager.put("OptionPane.yesButtonText", "Atualizar");
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpaceAdm frame = new SpaceAdm();
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
	public SpaceAdm() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 345);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Arquivo");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Logout");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Selection frame = new Selection();
				frame.setVisible(true);
				dispose();
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Sair");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(menuItem_1);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEspaoDoAdministrador = new JLabel("Espa\u00E7o do Administrador");
		lblEspaoDoAdministrador.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspaoDoAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblEspaoDoAdministrador, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel(" ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_1.add(label, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 11, 421, 193);
//		panel_2.add(panel_3);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(129, 11, 282, 182);
//		panel_3.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(43, 36, 46, 14);
		panel_8.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(134, 33, 86, 20);
		panel_8.add(textField_1);
		
		JLabel lblAluno = new JLabel("Aluno");
		lblAluno.setBounds(107, 8, 46, 14);
		panel_8.add(lblAluno);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(43, 61, 46, 14);
		panel_8.add(lblCpf);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(134, 58, 86, 20);
		panel_8.add(textField);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(43, 86, 68, 14);
		panel_8.add(lblTelefone);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(134, 83, 86, 20);
		panel_8.add(textField_2);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(43, 111, 68, 14);
		panel_8.add(lblEndereo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(134, 108, 86, 20);
		panel_8.add(textField_3);
		
		JButton btn1k = new JButton("Ok");
		btn1k.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno a = new Aluno(
						textField_1.getText(),
						textField.getText(),
						textField_2.getText(),
						textField_3.getText(),
						textField_1.getText(),
						textField_1.getText(),
						BancoDeDados.getCurso(textField_13.getText()),
						null
						);
				if(BancoDeDados.existeAluno(a.getCpf())==1){
					int op = JOptionPane.showConfirmDialog(null, "O CPF j� est� cadastrado. O que deseja fazer?");
					if (op == 0){
						BancoDeDados.atualizar(a);
					}
					else if(op==1){
						JOptionPane.showConfirmDialog(null, BancoDeDados.excluir(a),"Resultado da exclus�o",2);
					}
				}
				else
					JOptionPane.showConfirmDialog(null, BancoDeDados.inserir(a),"Resultado da inser��o",2);
			}
		});
		btn1k.setBounds(229, 148, 53, 23);
		panel_8.add(btn1k);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(134, 133, 86, 20);
		panel_8.add(textField_13);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(43, 136, 68, 14);
		panel_8.add(lblCurso);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(129, 0, 282, 193);
//		panel_3.add(panel_9);
		
		JLabel label_1 = new JLabel("Nome");
		label_1.setBounds(42, 25, 46, 14);
		panel_9.add(label_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(133, 22, 86, 20);
		panel_9.add(textField_6);
		
		JLabel lblProfessor = new JLabel("Professor");
		lblProfessor.setBounds(92, 0, 86, 20);
		panel_9.add(lblProfessor);
		
		JLabel label_3 = new JLabel("CPF");
		label_3.setBounds(42, 50, 46, 14);
		panel_9.add(label_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(133, 47, 86, 20);
		panel_9.add(textField_7);
		
		JLabel label_4 = new JLabel("Telefone");
		label_4.setBounds(42, 75, 68, 14);
		panel_9.add(label_4);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(133, 72, 86, 20);
		panel_9.add(textField_8);
		
		JLabel label_5 = new JLabel("Endere\u00E7o");
		label_5.setBounds(42, 100, 68, 14);
		panel_9.add(label_5);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(133, 97, 86, 20);
		panel_9.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(133, 122, 86, 20);
		panel_9.add(textField_10);
		
		JLabel lblValorHora = new JLabel("Valor Hora");
		lblValorHora.setBounds(42, 125, 68, 14);
		panel_9.add(lblValorHora);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(42, 150, 68, 14);
		panel_9.add(lblCdigo);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(133, 147, 86, 20);
		panel_9.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(133, 172, 86, 20);
		panel_9.add(textField_12);
		
		JLabel lblFormao = new JLabel("Forma\u00E7\u00E3o");
		lblFormao.setBounds(42, 175, 68, 14);
		panel_9.add(lblFormao);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Professor p = new Professor(
						textField_6.getText(),
						textField_7.getText(),
						textField_8.getText(),
						textField_9.getText(),
						Double.parseDouble(textField_10.getText()),
						textField_11.getText(),
						textField_12.getText(),
						textField_6.getText(),
						textField_6.getText()
						);
				if(BancoDeDados.existeProfessor(p.getCodigo())==1){
					int op = JOptionPane.showConfirmDialog(null, "O CPF j� est� cadastrado. O que deseja fazer?");
					if (op == 0){
						BancoDeDados.atualizar(p);
					}
					else if(op==1){
						JOptionPane.showConfirmDialog(null, BancoDeDados.excluir(p),"Resultado da exclus�o",2);
					}
				}
				else
					JOptionPane.showConfirmDialog(null, BancoDeDados.inserir(p),"Resultado da inser��o",2);
			}
		});
		btnOk.setBounds(229, 166, 53, 23);
		panel_9.add(btnOk);
		
		JButton btnAluno = new JButton("Aluno");
		btnAluno.setBounds(10, 11, 100, 23);
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.remove(panel_9);
				panel_3.repaint();
				panel_3.add(panel_8);
			}
		});
		panel_3.setLayout(null);
		panel_3.add(btnAluno);
		
		JButton btnProfessor = new JButton("Professor");
		btnProfessor.setBounds(10, 45, 100, 23);
		btnProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.remove(panel_8);
				panel_3.repaint();
				panel_3.add(panel_9);
			}
		});
		panel_3.add(btnProfessor);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 443, 216);
panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 10, 314, 195);
		panel_6.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		JButton btnApagarUmaSolicitao = new JButton("Apagar \r\nsolicita\u00E7\u00E3o");
		btnApagarUmaSolicitao.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnApagarUmaSolicitao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnApagarUmaSolicitao.setBounds(316, 179, 105, 23);
		panel_6.add(btnApagarUmaSolicitao);
		JLabel lblDigiteOCdigo = new JLabel("Digite o c\u00F3digo:");
		lblDigiteOCdigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiteOCdigo.setBounds(316, 11, 107, 14);
		panel_6.add(lblDigiteOCdigo);
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setBounds(316, 27, 107, 14);
		panel_6.add(textField_14);
		textField_14.setColumns(10);
		JLabel lblNewLabel = new JLabel("O que \r\ndeseja");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(316, 60, 107, 23);
		panel_6.add(lblNewLabel);
		JButton btnNewButton = new JButton("Cadastrar aluno");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton.setBounds(316, 111, 105, 23);
		panel_6.add(btnNewButton);
		
		JButton btnTrancarMatrcula = new JButton("Trancar Matr\u00EDcula");
		btnTrancarMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnTrancarMatrcula.setBounds(316, 145, 105, 23);
		panel_6.add(btnTrancarMatrcula);
		
		JLabel lblFazer = new JLabel(" fazer?");
		lblFazer.setHorizontalAlignment(SwingConstants.CENTER);
		lblFazer.setBounds(316, 72, 107, 28);
		panel_6.add(lblFazer);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 11, 427, 193);
//		panel_2.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btnSenha = new JButton("Senha");
		btnSenha.setBounds(10, 11, 106, 23);
		panel_7.add(btnSenha);
		
		JButton btnInformao = new JButton("Informa\u00E7\u00E3o");
		btnInformao.setBounds(10, 45, 106, 23);
		panel_7.add(btnInformao);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{75, 0};
		gbl_panel.rowHeights = new int[]{45, 45, 45, 45, 40, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Cadastrar");
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.add(panel_3);
			}
		});
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.fill = GridBagConstraints.BOTH;
		gbc_btnCadastrar.insets = new Insets(0, 0, 5, 0);
		gbc_btnCadastrar.gridx = 0;
		gbc_btnCadastrar.gridy = 0;
		panel.add(btnCadastrar, gbc_btnCadastrar);
		
		JButton btnConta = new JButton("Conta");
		btnConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Conta");
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.add(panel_7);
			}
		});
		
		JButton btnSolicitaes = new JButton("Solicita\u00E7\u00F5es");
		btnSolicitaes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Solicita��es");
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.add(panel_6);
				
				DefaultTableModel modelo = new DefaultTableModel();
				table = new JTable(modelo);
				scrollPane.setViewportView(table);
				
				//TODO retirar a parte de teste e descomentar esta parte
//				ArrayList<Solicita��o> lista = BancoDeDados.getSolicita��es();
//				modelo.addColumn("C�digo");
//				modelo.addColumn("Tipo");
//				modelo.addColumn("Data");
//				modelo.addColumn("CPF Aluno");
//				modelo.addColumn("c�digo Disciplina");
//				for(Solicita��o s:lista){
//					modelo.addRow(new Object[]{s.getCodigo(),s.getTipo(),s.getData(),s.getAluno().getCpf(),s.getDisciplina().getCodigo()});
//				}
					///teste
					modelo.addColumn("C�digo");
					modelo.addColumn("Tipo");
					modelo.addColumn("Data");
					modelo.addColumn("CPF Aluno");
					modelo.addColumn("c�digo Disciplina");
					for(int i = 0; i<20; i++){
						modelo.addRow(new Object[]{"1234","cadastramento","01 de 02 de 2018","1221","1111"});
						modelo.addRow(new Object[]{"2333","trancamento","01 de 02 de 2018","4444","2222"});
					}
			}
		});
		
		JButton button = new JButton("Disciplinas");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 0;
		gbc_button.gridy = 1;
		panel.add(button, gbc_button);
		GridBagConstraints gbc_btnSolicitaes = new GridBagConstraints();
		gbc_btnSolicitaes.fill = GridBagConstraints.BOTH;
		gbc_btnSolicitaes.insets = new Insets(0, 0, 5, 0);
		gbc_btnSolicitaes.gridx = 0;
		gbc_btnSolicitaes.gridy = 2;
		panel.add(btnSolicitaes, gbc_btnSolicitaes);
		GridBagConstraints gbc_btnConta = new GridBagConstraints();
		gbc_btnConta.anchor = GridBagConstraints.SOUTH;
		gbc_btnConta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnConta.gridx = 0;
		gbc_btnConta.gridy = 5;
		panel.add(btnConta, gbc_btnConta);
		
		
	}
}
