package GameState;
import java.awt.*;
import GameState.Level1State;
import java.awt.event.KeyEvent;

import TileMap.Background;
public class MenuState extends GameState {
	private Background bg;
	private int currentChoice = 0;
	private String[] Options = {"Start", "Help", "Quit"};
	private Color titleColor;
	private Font titleFont;
	private Font font;
	public MenuState(GameStateManager gsm) {
		this.gsm = gsm;
		try {
			
			bg = new Background("/Backgrounds/MenuBackGround.png", 1);
			bg.setVector(-0.1, 0);
			titleColor = new Color(128, 0, 0);
			titleFont = new Font("Century Gothic", Font.PLAIN, 28);
			font = new Font("Arial",Font.PLAIN, 12);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void init() { //25 MINTSE!   https://www.youtube.com/watch?v=9dzhgsVaiSo
		
	}
	public void update() {
		bg.update();
	}
	public void draw(Graphics2D g) {
		
		//draw bg
		bg.draw(g);
		
		//draw color
		g.setColor(titleColor);
		g.setFont(titleFont);
		g.drawString("Explore", 80, 70); // POS
		
		
		// draw menu options
		g.setFont(font);
		for(int i = 0; i < Options.length; i++) {
			if(i == currentChoice) {
				g.setColor(Color.BLACK)s;
			}
			else {
				g.setColor(Color.RED);
			}
			g.drawString(Options[i], 145, 140 + i *15);
		}
		
	}
	private void select() {
		if(currentChoice == 0) {
			//
			gsm.setState(GameStateManager.LEVEL1STATE);
		}
		if(currentChoice == 1) {
			//help
		}
		if(currentChoice == 2) {
			System.exit(0);
		}
	}
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_ENTER) {
			select();
			
		}
		if(k == KeyEvent.VK_UP) {
			currentChoice--;
			if(currentChoice == -1) {
				currentChoice = Options.length - 1;
			}
		}
		if(k == KeyEvent.VK_DOWN) {
			currentChoice++;
			if(currentChoice == Options.length) {
				currentChoice = 0;
			}
		}
	}
	public void keyReleased(int k) {
	
	}
}
