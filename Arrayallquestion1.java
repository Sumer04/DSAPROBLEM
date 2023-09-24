public class Arrayallquestion1 {
    public static void main(String[] args) {
       // int arr[][]  ={ {3 ,30 ,38 },
        // {44, 52 ,54 },
        // {57, 60 ,69} };
        // int x= 60;
        // int N =3;
        // int M= 3;
        int arr[] = {1,0,1};
        int M =1;

        // System.out.println(seachin2d1(arr, N, M, x));
        // System.out.println(searchin2d(arr, N, M, x));
        // System.out.println(maximum1s(arr, N, M));
     System.out.println(consuctive1s(arr, M));
     System.out.println(consuctive1ss(arr, M));
    }
    public static Boolean seachin2d1(int arr[][],int N,int M,int x)

    {
           for(int i =0; i<N; i++)
           {
            for(int j =0; j<M; j++)
            {
                if(arr[i][j]==x)
                {
                     return true;
                }
            }
           }
           return false;
    }
    public static int searchin2d(int arr[][],int N,int M,int x)
    {
        int row =0;
        int j =M-1;
        while(row<N && j>=0 ){
            if(arr[row][j]==x)
            {
                return 1;
            }
            else if(x<arr[row][j])
            {
                row++;
            }
            else{
                j--;
            }
        }
        return 0;
    }
    public static int maximum1s(int arr[][],int N,int M)
    {
        int sum =0;
        for(int i =0; i<N; i++)
        {
            int count =0;
         for(int j =0; j<M; j++)
         {
          
            if(arr[i][j]==1)
            {
                count ++;
            }
            sum =Math.max(sum,count);
         }
    }
    return sum;
}

// naive solution
public static int consuctive1ss(int arr[],int m)
{ 
    int res =0;
    for(int i =0; i<=arr.length-1; i++)
    {
        int count=0;
        for(int j=i; j<=arr.length-1; j++)
        {
            if(count==0)
            {
                count++;

            }
            if(count<=m)
            {
               if(j-i+1>=res)
               {
                res= j-i+1;
               }
            }
        }
    }
    return res;

}
// efficient 

public static int consuctive1s(int arr[],int m)
{
    int flip =0;
    int i=0; 
    int j =0;
    int ans =0;
    while(i<arr.length)
    {
        if(arr[i]==0)
        {
            flip++;
        }
    
    while(flip>m)
    {
        if(arr[j]==0)
        {
            flip--;
            j++;
        }
    }
    ans = Math.max(ans,i-j+1);
    i++;
}
    return ans;
}
}
