public class PlayResult {
    private int strike = 0;
    private int ball = 0;

    public PlayResult() {
    }

    public PlayResult(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }


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

    public String getResult() {
        if (ball > 0) {
            return ball + "볼 ";
        } else if (strike > 0) {
            return strike + "스트라이크";
        }
        return "낫싱";
    }
}
