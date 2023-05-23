public class SetAndGetVariable {
    public static void main(String[] args) {
    
        int q=200, w=30, e=50, r=10, t=5 ;

        int a=1, b=3, c=5, d=7 ;

        if(b==3) {
            a=r;
        }   else {
            c=t;
        } 
        
        if(d!=9) {
            b=t;
        }   else {
            b=q;
        }

        if(a==10) {
            c=e;
        }   else {
            d=w;
        }
    
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
