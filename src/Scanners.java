import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); // 입력을 받는 준비하는 코드
        // System.out.println("Enter username");

        // String userName = myObj.nextLine(); // 실제로 입력을 받는 코드 
        // System.out.println("Username is: " + userName); 
        
        

        int first = 0 ;
        int second = 0 ;
        first = myObj.nextInt();
        second = myObj.nextInt();
        System.out.println(first + second) ;

        myObj.close();
        // return 0;
    }
    
}
