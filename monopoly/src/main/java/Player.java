public class Player {
    private String name;
    protected Piece piece;
    private int cash;

    public Player(String name) {
        this.name = name;
        this.piece = Piece.takePiece();
    }

    public void takeTurn() {
        Cup cup = Cup.getInstance();
        //roll the dice
        cup.roll();
        //take the total
        int total = cup.getTotal();


        // System.out.println(name + " is on : " + piece.getLocation().getName());
        System.out.println(name + " got a " + cup.getDice()[0].getFaceValue() + " and a " + cup.getDice()[1].getFaceValue());

        Square oldLocation = piece.getLocation();
        Square newLocation = Board.getInstance().getSquare(oldLocation, total);

        piece.setLocation(newLocation);

        System.out.println(name + " is now on : " + piece.getLocation().getName() + "\n");
    }

    public void releasePiece() {
        Piece.release(this.piece);

        piece = null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void addCash(int cash) {
        this.cash += cash;
    }

    public boolean reduceCash(int cash) {
        if (this.cash > cash) {
            this.cash -= cash;
            return true;
        } else {
            return false;
        }

    }

    public int getNetWorth() {
        return cash;
    }

}
