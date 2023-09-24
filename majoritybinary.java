public class majoritybinary {
    public static void main(String[] args) {
        int x =1;
             System.out.println(sqyrt(x));
    }
    public static int sqyrt(int X){
        int start =1;
        int end =X;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(mid<=X/mid){
                start = mid+1;

            }
            else{
                    end = mid-1;
            }
            //return end;
        }
        return end;
    }
    
}
