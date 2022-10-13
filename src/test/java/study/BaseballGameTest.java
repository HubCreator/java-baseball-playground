package study;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;


class BaseballGameTest {

    @Test
    void getThreeRandomNums() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 3) {
            set.add(new Random().nextInt(9) + 1);
        }

        for (Integer x : set)
            assertThat(x).isBetween(1, 9);

        assertThat(set.size()).isEqualTo(3);
    }
}