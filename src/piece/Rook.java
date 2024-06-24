package piece;

import main.GamePanel;

public class Rook extends Piece {

	public Rook(int col, int row, int color) {
		super(col, row, color);
		if (color == GamePanel.WHITE) {
			img = getImage("/piece/w-rook");
			
		}else {
			img = getImage("/piece/b-rook");
		}
	}
	

}
