package study;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    String s = "2 + 3 * 4 / 2";

    @Test
    void operationTest() {
        String[] values = this.s.split(" ");
        assertThat(values).containsExactly("2", "+", "3", "*", "4", "/", "2");

        List<String> num = new ArrayList<>();
        List<String> operation = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 1) operation.add(values[i]);
            else if (i % 2 == 0) num.add(values[i]);
        }
        assertThat(num).containsExactly("2", "3", "4", "2");
        assertThat(operation).containsExactly("+", "*", "/");

        int answer = Integer.parseInt(num.get(0));
        for (int i = 1; i < num.size(); i++) {
            if (operation.get(i - 1).equals("+")) answer += Integer.parseInt(num.get(i));
            else if (operation.get(i - 1).equals("-")) answer -= Integer.parseInt(num.get(i));
            else if (operation.get(i - 1).equals("*")) answer *= Integer.parseInt(num.get(i));
            else if (operation.get(i - 1).equals("/")) answer /= Integer.parseInt(num.get(i));
        }
        assertThat(answer).isEqualTo(10);
    }
}
