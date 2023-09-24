import java.util.Arrays;

public class murgesortingalgo {
    public static void main(String[] args) {
        int a[] = {10,5,30,15,7};
        int low =0;
        int high =4;
      //  murgesort(a, low, high);
 System.out.println(Arrays.toString(murgesort(a, low, high)));
    }
    public static int[] murgesort(int a[],int low,int high){
        if(low<high){
            int mid = low +(high-low)/2;
            murgesort(a, low, mid);
            murgesort(a, mid+1, high);
            merge(a, low,mid, high);
        }

        return a;
        
    }
    static void merge(int arr[], int l, int m, int h){
        
        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];int[]right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];    
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];   }
    
}
