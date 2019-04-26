public enum Piece {
    DOG("Dog"),
    THIMBLE("Thimble"),
    HAT("Hat"),
    SHOES("Shoes"),
    CAR("Car"),
    IRON("Iron"),
    BOOT("Boot"),
    CAT("Cat");

    private String name;
    private Square location;
    private boolean availability = true;

    Piece(String name) {
        this.name = name;
    }

    public static Piece takePiece() {
        for (Piece piece : Piece.values()){
            if (piece.availability){
                piece.availability = false;
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

    @Override
    public String toString() {
        return name;
    }
}
