package aplicacao;

import chess.ChessMatch;

public class Programa {

	public static void main(String[] arg) {
		
	ChessMatch chessmatch = new ChessMatch();
	UI.printBoard(chessmatch.getPieces());
	
	}
}
