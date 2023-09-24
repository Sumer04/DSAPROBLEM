import java.util.Arrays;

public class deleteAtindex {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int index =3;
       deleteindex(arr, index);
    }
    public static void deleteindex(int arr[],int index){
        //find index of which element is deleted
        int i;
        for ( i = 0; i < arr.length; i++) {
            if(i==index){
                break;
            }
        }
            //when we found the index we sifting element to end 
            for (int j = i; j <=arr.length-2; j++) {
                arr[j] =arr[j+1];
                
            }
            arr[arr.length-1] =0;
        
            
        System.out.println(Arrays.toString(arr));
    }
    
}
