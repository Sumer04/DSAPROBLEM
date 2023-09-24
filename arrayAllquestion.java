import java.nio.file.NotLinkException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.processing.SupportedOptions;

public class arrayAllquestion {
   public static void main(String[] args) {
      // int arr[] = { 1, 2, 3, 4,5 };
      // int arr[] = {8,5,0,10,0,20};
      // int arr[] = {1,1,2,2,3,3,4,4,4,4,5};
      // int arr[] = {1,2,3,7,5};
      // int s =18;
      // int n =5;
      // System.out.println(subofarray(arr, s,n));

      // int x = 19;
      // int pos = arr.length - 1;

      // // insertatbefining(arr, x);5
      // // insertAttheend(arr, x);
      // // insertAtthepos(arr, x, pos);
      // // Atdeletionbegining(arr, x);
      // // deleteending(arr);
      // delteatpos(arr, pos);
      // int arr1[] = {10,20,20,20,20,20,20,30,30,30,30};
      // System.out.println(checkarray(arr));
      // System.out.println(removeduplicate(arr1));
      // leftrotate(arr);
      // leftrotatebyd(arr, 2);
      // for(int i = 0; i < arr.length; i++)
      // {
      // System.out.print(arr[i]+" ");
      // }
      // leftrotatebyd1(arr, 2);
      // recursive(arr, 2);
      // movezerotoend(arr);
      // movezerotoend2(arr);

      // System.out.println(immediatesmall(arr, x));
      // System.out.println(immediategreater(arr, x));

      // System.out.println(majorityElement(arr, 4, 5));
      // System.out.println(meanAndmedian(arr, 5));

      int arr[] = {6,1,2,8,3,4,7,10,5};
      int n =10;
     
      System.out.println(missingNumber(arr, n));
      int arr1[] = {1,2,3,4,5};
      int arr2[] = {1,2,3};
      union(arr1, arr2);
      System.out.println(union(arr1, arr2));
   }

   public static void insertatbefining(int arr[], int x) {
      for (int i = arr.length - 1; i > 0; i--) {
         arr[i] = arr[i - 1];

      }
      arr[0] = x;
      System.out.println(Arrays.toString(arr));
   }

   public static void insertAttheend(int arr[], int x) {
      // {naive solution
      // for(int i =0 ; i<=arr.length-1; i++)
      // {
      // if(i==arr.length-1)
      // {
      // arr[i] =x;
      // }
      // }
      // System.out.println(Arrays.toString(arr));
      arr[arr.length - 1] = x;
      System.out.println(Arrays.toString(arr));
   }

   public static void insertAtthepos(int arr[], int x, int pos) {
      for (int i = arr.length - 1; i > pos; i--) {
         arr[i] = arr[i - 1];

      }
      arr[pos] = x;
      System.out.println(Arrays.toString(arr));
   }

   public static void Atdeletionbegining(int arr[], int x) {
      for (int i = 0; i < arr.length - 1; i++) {
         arr[i] = arr[i + 1];
      }

      System.out.println(Arrays.toString(arr));

   }

   public static void deleteending(int arr[]) {
      arr[arr.length - 1] = 0;

      System.out.println(Arrays.toString(arr));
   }

   public static void delteatpos(int arr[], int pos) {
      if (pos == arr.length - 1) {
         arr[pos] = 0;
      }
      for (int i = pos; i < arr.length - 1; i++) {
         arr[i] = arr[i + 1];
      }

      System.out.println(Arrays.toString(arr));
   }

   public static boolean checkarray(int arr[]) {

      for (int i = 0; i < arr.length - 1; i++) {
         if (arr[i] > arr[i + 1]) {
            return false;
         }
      }
      return true;

   }

   public static int removeduplicate(int arr1[]) {
      int res = 1;
      for (int i = 1; i < arr1.length - 1; i++) {
         if (arr1[res - 1] != arr1[i]) {
            arr1[res] = arr1[i];
            res++;
         }
      }
      return res;

   }
   //

   public static void leftrotate(int arr[]) {
      int temp = arr[0];
      for (int i = 0; i < arr.length - 1; i++) {

         arr[i] = arr[i + 1];

      }
      arr[arr.length - 1] = temp;
      System.out.println(Arrays.toString(arr));
   }

   // efficient solution
   public static void leftrotatebyd(int arr[], int d) {
      int temp[] = new int[d];
      for (int i = 0; i < d; i++) {
         temp[i] = arr[i];
      }
      for (int i = d; i < arr.length; i++) {
         arr[i - d] = arr[i];
      }
      for (int i = 0; i < d; i++) {
         arr[arr.length - d + i] = temp[i];
      }

   }

   // naive solution
   public static void leftrotatebyd1(int arr[], int d) {
      for (int i = 0; i < d; i++) {
         leftrotate(arr);
      }
   }

