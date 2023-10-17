package br.com.chesssystemjava;

import br.com.chesssystemjava.chess.ChessMatch;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChessSystemJavaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ChessSystemJavaApplication.class, args);
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
