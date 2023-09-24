import java.util.Arrays;

public class updateAtindex {
    public static void main(String[] args) {
        int arr[] = {22,25,27,3,11,15};
        int index =3;
        int element =50;
        int n= arr.length-1;
        updateatindex(arr, n, index, element);
    }
    public static void updateatindex(int arr[],int n,int index,int element){
        for(int i =0; i<arr.length; i++){
            if(i ==index){
                arr[i]=element;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    
}
