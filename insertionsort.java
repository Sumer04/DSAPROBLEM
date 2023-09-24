import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int arr[] = {20,5,40,60,10,30};
           insertion(arr);

    }
    public static void insertion(int arr[]){
        for(int  i=1; i<arr.length; i++){
            int key  = arr[i];
            // in insertion sort we divided array into two parts sorted array and unsorted array and we intialise i =1 because we compare first elemrnt to privious element so we intialise j =i-1 and we cretw a new arrya and first we store value and we run a loop untill j is not eqval to zero and greater than zero and j is greater than key
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] = key;    
             //System.out.println(arr);
             //System.out.println(Arrays.toString(arr)); for every iteration print
        }
       System.out.println(Arrays.toString(arr));
    }
    
}
// time complexity is a 0(n) for sorted array that is best case
// worst case is a o(n^2) when array is reversed sorted
