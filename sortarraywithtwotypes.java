import java.util.Arrays;

import javax.annotation.processing.SupportedOptions;

public class sortarraywithtwotypes {
    public static void main(String[] args) {
        int arr[] = { 15, -3, -2, 18 };
        // for negstive positive
        // output =[-3,-2,15,18]
        // sortarraytecqnique(arr1);
        efficient(arr);
        // for even odd
        // int arr1[] = {15,14,13,12};
        // output =[14,12,15,13]
        // segerateevenodd(arr1);
        // for binary
        // int arr2[] = {0,1,1,1,0};
        // binarytype(arr2);

    }

    public static void sortarraytecqnique(int arr[]) {
        int temp[] = new int[arr.length];
        int m = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < 0) {
                temp[m] = arr[i];
                m++;
            }

        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > 0) {
                temp[m++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));

    }

    // efficient solution
    public static void efficient(int arr[]) {
        int i = -1;
        int j = arr.length - 1;
        while (true) {
            do {
                i++;

            } while (arr[i] < 0);

            do {
                j--;

            } while (arr[j] > 0);
            
            if (i >= j) {
                System.out.println(Arrays.toString(arr));
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        // answere
    }

    public static void segerateevenodd(int arr1[]) {
        int temp1[] = new int[arr1.length];
        int m = 0;
        for (int i = 0; i <= arr1.length - 1; i++) {
            if (arr1[i] % 2 == 0) {
                temp1[m] = arr1[i];
                m++;
            }
        }
        for (int i = 0; i <= arr1.length - 1; i++) {
            if (arr1[i] % 2 != 0) {
                temp1[m++] = arr1[i];
            }
        }
        System.out.println(Arrays.toString(temp1));
    }

    public static void binarytype(int arr2[]) {
        int temp2[] = new int[arr2.length];
        int m = 0;
        for (int i = 0; i <= arr2.length - 1; i++) {
            if (arr2[i] == 0) {
                temp2[m] = arr2[i];
                m++;
            }
        }
        for (int i = 0; i <= arr2.length - 1; i++) {
            if (arr2[i] == 1) {
                temp2[m++] = arr2[i];
            }
        }
        System.out.println(Arrays.toString(temp2));

    }
}
