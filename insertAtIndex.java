import java.util.Arrays;

public class insertAtIndex{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,0};
        int position =3;
        int element =90;
        int n =arr.length-1;
        insertatindex(arr, position, element,n);
     }
     public static void insertatindex(int arr[] , int position ,int element,int n){
        
        for(int i=n-1; i>=position; i--){
            arr[i+1]= arr[i];
        }
        arr[position] = element;
        System.out.println(Arrays.toString(arr));
     }
     
}