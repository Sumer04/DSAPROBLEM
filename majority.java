public class majority {
    public static void main(String[] args) {
        int arr[] ={1,1,2,2,3,3,4,4,4,4,5};
         int x =4;
         int y=5;
         System.out.println(majority(arr, x, y));
    }
    public static int majority(int arr[],int x,int y){
        int ans =x;
        int countX =1;
        int countY=1;
        for (int i = 0; i< arr.length; i++) {
            if(arr[i]==x){
                countX++;
            } if(arr[i]==y){
                countY++;
            }
            
        }
        if(countX==countY){
            if(x>y){
                ans =y;
            }
        } else if(countX>countY){
            return x;
        }else{
            return y;
        }
         return ans;
        }
    
    
}
