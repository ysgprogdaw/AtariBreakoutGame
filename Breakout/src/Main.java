import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame window = new JFrame("Breakout");
		//ImageIcon img = new ImageIcon("Imagen/oldlogo.jpg");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(700, 500);
		//window.setIconImage(img.getImage());
		window.setLocationRelativeTo(null);
		window.getContentPane().setBackground(Color.BLACK);
		window.setVisible(true);
		
		Brick brick = new Brick();
		window.add(brick);

	}

}