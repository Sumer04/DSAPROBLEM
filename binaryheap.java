public class binaryheap {
    public static void main(String[] args) {
        minheap h = new minheap(6);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);
        h.print();
        System.out.println(h.left(1));
        
    }

    
}
class minheap{
    int arr[];
    int size;
    int cap;
    minheap(int c )
    {
        size =0;
        cap=c;
        arr =new int[c];
    }
    public int left(int i)
    {
        return (2*i + 1);
    }
    public int right(int i)
    {
        return (2*i + 2);
    }
    public int parent(int i)
    {
        return (i-1)/2;
    }
    public void insert(int x)
    {
        if(size==cap)
        {
            return;
        }
        size++;
        arr[size-1]=x;
        for(int i =size-1; i!=0 && arr[parent(i)]>arr[i];)
        {
            int temp = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i] = temp;
            i = parent(i);
        }
    }
    public void print()
    {
        for(int i =0; i<size; i++)
        {
            System.out.println(arr[i]);
        }
    }



}
