public class sumofdigitrecursion {
    public static void main(String[] args) {
        int n=34567;
       System.out.println(sumrecursion(n));
    }
    // sum of digit number 
    public static int recursion(int n){
        int sum =0;
        while(n>0){
            int digit=n%10;
            n =n/10;
            sum =sum+digit;
        }
        return sum;
    }
    // sum of digit number by recursion
    public static int sumrecursion(int n){
   if(n==0){
    return 0;
   }

        return n%10+sumrecursion(n/10);


    }
}
