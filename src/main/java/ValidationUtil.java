import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidationUtil {
    public static boolean isValid(List<Integer> list) {
        if (!isValidRange(list) || !isSizeOfThree(list) || !hasDuplicatedNum(list)) {
            throw new IllegalArgumentException("잘못된 값을 입력하셨습니다.");
        }
        return true;
    }

    public static boolean isValidRange(List<Integer> list) {
        return list.size() == list.stream().filter(val -> val >= 1 && val <= 9).count();
    }

    public static boolean isSizeOfThree(List<Integer> list) {
        return list.size() == 3;
    }

    public static boolean hasDuplicatedNum(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set.size() == list.size();
    }
}
