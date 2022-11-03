import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidationUtil {
//    public static boolean isValid(int val) {
//        if (!isSizeOfThree(val)) {
//            return false;
//        }
//        return true;
//    }

    public static boolean isValidRange(int val) {
        return val >= 1 && val <= 9;
    }

    public static boolean isSizeOfThree(List<Integer> list) {
        return list.size() == 3;
    }

    public static boolean hasDuplicatedNum(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set.size() == list.size();
    }
}
