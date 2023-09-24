public class largest {
    public static void main(String[] args) {
        int arr[] = {23,45,67,54,56};
        // int ans  = largetElement(arr);
        int ans  = efficientApproach(arr);
        System.out.println(ans);
    }
   public static int largetElement(int arr[]){
    for(int i =0; i<arr.length; i++){
        boolean flag =true;
        for(int j =0; j<arr.length; j++){
            if(arr[j]>arr[i]){
                flag=false;
                break;

            }

        }
        if(flag==true){
            return i;
        }
        
    }
      return -1;
   }
   public static int efficientApproach(int arr[]){
    int max =0;
    for(int i =0; i<arr.length; i++){
        if(arr[i]>arr[max]){
            max =i;
        }
    }
    return max;
   }
}
// time complexity -o(n^2),for sorted array time complexity is 0(n) because array is sorted so we know exact value  how many time arraywill run 