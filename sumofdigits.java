public class sumofdigits {
    public static void main(String[] args) {
        int n =56789;
        System.out.println(sumOfDigits(n));
    }
    public static int sumOfDigits(int n){
        while(n<=0){
            return 0;
        }
        return n%10 +sumOfDigits(n/10);
    }
    
}
