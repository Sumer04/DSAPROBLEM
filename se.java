
    /*package whatever //do not write package name here */

// import java.io.*;
public class se {
    
    
    static void selectionSort(int arr[], int n){
        for(int i = 0; i < n; i++){
            int min_ind = i;
            
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
    }
    
    
	public static void main (String[] args) {
	    int a[] = {10,2,8,20,18};
	    selectionSort(a, 5);
	    
	    for(int i = 0; i < 5; i++){
	        System.out.print(a[i] + " ");
	    }
	}
}
    

