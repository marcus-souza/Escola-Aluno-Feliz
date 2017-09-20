package br.com.Space;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTable;
@SuppressWarnings("all")
public class CadDisc extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadDisc frame = new CadDisc();
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
	public CadDisc() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 54, 434, 207);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 414, 185);
//		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblClculo = new JLabel("C\u00E1lculo 1");
		lblClculo.setBounds(10, 11, 210, 14);
		panel_2.add(lblClculo);
		
		JLabel lblLgica = new JLabel("L\u00F3gica");
		lblLgica.setBounds(10, 36, 210, 14);
		panel_2.add(lblLgica);
		
		JLabel lblAlgoritmo = new JLabel("Algoritmo");
		lblAlgoritmo.setBounds(10, 61, 210, 14);
		panel_2.add(lblAlgoritmo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 11, 414, 185);
//		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblClculo2 = new JLabel("C\u00E1lculo 2");
		lblClculo2.setBounds(10, 11, 210, 14);
		panel_3.add(lblClculo2);
		
		JLabel lblClculoNumrico = new JLabel("Cáclculo Numérico");
		lblClculoNumrico.setBounds(10, 36, 210, 14);
		panel_3.add(lblClculoNumrico);
		
		JLabel lblProgComp1 = new JLabel("Programação de Computadores I");
		lblProgComp1.setBounds(10, 61, 210, 14);
		panel_3.add(lblProgComp1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 414, 185);
//		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblClculo3 = new JLabel("Cálculo 3");
		lblClculo3.setBounds(10, 11, 210, 14);
		panel_4.add(lblClculo3);
		
		JLabel lblFsica3 = new JLabel("Física 3");
		lblFsica3.setBounds(10, 36, 210, 14);
		panel_4.add(lblFsica3);
		
		JLabel lblProgComp2 = new JLabel("Programação de Computadores II");
		lblProgComp2.setBounds(10, 61, 210, 14);
		panel_4.add(lblProgComp2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 11, 414, 185);
//		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblPrdgmComp = new JLabel("Paradigma da Computação");
		lblPrdgmComp.setBounds(10, 11, 210, 14);
		panel_5.add(lblPrdgmComp);
		
		JLabel lblIHC = new JLabel("Interação Humano-Computador");
		lblIHC.setBounds(10, 36, 210, 14);
		panel_5.add(lblIHC);
		
		JLabel lblProgComp3 = new JLabel("Programação de Computadores III");
		lblProgComp3.setBounds(10, 61, 210, 14);
		panel_5.add(lblProgComp3);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(0, 0, 434, 43);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setFont(new Font("Traditional Arabic", Font.PLAIN, 16));
		lblDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplina.setBounds(10, 11, 91, 25);
		panel_1.add(lblDisciplina);
		
		String[] sem = {" ","1º Sem","2º Sem","3º Sem","4º Sem"};
		JComboBox comboBox = new JComboBox(sem);
		comboBox.setSelectedIndex(0);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("1º Sem")){
					panel.removeAll();
					panel.repaint();
					panel.add(panel_2);
				}
				if(comboBox.getSelectedItem().equals("2º Sem")){
					panel.removeAll();
					panel.repaint();
					panel.add(panel_3);
				}
				if(comboBox.getSelectedItem().equals("3º Sem")){
					panel.removeAll();
					panel.repaint();
					panel.add(panel_4);
				}
				if(comboBox.getSelectedItem().equals("4º Sem")){
					panel.removeAll();
					panel.repaint();
					panel.add(panel_5);
				}
			}
		});
		comboBox.setBounds(357, 13, 67, 20);
		panel_1.add(comboBox);
		
		JLabel lblFiltro = new JLabel("Filtro");
		lblFiltro.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiltro.setBounds(301, 16, 46, 14);
		panel_1.add(lblFiltro);
	}
}
