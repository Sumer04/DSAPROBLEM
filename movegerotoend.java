import java.util.Arrays;

public class movegerotoend {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 0, 0, 6, 7, 0 };
       // System.out.println(Arrays.toString(movegerotoend(arr)));
       System.out.println(Arrays.toString(move(arr)));
    }
// naive approach
// time complexity o(n^2)
    public static int[] movegerotoend(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
        }
        return arr;
    }
    // efficient appro
    //time complexity - o(n)
    public static int [] move(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] =arr[count];
                arr[count] = temp;
                 count++;
            
            }
            
        }
        return arr;
    }
}
