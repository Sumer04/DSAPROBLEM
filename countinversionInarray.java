import java.util.Arrays;

public class countinversionInarray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int l =0;
        int h = arr.length-1;
        System.out.println(count(arr, l, h));
        //countInverse(a);
    }
    // maive solution
    public static void countInverse(int a[]){
        int count =0;
        for(int i =0; i<a.length-1; i++){
             for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    count++;
                }
             }
        }
        System.out.println(count);
    }
    // efficient approach
    public static int efficient(int arr[],int l,int m,int h){

        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];int[]right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];    
        int i=0,j=0,k=l;
        int count =0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
                count=count+(n1-i);
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++]; 

           return count;

    }
    public static int count(int arr[],int l,int h){
        int count =0;
        if(l<h){
            int m = (h+l) /2;
            count(arr, l, m);
            count(arr, m+1, h);
            efficient(arr, l, m, h);
        }
        return count;
       
    }
}
