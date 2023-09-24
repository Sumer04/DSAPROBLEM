public class recursivelysumNnumber{
    public static void main(String[] args) {
        int N =5;
        recursiveNnumber(N);
        System.out.println(recursiveNnumber(N));
    }
    public static int recursiveNnumber(int N){
        if (N==0){
            return 0;

        }
        return N +recursiveNnumber(N-1);
    }

}

    

