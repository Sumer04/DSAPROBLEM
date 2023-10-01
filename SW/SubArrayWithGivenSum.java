import java.util.ArrayList;

public class SubArrayWithGivenSum
{
    public static void main(String[] args) {
        int arr[] =  {1,2,3,7,5};
        int target =12;
       System.out.println(SubSum(arr,target));
    }
    public static ArrayList<Integer> SubSum(int arr[],int target)
    {
       ArrayList<Integer> p = new ArrayList<>();
       int sum =0;
       int l =0;
      
       for(int i =0; i<=arr.length-1; i++)
       {
         sum  = sum +arr[i];
         while(sum>target)
         {
            sum  = sum -arr[l];
            l++;
         }
         if(sum==target)
         {
            
            p.add(l+1);
            p.add(i+1);
            return p;
         }

       }
       p.add(-1);
      return p;
    }
}