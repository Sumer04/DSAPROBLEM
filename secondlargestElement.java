public class secondlargestElement {
    public static void main(String[] args) {
        int arr [] = {12,34,56,78};
        System.out.println(secondlargestElement(arr));
        
    }
    public static int  secondlargestElement(int arr[] ){
        int  largest =largestelement(arr);
        int res= -1;
        for(int i =0 ; i<arr.length; i++ ){
            if(arr[i]!=arr[largest]){
              if (res==-1){
                res =i;
              }else if(arr[i]>arr[res]){
                res =i;
              }

            }
        }
        return res;

    }
    public static int largestelement(int arr[]){
      int max =0;
      for(int i =0; i<arr.length; i++){
        if(arr[i]>arr[max]){
            max =i;
        }
      }
      return max;
    }
}
