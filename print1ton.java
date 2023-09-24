public class print1ton {
    public static void main(String args[]){
       print1Ton(10);
    }
    public static void print1Ton(int n){
        if(n<=0){
            return;
            
        }
       // System.out.println(n);
        print1Ton(n-1);
        System.out.println(n);

    }


}
