import cases.ClassSeconds;

public class ClassMains {

    public static void main(String[] args) {
        try {

            ClassFirsts classFirsts = new ClassFirsts();
            ClassFirsts classFirstsWithVar = new ClassFirsts(5);
            int second = classFirstsWithVar.getsecond();
            ClassSeconds classSeconds = new ClassSeconds(6);

            System.out.println();

        } catch (Exception e) {
            // TODO~
        }
        // return 0;
    }
    
}
