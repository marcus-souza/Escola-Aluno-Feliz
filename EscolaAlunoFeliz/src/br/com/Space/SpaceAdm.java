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

import br.com.Login.Selection;

@SuppressWarnings("all")
public class SpaceAdm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		panel_3.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_8.setBounds(129, 11, 282, 171);
//		panel_3.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblAluno = new JLabel("Aluno");
		lblAluno.setBounds(10, 11, 60, 14);
		panel_8.add(lblAluno);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_9.setBounds(129, 11, 282, 171);
//		panel_3.add(panel_9);
		
		JLabel lblProfessor = new JLabel("Professor");
		lblProfessor.setBounds(10, 11, 60, 14);
		panel_9.add(lblProfessor);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_10.setBounds(129, 11, 282, 171);
//		panel_3.add(panel_10);
		
		JLabel lblServidor = new JLabel("Servidor");
		lblServidor.setBounds(10, 11, 60, 14);
		panel_10.add(lblServidor);
		
		JButton btnAluno = new JButton("Aluno");
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.remove(panel_9);
				panel_3.remove(panel_10);
				panel_3.repaint();
				panel_3.add(panel_8);
			}
		});
		btnAluno.setBounds(10, 11, 100, 23);
		panel_3.add(btnAluno);
		
		JButton btnProfessor = new JButton("Professor");
		btnProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.remove(panel_8);
				panel_3.remove(panel_10);
				panel_3.repaint();
				panel_3.add(panel_9);
			}
		});
		btnProfessor.setBounds(10, 45, 100, 23);
		panel_3.add(btnProfessor);
		
		JButton btnServidor = new JButton("Servidor");
		btnServidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.remove(panel_9);
				panel_3.remove(panel_8);
				panel_3.repaint();
				panel_3.add(panel_10);
			}
		});
		btnServidor.setBounds(10, 79, 100, 23);
		panel_3.add(btnServidor);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 421, 193);
//		panel_2.add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblRecados = new JLabel("Recados");
		GridBagConstraints gbc_lblRecados = new GridBagConstraints();
		gbc_lblRecados.gridwidth = 2;
		gbc_lblRecados.insets = new Insets(0, 0, 0, 5);
		gbc_lblRecados.gridx = 0;
		gbc_lblRecados.gridy = 0;
		panel_4.add(lblRecados, gbc_lblRecados);
		
		JButton btnEscrever = new JButton("Escrever");
		GridBagConstraints gbc_btnEscrever = new GridBagConstraints();
		gbc_btnEscrever.gridx = 12;
		gbc_btnEscrever.gridy = 0;
		panel_4.add(btnEscrever, gbc_btnEscrever);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 11, 427, 193);
//		panel_2.add(panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel lblTurma_1 = new JLabel("Turma");
		GridBagConstraints gbc_lblTurma_1 = new GridBagConstraints();
		gbc_lblTurma_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblTurma_1.gridx = 0;
		gbc_lblTurma_1.gridy = 0;
		panel_5.add(lblTurma_1, gbc_lblTurma_1);
		
		JLabel lblAo = new JLabel("A\u00E7\u00E3o");
		GridBagConstraints gbc_lblAo = new GridBagConstraints();
		gbc_lblAo.gridx = 1;
		gbc_lblAo.gridy = 0;
		panel_5.add(lblAo, gbc_lblAo);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 11, 421, 193);
//		panel_2.add(panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel lblPedidos = new JLabel("Pedidos");
		GridBagConstraints gbc_lblPedidos = new GridBagConstraints();
		gbc_lblPedidos.insets = new Insets(0, 0, 0, 5);
		gbc_lblPedidos.gridx = 0;
		gbc_lblPedidos.gridy = 0;
		panel_6.add(lblPedidos, gbc_lblPedidos);
		
		JLabel lblAo_1 = new JLabel("A\u00E7\u00E3o");
		GridBagConstraints gbc_lblAo_1 = new GridBagConstraints();
		gbc_lblAo_1.gridx = 1;
		gbc_lblAo_1.gridy = 0;
		panel_6.add(lblAo_1, gbc_lblAo_1);
		
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
		
		JButton btnRecados = new JButton("Recados");
		btnRecados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Recados");
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.add(panel_4);
			}
		});
		GridBagConstraints gbc_btnRecados = new GridBagConstraints();
		gbc_btnRecados.fill = GridBagConstraints.BOTH;
		gbc_btnRecados.insets = new Insets(0, 0, 5, 0);
		gbc_btnRecados.gridx = 0;
		gbc_btnRecados.gridy = 1;
		panel.add(btnRecados, gbc_btnRecados);
		
		JButton btnTurmas = new JButton("Turmas");
		btnTurmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Turmas");
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.add(panel_5);
			}
		});
		GridBagConstraints gbc_btnTurmas = new GridBagConstraints();
		gbc_btnTurmas.fill = GridBagConstraints.BOTH;
		gbc_btnTurmas.insets = new Insets(0, 0, 5, 0);
		gbc_btnTurmas.gridx = 0;
		gbc_btnTurmas.gridy = 2;
		panel.add(btnTurmas, gbc_btnTurmas);
		
		JButton btnSolicitaes = new JButton("Solicita\u00E7\u00F5es");
		btnSolicitaes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Solicitação");
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.add(panel_6);
			}
		});
		GridBagConstraints gbc_btnSolicitaes = new GridBagConstraints();
		gbc_btnSolicitaes.fill = GridBagConstraints.BOTH;
		gbc_btnSolicitaes.insets = new Insets(0, 0, 5, 0);
		gbc_btnSolicitaes.gridx = 0;
		gbc_btnSolicitaes.gridy = 3;
		panel.add(btnSolicitaes, gbc_btnSolicitaes);
		
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
		gbc_btnConta.anchor = GridBagConstraints.SOUTH;
		gbc_btnConta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnConta.gridx = 0;
		gbc_btnConta.gridy = 5;
		panel.add(btnConta, gbc_btnConta);
		
		
	}

}