   // recursive solution
   public static void recursive(int arr[], int d) {
      reversive(arr, 0, d - 1);
      reversive(arr, d, arr.length - 1);
      reversive(arr, 0, arr.length - 1);
      System.out.println(Arrays.toString(arr));
   }

   static void reversive(int arr[], int low, int high) {

      while (low < high) {
         int temp = arr[low];
         arr[low] = arr[high];
         arr[high] = temp;
         low++;
         high--;
      }
   }

   // solution1
   public static void movezerotoend(int arr[]) {
      int temp[] = new int[arr.length];

      for (int i = 0, j = 0; i <= arr.length - 1; i++) {
         if (arr[i] != 0) {
            temp[j] = arr[i];
            j++;

         }

      }
      System.out.println(Arrays.toString(temp));
   }

   public static void movezerotoend2(int arr[])

   {
      int count = 0;
      for (int i = 0; i < arr.length - 1; i++) {
         if (arr[i] != 0) {
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
            count++;

         }
         System.out.println(Arrays.toString(arr));
      }

   }

   public static int immediatesmall(int arr[], int x)

   {
      Arrays.sort(arr);
      for (int i = arr.length - 1; i > 0; i--) {
         if (arr[i] < x) {
            return arr[i];
         }
      }
      return -1;
   }

   public static int immediategreater(int arr[], int x) {
      Arrays.sort(arr);
      for (int i = 0; i < arr.length - 1; i++) {
         if (arr[i] > x) {
            return arr[i];
         }
      }
      return -1;
   }

   public static int majorityElement(int arr[], int x, int y) {
      int countx = 0;
      int county = 0;
      for (int i = 0; i < arr.length - 1; i++) {
         if (arr[i] == x) {
            countx++;
         }
         if (arr[i] == y) {
            county++;
         }
         if (countx == county) {
            if (x > y) {
               return y;
            } else {
               return x;
            }
         }
         if (countx > county) {
            return x;
         }

      }
      return y;

   }

   public static int meanAndmedian(int arr[], int n) {
      // mean
      // int sum =0;
      // for(int i =0; i<n-1; i++)
      // {
      // sum =sum +arr[i];
      // }
      // int mean = sum/n;
      // return mean;
      // meadian
      Arrays.sort(arr);
      int start = 1;
      int end = arr.length - 1;
      int mid = start + (end - start) / 2;

      if (n % 2 == 1) {
         return arr[mid];
      }
      return (arr[mid] + arr[mid - 1]) / 2;

   }

   // sub of array
   public static ArrayList<Integer> subofarray(int arr[], int s, int n) {
      // this is naive solution
      // int sum ,i,j;
      // for(i=0; i<n; i++)
      // {
      // sum =arr[i];
      // for(j=i+1; j<=n; j++)
      // {
      // if(sum==s)
      // {
      // System.out.println(i);
      // System.out.println(j-i);
      // return 1;
      // }
      // if(sum>s || j==n)
      // {
      // break;
      // }
      // sum =sum + arr[j];
      // }
      // }
      // System.out.println("not found");
      // return 0;

      // efficient soultion
      ArrayList<Integer> ans = new ArrayList<>();
      int sum = arr[0], start = 0, i;
      for (i = 1; i <= n; i++) {
         while (sum > s && start < i - 1) {
            sum = sum - arr[start];
            start++;
         }
         if (sum == s) {
            ans.add(start);
            ans.add(i - 1);
            return ans;
         }
         if (i < n) {
            sum = sum + arr[i];

         }
      }
      ans.add(-1);
      return ans;

   }

   // missing no. in array
   public static int missingNumber(int arr[], int n) {
      Arrays.sort(arr);
      for(int i =1; i<=n-1; i++)
      {
         if(arr[i-1]!=i)
         {
           return i;
         }
      }
      return n;
   }

   // union of two array
   public static ArrayList<Integer> union(int arr1[],int arr2[])
   {
       ArrayList<Integer> ans = new ArrayList<>();
      int temp[] = new int[arr1.length+arr2.length];
      for(int i =0; i<=arr1.length-1; i++)
      {
         temp[i] = arr1[i];
      }
      for(int i = 0; i<arr2.length; i++)
      {
         temp[arr1.length + i] = arr2[i];
      }
     Arrays.sort(temp);
 
     ans.add(temp[0]);
     for (int i = 1; i <=temp.length - 1; i++) {
        if (temp[i] != temp[i-1]) {
        
          ans.add(temp[i]);
        }
     }
    return ans;

   }

   public static int intersection(int arr1[],int arr2[])
   {
      int count =0;
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else{
                count++;
                i++;
            }
        }
        return count;
   }
}
