public class PlayResult {
    private int strike = 0;
    private int ball = 0;


    public int getStrike() {
        return this.strike;
    }

    public int getBall() {
        return this.ball;
    }

    public void report(BallStatus status) {
        if (status.isBall()) ball += 1;
        if (status.isStrike()) strike += 1;
    }
}
