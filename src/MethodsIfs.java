import java.util.Scanner;

public class MethodsIfs {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }

    public String todayTime (int time) {
        try {
            // int time = 1; 
                if (time<=12 && time>=0) {
                    System.out.println("오전입니다.");
                }   
                else if (time<=18 && time>=13) {
                    System.out.println("오후입니다.");
                }   
                else {
                    System.out.println("밤입니다.");
                }
        } catch (Exception e) {
            // TODO : handle exception 
        }
        return "";
    }


    public static void main(String[] args) {
        try {
            
            // int day = 4;  // 1~4 가능 
            // String str = "";

            // MethodSwitchs methodSwitchs = new MethodSwitchs() ;
            // String returnResult = methodSwitchs.today(day);

            // System.out.println(returnResult);


            int time = 0 ;
            Scanner times = new Scanner(System.in);
            time = times.nextInt();

            MethodsIfs methodsIfs = new MethodsIfs() ;
            int returnTimes = methodsIfs.todayTime(int time);


            while ( timeS <)
            System.out.println() ;
            
          

        } catch (Exception e) {
            // TODO : handle exception
        }
        // return 0;
    }
}
