import java.util.HashSet;
import java.util.Set;

public class ValidationUtil {
    public static boolean isValidRange(int val) {
        return val >= 1 && val <= 9;
    }

    public static boolean isSizeOfThree(int val) {
        return (int) Math.log10(val) + 1 == 3;
    }

    public static boolean hasDuplicatedNum(int val) {
        int size = (int) Math.log10(val) + 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(val % 10);
            val /= 10;
        }
        return set.size() == size;
    }
}
