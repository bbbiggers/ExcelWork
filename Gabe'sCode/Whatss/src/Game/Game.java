package Game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel {

	int x = 0;
	int y = 0;
	int xspd = 3;
	int yspd = 3;
	private void moveBall() {
		x = x + xspd;
		y = y + yspd;
		if(x  > 400) {
			if(y > 400) {
				xspd = -3;
				yspd = 3;
			}
			else {
				xspd = -3;
				yspd = -3;
			}
			
		}
		else if(x < 0) {
			if(y < 0) {
				xspd = 3;
				yspd = 3;
			}
			else {
				xspd = 3;
				yspd = -3;
			}
		}
		else if(y  > 400) {
			x = x + xspd;
			y = y + yspd;
			if(x > 400) {
				xspd = -3;
				yspd = 3;
			}
			else {
				xspd = -3;
				yspd = -3;
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis");
		Game game = new Game();
		frame.add(game);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			game.moveBall();
			game.repaint();
			Thread.sleep(10);
		}
	}
}