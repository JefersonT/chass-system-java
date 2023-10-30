package br.com.chesssystemjava;

import br.com.chesssystemjava.chess.ChessException;
import br.com.chesssystemjava.chess.ChessMatch;
import br.com.chesssystemjava.chess.ChessPiece;
import br.com.chesssystemjava.chess.ChessPosition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class ChessSystemJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessSystemJavaApplication.class, args);
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		while (true) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMatch);
				System.out.println();
				System.out.println("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);

				System.out.println();
				System.out.println("Target: ");
				ChessPosition target = UI.readChessPosition(sc);


				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}
	}



}
