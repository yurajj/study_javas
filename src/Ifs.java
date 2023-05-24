public class Ifs {
    
    public static void main(String[] args) {
       // if (condition) {
       //   }  else {  * else의 경우 yes만 있을 경우 생략가능 *
       // } -> if문 기본값
        
       int first = 20, second = 18 ;

        if (first > second) {
            System.out.println(first);
        }

        // 12시 이전 오전, 18시 이전 오후, 24시까지 밤
     
        int time = 1; 
        if (time<=12 && time>=0) {
            System.out.println("오전입니다.");
        }   
        else if (time<=18 && time>=13) {
            System.out.println("오후입니다.");
        }   
        else {
            System.out.println("밤입니다.");
        }

        
        System.out.println();
        // return 0;
    }
}
