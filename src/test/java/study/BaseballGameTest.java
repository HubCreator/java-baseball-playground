package study;

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
    void howManyMatchTest() {
        List<Integer> entry = new ArrayList<>();
        entry.add(2);
        entry.add(6);
        entry.add(3);

        String value1 = "214"; // 1스트라이크
        String value2 = "213"; // 2스트라이크
        String value3 = "613"; // 1볼 1스트라이크
        String value4 = "145"; // 낫싱

        assertThat(howManyMatch(entry, value1)).containsExactly(0, 1);
        assertThat(howManyMatch(entry, value2)).containsExactly(0, 2);
        assertThat(howManyMatch(entry, value3)).containsExactly(1, 1);
        assertThat(howManyMatch(entry, value4)).containsExactly(0, 0);
    }

    /**
     *
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