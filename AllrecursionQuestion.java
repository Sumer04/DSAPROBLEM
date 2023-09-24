public class AllrecursionQuestion {
    public static void main(String[] args) {
      //  int n =1234;
       // System.out.println(countdigit(n));
       // System.out.println(sumofdigit(n));
       // System.out.println(sumofNnumber(4));
       //System.out.println(fibonaci(20));
    //    System.out.println(Thesequence(2));
    //    System.out.println(findncr(5, 2));
       int arr[] = {1,2,3,4,5};
       int n =5;
      recursion(n, arr);
    }
    public static int countdigit(int n)
    {
        if(n/10==0)
        {
            return 1;
        }
            return 1+countdigit(n/10);
        
    } 
    //sum of digit  
    public static int sumofdigit(int n)
    {
        if(n%10==0)
        {
            return 0;
        }
        return n%10 + sumofdigit(n/10);
    } 
    // sum of N number
    public static int sumofNnumber(int n)
    {
        if(n==1)
        {
            return 1;

        }
        return n + sumofNnumber(n-1);
    }
    // fibonaci number
    public static int fibonaci(int n)
    {
       if(n==1)
       {
        return 1;
       }
       if(n==0)
       {
        return 0;
       }
        return  fibonaci(n-1) + fibonaci(n-2);
    }
    // the sequence
    public static int Thesequence(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n+n*Thesequence(n-1);
    }
    // find ncr 
    public static int findncr(int n,int r)
    {
        if(n==r || r==0)
        {
            return 1;
        }
        return findncr(n-1,r-1) + findncr(n-1, r);

    }
    // array element print using recursion
    public static void recursion(int n,int arr[])
    {
        if(n<=0)
        {
            return;
        }
        recursion(n-1, arr);
        System.out.println(arr[n-1]);
    }
}

