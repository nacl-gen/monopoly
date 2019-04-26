public enum Piece {
    DOG("Dog"),
    THIMBLE("Thimble"),
    HAT("Hat"),
    SHOES("Shoes"),
    CAR("car"),
    IRON("iron"),
    BOOT("Boot"),
    CAT("Cat");

    private String name;
    private Square location;
    private boolean disponibility=false;

    Piece(String name) {
        this.name = name;
    }

    public static Piece takePiece() {
        for (Piece piece : Piece.values()){
            if (!piece.disponibility){
                piece.disponibility=true;
                return piece;
            }
        }
        return null;
    }

    public void setLocation(Square location) {
        this.location = location;
    }

    public Square getLocation() {
        return location;
    }

    public void realsePiece(){
        disponibility=false;
    }

    @Override
    public String toString() {
        return name;
    }
}
