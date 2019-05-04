package board.square;

import Player.Player;

public abstract class Square {
    private String name;
    private int number;

    public Square(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }

    public abstract void landedOn(Player player);
}

