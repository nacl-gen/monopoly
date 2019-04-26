import java.util.ArrayList;

public class Board {
   Square[] squares = new Square[40];

    Board(){
        System.out.println(squares);
    }


    public Square getSquare(int position) {
        return squares[position];
    }
}
