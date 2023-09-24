import java.util.Arrays;

public class minimumdiffereninarray {
    public static void main(String[] args) {
        int arr[] = {1,8,12,5,18};
        minimumdefferece(arr);
    }
    public static void minimumdefferece(int arr[]){
        Arrays.sort(arr);
        int minimum =arr[1]-arr[0];
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]-arr[i-1]<minimum){
                  minimum =arr[i]-arr[i-1];
            }
        }
        System.out.println(minimum);
    }

}
    

