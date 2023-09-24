import java.util.Arrays;

public class murgesort {
    public static void main(String[] args) {
        int a[] = {10,15,20};
        int b[] = {5,6,6,15};
        int temp [] = new int[a.length+b.length]; 
       // mergesort(a, b, temp);
        efficient(a, b, temp);
    }
    public static void mergesort(int a[],int b[], int temp[]){
        for(int i =0; i<a.length; i++){
          temp[i] = a[i];
           
        }
        for(int i =0; i<b.length; i++){
            temp[a.length + i] = b[i];
             
        }
       // Arrays.sort(temp);
        // use any sorting algorithm like bubble sort /..............
        //System.out.println(Arrays.toString(temp));
    }
    // efficient approach 
    public static void efficient(int a[],int b[],int temp[]){
        int i =0;
        int j =0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                System.out.println(a[i]);
                i++;
                // if we convert into array then intailise another variable,temp[k++]
            }
            else{
                System.out.println(b[j]);
                j++;
            }


        }
        while(i<a.length){
            System.out.println(a[i]);
            i++;

        }
        while(j<b.length){
            System.out.println(b[j]);
            j++;
        }
    }
    
}
