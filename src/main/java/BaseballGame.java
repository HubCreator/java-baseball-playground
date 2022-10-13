import java.util.*;
import java.util.stream.Collectors;

public class BaseballGame {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (set.size() < 3) {
            set.add(new Random().nextInt(9) + 1);
        }
        List<Integer> entry = new ArrayList<>(set);

        while (true) {
            String value = scanner.nextLine();
            int[] result = howManyMatch(entry, value);
        }
    }

    private static int[] howManyMatch(List<Integer> entry, String value) {
        return new int[]{};
    }
}
