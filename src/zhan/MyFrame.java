package zhan;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.*;
import java.net.URL;
import java.awt.Color;
import java.awt.SystemColor;

public class MyFrame extends JFrame {
	
	
	private static final long serialVersionUID = 1L;

	Battlestar battlestar;

	static MyFrame frame;
	static JPanel contentPane = new JPanel();

	// 圖標
	static ImageIcon small1 = new ImageIcon("head/small1.jpg");
	static ImageIcon small2 = new ImageIcon("head/small2.jpg");
	static ImageIcon small3 = new ImageIcon("head/small3.png");
	static ImageIcon small4 = new ImageIcon("head/small4.jpg");
	static ImageIcon small5 = new ImageIcon("head/small5.jpg");
	static ImageIcon big1 = new ImageIcon("head/big1.jpg");
	static ImageIcon big2 = new ImageIcon("head/big2.jpg");
	static ImageIcon big3 = new ImageIcon("head/big3.png");
	static ImageIcon big4 = new ImageIcon("head/big4.jpg");
	static ImageIcon big5 = new ImageIcon("head/big5.png");
	static ImageIcon re = new ImageIcon("head/re.jpg");
	static ImageIcon vs = new ImageIcon("head/vs.png");
	static ImageIcon allbg =new ImageIcon("head/allbg.png");
	//音效
	private static Clip[] clip = new Clip[3];
	private static AudioInputStream[] ais = new AudioInputStream[3];

	// 遊戲頁的按鈕
	static JButton btn_start = new JButton("\u958B\u59CB\u6230\u9B25");
	static JButton btn_leave = new JButton("\u96E2\u958B");
	static JButton btn_hero1 = new JButton();
	static JButton btn_hero2 = new JButton();
	static JButton btn_hero3 = new JButton();
	static JButton btn_hero4 = new JButton();
	static JButton btn_hero5 = new JButton();
	static int ycstr = 0;// 存放隱藏人物暗號

	static JTextArea textArea = new JTextArea();
	static JLabel lbBoss = new JLabel("                          boss");
	static JLabel lbPlayer = new JLabel("                         player");
	private final JLabel label = new JLabel("\u6230\u5831\uFF1A");
	private final JLabel label_1 = new JLabel("\u89D2\u8272\u9078\u64C7:");
	private final JLabel vsLabel = new JLabel("vs");
	private final JLabel lblNewLabel = new JLabel("New label");


	
	/**
	 * Create the frame.
	 */
	public MyFrame() {

		setTitle("\u653F\u6CBB\u4EBA\u7269\u5927\u6B7B\u9B25");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 472);
		setContentPane(contentPane);

