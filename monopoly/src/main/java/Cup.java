
public class Cup {
    private Die[] dice;
    private static Cup instance;

    private Cup() {
        int sizeOfCup = 2;
        dice = new Die[sizeOfCup];
        for (int i = 0; i < sizeOfCup; i++) {
            dice[i] = new Die();
        }
    }

    static public Cup getInstance() {
        if (instance == null) {
            instance = new Cup();
        }
        return instance;
    }

    public void roll() {
        for (Die die : dice) {
            die.roll();
        }
    }

    public int getTotal() {
        int result = 0;
        for (Die die : dice) {
            result += die.getFaceValue();
        }
        return result;
    }

}
