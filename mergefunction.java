import java.util.Arrays;

public class mergefunction {
    public static void main(String[] args) {
        int a[] = {10,15,20,11,30};
        int low =0;
        int mid =2;
        int high = 4;
        mergefunction(a, low, mid, high);
    }
    public static void mergefunction(int a[],int low,int mid,int high){
        int temp[] = new int[mid-low+1];
        for (int i = 0; i < mid-low+1; i++) {
            temp[i] = a[low+i];
            
        }
        int temp1 [] = new int[high-mid];
        for (int j = 0; j< high-mid; j++) {
            temp1[j] = a[mid+j+1];
            
            
        }
        int i =0;
        int j =0;
        int k =low;
        while(i<temp.length && j<temp1.length){
            if(temp[i]<=temp1[j]){
//           System.out.println(temp[i]);
                a[k] = temp[i];
               
                i++;
                k++;
                // if we convert into array then intailise another variable,temp[k++]
            }
            else{
              //  System.out.println(temp1[j]);
                a[k] = temp[j];
                j++;
                k++;
            }


        }
        while(i<temp.length){

            //System.out.println(temp[i]);
            a[k] = temp[i];
            
            i++;
            k++;

        }
        while(j<temp1.length){
           // System.out.println(temp1[j]);
            a[k] = temp1[j];
           
            j++;
            k++;
        }
        System.out.println(Arrays.toString(a));
    }
    
}
