import java.lang.annotation.Retention;
import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
System.out.println(Arrays.toString(reversearray(arr)));
    }
    public static int [] reversearray(int arr[]){

        int low =0;
        int high =arr.length-1;
    
        while(low<high){
            int temp =arr[low];
            arr[low]=arr[high];
            arr[high]= temp;
            low++;
            high--;
        }
        return arr;
    }
    
}
// time complexity is 0(n) because we know the exact value loop will run n time