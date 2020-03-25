package chess.pieces;

import java.awt.Color;

import boadgame.Board;
import chess.ChessPiece;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
	

	
}
