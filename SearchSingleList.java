public class SearchSingleList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next = new Node(40);
        int x =40;

        //System.out.println(SearchLinlList(head, x));
        System.out.println(Searchlist(head, x));
        
    }
    // naive solution
//    public static int SearchLinlList(Node head, int x)
//     {
//         int pos =1;
//         Node curr=head;
//         while(curr!=null){
//             if(curr.data==x){
//                 return pos;
//             }
//             else{
//                 pos++;
//                 curr =curr.next;
//             }
//         }
//         return-1;
// optimize solution
           public static int Searchlist(Node head,int x){
            if(head==null){
                return-1;

            }
            if (head.data==x){
                return 1;
            }
            else {
                int res=Searchlist(head.next, x);
                if(res==-1){
                    return -1;

                }else{
                    return res+1;
                }
            }
           }
    }

    class Node 
    {
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

    
    

