public class IncomeTaxSquare extends Square {

    public IncomeTaxSquare() {
        super("Income Tax", 4);
    }

    @Override
    public void landedOn(Player player) {
        int money = player.getNetWorth();
        money = (int) Math.min(200, Math.floor(0.1 * money));

        player.reduceCash(money);

        System.out.println(player + " gives " + money + " to the bank");
    }
}
