package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;


class BaseballGameTest {


    @Test
    void getThreeRandomNumsTest() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 3) {
            set.add(new Random().nextInt(9) + 1);
        }

        for (Integer x : set)
            assertThat(x).isBetween(1, 9);

        assertThat(set.size()).isEqualTo(3);
    }

    @Test
    void howManyMatchAndPrintResultTest() {
        List<Integer> entry = new ArrayList<>();
        entry.add(2);
        entry.add(6);
        entry.add(3);
        String value1 = "214"; // 1스트라이크
        String value2 = "213"; // 2스트라이크
        String value3 = "613"; // 1볼 1스트라이크
        String value4 = "145"; // 낫싱

        int[] res1 = howManyMatch(entry, value1);
        int[] res2 = howManyMatch(entry, value2);
        int[] res3 = howManyMatch(entry, value3);
        int[] res4 = howManyMatch(entry, value4);

        assertThat(res1).containsExactly(0, 1);
        assertThat(printResult(res1)).isEqualTo("1스트라이크");

        assertThat(res2).containsExactly(0, 2);
        assertThat(printResult(res2)).isEqualTo("2스트라이크");

        assertThat(res3).containsExactly(1, 1);
        assertThat(printResult(res3)).isEqualTo("1볼 1스트라이크");

        assertThat(res4).containsExactly(0, 0);
        assertThat(printResult(res4)).isEqualTo("낫싱");
    }

    private String printResult(int[] result) {
        if (result[0] == 0 && result[1] == 0) return "낫싱";
        else if (result[0] == 0 && result[1] > 0) return result[1] + "스트라이크";
        else if (result[0] > 0 && result[1] == 0) return result[0] + "볼";
        else if (result[0] > 0 && result[1] > 0) return result[0] + "볼 " + result[1] + "스트라이크";
        return null;
    }

    /**
     * @param entry
     * @param value
     * @return 볼과 스트라이크 순서대로 배열 반환
     */
    private int[] howManyMatch(List<Integer> entry, String value) {
        int strike = 0, contains = 0;
        for (int i = 0; i < value.length(); i++) {
            int t = Integer.parseInt(String.valueOf(value.charAt(i)));
            if (entry.get(i) == t) strike++;
            if (entry.contains(t)) contains++;
        }
        return new int[]{contains - strike, strike};
    }
}