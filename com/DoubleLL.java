package xr.com;
class DLL{
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int val){
            data = val;
        }
    }
    public void push(int val){
        Node n =new Node(val);
        n.next=head;
        n.prev=null;
        if(head!=null){
            head.prev =n;
        }
        head = n;
    }

    public void inserttail(Node head,int val){
        if(head==null){
            push(val);
        }
        Node n= new Node(val);
        Node temp=head;
        while(temp.next!=null){
//            System.out.println("");
            temp = temp.next;
        }
        temp.next=n;
        n.prev =temp;
    }
    public void print(Node node){
        while(node!=null){
            System.out.print(node.data+ "->");
            node =node.next;
        }
        System.out.print("NULL");
        System.out.println("");
    }
    public Node deleteathead(Node head){
        Node temp=head;
        head=head.next;
        head.prev=null;
        temp=null;
    return head;
    }
    public Node delteatlast(Node head){
        if(head==null){
            System.out.println("deletion not performing");
            return null;
        }
        Node last =head;
        while(last.next.next!=null){
            last=last.next;
        }
        last.next=null;
        last.prev.next=last;
        return head;
    }
}
public class DoubleLL {
    public static void main(String[] args) {
    DLL dll =new DLL();
        dll.push(12);
        dll.push(13);
        dll.push(14);
        dll.push(15);
        dll.push(16);
//        dll.print(dll.head);

        dll.inserttail(dll.head,23);
        dll.inserttail(dll.head,24);
        dll.inserttail(dll.head,25);
        dll.inserttail(dll.head,26);
        dll.inserttail(dll.head,27);
        dll.print(dll.head);
        System.out.println("++++++++");
//        dll.head= dll.deleteathead(dll.head);
//        dll.print(dll.head);
        dll.head= dll.delteatlast(dll.head);
        dll.print(dll.head);



    }
    }