package br.com.chesssystemjava.chess.pieces;

import br.com.chesssystemjava.boardgame.Board;
import br.com.chesssystemjava.chess.ChessPiece;
import br.com.chesssystemjava.chess.Color;


public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
