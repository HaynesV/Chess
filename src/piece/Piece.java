package piece;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.Board;

public class Piece {
	public BufferedImage img;
	public int x,y;
	public int col,row,preCol,preRow;
	public int color;

	public Piece(int col, int row, int color) {
		this.col = col;
		this.row = row;
		this.color = color;
		x = getX();
		y = getY();
		preCol = col;
		preRow = row;
	}
	public BufferedImage getImage(String imgPatch) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(getClass().getResourceAsStream(imgPatch +".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
	public int getX() {
		return col * Board.SQUARE_SIZE;
	}
	public int getY() {
		return row * Board.SQUARE_SIZE;
	}
	public void draw(Graphics2D g2) {
		g2.drawImage(img,x,y,Board.SQUARE_SIZE,Board.SQUARE_SIZE,null);
	}

	
	
	
}
