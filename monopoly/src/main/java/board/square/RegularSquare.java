package board.square;

import Player.Player;

public class RegularSquare extends Square {

    public RegularSquare(String name, int number) {
        super(name, number);
    }

    @Override
    public void landedOn(Player player) {
        // do nothing
    }
}
