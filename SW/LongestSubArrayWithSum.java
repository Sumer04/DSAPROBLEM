import java.util.HashMap;

public  class LongestSubArrayWithSum{
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int target =15;
        System.out.println(lenOfLongSubarr(arr, target));
    }
    public static int lenOfLongSubarr(int arr[] ,int k)
    {
      //  this is optimal approach when we do not have any negative number 
      // int left =0;
      // int right =0;
      // int sum = arr[0];
      // int len =0;
      // while(right<arr.length)
      // {
      //   while(left<=right && sum>target)
      //   {
      //     sum =sum-arr[left];
      //     left++;
      //   }
      //   if(sum==target)
      //   {
      //     len = Math.max(len,right-left+1);
      //   }
      //   right++;
      //   if(right<arr.length)
      //   {
      //     sum =sum + arr[right];

      //   }
      // }
      // return len;

      // for negative number we use hashing
        int len = 0;
        int sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                len = Math.max(len, i + 1);
            }
            
            int remain = sum - k;
            if (mp.containsKey(remain)) {
                int maxi = i- mp.get(remain);
                len = Math.max(len, maxi);
            }
            
            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }
        
        return len;
    }
    
      
    
}