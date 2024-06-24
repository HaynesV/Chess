package piece;

import main.GamePanel;

public class King extends Piece {

	public King(int col, int row, int color) {
		super(col, row, color);
		if(color == GamePanel.WHITE) {
			img = getImage("/piece/w-king");
		}else {
			img = getImage("/piece/b-king");
		}
	}

}
