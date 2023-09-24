import java.util.Arrays;

public class delete {
    public static void main(String[] args) {
        int i;
        int arr [] = {2,4,5,6,7,8};
         int n = arr.length;
         int target = 8;
         int ans =deleteelement(n, arr, target);
         for(i =0; i<n; i++){
            System.out.println(arr[i]+"");
         }
         
    }
    
    public static int  findelement(int arr[],int target,int n){
       int i;
       for ( i = 0; i < n ; i++) {
        if(arr[i]==target){
            return i;
        }

        
       }
       return -1;

    }
    public static int deleteelement(int n,int arr[],int target){
        int pos  = findelement(arr,n,target);
        int i;
        for (i = pos; i < n-1; i++) {
            arr[i] =arr[i+1];
            
            return n-1;

        }
        
return-1;
    }
}

            
        
