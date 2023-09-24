import java.util.Arrays;

public class quicksort
{
    public static void main (String[] args) 
    {
        int arr[] = {8,4,7,9,3,10,5};
        
        //int n = arr.length;
       // qSort(arr,0,n-1);
        System.out.println(Arrays.toString(qsort(arr,0, arr.length-1)));
	   // for(int x: arr)
	      //  System.out.print(x+" ");
         // System.out.println((lomutopartision(arr, 0, arr.length-1)));
        
    }
    public static int lomutopartision(int arr[],int l,int h){
        int pivot=arr[h];
        int i = l-1;
        for(int j=l; j<=h-1; j++){
            if(arr[j]<pivot){
                i++;
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }
        int temp =arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
    public static int [] qsort(int arr[],int l,int h){
        if(l<h){
            int p = lomutopartision(arr, l, h);
            qsort(arr, l, p-1);
            qsort(arr, p+1, h);
            
        }
        return arr;
    }
    

}

