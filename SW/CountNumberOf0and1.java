import java.util.HashMap;
import java.util.HashSet;

public class CountNumberOf0and1 {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1};
        System.out.println(maxlength(arr));
    }
    public static int maxlength(int arr[])
    {
        // count the total no. of subarray including 0 and 1
   
    HashMap<Integer,Integer> mp  = new HashMap<>();
    int sum =0;
    int max=0;
    mp.put(0,-1);
    for(int i=0; i<=arr.length-1; i++)
    {
        if(arr[i]==0)
        {
            sum =sum-1;
        }else{
            sum =sum+1;
        }
        if(mp.containsKey(sum))
        {
            max  = Math.max(max, i-mp.get(sum));
        }
        else{
            mp.put(sum,i);
        }
    }
    return max;
    }
}
