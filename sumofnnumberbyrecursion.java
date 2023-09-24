public class sumofnnumberbyrecursion {
    public static void main(String[] args) {
       // int n = 5;
       // int sum = 0;
        //fact(n);
        System.out.println(fact1(5));
    }

    public static int fact(int n, int sum) {
        if (n == 0) {
            return sum;
        }
         //System.out.println(n); for n to1 print number
         sum=sum+n;
        return fact(n - 1, sum );
    }
   // when we do no use extra variable
   public static int fact1(int n){
    if (n==0){
        return 0;
    }
    return n + fact1(n-1);
   }

}
