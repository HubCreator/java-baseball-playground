public class ValidationUtil {
    public static boolean isValidInput(int val) {
        return val >= 1 && val <= 9;
    }

    public static boolean isSizeOfThree(int val) {
        return (int) Math.log10(val) + 1 == 3;
    }
}