		// 音效範例
		try {
			// 載入選擇音效
			URL a0 = getClass().getClassLoader().getResource("decision.wav");
			ais[0] = AudioSystem.getAudioInputStream(a0);
			clip[0] = AudioSystem.getClip();
			clip[0].open(ais[0]);
			// 載入取消音效
			URL a1 = getClass().getClassLoader().getResource("cancel.wav");
			ais[1] = AudioSystem.getAudioInputStream(a1);
			clip[1] = AudioSystem.getClip();
			clip[1].open(ais[1]);
			// 載入戰鬥音效
			URL a2 = getClass().getClassLoader().getResource("fight.wav");
			ais[2] = AudioSystem.getAudioInputStream(a2);
			clip[2] = AudioSystem.getClip();
			clip[2].open(ais[2]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error loading sound file, it may not exist or another program has a lock on it.");
			System.exit(1);
		}

		// ----------遊戲頁---------
		contentPane.setLayout(null);
		textArea.setBackground(SystemColor.text);

		textArea.setBounds(519, 23, 138, 330);
		contentPane.add(textArea);

		JPanel panel_select = new JPanel();
		panel_select.setBackground(SystemColor.desktop);
		panel_select.setBounds(0, 0, 79, 433);
		panel_select.setLayout(null);
		contentPane.add(panel_select);

		// 設置四位政治人物按鈕
		btn_hero1.setBounds(10, 27, 60, 60);
		btn_hero1.setIcon(small1);
		panel_select.add(btn_hero1);
		btn_hero2.setBounds(10, 97, 60, 60);
		btn_hero2.setIcon(small2);
		panel_select.add(btn_hero2);
		btn_hero3.setBounds(10, 167, 60, 60);
		btn_hero3.setIcon(small3);
		panel_select.add(btn_hero3);
		btn_hero4.setBounds(10, 237, 60, 60);
		btn_hero4.setIcon(small4);
		panel_select.add(btn_hero4);

		JButton btn_rechose = new JButton();
		btn_rechose.setBounds(10, 307, 60, 60);
		btn_rechose.setIcon(re);
		panel_select.add(btn_rechose);
		label_1.setBounds(10, 10, 60, 15);
		panel_select.add(label_1);
		btn_hero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ycstr =ycstr+11;
				clip[0].setFramePosition(0);
				clip[0].loop(0); // 0=play once
				if (lbBoss.getText() == "                          boss") {
					lbBoss.setIcon(big1);
					lbBoss.setText("han");
					btn_hero1.setEnabled(false);
				} else if (lbPlayer.getText() == "                         player") {
					lbPlayer.setIcon(big1);
					lbPlayer.setText("han");
					btn_hero1.setEnabled(false);
					btn_start.setEnabled(true);
				}
			}
		});
		btn_hero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ycstr = ycstr + 2;
				clip[0].setFramePosition(0);
				clip[0].loop(0); // 0=play once
				if (lbBoss.getText() == "                          boss") {
					lbBoss.setIcon(big2);
					lbBoss.setText("cai");
					btn_hero2.setEnabled(false);
				} else if (lbPlayer.getText() == "                         player") {
					lbPlayer.setIcon(big2);
					lbPlayer.setText("cai");
					btn_hero2.setEnabled(false);
					btn_start.setEnabled(true);
				}
			}
		});
		btn_hero3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ycstr = ycstr + 3;
				clip[0].setFramePosition(0);
				clip[0].loop(0); // 0=play once
				if (lbBoss.getText() == "                          boss") {
					lbBoss.setIcon(big3);
					lbBoss.setText("kep");
					btn_hero3.setEnabled(false);
				} else if (lbPlayer.getText() == "                         player") {
					lbPlayer.setIcon(big3);
					lbPlayer.setText("kep");
					btn_hero3.setEnabled(false);
					btn_start.setEnabled(true);
				}
			}
		});
		btn_hero4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ycstr = ycstr + 4;
				clip[0].setFramePosition(0);
				clip[0].loop(0); // 0=play once
				if (lbBoss.getText() == "                          boss") {
					lbBoss.setIcon(big4);
					lbBoss.setText("huang");
					btn_hero4.setEnabled(false);
				} else if (lbPlayer.getText() == "                         player") {
					lbPlayer.setIcon(big4);
					lbPlayer.setText("huang");
					btn_hero4.setEnabled(false);
					btn_start.setEnabled(true);
				}
			}
		});
		btn_hero5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clip[0].setFramePosition(0);
				clip[0].loop(0); // 0=play once
				if (lbBoss.getText() == "                          boss") { //只能當對手
					lbBoss.setIcon(big5);
					lbBoss.setText("xi");
					btn_hero5.setEnabled(false);
				}
			}
		});
		btn_rechose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ycstr=0;	//把隱藏暗號數字歸零
				clip[1].setFramePosition(0);
				clip[1].loop(0); // 0=play once
				lbBoss.setIcon(null);		//清空對戰區的人物頭像
				lbPlayer.setIcon(null);
				lbBoss.setText("                          boss");	//復原對戰區文字內容
				lbPlayer.setText("                         player");
				btn_hero1.setEnabled(true);  //恢復所有角色按鈕
				btn_hero2.setEnabled(true);
				btn_hero3.setEnabled(true);
				btn_hero4.setEnabled(true);
				btn_start.setEnabled(false);
				textArea.setText("");
			}
		});

		// 開始按鈕
		btn_start.setEnabled(false);
		// 檢查label裡的文字確定戰鬥組合，呼叫戰鬥過程Battlestar貼到textArea裡
		btn_start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (ycstr == 9) {  		//滿足條件後 增加隱藏角色重新繪製按鈕位置
					btn_hero5.setBounds(10, 307, 60, 60);
					btn_rechose.setBounds(10, 377, 60, 60);
					btn_hero5.setIcon(small5);
					panel_select.add(btn_hero5);
					panel_select.repaint();
				}
				clip[2].setFramePosition(0);
				clip[2].loop(0); // 0=play once
				//han韓總機當boss的情況 
				if (lbBoss.getText() == "han" && lbPlayer.getText() == "cai") {
					textArea.setText(Battlestar.hancai());
				}
				if (lbBoss.getText() == "han" && lbPlayer.getText() == "kep") {
					textArea.setText(Battlestar.hankep());
				}
				if (lbBoss.getText() == "han" && lbPlayer.getText() == "huang") {
					textArea.setText(Battlestar.hanhuang());
				}
				//cai蔡英文boss
				if (lbBoss.getText() == "cai" && lbPlayer.getText() == "han") {
					textArea.setText(Battlestar.caihan());
				}
				if (lbBoss.getText() == "cai" && lbPlayer.getText() == "kep") {
					textArea.setText(Battlestar.caikep());
				}
				if (lbBoss.getText() == "cai" && lbPlayer.getText() == "huang") {
					textArea.setText(Battlestar.caihuang());
				}
				//kep柯文哲boss
				if (lbBoss.getText() == "kep" && lbPlayer.getText() == "han") {
					textArea.setText(Battlestar.kephan());
				}
				if (lbBoss.getText() == "kep" && lbPlayer.getText() == "cai") {
					textArea.setText(Battlestar.kepcai());
				}
				if (lbBoss.getText() == "kep" && lbPlayer.getText() == "huang") {
					textArea.setText(Battlestar.kephuang());
				}
				//huang黃國昌boss
				if (lbBoss.getText() == "huang" && lbPlayer.getText() == "han") {
					textArea.setText(Battlestar.huanghan());
				}
				if (lbBoss.getText() == "huang" && lbPlayer.getText() == "cai") {
					textArea.setText(Battlestar.huangcai());
				}
				if (lbBoss.getText() == "huang" && lbPlayer.getText() == "kep") {
					textArea.setText(Battlestar.huangkep());
				}
				//xi習近平boss
				if (lbBoss.getText() == "xi" && lbPlayer.getText() == "han") {
					textArea.setText(Battlestar.xihan());
				}
				if (lbBoss.getText() == "xi" && lbPlayer.getText() == "cai") {
					textArea.setText(Battlestar.xicai());
				}
				if (lbBoss.getText() == "xi" && lbPlayer.getText() == "kep") {
					textArea.setText(Battlestar.xikep());
				}
				if (lbBoss.getText() == "xi" && lbPlayer.getText() == "huang") {
					textArea.setText(Battlestar.xihuang());
				}
			}
		});
		btn_start.setBounds(369, 360, 138, 63);
		contentPane.add(btn_start);
		//離開按鈕
		btn_leave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clip[1].setFramePosition(0);
				clip[1].loop(0); // 0=play once
				System.exit(0);
			}
		});
		btn_leave.setBounds(519, 360, 138, 63);
		contentPane.add(btn_leave);

		lbBoss.setBounds(96, 23, 174, 174);
		contentPane.add(lbBoss);
		lbPlayer.setBounds(335, 179, 174, 174);
		contentPane.add(lbPlayer);
		label.setBounds(519, 10, 46, 15);

		contentPane.add(label);
		vsLabel.setBounds(280, 179, 42, 42);
		vsLabel.setIcon(vs);
		contentPane.add(vsLabel);
		
		lblNewLabel.setBounds(0, 0, 667, 433);
		lblNewLabel.setIcon(allbg);
		contentPane.add(lblNewLabel);

		//滾軸
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(519, 23, 138, 330);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
		setVisible(true);
	}

}
