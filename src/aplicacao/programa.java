package aplicacao;

import boadgame.Board;
import boadgame.Position;
import chess.ChessMatch;

public class Programa {

	public static void main(String[] arg) {
		
	ChessMatch chessmatch = new ChessMatch();
	UI.printBoard(chessmatch.getPieces());
	
	}
}
