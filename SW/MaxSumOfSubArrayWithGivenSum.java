public class MaxSumOfSubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] ={100,200,300,400};
        int k =4;
        int  N =4;
        System.out.println(MaxSumOfSubArray(arr, k, N));
    }
    public static long MaxSumOfSubArray(int arr[],int K,int N){
    // long max =0;
    
    // for(int i=0; i<=N-K; i++)
    // {
    //      long sum  =0;
    //     for(int j =i; j<i+K; j++)
    //     {
    //         sum = sum + arr[j];
    //      //   max = Math.max(sum,max);
    //     }
    //      max = Math.max(sum,max);
    // }
    // return max;
    long prefixSum  =0;
    long sum =0;
    int m =0;
    for(int i =0; i<=arr.length-1; i++)
    {
        prefixSum= prefixSum+arr[i];
        if(i>=(K-1))
        {
            sum= Math.max(prefixSum, sum);
            
            prefixSum = prefixSum-arr[m];
            m++;
        }
    }
    return sum;
}
}
