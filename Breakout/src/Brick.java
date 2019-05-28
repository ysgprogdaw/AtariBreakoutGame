import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Brick extends JPanel {

	private int widthRect = 60;
	private int heightRect = 30;
	private Color wine = new Color(183, 49, 49);

	public Brick() {
		setBackground(Color.BLACK);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i <= 10; i++) {
			g.setColor(wine);
		}
		g.fillRect(10, 10, widthRect, heightRect);

	}

}