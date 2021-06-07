package zhan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;

public class HomeFrame extends JFrame {

	static JPanel home;
	static ImageIcon homebg =new ImageIcon("head/homebg.png");
    private static Clip[] clip = new Clip[3];
    private static AudioInputStream[] ais = new  AudioInputStream[3];

    
    
	public HomeFrame() {
		setTitle("\u653F\u6CBB\u4EBA\u7269\u5927\u6B7B\u9B25");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 472);
		//音效範例
		try {
			//載入選擇音效
			URL a0 = getClass().getClassLoader().getResource("decision.wav");
			ais[0] = AudioSystem.getAudioInputStream(a0);
			clip[0] = AudioSystem.getClip();
			clip[0].open(ais[0]);
			//載入取消音效
			URL a1 = getClass().getClassLoader().getResource("cancel.wav");
			ais[1] = AudioSystem.getAudioInputStream(a1);
			clip[1] = AudioSystem.getClip();
			clip[1].open(ais[1]);
			URL a2 = getClass().getClassLoader().getResource("fight.wav");
			ais[2] = AudioSystem.getAudioInputStream(a2);
			clip[2] = AudioSystem.getClip();
			clip[2].open(ais[2]);
        } catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error loading sound file, it may not exist or another program has a lock on it.");
			System.exit(1);
		}
		
		
		
		//----------首頁--------
		home = new JPanel();
		home.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(home);
		
		JButton game = new JButton("\u904A\u6232\u958B\u59CB");
		game.setBounds(83, 321, 160, 58);
		game.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clip[0].setFramePosition(0);
				clip[0].loop(0); //0=play once 
				MyFrame cc =new MyFrame();
				dispose();
			}
		});
		home.setLayout(null);
		home.add(game);
		
		JButton des = new JButton("\u904A\u6232\u8AAA\u660E");
		des.setBounds(253, 321, 160, 58);
		des.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clip[0].setFramePosition(0);
				clip[0].loop(0); //0=play once 
				ExFrame cc =new ExFrame();
				dispose();
			}
		});
		home.add(des);
		
		JButton leave = new JButton("\u96E2\u958B\u904A\u6232");
		leave.setBounds(423, 321, 160, 58);
		leave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clip[1].setFramePosition(0);
				clip[1].loop(0); //0=play once 
				System.exit(0);
			}
		});
		home.add(leave);
		
		JLabel lblNewLabel = new JLabel("\u7D44\u54E1\u540D\u55AE");
		lblNewLabel.setBounds(433, 396, 55, 15);
		home.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u738B\u6668\u535A S05352043");
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setBounds(498, 396, 112, 15);
		home.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 667, 433);
		lblNewLabel_2.setIcon(homebg);
		home.add(lblNewLabel_2);
		
		setVisible(true);
	}
}

