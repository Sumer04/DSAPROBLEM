public class countsmaller {
    public static void main(String[] args) {
        int arr[] = {4,5,9,3,1,2};
        int x =3;
        // output =2
        
        System.out.println(countsmaller(arr, x));
    }
    public static int countsmaller(int arr[],int x){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(x<arr[i]){//for count highest element than x
                //if(x>arr[i]) for count low element than x
                count++;

            }
            
        }
        return count;
    }
    
}
