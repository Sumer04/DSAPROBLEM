public class fibonaccirecursion {
    public static void main(String[] args) {
        int N =20;
        System.out.println(fibonacci(N));
    }
    public static int fibonacci(int N){
        if(N==0){
            return 0;
 }      if(N==1){
        return 1;
 }
         return fibonacci(N-1)+fibonacci(N-2);
    }
    
}
