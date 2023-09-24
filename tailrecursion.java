public class tailrecursion {
    public static void main(String[] args) {
        
        System.out.println(fact1(5,1));
    }
    // not tail recursive 
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);

    } //tail recursive


    public static int fact1(int n ,int k){
        if(n==0||n==1){
            return k;
        }
        return fact1(n-1,k*n);

    }
    
    
}
