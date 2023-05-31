import java.util.Scanner;

public class MethodsIfs {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }

    public String todayTime (int time) {
        String timeIs = "" ;
        try {
            // int time = 1; 
                if (time<=12 && time>=1) {
                    timeIs = "Morning." ;
                }   
                else if (time<=18 && time>=13) {
                    timeIs = "afternoon." ;
                }   
                else if (time>=19 && time<=24) {
                    timeIs = "night." ;
                }
        } catch (Exception e) {
            // TODO : handle exception 
        }
        return timeIs ;
    }


    public static void main(String[] args) {

        try {
            Scanner times = new Scanner(System.in);

            while (true) {
                System.out.println("time (1~24) : " ) ;
                int time = times.nextInt();

                MethodsIfs methodsIfs = new MethodsIfs() ;
                String timeIs = methodsIfs.todayTime(time);

                System.out.println(timeIs);
                // System.out.println("계속 하시겠습니까? (0:종료): ");
                

                if (time == 0 || time >= 25)
                        System.out.println("Error. End.");
                        break ;
         

                
            }
            System.out.println() ;
            times.close();
          

        } catch (Exception e) {
            // TODO : handle exception
        }
        // return 0;
    }
}