public class binarySearch{
    public static void main(String[] args) {
        int arr[] = {45,90,92,100,150,170,190,200};
        int target =45;
        int n =arr.length;
        int low =0;
        int high =n-1;
      
        System.out.println(binarySearch(arr, target, n, low, high));
    }
    // recursive solution for biinary search and time complexxity is log of n
    public static int binarySearch(int arr[],int target,int n,int low,int high ){
        if(low>high){
            return-1;

        }
        int mid = low + (high-low)/2;
        if(arr[mid]==target){
            return mid;
        
        }
        if(arr[mid]>target){
            return binarySearch(arr, target, n, low, mid-1);
        }

            
            return binarySearch(arr, target, n, mid+1, high);
        
       
    

    }
}