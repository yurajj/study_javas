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
<<<<<<< HEAD
                    timeIs = "Morning." ;
                }   
                else if (time<=18 && time>=13) {
                    timeIs = "afternoon." ;
                }   
                else if (time>=19 && time<=24) {
                    timeIs = "night." ;
=======
                    timeIs = "오전입니다." ;
                }   
                else if (time<=18 && time>=13) {
                    timeIs = "오후입니다." ;
                }   
                else if (time <=19 && time >=24) {
                    timeIs = "밤입니다." ;
>>>>>>> 7eecc6fb4e378520b0f405e3292b11c20d3e6b27
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
<<<<<<< HEAD
                System.out.println("time (1~24) : " ) ;
=======
                System.out.println("시간 입력 ( 1 ~ 24 ) : " ) ;
>>>>>>> 7eecc6fb4e378520b0f405e3292b11c20d3e6b27
                int time = times.nextInt();

                MethodsIfs methodsIfs = new MethodsIfs() ;
                String timeIs = methodsIfs.todayTime(time);

                System.out.println(timeIs);
                // System.out.println("계속 하시겠습니까? (0:종료): ");
                

<<<<<<< HEAD
                if (time == 0 || time >= 25)
                        System.out.println("Error. End.");
                        break ;
        

                
=======
                if (time == 0 && time >= 25)
                        System.out.println("잘못된 접근으로 종료합니다.");
                        break ;
        

>>>>>>> 7eecc6fb4e378520b0f405e3292b11c20d3e6b27
            }
            System.out.println() ;
            times.close();
          

        } catch (Exception e) {
            // TODO : handle exception
        }
        // return 0;
    }
}