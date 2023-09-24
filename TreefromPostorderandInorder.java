import java.util.HashMap;

public class TreefromPostorderandInorder {
    public static void main(String[] args) {
        int in[] = { 4, 8, 2, 5, 1, 6, 3, 7};
        int pos[] = {8 ,4 ,5, 2, 6, 7, 3, 1};
        int n = 8;
        System.out.println(buildtree(in, pos, n));
    }
    public static Node buildtree(int in[],int pos[],int n)
     {
         if(pos==null||in==null || in.length!=pos.length)
         {
            return null;
         }
         HashMap<Integer,Integer> hash = new HashMap<>();
         for(int i=0;i<n; i++)
         {
             hash.put(in[i],i);
         }
         return buildtreeefrompostin(in, 0, in.length-1, pos, 0, pos.length-1, hash);
        
     }
     public static Node buildtreeefrompostin(int in[],int is,int ie,int pos[],int ps,int pe,HashMap<Integer,Integer> hash)
     {
         if(ps>pe || is>ie)
         {
            return null;
         }
         Node root = new Node(pe);
         int inroot = hash.get(pos[pe]);
         int numsleft = inroot-is;
          root.left=buildtreeefrompostin(in,is, inroot-1, pos, ps, ps+numsleft-1, hash);
          root.right = buildtreeefrompostin(in,  inroot+1,ie, pos, ps+numsleft, pe-1, hash);
          return root;
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
