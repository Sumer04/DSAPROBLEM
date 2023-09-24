public class countdigit {
    public static void main(String[] args) {
       int n =99999;
       countDigits(n);
       System.out.println(countDigits(n));
    }
    public static int countDigits(int n){
        
        if(n/10==0){
            return 1;
        }
        
    // 1 + means that couunt start from count =1;
        
        return 1+countDigits(n/10);
    }
    

    
}
