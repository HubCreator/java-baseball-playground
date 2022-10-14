import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    Ball com;

    @BeforeEach
    void init() {
        com = new Ball(1, 4);
    }

    @Test
    void nothing() {
        Ball user = new Ball(2, 1);
        BallStatus status = com.play(user);
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        Ball user = new Ball(2, 4);
        BallStatus status = com.play(user);
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        Ball user = new Ball(1, 4);
        BallStatus status = com.play(user);
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }
}
