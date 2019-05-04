public class IncomeTaxSquare extends Square {

    public IncomeTaxSquare() {
        super("Income Tax", 4);
    }

    @Override
    public void landedOn(Player player) {
        int money = player.getNetWorth();
        money = (int) Math.min(200, Math.round(0.1 * money));
        boolean reduced = player.reduceCash(money);

        if(!reduced) {
            // TODO make player lose
            System.out.println(player + " is bankrupt !");
        } else {
            System.out.println(player + " gives " + money + " to the bank");
        }
    }
}
