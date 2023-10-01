import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeIntegerWindowOfSizeK {
    public static void main(String[] args) {
        long arr[] =  {-8,2,3,-6,10};
        int k =2;
      System.out.println(FirstNegativeWindowOfsize(arr, k));
    }
 
    
    public static long [] FirstNegativeWindowOfsize(long arr[],int k)
    {
     Queue<Long> q = new LinkedList<>();
    long result[] = new long[arr.length-k+1];
    int i=0;
    int j=0;
    int index=0;
    while(j<arr.length)
    {
        if(arr[j]<0)
        {
            q.add( arr[j]);
        }
        if(j-i+1==k)
        {
            if(q.size()==0)
            {
                result[index] = 0;
                index++;
            }else{
                result[index] = q.peek();
                index++;
                if(arr[i]==q.peek())
                {
                    q.poll();
                }
            }
            i++;
        }
        j++;

    }
    return result;
  
    }
}
