public class Board {
   private Square[] squares = new Square[40];

    public Board(){

        squares[0] = new Square("Go");

        for (int i = 1; i < 40; ++i) {
            squares[i] = new Square("Square " + i);
        }
    }


    public Square getSquare(int position) {
        return squares[position];
    }
}
