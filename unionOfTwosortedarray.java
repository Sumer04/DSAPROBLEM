import java.util.Arrays;

public class unionOfTwosortedarray{
    public static void main(String[] args) {
        int a[] = {3,5,8};
        int b[] = {2,8,9,10,15};
       // unionOf(a, b);
      efficient(a, b);
        
    }
    // naive solution
    public static void unionOf(int a[],int b[]){
        int n = a.length;
        int m = b.length;
        int c = n+m;
        int temp[] = new int[c];
        for(int i=0; i<n; i++){
           temp[i] = a[i];
        }
        for(int i =0; i<m; i++){
            
                temp[n+i]=b[i];
            
            
        }
        Arrays.sort(temp);
        
        for(int i =0; i<c; i++){
            if(i==0 || temp[i]!=temp[i-1])
            {
           System.out.println(temp[i]);
            }
        }
       }
       // efficient approach
       public static void efficient(int a[],int b[]){
        int i =0 ;
        int j =0;
        while(i<a.length && j<b.length){
            if(i>0 && a[i] ==a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[i] ==b[j-1]){
                j++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
                System.out.println(a[i]);

            }
            else if(a[i]>b[j]){
                j++;
                System.out.println(b[j]);
            }
            else{
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
            while(i<a.length){
                if(i==0 || a[i]!=a[i-1]){
                    System.out.println(a[i]);
                    i++;
                }
            }
            while(j<b.length){
                if(j==0 || b[j]!=b[j-1]){
                    System.out.println(b[j]);
                    j++;
                }
            }
        

       }

        

    }
// time complexity : 0(m+n)