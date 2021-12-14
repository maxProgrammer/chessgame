package chess.pieces;

import chess.ChessPiece;
import chess.Color;
import models.entities.Board;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

}
