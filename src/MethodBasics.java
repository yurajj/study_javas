public class MethodBasics {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // x에 +1

        public int F(int x) // x = 0
        {
        int result = x + 1;
        return result;
        }
    
    
        public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 + 1
            // y = F(x);
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.F(x);

            y = y + 1; // 변수에 + 1
            MethodBasics methodBasics_first = new MethodBasics();
            y = methodBasics_first.F(y);  // F(0)
            y = methodBasics_first.F(y);  // F(0)

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}



// public class MethodBasics {
//     // <access_modifier> <return_(data)type> <method_name>( list_of_parameters)
//     // {
//     // //body
//     // }
//     // x에 1을 더하기
    
//     public int F(int x) {
//         int result = x + 1;
//         return result;
//     }

//     // public int G(int y) {
//     //    int result = y + 1 ;
//     //    return result ; 
//     //}

     

//     public static void main(String[] args) {
//         try {
//             int x = 4;
//             int y = 0;
//             // y=x+1 ; // 변수에 +1
                        
//             MethodBasics methodbasics = new MethodBasics();
//             y = methodbasics.F(x) ;    // 이 변수를 클론을 해왔기 때문에 methodbasics 클론과 같음 모든 function을 사용할 수 있음. 
//             // y = F(x);          


//             // MethodBasics methodBasics2 = new MethodBasics() ;
//             // y = methodBasics2.G(y) ;
//             // y = y + 1; // 변수에 + 1

//             // y = y + 1 ;
//             MethodBasics methodBasics_first = new MethodBasics();
//             // y = methodBasics_first.F(0) ; // F(0)
//             y = methodBasics_first.F(y) ;
//             System.out.println(y);

//         } catch (Exception e) {
//             // TODO: handle exception
//         }

//         System.out.println();
//         // return 0;
//     }

// }



