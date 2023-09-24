public class recursion2{
    public static void main(String[] args) {
        fun1(5);
    }
    public static void fun(int n){
        if(n==0){
            return ;
        }
        fun(n-1);
        System.out.println(n);
        fun(n-1);
    }
    public static void fun1(int n){
        if(n==0)
            return ;
     //System.out.println(n);
     fun1(n-1);
     System.out.println(n);

        
    }
}