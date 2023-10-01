import java.util.HashSet;

public class MaxiMumAndMinimumOFeveryWindowOfSizek {
    public static void main(String[] args) {
        int arr[] ={10,20,30,50,10,70,30};
        int N =7;
    }
    static int[] maxOfMin(int[] arr, int n) 
    {
        int max =0;
        for(int i=0; i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        
        }
        System.out.println(max);
       int i =0;
       int start =1;
       while(i<n)
       {
            start = i+start;
            HashSet<Integer> mpp = new HashSet<>();
            for(int j=0; j<n;j++)
            {
                   if(arr[j]<arr[start])
                   {
                    mpp.add(arr[j]);
                   }
                   else{
                    mpp.add(arr[start]);
                   }
            }
            
       }
    }
}
