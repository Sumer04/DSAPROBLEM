public class array{
    public static void main(String[] args) {
      int arr [] = {2,4,5,6}; 
      int n =4;
      int target =5;
      System.out.println(serching(arr, n, target));
    }
    public static int serching(int arr[],int n,int target){
      for(int i =0; i<n; i++){
        if(arr[i]==target){
            return i;
        }
        
      }
      return -1;
    }
}