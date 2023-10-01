import java.util.ArrayList;

public class MaxiMumOfAllSubArraySizeOfk {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,1,4,5,2,3,6};
        int k =3;
        System.out.println(MaxOFallSubArrayWithSizeOFk(arr, k));
    }
    public static ArrayList<Integer> MaxOFallSubArrayWithSizeOFk(int arr[],int k)
    {
        ArrayList<Integer> p= new ArrayList<>();
        int max =0;
        for(int i =0; i<=arr.length-k; i++)
        {
            for(int j =i; j<k+i; j++)
            {
                max =Math.max(max, arr[j]);
             
            }
           p.add(max);
           max=0;
            }
        return p;
    }
    
}
