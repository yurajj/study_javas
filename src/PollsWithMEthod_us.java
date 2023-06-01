import pollsus.PollScanner;
import pollsus.PollStatistics;
import pollsus.PollnitailArrays;

public class PollsWithMEthod_us {
    

    public static void main(String[] args) {
        try {
            
            String[] answers ;
            String[][] polls;
            
            PollnitailArrays pollnitailArrays = new PollnitailArrays();
            polls = pollnitailArrays.init() ;   // 설문 내용 초기화

            PollScanner pollScanner = new PollScanner();
            answers = pollScanner.pollWithAnswers(polls);

            PollStatistics pollStatistics = new PollStatistics();
            pollStatistics.printAnswers(answers) ;

        } catch (Exception e) {
            // TODO ~
        }
        // return 0;
    }
}
