public class pailindrome {
    public static void main(String[] args) {
        int n = 56789;
        inttoString(n);
       
    }
    // when we solve integer pailindrom question we convert integer in to string 

    public static void inttoString(int n) {
        String s = Integer.toString(n);
        int start = 0;
        int end = s.length() - 1;

        System.out.println(checkpilindrome(s, start, end));
        
    }

    public static boolean checkpilindrome(String s,int start ,int end ){
                
        if(start>=end){
                    return true;
                }
        return  (s.charAt(start)==s.charAt(end))  && checkpilindrome(s,start+1 ,end-1);
        
    }

}
