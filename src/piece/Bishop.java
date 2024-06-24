package piece;

import main.GamePanel;

public class Bishop extends Piece{

	public Bishop(int col, int row, int color) {
		super(col, row, color);
		if (color == GamePanel.WHITE) {
			img = getImage("/piece/w-bishop");
		}else {
			img = getImage("/piece/b-bishop");
		}
	}

}
