import java.util.*;

public class GenerateNums {
    public static final int LENGTH = 3;

    public static List<Integer> generateRandNums() {
        Set<Integer> nums = new HashSet<>();

        while (nums.size() < 3) {
            nums.add(new Random().nextInt(9) + 1);
        }
        return new ArrayList<>(nums);
    }

    public static List<Integer> intToList(int val) {
        int tmp = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < LENGTH; i++) {
            tmp = val % 10;
            list.add(tmp);
            val /= 10;
        }
        return list;
    }

}
