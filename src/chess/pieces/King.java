package chess.pieces;

import java.awt.Color;

import boadgame.Board;
import chess.ChessPiece;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

	
}
