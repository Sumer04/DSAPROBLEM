import java.util.LinkedList;
import java.util.Queue;

import javax.print.attribute.standard.NumberUpSupported;
import javax.swing.InputMap;
import javax.swing.event.TreeExpansionEvent;

public class convertlinkedlistintoBinarytree{
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next =  new Node(12);
        head.next.next  = new Node(15);
        head.next.next.next =new Node(25);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(36);
       convertlinkedlistintobinary(head, null);
       //inorder(null);
    }
    public static void convertlinkedlistintobinary(Node head,Tree node)
    {
      Queue<Tree> q = new LinkedList<>();
      if(head==null)
      {
        return ;
      }
      Tree ans = new  Tree(head.data);
      q.add(ans);
      //System.out.println(ans.data);
      while(head!=null)
      {
       Tree temp = q.poll();
        head = head.next;
      

        if(head!=null)
        {
            temp.left =  new Tree(head.data);
            q.add(temp.left);
           // System.out.println(temp.left.data);
            head = head.next;
        }
        if(head!=null)
        {
            temp.right = new Tree(head.data);
            q.add(temp.right);
          // System.out.println(temp.right.data);
        }

      }
      //return ans;
       
    }
    public static void inorder(Tree node)
    {
        if(node!=null)
        {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }
}
class Node
{
    int  data;
    Node next;
   
    Node(int x)
    {
        data =x;
        next =null;
    }
}
class Tree
{
    int  data;
    Tree next;
    Tree left;
    Tree right;
    Tree(int x)
    {
       data =x;
    }
}