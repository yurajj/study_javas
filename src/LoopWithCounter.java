public class LoopWithCounter {

    public static void main(String[] args) {

        int rc=5, num=1, ct=1 ;

        while( ct <= rc ) {
            System.out.println(num) ;
            ct = ct + 1 ;
            num = num + 1 ;
        }

        System.out.println("End") ;

        // return 0;
    }
    
}
