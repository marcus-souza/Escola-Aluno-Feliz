package br.com.Space;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.Login.Selection;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.BevelBorder;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToolBar;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
@SuppressWarnings("all")
public class SpaceAluno extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpaceAluno frame = new SpaceAluno();
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
	public SpaceAluno() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 345);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Arquivo");
		menuBar.add(menu);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Selection frame = new Selection();
				frame.setVisible(true);
				dispose();
			}
		});
		menu.add(mntmLogout);
		
		JMenuItem menuItem = new JMenuItem("Sair");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		menu.add(menuItem);
		
		JMenu mnDisciplina = new JMenu("Disciplina");
		menuBar.add(mnDisciplina);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		mntmCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadDisc frame = new CadDisc();
				frame.setVisible(true);
			}
		});
		mnDisciplina.add(mntmCadastro);
		
		JMenuItem mntmTracamento = new JMenuItem("Tracamento");
		mnDisciplina.add(mntmTracamento);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblEspaoDoAluno = new JLabel("Espa\u00E7o do Aluno");
		contentPane.add(lblEspaoDoAluno, BorderLayout.NORTH);
		lblEspaoDoAluno.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEspaoDoAluno.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDisciplina = new JLabel(" ");
		panel_1.add(lblDisciplina, BorderLayout.NORTH);
		lblDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(20, 11, 415, 191);
//		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btnSenha = new JButton("Senha");
		btnSenha.setBounds(10, 11, 106, 23);
		panel_7.add(btnSenha);
		
		JButton btnInformao = new JButton("Informa\u00E7\u00E3o");
		btnInformao.setBounds(10, 45, 106, 23);
		panel_7.add(btnInformao);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 11, 415, 181);
//		panel.add(panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel lblDisciplina_2 = new JLabel("Disciplina");
		GridBagConstraints gbc_lblDisciplina_2 = new GridBagConstraints();
		gbc_lblDisciplina_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblDisciplina_2.gridx = 1;
		gbc_lblDisciplina_2.gridy = 0;
		panel_6.add(lblDisciplina_2, gbc_lblDisciplina_2);
		
		JLabel lblNotas_1 = new JLabel("Notas");
		GridBagConstraints gbc_lblNotas_1 = new GridBagConstraints();
		gbc_lblNotas_1.gridx = 2;
		gbc_lblNotas_1.gridy = 0;
		panel_6.add(lblNotas_1, gbc_lblNotas_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 11, 415, 181);
//		panel.add(panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel lblDiasDaSemana = new JLabel("Dias da Semana");
		GridBagConstraints gbc_lblDiasDaSemana = new GridBagConstraints();
		gbc_lblDiasDaSemana.gridx = 0;
		gbc_lblDiasDaSemana.gridy = 0;
		panel_5.add(lblDiasDaSemana, gbc_lblDiasDaSemana);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 415, 181);
//		panel.add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblMensagens = new JLabel("Mensagens");
		GridBagConstraints gbc_lblMensagens = new GridBagConstraints();
		gbc_lblMensagens.insets = new Insets(0, 0, 0, 5);
		gbc_lblMensagens.gridx = 0;
		gbc_lblMensagens.gridy = 0;
		panel_4.add(lblMensagens, gbc_lblMensagens);
		
		JLabel lblAes_1 = new JLabel("A\u00E7\u00F5es");
		GridBagConstraints gbc_lblAes_1 = new GridBagConstraints();
		gbc_lblAes_1.gridx = 1;
		gbc_lblAes_1.gridy = 0;
		panel_4.add(lblAes_1, gbc_lblAes_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 11, 415, 181);
