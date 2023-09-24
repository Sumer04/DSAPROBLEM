import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
      int arr[] = {2,3,4,5,0}; 
      int target = 7;
      int position =3;
      int n =arr.length-1;
     insert(arr,n,target,position);
    }
    public static void insert(int arr[],int n ,int target ,int position){
        int index = position-1;
        for (int i= n-1; i>=index; i--) {
            arr[i+1] =arr[i];
        
            
        }
        arr[index] = target;
        System.out.println(Arrays.toString(arr));
    }
    // time complexity : =o(n) ,best case when we insert element at the end o(1),and also inert a element ins startring is best case 0(1)
}
