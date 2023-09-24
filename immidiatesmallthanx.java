import java.util.Arrays;

public class immidiatesmallthanx {
    public static void main(String[] args) {
        int arr[] = {6,67,13,12,15};
        int x =68;
       int ans = immidiatesmall(arr, x);
       System.out.println(ans);
    }
    public static int immidiatesmall(int arr[],int x){
        Arrays.sort(arr);
        for(int i =arr.length-1; i>0; i--){
           if(arr[i]<x){
            return arr[i];
           }
            
            }
             return -1;


        }
        public static int immidiatesmall(int arr[],int x){
            Arrays.sort(arr);
            for(int i =0; i<arr.length; i++){
                if(arr[i]>x){
                    return arr[i];
                }
            }
             return -1;
        }


    }

