import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BallTest {

    Ball computer = new Ball(1, 3);

    @Test
    void nothingTest() {
        assertThat(computer.play(new Ball(2, 4))).isEqualTo(BallStatus.NOTHING);
        assertThat(computer.play(new Ball(1, 4))).isEqualTo(BallStatus.NOTHING);
        assertThat(computer.play(new Ball(1, 9))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ballTest() {
        assertThat(computer.play(new Ball(2, 3))).isEqualTo(BallStatus.BALL);
        assertThat(computer.play(new Ball(3, 3))).isEqualTo(BallStatus.BALL);
        assertThat(computer.play(new Ball(4, 3))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strikeTest() {
        assertThat(computer.play(new Ball(1, 3))).isEqualTo(BallStatus.STRIKE);
    }
}
