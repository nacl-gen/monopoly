public class Board {
   private Square[] squares = new Square[40];

   private static Board instance;

    private Board () {

        squares[0] = new Square("Go", 0);

        for (int i = 1; i < 40; ++i) {
            squares[i] = new Square("Square " + i, i);
        }
    }

    public static Board getInstance() {

        if (instance == null) {
            instance = new Board();
        }

        return instance;
    }

    public Square getSquare(int number) {
        return squares[number];
    }
    public Square getSquare(Square oldLocation, int advancement) {
        return squares[(oldLocation.getNumber() + advancement) % 40];
    }
}
