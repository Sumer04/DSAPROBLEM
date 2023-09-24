public class countBinary {
    public static void main(String[] args) {
       int  arr[] = {1,1,1,0,0,0};
       int N= arr.length;
       System.out.println(countOnes(arr, N));
      
    }
    public static int countOnes(int arr[],int N){
        int start =0;
        int end = N-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==1 && arr[mid+1]==1)
            {
                start = mid+1;
            }
            else if(arr[mid]==0){
                end=mid-1;
            }else{
                return mid+1;
            }
        }

        return -1;
        
       
    }

    
    
}
