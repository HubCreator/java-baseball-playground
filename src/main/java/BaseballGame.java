import java.util.*;

public class BaseballGame {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);


        while (set.size() < 3) {
            set.add(new Random().nextInt(9) + 1);
        }

        List<Integer> entry = new ArrayList<>(set);
        int[] result = new int[2];
        while (result[1] < 3) {
            System.out.print("숫자를 입력해 주세요 : ");
            String value = scanner.nextLine();
            result = howManyMatch(entry, value);
            printResult(result);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    private static void printResult(int[] result) {
        if (result[0] == 0 && result[1] == 0) System.out.println("낫싱");
        else if (result[0] == 0 && result[1] > 0) System.out.println(result[1] + "스트라이크");
        else if (result[0] > 0 && result[1] == 0) System.out.println(result[0] + "볼");
        else if (result[0] > 0 && result[1] > 0) System.out.println(result[0] + "볼 " + result[1] + "스트라이크");
    }

    private static int[] howManyMatch(List<Integer> entry, String value) {
        int strike = 0, contains = 0;
        for (int i = 0; i < value.length(); i++) {
            int t = Integer.parseInt(String.valueOf(value.charAt(i)));
            if (entry.get(i) == t) strike++;
            if (entry.contains(t)) contains++;
        }
        return new int[]{contains - strike, strike};
    }
}
