package br.com.chesssystemjava;

import br.com.chesssystemjava.boardgame.Board;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChessSystemJavaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ChessSystemJavaApplication.class, args);
		Board board = new Board(8,8);
	}

}
