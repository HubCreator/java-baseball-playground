
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] values = value.split(" ");

        List<Integer> num = new ArrayList<>();
        List<String> operation = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 1) operation.add(values[i]);
            else if (i % 2 == 0) num.add(Integer.parseInt(values[i]));
        }

        int answer = num.get(0);
        for (int i = 1; i < num.size(); i++) {
            if (operation.get(i - 1).equals("+")) answer += num.get(i);
            else if (operation.get(i - 1).equals("-")) answer -= num.get(i);
            else if (operation.get(i - 1).equals("*")) answer *= num.get(i);
            else if (operation.get(i - 1).equals("/")) answer /= num.get(i);
        }

        System.out.println("answer = " + answer);
    }
}
