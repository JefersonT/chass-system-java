package br.com.chesssystemjava.chess;

import br.com.chesssystemjava.boardgame.Board;
import br.com.chesssystemjava.boardgame.Piece;
import lombok.Getter;
import lombok.Setter;

public abstract class ChessPiece extends Piece {

    @Getter @Setter
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

}
