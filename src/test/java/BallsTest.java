import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class BallsTest {

    Balls com;

    @BeforeEach
    void init() {
        com = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void nothing() {
        PlayResult result = com.play(Arrays.asList(4, 5, 6));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    void one_ball() {
        PlayResult result = com.play(Arrays.asList(4, 5, 1));
        assertThat(result.getBall()).isEqualTo(1);
        assertThat(result.getStrike()).isEqualTo(0);
    }

    @Test
    void one_strike() {
        PlayResult result = com.play(Arrays.asList(1, 5, 6));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(1);
    }

    @Test
    void two_ball_one_strike() {
        PlayResult result = com.play(Arrays.asList(1, 3, 2));
        assertThat(result.getBall()).isEqualTo(2);
        assertThat(result.getStrike()).isEqualTo(1);
    }

    @Test
    void three_strike() {
        PlayResult result = com.play(Arrays.asList(1, 2, 3));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(3);
    }
}
