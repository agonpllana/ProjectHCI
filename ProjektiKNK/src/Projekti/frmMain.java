package Projekti;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMain frame = new frmMain();
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
	public frmMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGjuha = new JMenu("Gjuha");
		menuBar.add(mnGjuha);
		
		JMenuItem mntmAnglisht = new JMenuItem("Anglisht");
		mnGjuha.add(mntmAnglisht);
		
		JMenuItem mntmShqip = new JMenuItem("Shqip");
		mnGjuha.add(mntmShqip);
		
		JMenu mnFaqja = new JMenu("Faqja");
		menuBar.add(mnFaqja);
		
		JMenuItem mntmRezultatet = new JMenuItem("Rezultatet");
		mntmRezultatet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmRezultatet objC1 = new frmRezultatet();
				objC1.setVisible(true);
			}
		});
		mnFaqja.add(mntmRezultatet);
		
		JMenuItem mntmTabela = new JMenuItem("Tabela");
		mntmTabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmTabela objCC=new frmTabela();
				objCC.setVisible(true);
			}
		});
		mnFaqja.add(mntmTabela);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
