package m2l;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DecoElement {
	public static void decoJpanel(JPanel rootPanel,JFrame frame) {
		rootPanel.setBackground(Color.GRAY);
		rootPanel.setBounds(0, 0, 1000, 500);
		frame.getContentPane().add(rootPanel);
		rootPanel.setLayout(null);
		
	}
	
	public static void decoJbouton(JButton rootBouton) {
//		rootBouton.setBackground(Color.green);
		rootBouton.setForeground(Color.BLACK);
		rootBouton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
	}

}
