import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class BallsTest {

    Balls balls;

    @BeforeEach
    void init() {
        balls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void nothing() {
        Ball ball = new Ball(1, 5);
        BallStatus status = balls.play(ball);
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        Ball ball = new Ball(1, 2);
        BallStatus status = balls.play(ball);
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        Ball ball = new Ball(1, 1);
        BallStatus status = balls.play(ball);
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }
}
