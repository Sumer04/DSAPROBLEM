import java.util.Arrays;
public class aryrotedbyd {
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5};
         int d =2;
        //   System.out.println(Arrays.toString(approach2(arr, d)));
         System.out.println(Arrays.toString(approach3(arr, d)));
    }
    // approach -1
    // time complexity -0(n)
    public static int [] rottedbyone(int arr[]){
        int temp =arr[0];
        for (int i = 1; i< arr.length; i++) {
            arr[i-1] =arr[i];
            
        }
       arr[arr.length-1]=temp;
       return arr;
    }
    public static int [] rottedbyd(int arr[],int d){
        for(int i=0;i<d; i++){
            rottedbyone(arr);
          
        } 

        return arr;

    }
    // approach-2 time complexity 0(n)
    public static int [] approach2(int arr[],int d){
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
             temp[i] = arr[i];
            
        }
        for (int i= d; i < arr.length; i++) {
            arr[i-d]=arr[i];
            
        }
        for (int i = 0; i< d; i++) {
            arr[arr.length-d+i] = temp[i];
            
        }
        return arr;
     }
     public static int [] approach3(int arr[],int d){
        int n =arr.length;
        reverse(arr,0,d-1);
        //0(d)
        reverse(arr,d,n-1);
        //0(n-d)
        reverse(arr,0,n-1);
       // 0(n);

        return arr;
     }
    public static int [] reverse(int arr[],int low,int high){
        while(low<high){
            int temp =arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;

            
        }
        return arr;
        //  time complexity-0(n)>
    }
}