//		panel.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblDisciplina_1 = new JLabel("Disciplina");
		GridBagConstraints gbc_lblDisciplina_1 = new GridBagConstraints();
		gbc_lblDisciplina_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblDisciplina_1.gridx = 0;
		gbc_lblDisciplina_1.gridy = 0;
		panel_3.add(lblDisciplina_1, gbc_lblDisciplina_1);
		
		JLabel lblNotas = new JLabel("Notas");
		GridBagConstraints gbc_lblNotas = new GridBagConstraints();
		gbc_lblNotas.insets = new Insets(0, 0, 0, 5);
		gbc_lblNotas.gridx = 3;
		gbc_lblNotas.gridy = 0;
		panel_3.add(lblNotas, gbc_lblNotas);
		
		JLabel lblAes = new JLabel("A\u00E7\u00F5es");
		GridBagConstraints gbc_lblAes = new GridBagConstraints();
		gbc_lblAes.gridx = 12;
		gbc_lblAes.gridy = 0;
		panel_3.add(lblAes, gbc_lblAes);
		
		JPanel panel_2 = new JPanel();
		scrollPane.setRowHeaderView(panel_2);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{75, 0};
		gbl_panel_2.rowHeights = new int[]{45, 45, 45, 45, 40, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btnDisciplina = new JButton("Disciplinas");
		btnDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblDisciplina.setText("Disciplinas");
				panel.removeAll();
				panel.repaint();
				panel.add(panel_3);
			}
		});
		GridBagConstraints gbc_btnDisciplina = new GridBagConstraints();
		gbc_btnDisciplina.fill = GridBagConstraints.BOTH;
		gbc_btnDisciplina.insets = new Insets(0, 0, 5, 0);
		gbc_btnDisciplina.gridx = 0;
		gbc_btnDisciplina.gridy = 0;
		panel_2.add(btnDisciplina, gbc_btnDisciplina);
		
		JButton btnRecados = new JButton("Recados");
		btnRecados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisciplina.setText("Recados");
				panel.removeAll();
				panel.repaint();
				panel.add(panel_4);
			}
		});
		GridBagConstraints gbc_btnRecados = new GridBagConstraints();
		gbc_btnRecados.fill = GridBagConstraints.BOTH;
		gbc_btnRecados.insets = new Insets(0, 0, 5, 0);
		gbc_btnRecados.gridx = 0;
		gbc_btnRecados.gridy = 1;
		panel_2.add(btnRecados, gbc_btnRecados);
		
		JButton btnCalendario = new JButton("Calendário");
		btnCalendario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisciplina.setText("Calendário");
				panel.removeAll();
				panel.repaint();
				panel.add(panel_5);
			}
		});
		GridBagConstraints gbc_btnCalendario = new GridBagConstraints();
		gbc_btnCalendario.fill = GridBagConstraints.BOTH;
		gbc_btnCalendario.insets = new Insets(0, 0, 5, 0);
		gbc_btnCalendario.gridx = 0;
		gbc_btnCalendario.gridy = 2;
		panel_2.add(btnCalendario, gbc_btnCalendario);
		
		JButton btnHistrico = new JButton("Hist\u00F3rico");
		btnHistrico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisciplina.setText("Histórico");
				panel.removeAll();
				panel.repaint();
				panel.add(panel_6);
			}
		});
		GridBagConstraints gbc_btnHistrico = new GridBagConstraints();
		gbc_btnHistrico.fill = GridBagConstraints.BOTH;
		gbc_btnHistrico.insets = new Insets(0, 0, 5, 0);
		gbc_btnHistrico.gridx = 0;
		gbc_btnHistrico.gridy = 3;
		panel_2.add(btnHistrico, gbc_btnHistrico);
		
		JButton btnConta = new JButton("Conta");
		btnConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisciplina.setText("Conta");
				panel.removeAll();
				panel.repaint();
				panel.add(panel_7);
			}
		});
		GridBagConstraints gbc_btnConta = new GridBagConstraints();
		gbc_btnConta.fill = GridBagConstraints.BOTH;
		gbc_btnConta.gridx = 0;
		gbc_btnConta.gridy = 5;
		panel_2.add(btnConta, gbc_btnConta);
	}
}
