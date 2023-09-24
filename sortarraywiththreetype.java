import java.util.Arrays;

public class sortarraywiththreetype {
    public static void main(String[] args) {
       // int arr[]= {0,1,0,2,1,2};
       int arr[] = {4,4,6,7,9,3,2,2,1,4,2};
       int pivot =2;
       System.out.println(Arrays.toString(sortarray(arr,pivot)));
       
    }
    // efficient solution
    public static int [] sortarray(int arr[],int pivot){
       int mid  =0 ;
       int low =0;
       int high  = arr.length-1;
       while(mid<=high){
        if(arr[mid]<pivot){
            int temp =arr[mid];
            arr[mid] = arr[low];
            arr[low] = temp;
            low++;
            mid++;

        }
        else if(arr[mid]==pivot){
            mid++;
        }
        else{
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
        }
       }
       return arr;
    }
    
}
