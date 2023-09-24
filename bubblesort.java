import java.util.Arrays;

public class bubblesort{
    public static void main(String[] args) {
        int arr[] = {2,10,8,7};
        bubblesort(arr);
    }
    // bubble sort algorithm ,time complexity is o(n^2)
    public static void bubblesort(int arr[]){
        for(int i=0; i<arr.length; i++){
             boolean swapped = false;// optimize solution is intialije swappeed variable
            for(int j=1; j<=arr.length-i-1; j++){
                if(arr[j]<arr[j-1]){
                      int temp = arr[j-1];
                      arr[j-1] = arr[j];
                      arr[j] = temp;
                      swapped = true;
                }
            }
                  
            if(swapped==false){
                break;
            }
            
        
           
           
    }
    System.out.println(Arrays.toString(arr));
}
}