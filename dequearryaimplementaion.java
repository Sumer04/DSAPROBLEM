public class dequearryaimplementaion {
    public static void main(String[] args) {
        deque q =new deque(4);
        q.insertAtfront(10);
        q.insertAtfront(20);
        q.insertAtrear(40);
        q.insertAtrear(50);
        q.insertAtfront(30);
       System.out.println(q.getfront());
        System.out.println(q.getrear());
      
        
    }

    
}
// simple implementation
class deque{
     int cap;
     int size;
     int arr[];
     deque(int c)
     {
        cap =c;
        size =0;
        arr = new int[c];

     }
     void insertAtfront(int x)
     { 
        if(isfull()){
            return;
        }
     
        for(int i=size-1; i>=0; i--){
            arr[i+1] =arr[i];
        }
        arr[0]=x;
        size++;
     }
     void insertAtrear(int x)
     {   
        if(isfull())
        {
            return;

        }
        arr[size] =x;
        size++;

     }
     void deleteatfront()
      {
    if(isEmpty())
    {
        return;
    }
        for(int i =0; i<size-1; i++){
            arr[i] =arr[i+1];
        }
        size--;
     }
     void deleteatrear(){
     if(isEmpty()){
        return;
    }
     
     
    size--;
     }
     int getrear(){
        if(isEmpty())
        {
            return -1;
        }
        
    return size-1;
     }
     int getfront()
     {
        if(isEmpty())
        {
            return -1;
        }
       
    return 0;
     }
     boolean isfull(){
        
            return size==cap;
    
     }
     boolean isEmpty()
     {
        return size==0;
     }
     //
     
}

