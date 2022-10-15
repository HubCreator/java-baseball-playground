import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> com;
        Balls comBalls;
        int val = 0;

        while (val != 2) {
            com = GenerateNums.generateRandNums(); // computer가 세 자리 랜덤 넘버 생성
            comBalls = new Balls(com);
            playGame(scanner, comBalls);
            val = reGameOrNot(scanner);
        }
    }

    private static int reGameOrNot(Scanner scanner) {
        System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. : ");
        return scanner.nextInt();
    }

    private static void playGame(Scanner scanner, Balls comBalls) {
        PlayResult result = new PlayResult(0, 0);
        do {
            System.out.print("숫자를 입력해주세요 : ");
            int val = scanner.nextInt();
            System.out.println("val = " + val);
            if (!ValidationUtils.validNums(val)) continue;
            result = comBalls.play(GenerateNums.intToList(val));
            System.out.println(result.getResult());
        } while (result.getStrike() < 3);
    }
}
