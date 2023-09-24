import java.util.Arrays;

public class pfofquicksort {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 8, 4, 2, 7, 1, 10 };
        int p =0;
        
       
        // for oivot is low in hoare solution
        // element of last index for naive and loumuto solution
        // partition(arr, p);
        // lomutopartion(arr, p);
        System.out.println(Arrays.toString(haarepartion(arr, p)));
    }

    public static void partition(int arr[], int p) {
        // naive solution
        int temp[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i <= p; i++) {
            if (arr[i] <= arr[p]) {
                temp[index] = arr[i];
                index++;
            }

        }
        for (int i = 0; i <= p; i++) {
            if (arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }

        }
        System.out.println(Arrays.toString(temp));
    }

    // time complexity is o(n) and the auxiliary space is o(1)
    // corner case 1 - when the pivot is lesst than all element of array
    // [70,60,80,40,30] swap pivot with first element
    // corner case 2- when the pivot is greater than all element of
    // pivot[30,40,20,50,80] swap the element with itself pivot is wap with i+ 1
    // element
    // how to handle a case when pivot is not a last element then swapping pivot
    // element with the last element.
    public static void lomutopartion(int arr[], int p) {
        int i = -1;
        for (int j = 0; j <= p - 1; j++) {
            if (arr[j] < arr[p]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[p];
        arr[p] = temp;

        System.out.println(Arrays.toString(arr));

    }

    public static int[] haarepartion(int arr[], int p) {
        int i = -1;
        int h = arr.length-1;
        int j = h+1;

        while (true) {
            do {
                i++;
            }while (arr[i] < arr[p]);

            do {
                j--;

            }while (arr[j] > arr[p]);
            if (i>=j) {
                return arr;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // in hoare partion is better than lomuto because its less comparision than loumuto .
        // in hoare pivot is first element of array.
        // corner case-1 pivot is smaller than all element dont do any thing [5,10,9,12]
        //corner case-2  when pivot is greater than all element than swaping with last element [12,10,5,9]
        // corner case-3 when pivot is equal means that all element are same then the array is not stable because the original array is disturb 

    }

}
