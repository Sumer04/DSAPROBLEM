public class constructbinarytreefromarray {
    public static void main(String args[])
    {
        int arr[] = {-1,0,0,1,1,3,5};
        int N =7;
    createtree(arr, N);
    }
    public static void createtree(int arr[],int N)
    {
        Node root = null;
        Node temp[] = new Node[N];
        for(int i =0; i<N; i++)
        {
            temp[i] = new Node(i);
        }
           
        for(int i=0; i<N; i++)
        {
            if(arr[i] == -1)
            {
                root = temp[i];
                System.out.println(root.data);
            }
            else 
            {
                if(temp[arr[i]].left==null)
                {
                    temp[arr[i]].left=temp[i];
                   System.out.println( temp[arr[i]].left.data);
                }
                else{
                    temp[arr[i]].right=temp[i];
                    System.out.println(temp[arr[i]].right.data);
                }
                }
            }
          //  return root;
        }



        }
        class Node
        {
            int data;
            Node left;
            Node right;
            Node(int x)
            {
                data =x;
                left =null;
                right =null;
            }
        }
    
    

