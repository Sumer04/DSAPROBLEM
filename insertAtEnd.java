import java.util.Arrays;

public class insertAtEnd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,0};
        int element =90;
        int n =6;
        Insertelement(arr,element,n);
        // insertAtEnd(arr);
    }
    public static void Insertelement(int arr[],int element,int n){
       arr[n-1] =element;
    System.out.println(Arrays.toString(arr));
    }
    // if array size is 5
    // we create a new array and copy of privious array in new array
    // public static void insertAtEnd(int arr[] )}
    // int temp[] = new int[arr.length+1];
    // for(int i =0; i<arr.length; i++){
    //     arr[temp] = arr[i];
    // } 
    // arr[temp] =element;
    // System.out.println(Arrays.toString(arr));
     
}


