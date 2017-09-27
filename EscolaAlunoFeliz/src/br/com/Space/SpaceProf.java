package br.com.Space;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import br.com.ClassesInternas.Professor;
import br.com.Login.Selection;

@SuppressWarnings("all")
public class SpaceProf extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Professor prof = new Professor();
					SpaceProf frame = new SpaceProf(prof);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param prof 
	 */
	public SpaceProf(Professor prof) {
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
		
		JLabel lblEspaoDoProfessor = new JLabel("Espa\u00E7o do Professor");
		lblEspaoDoProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspaoDoProfessor.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblEspaoDoProfessor, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{75, 0};
		gbl_panel.rowHeights = new int[]{45, 45, 45, 45, 40, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
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
		panel_3.setBounds(10, 11, 427, 193);
//		panel_2.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblDisciplina = new JLabel("Disciplina");
		GridBagConstraints gbc_lblDisciplina = new GridBagConstraints();
		gbc_lblDisciplina.insets = new Insets(0, 0, 0, 5);
		gbc_lblDisciplina.gridx = 0;
		gbc_lblDisciplina.gridy = 0;
		panel_3.add(lblDisciplina, gbc_lblDisciplina);
		
		JLabel lblTurma = new JLabel("Turma");
		GridBagConstraints gbc_lblTurma = new GridBagConstraints();
		gbc_lblTurma.gridx = 1;
		gbc_lblTurma.gridy = 0;
		panel_3.add(lblTurma, gbc_lblTurma);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 427, 193);
//		panel_2.add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblTurma_1 = new JLabel("Turma");
		GridBagConstraints gbc_lblTurma_1 = new GridBagConstraints();
		gbc_lblTurma_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblTurma_1.gridx = 0;
		gbc_lblTurma_1.gridy = 0;
		panel_4.add(lblTurma_1, gbc_lblTurma_1);
		
		JLabel lblAo = new JLabel("A\u00E7\u00E3o");
		GridBagConstraints gbc_lblAo = new GridBagConstraints();
		gbc_lblAo.gridx = 1;
		gbc_lblAo.gridy = 0;
		panel_4.add(lblAo, gbc_lblAo);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 11, 427, 193);
//		panel_2.add(panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel lblRecados = new JLabel("Recados");
		GridBagConstraints gbc_lblRecados = new GridBagConstraints();
		gbc_lblRecados.insets = new Insets(0, 0, 5, 5);
		gbc_lblRecados.gridx = 1;
		gbc_lblRecados.gridy = 0;
		panel_5.add(lblRecados, gbc_lblRecados);
		
		JButton btnEscrever = new JButton("Escrever");
		GridBagConstraints gbc_btnEscrever = new GridBagConstraints();
		gbc_btnEscrever.insets = new Insets(0, 0, 0, 5);
		gbc_btnEscrever.gridx = 11;
		gbc_btnEscrever.gridy = 1;
		panel_5.add(btnEscrever, gbc_btnEscrever);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 11, 427, 193);
//		panel_2.add(panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel lblDiasDaSemana = new JLabel("Dias da Semana");
		GridBagConstraints gbc_lblDiasDaSemana = new GridBagConstraints();
		gbc_lblDiasDaSemana.insets = new Insets(0, 0, 5, 0);
		gbc_lblDiasDaSemana.gridx = 1;
		gbc_lblDiasDaSemana.gridy = 0;
		panel_6.add(lblDiasDaSemana, gbc_lblDiasDaSemana);
		
		JLabel lblHorrio = new JLabel("Hor\u00E1rio");
		GridBagConstraints gbc_lblHorrio = new GridBagConstraints();
		gbc_lblHorrio.insets = new Insets(0, 0, 0, 5);
		gbc_lblHorrio.gridx = 0;
		gbc_lblHorrio.gridy = 1;
		panel_6.add(lblHorrio, gbc_lblHorrio);
		
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
		
		JButton btnDisciplinas = new JButton("Disciplinas");
		btnDisciplinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Disciplina");
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.add(panel_3);
			}
		});
		GridBagConstraints gbc_btnDisciplinas = new GridBagConstraints();
		gbc_btnDisciplinas.fill = GridBagConstraints.VERTICAL;
		gbc_btnDisciplinas.insets = new Insets(0, 0, 5, 0);
		gbc_btnDisciplinas.gridx = 0;
		gbc_btnDisciplinas.gridy = 0;
		panel.add(btnDisciplinas, gbc_btnDisciplinas);
		
		JButton btnTurmas = new JButton("Turmas");
		btnTurmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Turmas");
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.add(panel_4);
			}
		});
		GridBagConstraints gbc_btnTurmas = new GridBagConstraints();
		gbc_btnTurmas.fill = GridBagConstraints.BOTH;
		gbc_btnTurmas.insets = new Insets(0, 0, 5, 0);
		gbc_btnTurmas.gridx = 0;
		gbc_btnTurmas.gridy = 1;
		panel.add(btnTurmas, gbc_btnTurmas);
		
		JButton btnRecados = new JButton("Recados");
		btnRecados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Recados");
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.add(panel_5);
			}
		});
		GridBagConstraints gbc_btnRecados = new GridBagConstraints();
		gbc_btnRecados.fill = GridBagConstraints.BOTH;
		gbc_btnRecados.insets = new Insets(0, 0, 5, 0);
		gbc_btnRecados.gridx = 0;
		gbc_btnRecados.gridy = 2;
		panel.add(btnRecados, gbc_btnRecados);
		
		JButton btnCalendrio = new JButton("Calend\u00E1rio");
		btnCalendrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Calendário");
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.add(panel_6);
			}
		});
		GridBagConstraints gbc_btnCalendrio = new GridBagConstraints();
		gbc_btnCalendrio.fill = GridBagConstraints.BOTH;
		gbc_btnCalendrio.insets = new Insets(0, 0, 5, 0);
		gbc_btnCalendrio.gridx = 0;
		gbc_btnCalendrio.gridy = 3;
		panel.add(btnCalendrio, gbc_btnCalendrio);
		
		JButton btnConta = new JButton("Conta");
		btnConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Conta");
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.add(panel_7);
			}
		});
		GridBagConstraints gbc_btnConta = new GridBagConstraints();
		gbc_btnConta.fill = GridBagConstraints.BOTH;
		gbc_btnConta.gridx = 0;
		gbc_btnConta.gridy = 5;
		panel.add(btnConta, gbc_btnConta);
		
		
	}
}
