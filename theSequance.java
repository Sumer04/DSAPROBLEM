public class theSequance {
    public static void main(String[] args) {
        System.out.println(theSequence(2));
    }
    public static int theSequence(int N){
        if(N==0){
            return 1;

        }
        return N+ N*(theSequence(N-1));
    }
    
    
}
