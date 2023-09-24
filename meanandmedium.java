import java.util.Arrays;

public class meanandmedium {
    public static void main(String[] args) {
        int arr[] ={2,8,3,4};
         int N = 4;
         System.out.println(median(arr,N));
         System.out.println(mean(arr, N));
    }
    public static int median(int arr[],int N){
        Arrays.sort(arr);
        int start =0;
        int end  = N-1;
      int mid =  start +(end-start)/2;
      if(N%2==1){
        return arr[mid];
      } 
      return (arr[mid]+arr[mid-1]/2);

    }
    public static int mean(int arr[],int N){
        int sum =0;
        for(int i =0; i<N;  i++){
            sum = sum +arr[i];
        }
        int mean = sum/N;
        return mean;

    }
    
}
