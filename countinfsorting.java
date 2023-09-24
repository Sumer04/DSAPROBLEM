import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class countinfsorting {
    public static void main(String[] args) {
        int arr[] = {1,4,4,1,0,1};
        int k =5;
        // k is the highest range in the arr +1
        int n =  arr.length-1;
       // countSRTALGO(arr, k, n);
        efficient(arr, k, n);
    }
    //naive approach
    public static void countSRTALGO(int arr[],int k,int n){
        int count[] = new int[k];
        for(int i =0; i<k; i++){
            count[i] =0;

        }
        for(int i =0; i<=n; i++){
            count[arr[i]]++;
        }
       // System.out.println(Arrays.toString(count));
    
    int index = 0;
      for(int i =0; i<k; i++){
        for(int j =0; j<count[i]; j++){
            arr[index] = i;
            index++;
        }
      }
      System.out.println(Arrays.toString(arr));
    }
    //efficient approach
    public static void efficient(int arr[],int k,int n){
        int count[] = new int[k];
        for(int i =0; i<k; i++){
            count[i] =0;

        }
        for(int i =0; i<=n; i++){
            count[arr[i]]++;
        }
        for(int i =1; i<k; i++){
            count[i] = count[i-1] +count[i]; 
        }
        int output [] = new int[n];
        for(int i=n; i>=0; i--){
          output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
            //count[arr[i]] = count[arr[i]]-1

        }
        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }

System.out.println(Arrays.toString(arr));
    }
}
