import java.util.*;

public class BaseballGame {
    public static void main(String[] args) {

        String startOrExit = "1";
        while (startOrExit.equals("1")) {
            Set<Integer> nums = new HashSet<>();
            Scanner scanner = new Scanner(System.in);
            getNums(nums);
            List<Integer> entry = new ArrayList<>(nums);
            int[] result = new int[2];
            logic(scanner, entry, result);
            printEndMessages();
            startOrExit = scanner.nextLine();
        }
    }

    private static void printEndMessages() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    private static void logic(Scanner scanner, List<Integer> entry, int[] result) {
        while (result[1] < 3) {
            System.out.print("숫자를 입력해 주세요 : ");
            String value = scanner.nextLine();
            result = howManyMatch(entry, value);
            printResult(result);
        }
    }

    private static void getNums(Set<Integer> nums) {
        while (nums.size() < 3) {
            nums.add(new Random().nextInt(9) + 1);
        }
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
