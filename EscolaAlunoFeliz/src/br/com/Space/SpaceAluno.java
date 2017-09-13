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
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
@SuppressWarnings("all")
public class SpaceAluno extends JFrame {

	String menuTitle = " ";
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
		menu.add(menuItem);
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
		
		JPanel panel_2 = new JPanel();
		scrollPane.setRowHeaderView(panel_2);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{75, 0};
		gbl_panel_2.rowHeights = new int[]{45, 45, 45, 45, 45, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setLayout(null);
		
		JLabel lblDisciplina = new JLabel(menuTitle);
		lblDisciplina.setBounds(2, 2, 443, 29);
		panel_1.add(lblDisciplina);
		lblDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(2, 72, 443, 162);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 443, 162);
//		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnPop = new JButton("pop");
		btnPop.setBounds(208, 59, 89, 23);
		panel_4.add(btnPop);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 5, 443, 152);
		//panel.add(panel_3);
		
		JLabel lblDisciplina_1 = new JLabel("Disciplina");
		
		JLabel lblNotas = new JLabel("Notas");
		
		JLabel lblAo = new JLabel("A\u00E7\u00E3o");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(lblDisciplina_1)
					.addGap(5)
					.addComponent(lblNotas)
					.addGap(5)
					.addComponent(lblAo)
					.addContainerGap(243, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDisciplina_1)
						.addComponent(lblNotas)
						.addComponent(lblAo))
					.addContainerGap(138, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
				
		JButton btnDisciplina = new JButton("Disciplina");
		btnDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblDisciplina.setText("Disciplina");	
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
		
		JButton btnNotas = new JButton("Notas");
		btnNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisciplina.setText("Notas");
			}
		});
		GridBagConstraints gbc_btnNotas = new GridBagConstraints();
		gbc_btnNotas.fill = GridBagConstraints.BOTH;
		gbc_btnNotas.insets = new Insets(0, 0, 5, 0);
		gbc_btnNotas.gridx = 0;
		gbc_btnNotas.gridy = 2;
		panel_2.add(btnNotas, gbc_btnNotas);
		
		JButton btnHistrico = new JButton("Hist\u00F3rico");
		btnHistrico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisciplina.setText("Histórico");
				
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
				panel_1.remove(panel_3);
			}
		});
		GridBagConstraints gbc_btnConta = new GridBagConstraints();
		gbc_btnConta.fill = GridBagConstraints.BOTH;
		gbc_btnConta.gridx = 0;
		gbc_btnConta.gridy = 4;
		panel_2.add(btnConta, gbc_btnConta);
	}
}
