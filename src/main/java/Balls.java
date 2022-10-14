import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> answers;

    public Balls(List<Integer> balls) {
        this.answers = integerToBall(balls);
    }

    private List<Ball> integerToBall(List<Integer> balls) {
        List<Ball> answer = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            answer.add(new Ball(i + 1, balls.get(i)));
        }
        return answer;
    }

    public BallStatus play(Ball userBall) {
        return answers.stream()
                .map((answer) -> answer.play(userBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public PlayResult play(List<Integer> balls) {
        Balls userBalls = new Balls(balls);
        PlayResult result = new PlayResult();
        for (Ball answer : answers) {
            BallStatus status = userBalls.play(answer);
            result.report(status);
        }
        return result;
    }
}
