package piece;

import main.GamePanel;

public class Knight extends Piece {

	public Knight(int col, int row, int color) {
		super(col, row, color);
		if(color == GamePanel.WHITE) {
			img = getImage("/piece/w-knight");
		}else {
			img = getImage("/piece/b-knight");
		}
	}

}
