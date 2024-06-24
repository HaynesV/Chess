package main;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame main = new JFrame("Chess");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setResizable(false);
		
		GamePanel gPanel = new GamePanel();
		main.add(gPanel);
		main.pack();
		
		main.setLocationRelativeTo(null);
		main.setVisible(true);
		gPanel.launchGame();
	
		
	}
}
