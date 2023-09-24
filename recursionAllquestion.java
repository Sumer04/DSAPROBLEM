public class recursionAllquestion {
    public static void main(String s[])
    {
    //     int n =5;
    //     print1(n);
    //     System.out.println(sum(n));
    //     String str =  "abba";
    //     int start =0;
    //     int end = str.length()-1;
    //     System.out.println(pailindrome(str, start, end));
    int n =9987;
    System.out.println(sumofndigit(n));
    System.out.println(ropecutting(23, 11, 9, 12));
    }
    public static void  print(int n)
    {
        if(n==0)
        {
            return;
        }
        else {
            System.out.println(n);
            print(n-1);
        }
        
    }
    public static void print1(int n)
    {
        if(n==0)
        {
            return;
        }
       print1(n-1);
       System.out.println(n);
    }
    //sum of n natural number
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    // pailindrome using recursion
    public static boolean pailindrome(String str ,int start,int end)
    {
       if(start>=end)
       {
          return true;
       }
       else{
        return str.charAt(start)==str.charAt(end) && pailindrome(str, ++start, --end);
       }
    }

    // sum of digit using recursion
    public static int sumofndigit(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else{
            return n%10 + sumofndigit(n/10);
        }

    }

    // rope cutting pronlem
    public static int ropecutting(int n,int a,int b,int c)
    {
        if(n==0)
        {
            return 0;
        }
        if(n<0)
        {
            return -1;
        }
        int x  = ropecutting(n-a, a, b, c);
        int y =ropecutting(n-b, a, b, c);
        int z = ropecutting(n-c, a, b, c);
        int res = Math.max(x,Math.max(y,z));
        if(res==-1)
        {
            return -1;
        }
        return res + 1;
    }
    
}
