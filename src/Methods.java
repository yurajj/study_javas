public class Methods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    
    public int minus(int first, int second) {
        int result = 0;
        try {
                result = first - second ;
        } catch (Exception e) {
            // TODO : handle exception
        }
        return result;
    }
    
    public int add(int first, int second) {
        int result = 0;
        try {
                result = first + second ;
        } catch (Exception e) {
            // TODO : handle exception
        }
        return result ;
    }

    public static void main(String[] args) {
        // int x = 1;
        // int y = 2;

        Methods methods = new Methods();

        try {
            int x = 1;
            int y = 2;

            for (x = 1 ; x <= 18 ; x=x+1){
                x = methods.add(x, y) ;
            }  if ( y >= 18) {
                y = methods.minus(x, y);
            }
        
        
        if (y == 17) {
            System.out.println(y);


        }
            // Methods methods = new Methods();
            // y = methods.add(x, y) ;

            // x = x+1;
            // y = y+1;
            // y = methods.add(x, y) ;



            // Methods methodss = new Methods();
            // y = methodss.minus(x, y);

        } catch (Exception e) {
            // TODO : handle exception
        }
        System.out.println();
        // return 0;
    }
    
}
