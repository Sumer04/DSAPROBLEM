public class pallondrombyrecursion {
    public static void main(String[] args) {
        String  s = "abba";
        int start =0;
        int n = s.length();
         int end =n-1;
         System.out.println(booleanstr(s,start,end));
    }
    public static boolean booleanstr(String s,int start,int end){
        if(start>=end){
            return true;
        
        }
        //booleanstr(s,start++,n ,end--);
        return  (s.charAt(start)==s.charAt(end))  && booleanstr(s,start+1 ,end-1);
    }
    

    
}
