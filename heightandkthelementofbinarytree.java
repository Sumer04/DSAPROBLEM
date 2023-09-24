public class heightandkthelementofbinarytree {
    public static void main(String[] args) {
        Node root =new Node(10);
        root.left = new Node(20);
        root.right =new Node(30);
        root.right.left = new Node(40);
        root.right.right =  new Node(50);
        //System.out.println(heightofBt(root));
        int k =2;
        printkthelement(root, k);
    }
    // height of binary tree
    static int heightofBt(Node root)
    {
             if(root==null)
             {
                return 0;
             }
             else{
            return Math.max(heightofBt(root.left),heightofBt(root.right)+1);
    }
}
// kth element of binarytree
static void printkthelement(Node root,int k)
{
    if(root==null){
        return;
    }
    if(k==0)
    {
        System.out.println(root.data+"");
    }
    else{
        printkthelement(root.left, k-1);
        printkthelement(root.right, k-1);
    }
}
}
class Node {
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
