public class duplicate {
    public static void main(String[] args) {
        int arr[]= {10,20,20,30,30,30};
       
    System.out.println(duplicate(arr,arr.length));
    }
    // efficient aproach
       public static int duplicateArray(int arr[]){
        int count =1;
        for(int i =1; i<arr.length; i++){
            if(arr[i-1]!= arr[i]){
                count++;
            }
        }
        return count;
       }
    //    naive approach 
       public static int duplicate(int arr[],int n){
        int temp [] = new int[n];
        temp[0] = arr[0];
        int res =1;
        for(int i =0 ; i<arr.length; i++){
            if(arr[res-1]!=arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        // for(int i =0; i<res; i++){
            // temp[i] =arr[i];
        
         return res;

       }
    
}
