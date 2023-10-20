package br.com.chesssystemjava.chess;

import br.com.chesssystemjava.boardgame.Position;
import lombok.Getter;

@Getter
public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

    protected Position toPosition() {
        return new Position(8-row,column-'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        int row = 8 - position.getRow();
        char column = (char) ('a' - position.getColumn());
        return new ChessPosition(column, row);
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
