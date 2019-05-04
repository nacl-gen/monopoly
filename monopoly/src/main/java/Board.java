public class Board {
   private Square[] squares = new Square[40];

   private static Board instance;

    private Board () {

        squares[0] = new GoSquare();
        squares[4] = new IncomeTaxSquare();
        squares[9] = JailSquare.createJailSquare(9);
        squares[29] = new GoToJailSquare();

        for (int i = 1; i < 40; ++i) {
            if(i != 4 && i != 9 && i != 29) {
                squares[i] = new RegularSquare("Square " + i, i);
            }
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
