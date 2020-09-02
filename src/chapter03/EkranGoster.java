package chapter03;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EkranGoster {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(500, 500);
		window.setLocation(300, 300);
		window.setContentPane(new JLabel(new ImageIcon("background.png")));
        
		window.setVisible(true);
		
		JOptionPane.showMessageDialog(null, "Merhaba Sinan");
	}
	

}
