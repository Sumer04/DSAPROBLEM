// time complexity - o(n^2) there is a two for loop 
// worst case - array is sorted
// best case - when starting two element are unsorted  
public class checkarraysorted {
    public static void main(String[] args) {
        int arr[] = {23,34,56,67,89};
       // boolean ans = checkArray(arr);
       boolean ans =check(arr);
System.out.println(ans);
    }
    public static boolean checkArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j< arr.length; j++) {
                if(arr[j]<arr[i]){
                   return false;
                }
                
            }
            
        }

       return true;

    }
    // efficient approach
// time complexity : o(n) because there are one loop
    public static boolean check(int arr[]){
        for (int i = 0; i < arr.length; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
