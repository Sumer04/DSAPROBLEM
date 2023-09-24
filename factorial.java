public class factorial {
    public static void main(String s[]){
        
    
        System.out.println(fact(5));
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
            // fsctorial 0 and 1 value is 1
        }
     
        return n*fact(n-1);
    }
}
