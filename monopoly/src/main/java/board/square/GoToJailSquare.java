package board.square;

import Player.Player;

public class GoToJailSquare extends Square {

    public GoToJailSquare() {
        super("Go To Jail", 29);
    }

    @Override
    public void landedOn(Player player) {
        player.getPiece().setLocation(JailSquare.getInstance());

        System.out.println(player + " goes to Jail");
    }
}
