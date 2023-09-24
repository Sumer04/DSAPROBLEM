public class toverofhanoi {
    public static void main(String args[]){
      int n=3;
      char A= 'A';
      char B='B';
      char c ='C';
      toverOfHanoi(n, A, B, c);
    }
    public static  void toverOfHanoi(int n, char A, char B,char C){
        if(n==1){
            System.out.println("move 1" +A+ "tomove"+C);
            return;
        }
        toverOfHanoi(n-1,A,C,B);
        System.out.println("move disc " +n+ +A+ "tomove" +B);
        toverOfHanoi(n-1, B, A, C);
    }
    
}
