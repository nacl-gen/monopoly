package board.square;

import Player.Player;

public class GoSquare extends Square {

    public GoSquare() {
        super("Go", 0);
    }

    @Override
    public void landedOn(Player player) {
        int income = 200;
        player.addCash(income);
        System.out.println(player + " receives " + income + " from the bank");
    }
}
