import java.util.Objects;

public class Ball {
    private final int index;
    private final int no;

    public Ball(int position, int ballNo) {
        this.index = position;
        this.no = ballNo;
    }

    public BallStatus play(Ball user) {
        if (this.equals(user)) {
            return BallStatus.STRIKE;
        }
        if (this.no == user.no) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return index == ball.index && no == ball.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, no);
    }
}
