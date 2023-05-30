public class MethodBasics {
    // <access_modifier> <return_(data)type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // x에 1을 더하기
    
    public int F(int x) {
        int result = x + 1;
        return result;
    }

    public int G(int y) {
        int result = y + 1 ;
        return result ; 
    }

    public static void main(String[] args) {
        try {
            int y = 4;
            int x = 0;
            // y=x+1 ; // 변수에 +1
                        
            MethodBasics methodbasics = new MethodBasics();
            y = methodbasics.F(x) ;    // 이 변수를 클론을 해왔기 때문에 methodbasics 클론과 같음 모든 function을 사용할 수 있음. 
            // y = F(x);          


            MethodBasics methodBasics2 = new MethodBasics() ;
            y = methodBasics2.G(y) ;
            //y = y + 1; // 변수에 + 1

        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println();
        // return 0;
    }

}