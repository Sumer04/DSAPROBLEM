import java.util.Arrays;

public class intersectionOfTwoSortAray {
    public static void main(String[] args) {
        int a[] ={3,5,10,10,10,15,15,20};
        int b[] = {5,10,10,15,30};
        //intersection(a, b);
        efficient(a, b);

    }
    // naive solution
    public static void intersection(int a[],int b[]){
         for(int i =0; i<a.length; i++){
            if(i>0 && a[i]==a[i-1] )
                continue;
                for(int j =0; j<b.length; j++){
                    if(a[i]==b[j]){
                        System.out.println(a[i]);
                        break;
                    }
                }
            }
            
            
             
         }
         // efficinet approach
         public static void efficient(int a[],int b[]){
         int i =0;
         int j =0;
         while(i<a.length && j<b.length){
            if(i>0 && a[i]==a[i-1]){
                i++;
               continue;

            }
        if(a[i]<b[j]){
            i++;
        } 
        else if(a[i]>b[j]){
              j++;
        }
        else{
            System.out.println(a[i]);
            i++;
            j++;
        }

         }
        }
    }


