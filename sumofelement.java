public class sumofelement {
    public static void main(String[] args) {
        int arr[] ={3,2,1};
        int sum =0;
        System.out.println(sumofelement(arr, sum));
    }
    public static int sumofelement(int arr[],int sum){
         for(int i =0; i<arr.length; i++){
            sum =sum+arr[i];
         }
         return sum;
    }
    
}
