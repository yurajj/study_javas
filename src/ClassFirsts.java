public class ClassFirsts {
    public int second = 0 ; // 바깥으로 나와있는 변수 앞에는 public을 붙여준다. 

    ClassFirsts() {
        System.out.println();
    }
    ClassFirsts(int first){
        this.second = first ;
        System.out.println(first);
    }

    public int getsecond() {
        return this.second ;
    }

}

