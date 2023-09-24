import java.util.Arrays;
public class arrayroted{
    public static void main(String[] args) {
        int arr[] = {12,34,56,78};
        arrayroted(arr);
    //    System.out.println(Arrays.toString(arrayroted(arr)));
    }
    public static void arrayroted(int arr[]){
        int temp = arr[0];
        for(int i =1; i<arr.length; i++){
            arr[i-1] =arr[i];

        }
        arr[arr.length-1] =temp;
        System.out.println(Arrays.toString(arr));
    }
    // time complexity = 0(N)
}