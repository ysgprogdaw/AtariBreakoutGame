import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Ball extends JPanel{

	private boolean destroyed;
	private int xBall = 15;
	private int yBall = 15;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i <= 10; i++) {
			g.setColor(Color.WHITE);
		}
		g.fillArc(350, 400, xBall, yBall, 0, 360);
	}

}
