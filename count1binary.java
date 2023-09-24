public class count1binary{
    public static void main(String[] args) {
      int arr[] = {1,1,1,1,1,0,0,0};
      int N =arr.length;
      System.out.println(Bnarycount(arr, N));
   }
   public static int Bnarycount(int arr[],int N){
       int low =0;
       int high =N-1;
       int count =0;
       while(low<=high){
        int mid  =low  + (high-low)/2;
        if(arr[mid]==1){
            count =mid+1;
            low =mid+1;
        }
        else {
            high =mid -1;
        }
       }
      return count;
       
   }
}
   