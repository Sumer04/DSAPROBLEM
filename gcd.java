public class gcd {
    public static void main(String[] args) {
        int a =2;
        int b =4;
        System.out.println(gcd(a, b));
    }
    public static int gcd(int a,int b){
       if(a%b==0){
        return a;
    }
    return gcd(a,a%b);

    

    }
}
