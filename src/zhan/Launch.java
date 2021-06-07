package zhan;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Launch extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame frame = new HomeFrame();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
