import java.util.Arrays;

public class heapSort{
    public static void main(String[] args) {
        int arr[] = {10,15,50,4,20};
        heap( arr,arr.length-1);
        
    

    }
    public static void buildheap(int arr[], int n){
        // run a loop for index of last node
        for(int i = n-2/2; i>=0; i--){
            maxHeapify(arr, n,i);

        }
    }
    public static void maxHeapify(int arr[],int n,int i){
        int largest =i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && arr[left]>largest){
            largest =left;
        }
        if(right<n && arr[right]>largest){
            largest = right;
        }
        if(largest !=i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, n,largest);
        }
        
    }
    public static void heap(int arr[],int n){
        buildheap(arr, n);
        for(int i =n-1; i<=0; i--){
            int temp =arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, i, 0);
        }
        System.out.println(Arrays.toString(arr));
    }
}