public class JailSquare extends RegularSquare {
    private static JailSquare instance;

    private JailSquare(int number) {
        super("Jail", number);
    }

    public static JailSquare getInstance() {
        if (instance == null) {
            throw new NullPointerException("square number not initialise for Jail");
        } else {
            return instance;
        }
    }

    public static Square createJailSquare(int number) {
        instance = new JailSquare(number);
        return instance;
    }
}
