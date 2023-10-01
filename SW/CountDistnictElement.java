import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CountDistnictElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
        int k = 4;
        System.out.println(CountDistnictElement1(arr, k));
    }

    public static ArrayList<Integer> CountDistnictElement1(int arr[], int k) {
        // this is a brute force Approach
    //   ArrayList<Integer> sp = new ArrayList<>();
    //     for (int i = 0; i <=arr.length - k; i++) {
    //          HashSet<Integer> mp = new HashSet<>();
    //         int count = 0;
    //         for (int j = i; j < i + k; j++) {
                
    //                 mp.add(arr[j]);
    //                 }
    //         sp.add(mp.size());
    //     }
    //     return sp;
    // this is optimal Approach
    HashMap<Integer, Integer> opp = new HashMap<>();
    ArrayList<Integer> sp = new ArrayList<>();
    for(int i = 0; i < k; i++) {
        opp.put(arr[i], opp.getOrDefault(arr[i], 0) + 1);
    }
    sp.add(opp.size());
    
    for(int i = k; i < arr.length; i++) {
        if (opp.get(arr[i - k]) == 1) {
            opp.remove(arr[i - k]);
        } else {
            opp.put(arr[i - k], opp.get(arr[i - k]) - 1);
        }
        opp.put(arr[i], opp.getOrDefault(arr[i], 0) + 1);
    }
    sp.add(opp.size());
    return sp;


    }
}