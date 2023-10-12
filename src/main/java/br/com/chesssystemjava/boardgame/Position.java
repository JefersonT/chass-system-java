package br.com.chesssystemjava.boardgame;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Position {
    private Integer row;
    private Integer column;

    @Override
    public String toString() {
        return row + ", " + column;
    }
}
