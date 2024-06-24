package piece;

import main.GamePanel;

public class Pawn extends Piece {

	public Pawn(int col, int row, int color) {
		super(col, row, color);
		if (color == GamePanel.WHITE) {
			img = getImage("/piece/w-pawn");
		}else {
			img = getImage("/piece/b-pawn");
		}
	}

}
