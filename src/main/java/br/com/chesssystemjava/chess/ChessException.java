package br.com.chesssystemjava.chess;

import br.com.chesssystemjava.boardgame.Boardxception;

public class ChessException extends Boardxception {

    public ChessException(String message) {
        super(message);
    }
}
