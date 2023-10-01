import java.util.HashSet;

public class SubArrayWithSum {
    public static void main(String[] args) {
        int arr[] = {4 ,5 ,-4 ,-2, 1};
        System.out.println(SubArrayWithSum(arr));
    }
    public static boolean SubArrayWithSum(int arr[])
    {
        int prefixSum  =0;
        HashSet<Integer> sp = new HashSet<>();
        for(int i=0; i<=arr.length-1; i++)
        {
            prefixSum = prefixSum + arr[i];
            if(sp.contains(prefixSum) || prefixSum==0)
            {
                return true;
            }
            sp.add(prefixSum);

        }
        return false;

    }
}
