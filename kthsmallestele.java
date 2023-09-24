import java.util.Arrays;

public class kthsmallestele {
    public static void main(String[] args) {
        int arr[] ={30,20,5,10,8};
       // int n = arr.length-1;

        int k =4;
       
     
        // that meand kt smallest element 
       // Kthsmallest(arr, k);
       //int ans =  lomuto(arr,  h, low);
      // System.out.println(ans);
      System.out.println(efficient(arr, k));
    }
    // naive solution 
    public static void Kthsmallest(int arr[],int k){
        Arrays.sort(arr);
    System.out.println(arr[k-1]);

        }
     // better solution
      public static int lomuto(int arr[],int h ,int low){
         h = 4;
          low =0;
        int pivot = arr[h];
        int i = low-1;
        for(int j =low; j<=h-1; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
            } 
        }
        int temp = arr[h];
        arr[h] = arr[i+1];
        arr[i+1] = temp;
         return i+1;


      }
      public static int  efficient(int arr[],int k){
        int low =0;
        int h =  arr.length-1;
        while(low<=h){
         int  p = lomuto(arr, h, low);
         if(p ==k-1){
            return p;
         }
         else if(p<k-1){
            low =p+1;
         }
         else{
            h = p-1;
         }
        }
        return -1;
      }
    }
    

