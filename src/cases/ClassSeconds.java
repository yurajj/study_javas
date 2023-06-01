package cases;

public class ClassSeconds {
    public int third = 0 ; 
    public ClassSeconds(){

    }
    public ClassSeconds(int first) {
        this.third = first ;
        System.out.println(first);
    }

    public int getthird() {
        return this.third ;
    }
}
