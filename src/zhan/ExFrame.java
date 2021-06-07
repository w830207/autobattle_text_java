package zhan;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Color;

public class ExFrame extends JFrame {

	static JPanel contentPane;
	static ImageIcon allbg =new ImageIcon("head/allbg.png");
	static ImageIcon small1 =new ImageIcon("head/small1.jpg");
	static ImageIcon small2 =new ImageIcon("head/small2.jpg");
	static ImageIcon small3 =new ImageIcon("head/small3.png");
	static ImageIcon small4 =new ImageIcon("head/small4.jpg");
    private static Clip[] clip = new Clip[3];
    private static AudioInputStream[] ais = new  AudioInputStream[3];

    
    
	public ExFrame() {
		setTitle("\u653F\u6CBB\u4EBA\u7269\u5927\u6B7B\u9B25");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 472);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
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
		
		
		JLabel hero1 = new JLabel("New label");
		hero1.setBounds(10, 46, 60, 60);
		hero1.setIcon(small1);
		contentPane.add(hero1);
		
		JLabel hero2 = new JLabel("New label");
		hero2.setBounds(10, 236, 60, 60);
		hero2.setIcon(small2);
		contentPane.add(hero2);
		
		JLabel hero3 = new JLabel("New label");
		hero3.setBounds(324, 46, 60, 60);
		hero3.setIcon(small3);
		contentPane.add(hero3);
		
		JLabel hero4 = new JLabel("New label");
		hero4.setBounds(324, 236, 60, 60);
		hero4.setIcon(small4);
		contentPane.add(hero4);
		
		JButton back = new JButton("\u56DE\u9996\u9801");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clip[1].setFramePosition(0);
				clip[1].loop(0); //0=play once 
				HomeFrame cc =new HomeFrame();
				dispose();
			}
		});
		back.setBounds(519, 360, 138, 63);
		contentPane.add(back);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.controlHighlight);
		textArea.setText("\u97D3\u570B\u745C-\u9AD8\u96C4\u5E02\u9577\uFF1F\r\n\t \u751F\u547D\u503C : 100\r\n\t \u653B\u64CA\u529B : 7\r\n\t \u9632\u79A6\u529B : 5\r\n\t \u547D\u4E2D\u7387 : 0.55");
		textArea.setEditable(false);
		textArea.setBounds(98, 46, 187, 114);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("\u8521\u82F1\u6587-\u4E2D\u83EF\u6C11\u570B\u7E3D\u7D71\r\n\t \u751F\u547D\u503C : 100\r\n\t \u653B\u64CA\u529B : 8\r\n\t \u9632\u79A6\u529B : 5\r\n\t \u547D\u4E2D\u7387 : 0.7");
		textArea_1.setEditable(false);
		textArea_1.setBackground(SystemColor.controlHighlight);
		textArea_1.setBounds(98, 236, 187, 114);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setText("\u67EF\u6587\u54F2-\u53F0\u5317\u5E02\u9577\r\n\t \u751F\u547D\u503C : 100\r\n\t \u653B\u64CA\u529B : 7\r\n\t \u9632\u79A6\u529B : 5\r\n\t \u547D\u4E2D\u7387 : 0.8");
		textArea_2.setEditable(false);
		textArea_2.setBackground(SystemColor.controlHighlight);
		textArea_2.setBounds(394, 46, 187, 114);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setText("\u9EC3\u570B\u660C-\u6642\u4EE3\u529B\u91CF\u524D\u9EE8\u4E3B\u5E2D\r\n\t \u751F\u547D\u503C : 100\r\n\t \u653B\u64CA\u529B : 13\r\n\t \u9632\u79A6\u529B : 3\r\n\t \u547D\u4E2D\u7387 : 0.6");
		textArea_3.setEditable(false);
		textArea_3.setBackground(SystemColor.controlHighlight);
		textArea_3.setBounds(394, 236, 187, 114);
		contentPane.add(textArea_3);
		
		JLabel lblNewLabel = new JLabel("\u96B1\u85CF\u89D2\u8272\u6309\u4E0B\u9EC3\u570B\u660C\u67EF\u6587\u54F2\u8521\u82F1\u6587\u5F8C  \u6309\u958B\u59CB\u6230\u9B25\u6703\u51FA\u73FE\u96B1\u85CF\u7FD2\u5927\u5927\u3002");
		lblNewLabel.setBounds(10, 384, 479, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 667, 433);
		lblNewLabel_1.setIcon(allbg);
		contentPane.add(lblNewLabel_1);
		
		setVisible(true);
	}
}
