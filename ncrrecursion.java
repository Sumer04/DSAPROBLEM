public class ncrrecursion {
    public static void main(String[] args) {
        int n =5;
        int r=2;
        System.out.println(nCr(n, r));
    }
    public static int nCr(int n,int r){
        if(n==r|| r==0){
            return 1;
        }
       
        return nCr(n-1,r-1) +nCr(n-1,r);
    }
    
}
