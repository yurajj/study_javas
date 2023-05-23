public class TypeCasting {

    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
    
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
            // int 정수만, 크기가 맞지 않아 DOUBLE의 소수점이 불가능함
            // return 0; 
    }
}
