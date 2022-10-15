import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidationUtils {

    public static final int MAX = 9;
    public static final int MIN = 1;
    public static final int LENGTH = 3;
    public static final Set<Integer> set = new HashSet<>();

    public static boolean validNum(int no) {
        return no >= MIN && no <= MAX;
    }

    public static boolean validNums(int nums) {
        if ((int) Math.log10(nums) != LENGTH - 1) { // 자릿수 체크
            return false;
        }
        set.clear();
        int tmp = 0;
        for (int i = 0; i < LENGTH; i++) {
            tmp = nums % 10;
            set.add(tmp);
            if (!validNum(tmp)) return false;
            nums /= 10;
        }
        return set.size() == LENGTH;
    }

    public static boolean validNums(List<Integer> nums) {
        if(nums.size() != LENGTH) return false;
        set.clear();
        for (int i = 0; i < LENGTH; i++) {
            set.add(nums.get(i));
            if (!validNum(nums.get(i))) return false;
        }
        return set.size() == LENGTH;
    }
}
