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
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmRezultatet extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 563, 415);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("                               \t\t\t                                          \t");
		menuBar.add(menu);
		
		JMenu mnJava = new JMenu("Java");
		menuBar.add(mnJava);
		
		JMenuItem mntmJava = new JMenuItem("Java 1");
		mnJava.add(mntmJava);
		
		JMenuItem mntmJava_1 = new JMenuItem("Java 2");
		mnJava.add(mntmJava_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 40, 470, 305);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "REZULTATET E SUPERLIGES", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		contentPane.add(panel);
		panel.setLayout(null);
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
