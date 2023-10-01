public class CountWays
{
    public static void main(String[] args) {
        int n =4;
        System.out.println(CountWays1(n));
    }
    public static int CountWays1(int n)
    {
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        return CountWays1(n-1)+  CountWays1(n-2);
    }
}