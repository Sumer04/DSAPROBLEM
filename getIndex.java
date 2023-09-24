public class getIndex {
    public static void main(String[] args) {
        int arr[] = {12,3,4,56,7};
        int index =4;
        System.out.println(getindex(arr, index));
        

    }
    public static int getindex(int arr[],int index){
        for(int i =0; i<=arr.length; i++){
            if(i==index)
            return arr[i];
        }
        return -1;
    }
}
    

