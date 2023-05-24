public class MakingGamebyOneHand {
    public static void main(String[] args) {
        int Q1;
        int Q2;
        int Q3;

        Q1 = 1 ;
        Q2 = 2 ;
        
        System.out.println(Q1) ;
        System.out.println(Q2) ;

        Q3 = Q1 ;
        Q1 = Q2 ;
        Q2 = Q3 ;

        System.out.println(Q1) ;
        System.out.println(Q2) ;

        // return 0;
    }
}