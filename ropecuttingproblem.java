public class ropecuttingproblem{
    public static void main(String[] args) {
        int n =5;
        int a = 2;
        int b =5;
        int c =1;
        System.out.println(ropecutting(n, a, b, c));
    }
    public static int ropecutting(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<=-1){
            return-1;
        }
        int x = ropecutting(n-a,a,b,c);
        int y =ropecutting(n-b,a,b,c);
        int z =ropecutting(n-c,a,b,c);
        int res =Math.max(x,Math.max(y,z));
        if(res==-1){
            return -1;
        }
        return res + 1;
    }
}