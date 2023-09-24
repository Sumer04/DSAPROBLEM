public class Allquestion1recursion{
    public static void main(String[] args) {
        // int arr[] = {45,52,13,25,33,41};
        // int n = 5;
        // System.out.println(reversearray(arr, n));
        String str = "123";
        atoiproblem(str);

    }
    public static int reversearray(int arr[],int n)
    {
        if(n<=0)
        {
            return arr[0];
        }
        else{
            System.out.println(arr[n]);
            return reversearray(arr, n-1);
        }
    }
    public static void atoiproblem(String str)
    {
     int num =0;
   int n = str.length();
   for(int i =0; i<n; i++)
   {
num =num*10+((int)str.charAt(i)-48);
   } 
    }
}