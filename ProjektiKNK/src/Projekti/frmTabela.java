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
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

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
		setBounds(100, 100, 550, 591);
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
		lblPozita.setToolTipText("Pozita");
		lblPozita.setBounds(20, 32, 14, 14);
		panel.add(lblPozita);
		
		JLabel lblEkipi = new JLabel("Ekipi");
		lblEkipi.setBounds(41, 32, 67, 14);
		panel.add(lblEkipi);
		
		JLabel lblNdeshje = new JLabel("N");
		lblNdeshje.setToolTipText("Ndeshje te zhvilluara");
		lblNdeshje.setBounds(175, 32, 14, 14);
		panel.add(lblNdeshje);
		
		JLabel lblF = new JLabel("F");
		lblF.setToolTipText("Fitore");
		lblF.setBounds(215, 32, 14, 14);
		panel.add(lblF);
		
		JLabel lblB = new JLabel("B");
		lblB.setToolTipText("Barazime");
		lblB.setBounds(255, 32, 14, 14);
		panel.add(lblB);
		
		JLabel lblH = new JLabel("H");
		lblH.setToolTipText("Humbje");
		lblH.setBounds(295, 32, 14, 14);
		panel.add(lblH);
		
		JLabel lblG = new JLabel("G+");
		lblG.setToolTipText("Gola te shenuar");
		lblG.setBounds(335, 32, 20, 14);
		panel.add(lblG);
		
		JLabel lblG_1 = new JLabel("G-");
		lblG_1.setToolTipText("Gola te pranuar");
		lblG_1.setBounds(375, 32, 20, 14);
		panel.add(lblG_1);
		
		JLabel lblG_2 = new JLabel("G +/-");
		lblG_2.setToolTipText("Golaverazhi");
		lblG_2.setBounds(415, 32, 32, 14);
		panel.add(lblG_2);
		
		JLabel lblPike = new JLabel("Pike");
		lblPike.setBounds(457, 32, 32, 14);
		panel.add(lblPike);
		
		JLabel lblDritaP = new JLabel("1");
		lblDritaP.setToolTipText("Champions League");
		lblDritaP.setBounds(20, 57, 14, 14);
		lblDritaP.setOpaque(true);
		lblDritaP.setBackground(Color.green);
		panel.add(lblDritaP);
		
		JLabel lblDrita = new JLabel("Drita");
		lblDrita.setBounds(41, 49, 98, 35);
		lblDrita.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Drita.png"));
		panel.add(lblDrita);
		
		JLabel lblDritaN = new JLabel("33");
		lblDritaN.setBounds(175, 57, 14, 14);
		panel.add(lblDritaN);
		
		JLabel lblDritaF = new JLabel("18");
		lblDritaF.setBounds(215, 57, 14, 14);
		panel.add(lblDritaF);
		
		JLabel lblDritaB = new JLabel("13");
		lblDritaB.setBounds(255, 57, 14, 14);
		panel.add(lblDritaB);
		
		JLabel lblDritaH = new JLabel("2");
		lblDritaH.setBounds(295, 57, 14, 14);
		panel.add(lblDritaH);
		
		JLabel lblDritaGsh = new JLabel("53");
		lblDritaGsh.setBounds(335, 57, 20, 14);
		panel.add(lblDritaGsh);
		
		JLabel lblDritaGp = new JLabel("21");
		lblDritaGp.setBounds(375, 57, 20, 14);
		panel.add(lblDritaGp);
		
		JLabel lblDritaGz = new JLabel("+32");
		lblDritaGz.setBounds(415, 57, 32, 14);
		panel.add(lblDritaGz);
		
		JLabel lblDritaPi = new JLabel("67");
		lblDritaPi.setBounds(457, 57, 32, 14);
		panel.add(lblDritaPi);
		
		JLabel lblPrishtinaP = new JLabel("2");
		lblPrishtinaP.setBounds(20, 95, 14, 14);
		panel.add(lblPrishtinaP);
		
		JLabel lblPrishtina = new JLabel("Prishtina");
		lblPrishtina.setBounds(41, 88, 98, 35);
		lblPrishtina.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Prishtina.png"));
		panel.add(lblPrishtina);
		
		JLabel lblPrishtinaN = new JLabel("33");
		lblPrishtinaN.setBounds(175, 95, 14, 14);
		panel.add(lblPrishtinaN);
		
		JLabel lblPrishtinaF = new JLabel("18");
		lblPrishtinaF.setBounds(215, 95, 14, 14);
		panel.add(lblPrishtinaF);
		
		JLabel lblPrishtinaB = new JLabel("10");
		lblPrishtinaB.setBounds(255, 95, 14, 14);
		panel.add(lblPrishtinaB);
		
		JLabel lblPrishtinaH = new JLabel("5");
		lblPrishtinaH.setBounds(295, 95, 14, 14);
		panel.add(lblPrishtinaH);
		
		JLabel lblPrishtinaGsh = new JLabel("39");
		lblPrishtinaGsh.setBounds(335, 95, 20, 14);
		panel.add(lblPrishtinaGsh);
		
		JLabel lblPrishtinaGp = new JLabel("18");
		lblPrishtinaGp.setBounds(375, 95, 20, 14);
		panel.add(lblPrishtinaGp);
		
		JLabel lblPrishtinaGz = new JLabel("+21");
		lblPrishtinaGz.setBounds(415, 95, 32, 14);
		panel.add(lblPrishtinaGz);
		
		JLabel lblPrishtinaPi = new JLabel("64");
		lblPrishtinaPi.setBounds(457, 95, 32, 14);
		panel.add(lblPrishtinaPi);
		
		JLabel lblLlapiP = new JLabel("3");
		lblLlapiP.setBounds(20, 137, 14, 14);
		panel.add(lblLlapiP);
		
		JLabel lblLlapi = new JLabel("Llapi");
		lblLlapi.setBounds(41, 127, 98, 35);
		lblLlapi.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Llapi.png"));
		panel.add(lblLlapi);
		
		JLabel lblLlapiN = new JLabel("33");
		lblLlapiN.setBounds(175, 134, 14, 14);
		panel.add(lblLlapiN);
		
		JLabel lblLlapiF = new JLabel("16");
		lblLlapiF.setBounds(215, 134, 14, 14);
		panel.add(lblLlapiF);
		
		JLabel lblLlapiB = new JLabel("6");
		lblLlapiB.setBounds(255, 134, 14, 14);
		panel.add(lblLlapiB);
		
		JLabel lblLlapiH = new JLabel("11");
		lblLlapiH.setBounds(295, 134, 14, 14);
		panel.add(lblLlapiH);
		
		JLabel lblLlapiGsh = new JLabel("51");
		lblLlapiGsh.setBounds(335, 134, 20, 14);
		panel.add(lblLlapiGsh);
		
		JLabel lblLlapiGp = new JLabel("41");
		lblLlapiGp.setBounds(375, 134, 20, 14);
		panel.add(lblLlapiGp);
		
		JLabel lblLlapiGz = new JLabel("+10");
		lblLlapiGz.setBounds(415, 134, 32, 14);
		panel.add(lblLlapiGz);
		
		JLabel lblLlapiPi = new JLabel("54");
		lblLlapiPi.setBounds(457, 134, 32, 14);
		panel.add(lblLlapiPi);
		
		JLabel label_29 = new JLabel("4");
		label_29.setBounds(20, 169, 14, 14);
		panel.add(label_29);
		
		JLabel lblTrepca = new JLabel("Trepca '89");
		lblTrepca.setBounds(41, 160, 98, 35);
		lblTrepca.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Trepca.png"));
		panel.add(lblTrepca);
		
		JLabel label_31 = new JLabel("33");
		label_31.setBounds(175, 169, 14, 14);
		panel.add(label_31);
		
		JLabel label_32 = new JLabel("14");
		label_32.setBounds(215, 169, 14, 14);
		panel.add(label_32);
		
		JLabel label_33 = new JLabel("11");
		label_33.setBounds(255, 169, 14, 14);
		panel.add(label_33);
		
		JLabel label_34 = new JLabel("8");
		label_34.setBounds(295, 169, 14, 14);
		panel.add(label_34);
		
		JLabel label_35 = new JLabel("41");
		label_35.setBounds(335, 169, 20, 14);
		panel.add(label_35);
		
		JLabel label_36 = new JLabel("25");
		label_36.setBounds(375, 169, 20, 14);
		panel.add(label_36);
		
		JLabel label_37 = new JLabel("+16");
		label_37.setBounds(415, 169, 32, 14);
		panel.add(label_37);
		
		JLabel label_38 = new JLabel("53");
		label_38.setBounds(457, 169, 32, 14);
		panel.add(label_38);
		
		JLabel label_39 = new JLabel("5");
		label_39.setBounds(20, 206, 14, 14);
		panel.add(label_39);
		
		JLabel lblDrenica = new JLabel("Drenica");
		lblDrenica.setBounds(41, 197, 98, 35);
		lblDrenica.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Drenica.png"));
		panel.add(lblDrenica);
		
		JLabel label_41 = new JLabel("33");
		label_41.setBounds(175, 206, 14, 14);
		panel.add(label_41);
		
		JLabel label_42 = new JLabel("10");
		label_42.setBounds(215, 206, 14, 14);
		panel.add(label_42);
		
		JLabel label_43 = new JLabel("18");
		label_43.setBounds(255, 206, 14, 14);
		panel.add(label_43);
		
		JLabel label_44 = new JLabel("5");
		label_44.setBounds(295, 206, 14, 14);
		panel.add(label_44);
		
		JLabel label_45 = new JLabel("32");
		label_45.setBounds(335, 206, 20, 14);
		panel.add(label_45);
		
		JLabel label_46 = new JLabel("18");
		label_46.setBounds(375, 206, 20, 14);
		panel.add(label_46);
		
		JLabel label_47 = new JLabel("+14");
		label_47.setBounds(415, 206, 32, 14);
		panel.add(label_47);
		
		JLabel label_48 = new JLabel("48");
		label_48.setBounds(457, 206, 32, 14);
		panel.add(label_48);
		
		JLabel label_49 = new JLabel("6");
		label_49.setBounds(20, 247, 14, 14);
		panel.add(label_49);
		
		JLabel lblFeronikeli = new JLabel("Feronikeli");
		lblFeronikeli.setBounds(41, 236, 98, 35);
		lblFeronikeli.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Feronikeli.png"));
		panel.add(lblFeronikeli);
		
		JLabel label_51 = new JLabel("33");
		label_51.setBounds(175, 247, 14, 14);
		panel.add(label_51);
		
		JLabel label_52 = new JLabel("13");
		label_52.setBounds(215, 247, 14, 14);
		panel.add(label_52);
		
		JLabel label_53 = new JLabel("9");
		label_53.setBounds(255, 247, 14, 14);
		panel.add(label_53);
		
		JLabel label_54 = new JLabel("11");
		label_54.setBounds(295, 247, 14, 14);
		panel.add(label_54);
		
		JLabel label_55 = new JLabel("34");
		label_55.setBounds(335, 247, 20, 14);
		panel.add(label_55);
		
		JLabel label_56 = new JLabel("27");
		label_56.setBounds(375, 247, 20, 14);
		panel.add(label_56);
		
		JLabel label_57 = new JLabel("+7");
		label_57.setBounds(415, 247, 20, 14);
		panel.add(label_57);
		
		JLabel label_58 = new JLabel("48");
		label_58.setBounds(457, 247, 32, 14);
		panel.add(label_58);
		
		JLabel label_59 = new JLabel("7");
		label_59.setBounds(20, 282, 14, 14);
		panel.add(label_59);
		
		JLabel lblLiria = new JLabel("Liria");
		lblLiria.setBounds(41, 273, 98, 35);
		lblLiria.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Liria.png"));
		panel.add(lblLiria);
		
		JLabel label_61 = new JLabel("33");
		label_61.setBounds(175, 282, 14, 14);
		panel.add(label_61);
		
		JLabel label_62 = new JLabel("13");
		label_62.setBounds(215, 282, 14, 14);
		panel.add(label_62);
		
		JLabel label_63 = new JLabel("9");
		label_63.setBounds(255, 282, 14, 14);
		panel.add(label_63);
		
		JLabel label_64 = new JLabel("11");
		label_64.setBounds(295, 282, 14, 14);
		panel.add(label_64);
		
		JLabel label_65 = new JLabel("34");
		label_65.setBounds(335, 282, 20, 14);
		panel.add(label_65);
		
		JLabel label_66 = new JLabel("30");
		label_66.setBounds(375, 282, 20, 14);
		panel.add(label_66);
		
		JLabel label_67 = new JLabel("+4");
		label_67.setBounds(415, 282, 14, 14);
		panel.add(label_67);
		
		JLabel label_68 = new JLabel("48");
		label_68.setBounds(457, 282, 32, 14);
		panel.add(label_68);
		
		JLabel label_69 = new JLabel("8");
		label_69.setBounds(20, 321, 14, 14);
		panel.add(label_69);
		
		JLabel lblGjilani = new JLabel("Gjilani");
		lblGjilani.setBounds(41, 311, 98, 35);
		lblGjilani.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Gjilani.png"));
		panel.add(lblGjilani);
		
		JLabel label_71 = new JLabel("33");
		label_71.setBounds(175, 321, 14, 14);
		panel.add(label_71);
		
		JLabel label_72 = new JLabel("10");
		label_72.setBounds(215, 321, 14, 14);
		panel.add(label_72);
		
		JLabel label_73 = new JLabel("16");
		label_73.setBounds(255, 321, 14, 14);
		panel.add(label_73);
		
		JLabel label_74 = new JLabel("7");
		label_74.setBounds(295, 321, 14, 14);
		panel.add(label_74);
		
		JLabel label_75 = new JLabel("29");
		label_75.setBounds(335, 321, 20, 14);
		panel.add(label_75);
		
		JLabel label_76 = new JLabel("21");
		label_76.setBounds(375, 321, 20, 14);
		panel.add(label_76);
		
		JLabel label_77 = new JLabel("+8");
		label_77.setBounds(415, 321, 14, 14);
		panel.add(label_77);
		
		JLabel label_78 = new JLabel("46");
		label_78.setBounds(457, 321, 32, 14);
		panel.add(label_78);
		
		JLabel label_79 = new JLabel("9");
		label_79.setToolTipText("Play Out");
		label_79.setBackground(new Color(255, 69, 0));
		label_79.setBounds(20, 361, 14, 14);
		label_79.setOpaque(true);
		panel.add(label_79);
		
		JLabel lblVellaznimi = new JLabel("Vellaznimi");
		lblVellaznimi.setBounds(41, 351, 98, 35);
		lblVellaznimi.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Vellaznimi.png"));
		panel.add(lblVellaznimi);
		
		JLabel label_81 = new JLabel("33");
		label_81.setBounds(175, 361, 14, 14);
		panel.add(label_81);
		
		JLabel label_82 = new JLabel("10");
		label_82.setBounds(215, 361, 14, 14);
		panel.add(label_82);
		
		JLabel label_83 = new JLabel("14");
		label_83.setBounds(255, 361, 14, 14);
		panel.add(label_83);
		
		JLabel label_84 = new JLabel("9");
		label_84.setBounds(295, 361, 14, 14);
		panel.add(label_84);
		
		JLabel label_85 = new JLabel("29");
		label_85.setBounds(335, 361, 20, 14);
		panel.add(label_85);
		
		JLabel label_86 = new JLabel("28");
		label_86.setBounds(375, 361, 20, 14);
		panel.add(label_86);
		
		JLabel label_87 = new JLabel("+1");
		label_87.setBounds(415, 361, 14, 14);
		panel.add(label_87);
		
		JLabel label_88 = new JLabel("44");
		label_88.setBounds(457, 361, 32, 14);
		panel.add(label_88);
		
		JLabel label_89 = new JLabel("10");
		label_89.setToolTipText("Play Out");
		label_89.setBackground(new Color(255, 69, 0));
		label_89.setBounds(20, 400, 14, 14);
		label_89.setOpaque(true);
		panel.add(label_89);
		
		JLabel lblFlamurtari = new JLabel("Flamurtari");
		lblFlamurtari.setBounds(41, 390, 98, 35);
		lblFlamurtari.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Flamurtari.png"));
		panel.add(lblFlamurtari);
		
		JLabel label_91 = new JLabel("33");
		label_91.setBounds(175, 400, 14, 14);
		panel.add(label_91);
		
		JLabel label_92 = new JLabel("6");
		label_92.setBounds(215, 400, 14, 14);
		panel.add(label_92);
		
		JLabel label_93 = new JLabel("7");
		label_93.setBounds(255, 400, 14, 14);
		panel.add(label_93);
		
		JLabel label_94 = new JLabel("20");
		label_94.setBounds(295, 400, 14, 14);
		panel.add(label_94);
		
		JLabel label_95 = new JLabel("28");
		label_95.setBounds(335, 400, 20, 14);
		panel.add(label_95);
		
		JLabel label_96 = new JLabel("53");
		label_96.setBounds(375, 400, 20, 14);
		panel.add(label_96);
		
		JLabel label_97 = new JLabel("-25");
		label_97.setBounds(415, 400, 22, 14);
		panel.add(label_97);
		
		JLabel label_98 = new JLabel("25");
		label_98.setBounds(457, 400, 32, 14);
		panel.add(label_98);
		
		JLabel label_99 = new JLabel("11");
		label_99.setToolTipText("Liga e Pare");
		label_99.setBackground(Color.RED);
		label_99.setBounds(20, 439, 14, 14);
		label_99.setOpaque(true);
		panel.add(label_99);
		
		JLabel lblBesa = new JLabel("Besa");
		lblBesa.setBounds(41, 428, 98, 35);
		lblBesa.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Besa.png"));
		panel.add(lblBesa);
		
		JLabel label_101 = new JLabel("33");
		label_101.setBounds(175, 439, 14, 14);
		panel.add(label_101);
		
		JLabel label_102 = new JLabel("6");
		label_102.setBounds(215, 439, 14, 14);
		panel.add(label_102);
		
		JLabel label_103 = new JLabel("4");
		label_103.setBounds(255, 439, 14, 14);
		panel.add(label_103);
		
		JLabel label_104 = new JLabel("23");
		label_104.setBounds(295, 439, 14, 14);
		panel.add(label_104);
		
		JLabel label_105 = new JLabel("28");
		label_105.setBounds(335, 439, 20, 14);
		panel.add(label_105);
		
		JLabel label_106 = new JLabel("64");
		label_106.setBounds(375, 439, 20, 14);
		panel.add(label_106);
		
		JLabel label_107 = new JLabel("-36");
		label_107.setBounds(415, 439, 22, 14);
		panel.add(label_107);
		
		JLabel label_108 = new JLabel("22");
		label_108.setBounds(457, 439, 32, 14);
		panel.add(label_108);
		
		JLabel label_109 = new JLabel("12");
		label_109.setToolTipText("Liga e Pare");
		label_109.setLabelFor(label_109);
		label_109.setOpaque(true);
		label_109.setBackground(new Color(255, 0, 0));
		label_109.setBounds(20, 476, 14, 14);
		panel.add(label_109);
		
		JLabel lblVllaznia = new JLabel("Vllaznia");
		lblVllaznia.setBounds(41, 466, 98, 35);
		lblVllaznia.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\ProjektiKNK\\src\\img\\Logo-KF-Vllaznia.png"));
		panel.add(lblVllaznia);
		
		JLabel label_111 = new JLabel("33");
		label_111.setBounds(175, 476, 14, 14);
		panel.add(label_111);
		
		JLabel label_112 = new JLabel("3");
		label_112.setBounds(215, 476, 14, 14);
		panel.add(label_112);
		
		JLabel label_113 = new JLabel("5");
		label_113.setBounds(255, 476, 14, 14);
		panel.add(label_113);
		
		JLabel label_114 = new JLabel("25");
		label_114.setBounds(295, 476, 14, 14);
		panel.add(label_114);
		
		JLabel label_115 = new JLabel("16");
		label_115.setBounds(335, 476, 20, 14);
		panel.add(label_115);
		
		JLabel label_116 = new JLabel("68");
		label_116.setBounds(375, 476, 20, 14);
		panel.add(label_116);
		
		JLabel label_117 = new JLabel("-52");
		label_117.setBounds(415, 476, 22, 14);
		panel.add(label_117);
		
		JLabel label_118 = new JLabel("14");
		label_118.setBounds(457, 476, 32, 14);
		panel.add(label_118);
	}
}
