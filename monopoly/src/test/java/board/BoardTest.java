package board;

import board.square.GoSquare;
import board.square.RegularSquare;
import board.square.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {


    @Test
    void getSquareNumberAndName() {
        Board board = Board.getInstance();

        for (int i = 0; i < 40; ++i) {
            if(i == 0) {
                assertEquals("Go", board.getSquare(i).getName());
                assertEquals(i, board.getSquare(i).getNumber());
            } else if(i == 4) {
                assertEquals("Income Tax", board.getSquare(4).getName());
                assertEquals(4, board.getSquare(4).getNumber());
            } else if(i == 9) {
                assertEquals("Jail", board.getSquare(9).getName());
                assertEquals(9, board.getSquare(9).getNumber());
            } else if(i == 29) {
                assertEquals("Go To Jail", board.getSquare(29).getName());
                assertEquals(29, board.getSquare(29).getNumber());
            } else {
                assertEquals("board.square.Square " + i, board.getSquare(i).getName());
                assertEquals(i, board.getSquare(i).getNumber());
            }
        }
    }

    @Test
    void getSquareGo() {
        Board board = Board.getInstance();

        assertEquals("Go", board.getSquare(0).getName());
        assertEquals(0, board.getSquare(0).getNumber());
    }

    @Test
    void getSquareNumberWithAdvancement() {
        Board board = Board.getInstance();

        Square old0 = new GoSquare();
        Square old38 = new RegularSquare("board.square.Square 38", 38);

        // normal case
        assertEquals(board.getSquare(old0, 10).getName(), "board.square.Square 10");
        // (38 + 2) % 40 = 0 (Go)
        assertEquals(board.getSquare(old38, 2).getName(), "Go");
        // (38 + 3) % 40 = 1
        assertEquals(board.getSquare(old38, 3).getName(), "board.square.Square 1");
    }
}