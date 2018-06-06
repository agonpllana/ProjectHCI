package Projekti;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class frmRezultatet extends JFrame {

	private JPanel contentPane;
	private JTextField txtJava;
	private JTextField txtj1r1;
	private JTextField txtj1r2;
	private JTextField txtj1r3;
	private JTextField txtj1r4;
	private JTextField txtj1r5;
	private JTextField txtj1r6;
	private JTextField textField;
	private JTextField textField_1;
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
	private JTextField textField_24;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRezultatet frame = new frmRezultatet();
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
	public frmRezultatet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 469);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("                               \t\t\t                                          \t");
		menuBar.add(menu);
		
		JMenu mnJava = new JMenu("Java");
		menuBar.add(mnJava);
		
		JMenuItem mntmJava = new JMenuItem("Java 1");
		mntmJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtJava.setText("Java_1");
				//java_1.setVisible(true);
			}
		});
		mnJava.add(mntmJava);
		
		JMenuItem mntmJava_1 = new JMenuItem("Java 2");
		mntmJava_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtJava.setText("Java_2");
			}
		});
		mnJava.add(mntmJava_1);
		
		JMenuItem mntmJava_2 = new JMenuItem("Java 3");
		mntmJava_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJava.setText("Java_3");
			}
		});
		mnJava.add(mntmJava_2);
		
		JMenuItem mntmJava_3 = new JMenuItem("Java 4");
		mntmJava_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJava.setText("Java_4");
			}
		});
		mnJava.add(mntmJava_3);
		
		JMenuItem mntmJava_4 = new JMenuItem("Java 5");
		mntmJava_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJava.setText("Java_5");
			}
		});
		mnJava.add(mntmJava_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 40, 470, 348);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "REZULTATET E SUPERLIGES", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel java_1 = new JPanel();
		java_1.setBorder(new TitledBorder(null, "Java 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		java_1.setBounds(50, 35, 357, 289);
		panel.add(java_1);
		java_1.setLayout(null);
		
		txtj1r1 = new JTextField();
		txtj1r1.setHorizontalAlignment(SwingConstants.CENTER);
		txtj1r1.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtj1r1.setText("2-1");
		txtj1r1.setBounds(128, 35, 86, 20);
		java_1.add(txtj1r1);
		txtj1r1.setColumns(10);
		
		JLabel lblGjilani1 = new JLabel("Gjilani");
		lblGjilani1.setBounds(39, 41, 62, 14);
		java_1.add(lblGjilani1);
		
		JLabel lblBesa1 = new JLabel("Besa");
		lblBesa1.setBounds(255, 41, 71, 14);
		java_1.add(lblBesa1);
		
		txtj1r2 = new JTextField();
		txtj1r2.setHorizontalAlignment(SwingConstants.CENTER);
		txtj1r2.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtj1r2.setText("0-1");
		txtj1r2.setColumns(10);
		txtj1r2.setBounds(128, 76, 86, 20);
		java_1.add(txtj1r2);
		
		JLabel lblPrishtina1 = new JLabel("Prishtina");
		lblPrishtina1.setBounds(39, 82, 62, 14);
		java_1.add(lblPrishtina1);
		
		JLabel lblDrita1 = new JLabel("Drita");
		lblDrita1.setBounds(255, 82, 71, 14);
		java_1.add(lblDrita1);
		
		txtj1r3 = new JTextField();
		txtj1r3.setHorizontalAlignment(SwingConstants.CENTER);
		txtj1r3.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtj1r3.setText("1-0");
		txtj1r3.setColumns(10);
		txtj1r3.setBounds(128, 119, 86, 20);
		java_1.add(txtj1r3);
		
		JLabel lblVellaznimi1 = new JLabel("Vellaznimi");
		lblVellaznimi1.setBounds(39, 125, 62, 14);
		java_1.add(lblVellaznimi1);
		
		JLabel lblLiria1 = new JLabel("Liria");
		lblLiria1.setBounds(255, 125, 71, 14);
		java_1.add(lblLiria1);
		
		txtj1r4 = new JTextField();
		txtj1r4.setHorizontalAlignment(SwingConstants.CENTER);
		txtj1r4.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtj1r4.setText("1-0");
		txtj1r4.setColumns(10);
		txtj1r4.setBounds(128, 163, 86, 20);
		java_1.add(txtj1r4);
		
		JLabel lblFeronikeli1 = new JLabel("Feronikeli");
		lblFeronikeli1.setBounds(39, 169, 62, 14);
		java_1.add(lblFeronikeli1);
		
		JLabel lblVllaznia1 = new JLabel("Vllaznia");
		lblVllaznia1.setBounds(255, 169, 71, 14);
		java_1.add(lblVllaznia1);
		
		txtj1r5 = new JTextField();
		txtj1r5.setHorizontalAlignment(SwingConstants.CENTER);
		txtj1r5.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtj1r5.setText("1-0");
		txtj1r5.setColumns(10);
		txtj1r5.setBounds(128, 208, 86, 20);
		java_1.add(txtj1r5);
		
		JLabel lblLlapi1 = new JLabel("Llapi");
		lblLlapi1.setBounds(39, 214, 62, 14);
		java_1.add(lblLlapi1);
		
		JLabel lblDrenica1 = new JLabel("Drenica");
		lblDrenica1.setBounds(255, 214, 71, 14);
		java_1.add(lblDrenica1);
		
		txtj1r6 = new JTextField();
		txtj1r6.setHorizontalAlignment(SwingConstants.CENTER);
		txtj1r6.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtj1r6.setText("3-1");
		txtj1r6.setColumns(10);
		txtj1r6.setBounds(128, 247, 86, 20);
		java_1.add(txtj1r6);
		
		JLabel lblTrepca1 = new JLabel("Trepca '89");
		lblTrepca1.setBounds(39, 253, 62, 14);
		java_1.add(lblTrepca1);
		
		JLabel lblFlamurtari1 = new JLabel("Flamurtari");
		lblFlamurtari1.setBounds(255, 253, 71, 14);
		java_1.add(lblFlamurtari1);
		java_1.setVisible(false);
		

		JPanel java_3 = new JPanel();
		java_3.setBorder(new TitledBorder(null, "Java 3", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		java_3.setBounds(50, 35, 357, 289);
		panel.add(java_3);
		java_3.setLayout(null);
		
		textField = new JTextField();
		textField.setText("1-0");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setColumns(10);
		textField.setBounds(125, 32, 86, 20);
		java_3.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("3-0");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(125, 73, 86, 20);
		java_3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("0-0");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(125, 116, 86, 20);
		java_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("1-0");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(125, 160, 86, 20);
		java_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("2-1");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(125, 205, 86, 20);
		java_3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("1-1");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(125, 244, 86, 20);
		java_3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("2-1");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(125, 32, 86, 20);
		java_3.add(textField_6);
		
		JLabel lblTrepca3 = new JLabel("Trepca '89");
		lblTrepca3.setBounds(36, 38, 62, 14);
		java_3.add(lblTrepca3);
		
		textField_7 = new JTextField();
		textField_7.setText("0-1");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(125, 73, 86, 20);
		java_3.add(textField_7);
		
		JLabel lblVellaznimi3 = new JLabel("Vellaznimi");
		lblVellaznimi3.setBounds(36, 79, 62, 14);
		java_3.add(lblVellaznimi3);
		
		textField_8 = new JTextField();
		textField_8.setText("1-0");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_8.setColumns(10);
		textField_8.setBounds(125, 116, 86, 20);
		java_3.add(textField_8);
		
		JLabel lblDrita3 = new JLabel("Drita");
		lblDrita3.setBounds(36, 122, 62, 14);
		java_3.add(lblDrita3);
		
		textField_9 = new JTextField();
		textField_9.setText("1-0");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_9.setColumns(10);
		textField_9.setBounds(125, 160, 86, 20);
		java_3.add(textField_9);
		
		JLabel lblPrishtina3 = new JLabel("Prishtina");
		lblPrishtina3.setBounds(36, 166, 62, 14);
		java_3.add(lblPrishtina3);
		
		textField_10 = new JTextField();
		textField_10.setText("1-0");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_10.setColumns(10);
		textField_10.setBounds(125, 205, 86, 20);
		java_3.add(textField_10);
		
		JLabel lblFeronikeli3 = new JLabel("Feronikeli");
		lblFeronikeli3.setBounds(36, 211, 62, 14);
		java_3.add(lblFeronikeli3);
		
		textField_11 = new JTextField();
		textField_11.setText("3-1");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_11.setColumns(10);
		textField_11.setBounds(125, 244, 86, 20);
		java_3.add(textField_11);
		
		JLabel lblLlapi3 = new JLabel("Llapi");
		lblLlapi3.setBounds(36, 250, 62, 14);
		java_3.add(lblLlapi3);
		
		JLabel lblDrenica3 = new JLabel("Drenica");
		lblDrenica3.setBounds(252, 38, 71, 14);
		java_3.add(lblDrenica3);
		
		JLabel lblVllaznia3 = new JLabel("Vllaznia");
		lblVllaznia3.setBounds(252, 79, 71, 14);
		java_3.add(lblVllaznia3);
		
		JLabel lblFlamurtari3 = new JLabel("Flamurtari");
		lblFlamurtari3.setBounds(252, 122, 71, 14);
		java_3.add(lblFlamurtari3);
		
		JLabel lblLiria3 = new JLabel("Liria");
		lblLiria3.setBounds(252, 166, 71, 14);
		java_3.add(lblLiria3);
		
		JLabel lblBesa3 = new JLabel("Besa");
		lblBesa3.setBounds(252, 211, 71, 14);
		java_3.add(lblBesa3);
		
		JLabel lblGjilani3 = new JLabel("Gjilani");
		lblGjilani3.setBounds(252, 250, 71, 14);
		java_3.add(lblGjilani3);
		java_3.setVisible(false);
		
		JPanel java_4 = new JPanel();
		java_4.setBorder(new TitledBorder(null, "Java 4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		java_4.setBounds(50, 35, 357, 289);
		panel.add(java_4);
		java_4.setLayout(null);
		
		textField_24 = new JTextField();
		textField_24.setText("1-1");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_24.setColumns(10);
		textField_24.setBounds(128, 31, 86, 20);
		java_4.add(textField_24);
		
		JLabel lblGjilani4 = new JLabel("Gjilani");
		lblGjilani4.setBounds(42, 40, 62, 14);
		java_4.add(lblGjilani4);
		
		JLabel lblVellaznimi4 = new JLabel("Vellaznimi");
		lblVellaznimi4.setBounds(258, 40, 71, 14);
		java_4.add(lblVellaznimi4);
		
		textField_31 = new JTextField();
		textField_31.setText("2-0");
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_31.setColumns(10);
		textField_31.setBounds(131, 75, 86, 20);
		java_4.add(textField_31);
		
		JLabel lblBesa4 = new JLabel("Besa");
		lblBesa4.setBounds(42, 81, 62, 14);
		java_4.add(lblBesa4);
		
		JLabel lblFlamurtari4 = new JLabel("Flamurtari");
		lblFlamurtari4.setBounds(258, 81, 71, 14);
		java_4.add(lblFlamurtari4);
		
		textField_32 = new JTextField();
		textField_32.setText("1-1");
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_32.setColumns(10);
		textField_32.setBounds(131, 118, 86, 20);
		java_4.add(textField_32);
		
		JLabel lblDrenica4 = new JLabel("Drenica");
		lblDrenica4.setBounds(42, 124, 62, 14);
		java_4.add(lblDrenica4);
		
		JLabel lblPrishtina4 = new JLabel("Prishtina");
		lblPrishtina4.setBounds(258, 124, 71, 14);
		java_4.add(lblPrishtina4);
		
		textField_33 = new JTextField();
		textField_33.setText("2-0");
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_33.setColumns(10);
		textField_33.setBounds(131, 162, 86, 20);
		java_4.add(textField_33);
		
		JLabel lblLiria4 = new JLabel("Liria");
		lblLiria4.setBounds(42, 168, 62, 14);
		java_4.add(lblLiria4);
		
		JLabel lblDrita4 = new JLabel("Drita");
		lblDrita4.setBounds(258, 168, 71, 14);
		java_4.add(lblDrita4);
		
		textField_34 = new JTextField();
		textField_34.setText("2-1");
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_34.setColumns(10);
		textField_34.setBounds(131, 207, 86, 20);
		java_4.add(textField_34);
		
		JLabel lblVllaznia4 = new JLabel("Vllaznia");
		lblVllaznia4.setBounds(42, 213, 62, 14);
		java_4.add(lblVllaznia4);
		
		JLabel lblTrepca4 = new JLabel("Trepca '89");
		lblTrepca4.setBounds(258, 213, 71, 14);
		java_4.add(lblTrepca4);
		
		textField_35 = new JTextField();
		textField_35.setText("0-0");
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_35.setColumns(10);
		textField_35.setBounds(131, 246, 86, 20);
		java_4.add(textField_35);
		
		JLabel lblFeronikeli4 = new JLabel("Feronikeli");
		lblFeronikeli4.setBounds(42, 252, 62, 14);
		java_4.add(lblFeronikeli4);
		java_4.setVisible(false);
		
		JLabel lblLlapi4 = new JLabel("Llapi");
		lblLlapi4.setBounds(258, 252, 71, 14);
		java_4.add(lblLlapi4);
		
		JPanel java_5 = new JPanel();
		java_5.setBorder(new TitledBorder(null, "Java 5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		java_5.setBounds(50, 35, 357, 289);
		panel.add(java_5);
		java_5.setLayout(null);
		
		textField_12 = new JTextField();
		textField_12.setText("1-1");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_12.setColumns(10);
		textField_12.setBounds(125, 31, 86, 20);
		java_5.add(textField_12);
		
		JLabel lblDrita5 = new JLabel("Drita");
		lblDrita5.setBounds(39, 40, 62, 14);
		java_5.add(lblDrita5);
		
		JLabel lblDrenica5 = new JLabel("Drenica");
		lblDrenica5.setBounds(255, 40, 71, 14);
		java_5.add(lblDrenica5);
		
		textField_13 = new JTextField();
		textField_13.setText("2-0");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_13.setColumns(10);
		textField_13.setBounds(128, 75, 86, 20);
		java_5.add(textField_13);
		
		JLabel lblTrepca5 = new JLabel("Trepca '89");
		lblTrepca5.setBounds(39, 81, 62, 14);
		java_5.add(lblTrepca5);
		
		JLabel lblGjilani5 = new JLabel("Gjilani");
		lblGjilani5.setBounds(255, 81, 71, 14);
		java_5.add(lblGjilani5);
		
		textField_14 = new JTextField();
		textField_14.setText("1-1");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_14.setColumns(10);
		textField_14.setBounds(128, 118, 86, 20);
		java_5.add(textField_14);
		
		JLabel lblVellaznimi5 = new JLabel("Vellaznimi");
		lblVellaznimi5.setBounds(39, 124, 62, 14);
		java_5.add(lblVellaznimi5);
		
		JLabel lblFlamurtari5 = new JLabel("Feronikeli");
		lblFlamurtari5.setBounds(255, 124, 71, 14);
		java_5.add(lblFlamurtari5);
		
		textField_15 = new JTextField();
		textField_15.setText("2-0");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_15.setColumns(10);
		textField_15.setBounds(128, 162, 86, 20);
		java_5.add(textField_15);
		
		JLabel lblFlamurtari_15 = new JLabel("Flamurtari");
		lblFlamurtari_15.setBounds(39, 168, 62, 14);
		java_5.add(lblFlamurtari_15);
		
		JLabel lblLiria5 = new JLabel("Liria");
		lblLiria5.setBounds(255, 168, 71, 14);
		java_5.add(lblLiria5);
		
		textField_16 = new JTextField();
		textField_16.setText("2-1");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_16.setColumns(10);
		textField_16.setBounds(128, 207, 86, 20);
		java_5.add(textField_16);
		
		JLabel lblLlapi5 = new JLabel("Llapi");
		lblLlapi5.setBounds(39, 213, 62, 14);
		java_5.add(lblLlapi5);
		
		JLabel lblBesa5 = new JLabel("Besa");
		lblBesa5.setBounds(255, 213, 71, 14);
		java_5.add(lblBesa5);
		
		textField_17 = new JTextField();
		textField_17.setText("0-0");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_17.setColumns(10);
		textField_17.setBounds(128, 246, 86, 20);
		java_5.add(textField_17);
		
		JLabel lblPrishtina5 = new JLabel("Prishtina");
		lblPrishtina5.setBounds(39, 252, 62, 14);
		java_5.add(lblPrishtina5);
		
		JLabel lblVllaznia5 = new JLabel("Vllaznia");
		lblVllaznia5.setBounds(255, 252, 71, 14);
		java_5.add(lblVllaznia5);
		java_5.setVisible(false);
		
		JPanel java_2 = new JPanel();
		java_2.setBorder(new TitledBorder(null, "Java 2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		java_2.setBounds(50, 35, 357, 289);
		panel.add(java_2);
		java_2.setLayout(null);
		
		textField_18 = new JTextField();
		textField_18.setText("2-0");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_18.setColumns(10);
		textField_18.setBounds(119, 30, 86, 20);
		java_2.add(textField_18);
		
		JLabel lblBesa2 = new JLabel("Besa");
		lblBesa2.setBounds(30, 36, 62, 14);
		java_2.add(lblBesa2);
		
		JLabel lblDrita2 = new JLabel("Drita");
		lblDrita2.setBounds(246, 36, 71, 14);
		java_2.add(lblDrita2);
		
		textField_19 = new JTextField();
		textField_19.setText("1-1");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_19.setColumns(10);
		textField_19.setBounds(119, 71, 86, 20);
		java_2.add(textField_19);
		
		JLabel lblGjilani2 = new JLabel("Gjilani");
		lblGjilani2.setBounds(30, 77, 62, 14);
		java_2.add(lblGjilani2);
		
		JLabel lblFeronikeli2 = new JLabel("Feronikeli");
		lblFeronikeli2.setBounds(246, 77, 71, 14);
		java_2.add(lblFeronikeli2);
		
		textField_20 = new JTextField();
		textField_20.setText("1-0");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_20.setColumns(10);
		textField_20.setBounds(119, 114, 86, 20);
		java_2.add(textField_20);
		
		JLabel lblDrenica2 = new JLabel("Drenica");
		lblDrenica2.setBounds(30, 120, 62, 14);
		java_2.add(lblDrenica2);
		
		JLabel lblVllaznimi2 = new JLabel("Vllaznimi");
		lblVllaznimi2.setBounds(246, 120, 71, 14);
		java_2.add(lblVllaznimi2);
		
		textField_21 = new JTextField();
		textField_21.setText("0-2");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_21.setColumns(10);
		textField_21.setBounds(119, 158, 86, 20);
		java_2.add(textField_21);
		
		JLabel lblFlamurtari2 = new JLabel("Flamurtari");
		lblFlamurtari2.setBounds(30, 164, 62, 14);
		java_2.add(lblFlamurtari2);
		
		JLabel lblPrishtina2 = new JLabel("Prishtina");
		lblPrishtina2.setBounds(246, 164, 71, 14);
		java_2.add(lblPrishtina2);
		
		textField_22 = new JTextField();
		textField_22.setText("1-0");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_22.setColumns(10);
		textField_22.setBounds(119, 203, 86, 20);
		java_2.add(textField_22);
		
		JLabel lblLiria2 = new JLabel("Liria");
		lblLiria2.setBounds(30, 209, 62, 14);
		java_2.add(lblLiria2);
		
		JLabel lblTrepca2 = new JLabel("Trepca '89");
		lblTrepca2.setBounds(246, 209, 71, 14);
		java_2.add(lblTrepca2);
		
		textField_23 = new JTextField();
		textField_23.setText("0-1");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_23.setColumns(10);
		textField_23.setBounds(119, 242, 86, 20);
		java_2.add(textField_23);
		
		JLabel lblVllaznia2 = new JLabel("Vllaznia");
		lblVllaznia2.setBounds(30, 248, 62, 14);
		java_2.add(lblVllaznia2);
		
		JLabel lblLlapi2 = new JLabel("Llapi");
		lblLlapi2.setBounds(246, 248, 71, 14);
		java_2.add(lblLlapi2);
		java_2.setVisible(false);
		
		
		JButton btnShfaqRezultatet = new JButton("Shfaq Rezultatet");
		btnShfaqRezultatet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String javae = txtJava.getText();
				if(javae.equals("Java_1"))
				{
					java_2.setVisible(false);
					java_3.setVisible(false);
					java_4.setVisible(false);
					java_5.setVisible(false);
					java_1.setVisible(true);
				}
				else if(javae.equals("Java_2"))
				{
					java_1.setVisible(false);
					java_3.setVisible(false);
					java_4.setVisible(false);
					java_5.setVisible(false);
					java_2.setVisible(true);
				}
				else if(javae.equals("Java_3"))
				{
					java_2.setVisible(false);
					java_1.setVisible(false);
					java_4.setVisible(false);
					java_5.setVisible(false);
					java_3.setVisible(true);
				}
				else if(javae.equals("Java_4"))
				{
					java_2.setVisible(false);
					java_3.setVisible(false);
					java_1.setVisible(false);
					java_5.setVisible(false);
					java_4.setVisible(true);
				}
				else if(javae.equals("Java_5"))
				{
					java_2.setVisible(false);
					java_3.setVisible(false);
					java_4.setVisible(false);
					java_1.setVisible(false);
					java_5.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null, "Ju lutem zgjedheni njeren nga javet!");
				
				
			}
		});
		btnShfaqRezultatet.setBounds(170, 11, 156, 23);
		contentPane.add(btnShfaqRezultatet);
		
		txtJava = new JTextField();
		txtJava.setBounds(385, 12, 86, 20);
		contentPane.add(txtJava);
		txtJava.setColumns(10);
		txtJava.setVisible(false);
		
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
