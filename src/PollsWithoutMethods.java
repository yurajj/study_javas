import java.util.Arrays;
import java.util.Scanner;

public class PollsWithoutMethods {
    private int[] scores = new int[4];
    private Scanner scanner = new Scanner(System.in);

    public int getScore() {
        int score = -1;
        while (score < 1 || score > 4) {
            System.out.println("(1) 전혀 아니다 (2) 아니다 (3) 그렇다 (4) 완전 그렇다.");
            score = scanner.nextInt();
            if (score < 1 || score > 4) {
                System.out.println("1부터 4까지의 숫자 중 하나를 선택해주세요.");
            }
        }
        return score;
    }

    public void Que() {
        System.out.println("1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?");
        scores[0] = getScore();

        System.out.println("2. 강의의 내용은 체계적이고 성의있게 구성되었는가?");
        scores[1] = getScore();

        System.out.println("3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?");
        scores[2] = getScore();

        System.out.println("4. 강의 진행 속도는 적절하였는가?");
        scores[3] = getScore();
    }

    public static void main(String[] args) {
        PollsWithoutMethods pollInitailArray = new PollsWithoutMethods();
        pollInitailArray.Que();

        int[] scores = pollInitailArray.scores;
        System.out.println("평가 점수: " + Arrays.toString(scores));
    }
}