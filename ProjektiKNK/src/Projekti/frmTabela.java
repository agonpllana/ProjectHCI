package Projekti;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class frmTabela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTabela frame = new frmTabela();
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
	public frmTabela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "TABELA E SUPERLIGES", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(10, 11, 552, 531);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPozita = new JLabel("P");
		lblPozita.setBounds(20, 32, 14, 14);
		panel.add(lblPozita);
		
		JLabel lblEkipi = new JLabel("Ekipi");
		lblEkipi.setBounds(41, 32, 67, 14);
		panel.add(lblEkipi);
		
		JLabel lblNdeshje = new JLabel("N");
		lblNdeshje.setBounds(149, 32, 14, 14);
		panel.add(lblNdeshje);
		
		JLabel lblF = new JLabel("F");
		lblF.setBounds(171, 32, 14, 14);
		panel.add(lblF);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(191, 32, 14, 14);
		panel.add(lblB);
		
		JLabel lblH = new JLabel("H");
		lblH.setBounds(211, 32, 14, 14);
		panel.add(lblH);
		
		JLabel lblG = new JLabel("G+");
		lblG.setBounds(231, 32, 20, 14);
		panel.add(lblG);
		
		JLabel lblG_1 = new JLabel("G-");
		lblG_1.setBounds(261, 32, 20, 14);
		panel.add(lblG_1);
		
		JLabel lblG_2 = new JLabel("G +/-");
		lblG_2.setBounds(281, 32, 32, 14);
		panel.add(lblG_2);
		
		JLabel lblPike = new JLabel("Pike");
		lblPike.setBounds(321, 32, 32, 14);
		panel.add(lblPike);
		
		JLabel lblDritaP = new JLabel("1");
		lblDritaP.setBounds(20, 57, 14, 14);
		panel.add(lblDritaP);
		
		JLabel lblDrita = new JLabel("Drita");
		lblDrita.setBounds(41, 49, 98, 35);
		lblDrita.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Drita.png"));
		panel.add(lblDrita);
		
		JLabel lblDritaN = new JLabel("10");
		lblDritaN.setBounds(149, 57, 14, 14);
		panel.add(lblDritaN);
		
		JLabel lblDritaF = new JLabel("7");
		lblDritaF.setBounds(171, 57, 14, 14);
		panel.add(lblDritaF);
		
		JLabel lblDritaB = new JLabel("1");
		lblDritaB.setBounds(191, 57, 14, 14);
		panel.add(lblDritaB);
		
		JLabel lblDritaH = new JLabel("2");
		lblDritaH.setBounds(211, 57, 14, 14);
		panel.add(lblDritaH);
		
		JLabel lblDritaGsh = new JLabel("21");
		lblDritaGsh.setBounds(231, 57, 20, 14);
		panel.add(lblDritaGsh);
		
		JLabel lblDritaGp = new JLabel("11");
		lblDritaGp.setBounds(261, 57, 20, 14);
		panel.add(lblDritaGp);
		
		JLabel lblDritaGz = new JLabel("10");
		lblDritaGz.setBounds(291, 57, 20, 14);
		panel.add(lblDritaGz);
		
		JLabel lblDritaPi = new JLabel("22");
		lblDritaPi.setBounds(321, 57, 32, 14);
		panel.add(lblDritaPi);
		
		JLabel lblPrishtinaP = new JLabel("2");
		lblPrishtinaP.setBounds(20, 95, 14, 14);
		panel.add(lblPrishtinaP);
		
		JLabel lblPrishtina = new JLabel("Prishtina");
		lblPrishtina.setBounds(41, 88, 98, 35);
		lblPrishtina.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Prishtina.png"));
		panel.add(lblPrishtina);
		
		JLabel lblPrishtinaN = new JLabel("10");
		lblPrishtinaN.setBounds(149, 95, 14, 14);
		panel.add(lblPrishtinaN);
		
		JLabel lblPrishtinaF = new JLabel("7");
		lblPrishtinaF.setBounds(171, 95, 14, 14);
		panel.add(lblPrishtinaF);
		
		JLabel lblPrishtinaB = new JLabel("1");
		lblPrishtinaB.setBounds(191, 95, 14, 14);
		panel.add(lblPrishtinaB);
		
		JLabel lblPrishtinaH = new JLabel("2");
		lblPrishtinaH.setBounds(211, 95, 14, 14);
		panel.add(lblPrishtinaH);
		
		JLabel lblPrishtinaGsh = new JLabel("21");
		lblPrishtinaGsh.setBounds(231, 95, 20, 14);
		panel.add(lblPrishtinaGsh);
		
		JLabel lblPrishtinaGp = new JLabel("11");
		lblPrishtinaGp.setBounds(261, 95, 20, 14);
		panel.add(lblPrishtinaGp);
		
		JLabel lblPrishtinaGz = new JLabel("10");
		lblPrishtinaGz.setBounds(291, 95, 20, 14);
		panel.add(lblPrishtinaGz);
		
		JLabel lblPrishtinaPi = new JLabel("22");
		lblPrishtinaPi.setBounds(321, 95, 32, 14);
		panel.add(lblPrishtinaPi);
		
		JLabel lblLlapiP = new JLabel("3");
		lblLlapiP.setBounds(20, 137, 14, 14);
		panel.add(lblLlapiP);
		
		JLabel lblLlapi = new JLabel("Llapi");
		lblLlapi.setBounds(41, 127, 98, 35);
		lblLlapi.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Llapi.png"));
		panel.add(lblLlapi);
		
		JLabel lblLlapiN = new JLabel("10");
		lblLlapiN.setBounds(149, 134, 14, 14);
		panel.add(lblLlapiN);
		
		JLabel lblLlapiF = new JLabel("7");
		lblLlapiF.setBounds(171, 134, 14, 14);
		panel.add(lblLlapiF);
		
		JLabel lblLlapiB = new JLabel("1");
		lblLlapiB.setBounds(191, 134, 14, 14);
		panel.add(lblLlapiB);
		
		JLabel lblLlapiH = new JLabel("2");
		lblLlapiH.setBounds(211, 134, 14, 14);
		panel.add(lblLlapiH);
		
		JLabel lblLlapiGsh = new JLabel("21");
		lblLlapiGsh.setBounds(231, 134, 20, 14);
		panel.add(lblLlapiGsh);
		
		JLabel lblLlapiGp = new JLabel("11");
		lblLlapiGp.setBounds(261, 134, 20, 14);
		panel.add(lblLlapiGp);
		
		JLabel lblLlapiGz = new JLabel("10");
		lblLlapiGz.setBounds(291, 134, 14, 14);
		panel.add(lblLlapiGz);
		
		JLabel lblLlapiPi = new JLabel("22");
		lblLlapiPi.setBounds(321, 134, 32, 14);
		panel.add(lblLlapiPi);
		
		JLabel label_29 = new JLabel("4");
		label_29.setBounds(20, 169, 14, 14);
		panel.add(label_29);
		
		JLabel lblTrepca = new JLabel("Trepca '89");
		lblTrepca.setBounds(41, 160, 98, 35);
		lblTrepca.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Trepca.png"));
		panel.add(lblTrepca);
		
		JLabel label_31 = new JLabel("10");
		label_31.setBounds(149, 169, 14, 14);
		panel.add(label_31);
		
		JLabel label_32 = new JLabel("7");
		label_32.setBounds(171, 169, 14, 14);
		panel.add(label_32);
		
		JLabel label_33 = new JLabel("1");
		label_33.setBounds(191, 169, 14, 14);
		panel.add(label_33);
		
		JLabel label_34 = new JLabel("2");
		label_34.setBounds(211, 169, 14, 14);
		panel.add(label_34);
		
		JLabel label_35 = new JLabel("21");
		label_35.setBounds(231, 169, 20, 14);
		panel.add(label_35);
		
		JLabel label_36 = new JLabel("11");
		label_36.setBounds(261, 169, 20, 14);
		panel.add(label_36);
		
		JLabel label_37 = new JLabel("10");
		label_37.setBounds(291, 169, 20, 14);
		panel.add(label_37);
		
		JLabel label_38 = new JLabel("22");
		label_38.setBounds(321, 169, 32, 14);
		panel.add(label_38);
		
		JLabel label_39 = new JLabel("5");
		label_39.setBounds(20, 206, 14, 14);
		panel.add(label_39);
		
		JLabel lblDrenica = new JLabel("Drenica");
		lblDrenica.setBounds(41, 197, 98, 35);
		lblDrenica.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Drenica.png"));
		panel.add(lblDrenica);
		
		JLabel label_41 = new JLabel("10");
		label_41.setBounds(149, 206, 14, 14);
		panel.add(label_41);
		
		JLabel label_42 = new JLabel("7");
		label_42.setBounds(171, 206, 14, 14);
		panel.add(label_42);
		
		JLabel label_43 = new JLabel("1");
		label_43.setBounds(191, 206, 14, 14);
		panel.add(label_43);
		
		JLabel label_44 = new JLabel("2");
		label_44.setBounds(211, 206, 14, 14);
		panel.add(label_44);
		
		JLabel label_45 = new JLabel("21");
		label_45.setBounds(231, 206, 20, 14);
		panel.add(label_45);
		
		JLabel label_46 = new JLabel("11");
		label_46.setBounds(261, 206, 20, 14);
		panel.add(label_46);
		
		JLabel label_47 = new JLabel("10");
		label_47.setBounds(291, 206, 14, 14);
		panel.add(label_47);
		
		JLabel label_48 = new JLabel("22");
		label_48.setBounds(321, 206, 32, 14);
		panel.add(label_48);
		
		JLabel label_49 = new JLabel("6");
		label_49.setBounds(20, 247, 14, 14);
		panel.add(label_49);
		
		JLabel lblFeronikeli = new JLabel("Feronikeli");
		lblFeronikeli.setBounds(41, 236, 98, 35);
		lblFeronikeli.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Feronikeli.png"));
		panel.add(lblFeronikeli);
		
		JLabel label_51 = new JLabel("10");
		label_51.setBounds(149, 247, 14, 14);
		panel.add(label_51);
		
		JLabel label_52 = new JLabel("7");
		label_52.setBounds(171, 247, 14, 14);
		panel.add(label_52);
		
		JLabel label_53 = new JLabel("1");
		label_53.setBounds(191, 247, 14, 14);
		panel.add(label_53);
		
		JLabel label_54 = new JLabel("2");
		label_54.setBounds(211, 247, 14, 14);
		panel.add(label_54);
		
		JLabel label_55 = new JLabel("21");
		label_55.setBounds(231, 247, 20, 14);
		panel.add(label_55);
		
		JLabel label_56 = new JLabel("11");
		label_56.setBounds(261, 247, 20, 14);
		panel.add(label_56);
		
		JLabel label_57 = new JLabel("10");
		label_57.setBounds(291, 247, 20, 14);
		panel.add(label_57);
		
		JLabel label_58 = new JLabel("22");
		label_58.setBounds(321, 247, 32, 14);
		panel.add(label_58);
		
		JLabel label_59 = new JLabel("7");
		label_59.setBounds(20, 282, 14, 14);
		panel.add(label_59);
		
		JLabel lblLiria = new JLabel("Liria");
		lblLiria.setBounds(41, 273, 98, 35);
		lblLiria.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Liria.png"));
		panel.add(lblLiria);
		
		JLabel label_61 = new JLabel("10");
		label_61.setBounds(149, 282, 14, 14);
		panel.add(label_61);
		
		JLabel label_62 = new JLabel("7");
		label_62.setBounds(171, 282, 14, 14);
		panel.add(label_62);
		
		JLabel label_63 = new JLabel("1");
		label_63.setBounds(191, 282, 14, 14);
		panel.add(label_63);
		
		JLabel label_64 = new JLabel("2");
		label_64.setBounds(211, 282, 14, 14);
		panel.add(label_64);
		
		JLabel label_65 = new JLabel("21");
		label_65.setBounds(231, 282, 20, 14);
		panel.add(label_65);
		
		JLabel label_66 = new JLabel("11");
		label_66.setBounds(261, 282, 20, 14);
		panel.add(label_66);
		
		JLabel label_67 = new JLabel("10");
		label_67.setBounds(291, 282, 14, 14);
		panel.add(label_67);
		
		JLabel label_68 = new JLabel("22");
		label_68.setBounds(321, 282, 32, 14);
		panel.add(label_68);
		
		JLabel label_69 = new JLabel("8");
		label_69.setBounds(20, 321, 14, 14);
		panel.add(label_69);
		
		JLabel lblGjilani = new JLabel("Gjilani");
		lblGjilani.setBounds(41, 311, 98, 35);
		lblGjilani.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Gjilani.png"));
		panel.add(lblGjilani);
		
		JLabel label_71 = new JLabel("10");
		label_71.setBounds(149, 321, 14, 14);
		panel.add(label_71);
		
		JLabel label_72 = new JLabel("7");
		label_72.setBounds(171, 321, 14, 14);
		panel.add(label_72);
		
		JLabel label_73 = new JLabel("1");
		label_73.setBounds(191, 321, 14, 14);
		panel.add(label_73);
		
		JLabel label_74 = new JLabel("2");
		label_74.setBounds(211, 321, 14, 14);
		panel.add(label_74);
		
		JLabel label_75 = new JLabel("21");
		label_75.setBounds(231, 321, 20, 14);
		panel.add(label_75);
		
		JLabel label_76 = new JLabel("11");
		label_76.setBounds(261, 321, 20, 14);
		panel.add(label_76);
		
		JLabel label_77 = new JLabel("10");
		label_77.setBounds(291, 321, 14, 14);
		panel.add(label_77);
		
		JLabel label_78 = new JLabel("22");
		label_78.setBounds(321, 321, 32, 14);
		panel.add(label_78);
		
		JLabel label_79 = new JLabel("9");
		label_79.setBounds(20, 361, 14, 14);
		panel.add(label_79);
		
		JLabel lblVellaznimi = new JLabel("Vellaznimi");
		lblVellaznimi.setBounds(41, 351, 98, 35);
		lblVellaznimi.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Vellaznimi.png"));
		panel.add(lblVellaznimi);
		
		JLabel label_81 = new JLabel("10");
		label_81.setBounds(149, 361, 14, 14);
		panel.add(label_81);
		
		JLabel label_82 = new JLabel("7");
		label_82.setBounds(171, 361, 14, 14);
		panel.add(label_82);
		
		JLabel label_83 = new JLabel("1");
		label_83.setBounds(191, 361, 14, 14);
		panel.add(label_83);
		
		JLabel label_84 = new JLabel("2");
		label_84.setBounds(211, 361, 14, 14);
		panel.add(label_84);
		
		JLabel label_85 = new JLabel("21");
		label_85.setBounds(231, 361, 20, 14);
		panel.add(label_85);
		
		JLabel label_86 = new JLabel("11");
		label_86.setBounds(261, 361, 20, 14);
		panel.add(label_86);
		
		JLabel label_87 = new JLabel("10");
		label_87.setBounds(291, 361, 14, 14);
		panel.add(label_87);
		
		JLabel label_88 = new JLabel("22");
		label_88.setBounds(321, 361, 32, 14);
		panel.add(label_88);
		
		JLabel label_89 = new JLabel("10");
		label_89.setBounds(20, 400, 14, 14);
		panel.add(label_89);
		
		JLabel lblFlamurtari = new JLabel("Flamurtari");
		lblFlamurtari.setBounds(41, 390, 98, 35);
		lblFlamurtari.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Flamurtari.png"));
		panel.add(lblFlamurtari);
		
		JLabel label_91 = new JLabel("10");
		label_91.setBounds(149, 400, 14, 14);
		panel.add(label_91);
		
		JLabel label_92 = new JLabel("7");
		label_92.setBounds(171, 400, 14, 14);
		panel.add(label_92);
		
		JLabel label_93 = new JLabel("1");
		label_93.setBounds(191, 400, 14, 14);
		panel.add(label_93);
		
		JLabel label_94 = new JLabel("2");
		label_94.setBounds(211, 400, 14, 14);
		panel.add(label_94);
		
		JLabel label_95 = new JLabel("21");
		label_95.setBounds(231, 400, 20, 14);
		panel.add(label_95);
		
		JLabel label_96 = new JLabel("11");
		label_96.setBounds(261, 400, 20, 14);
		panel.add(label_96);
		
		JLabel label_97 = new JLabel("10");
		label_97.setBounds(291, 400, 14, 14);
		panel.add(label_97);
		
		JLabel label_98 = new JLabel("22");
		label_98.setBounds(321, 400, 32, 14);
		panel.add(label_98);
		
		JLabel label_99 = new JLabel("11");
		label_99.setBounds(20, 439, 14, 14);
		panel.add(label_99);
		
		JLabel lblBesa = new JLabel("Besa");
		lblBesa.setBounds(41, 428, 98, 35);
		lblBesa.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Besa.png"));
		panel.add(lblBesa);
		
		JLabel label_101 = new JLabel("10");
		label_101.setBounds(149, 439, 14, 14);
		panel.add(label_101);
		
		JLabel label_102 = new JLabel("7");
		label_102.setBounds(171, 439, 14, 14);
		panel.add(label_102);
		
		JLabel label_103 = new JLabel("1");
		label_103.setBounds(191, 439, 14, 14);
		panel.add(label_103);
		
		JLabel label_104 = new JLabel("2");
		label_104.setBounds(211, 439, 14, 14);
		panel.add(label_104);
		
		JLabel label_105 = new JLabel("21");
		label_105.setBounds(231, 439, 20, 14);
		panel.add(label_105);
		
		JLabel label_106 = new JLabel("11");
		label_106.setBounds(261, 439, 20, 14);
		panel.add(label_106);
		
		JLabel label_107 = new JLabel("10");
		label_107.setBounds(291, 439, 14, 14);
		panel.add(label_107);
		
		JLabel label_108 = new JLabel("22");
		label_108.setBounds(321, 439, 32, 14);
		panel.add(label_108);
		
		JLabel label_109 = new JLabel("12");
		label_109.setBounds(20, 476, 14, 14);
		panel.add(label_109);
		
		JLabel lblVllaznia = new JLabel("Vllaznia");
		lblVllaznia.setBounds(41, 466, 98, 35);
		lblVllaznia.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Vllaznia.png"));
		panel.add(lblVllaznia);
		
		JLabel label_111 = new JLabel("10");
		label_111.setBounds(149, 476, 14, 14);
		panel.add(label_111);
		
		JLabel label_112 = new JLabel("7");
		label_112.setBounds(171, 476, 14, 14);
		panel.add(label_112);
		
		JLabel label_113 = new JLabel("1");
		label_113.setBounds(191, 476, 14, 14);
		panel.add(label_113);
		
		JLabel label_114 = new JLabel("2");
		label_114.setBounds(211, 476, 14, 14);
		panel.add(label_114);
		
		JLabel label_115 = new JLabel("21");
		label_115.setBounds(231, 476, 20, 14);
		panel.add(label_115);
		
		JLabel label_116 = new JLabel("11");
		label_116.setBounds(261, 476, 20, 14);
		panel.add(label_116);
		
		JLabel label_117 = new JLabel("10");
		label_117.setBounds(291, 476, 14, 14);
		panel.add(label_117);
		
		JLabel label_118 = new JLabel("22");
		label_118.setBounds(321, 476, 32, 14);
		panel.add(label_118);
	}
}
