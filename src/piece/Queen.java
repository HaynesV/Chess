package piece;

import main.GamePanel;

public class Queen extends Piece {

	public Queen(int col, int row, int color) {
		super(col, row, color);
		if(color == GamePanel.WHITE) {
			img = getImage("/piece/w-queen");
		}else {
			img = getImage("/piece/b-queen");
		}
	}

}
