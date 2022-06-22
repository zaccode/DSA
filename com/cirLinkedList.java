package xr.com;
class cirLL{
    node head;//heads points to the first node
    node tail;//tails points to the last node

    class node{
        int data;
        node next;
        node(int val){
            data=val;
        }
    }
    public node insertF(node head,int val){
        node ptr=new node(val);
        if(head==null){
            head=ptr;
        }else{
            tail.next=ptr;
        }
        tail=ptr;
        tail.next = head;
    return head;
    }

    void display(node head) {
        node ptr = head;
        if (head != null) {
            do {
                System.out.println(" " + ptr.data);
                ptr = ptr.next;
            } while (ptr != head);
        }
    }
}
public class cirLinkedList {
    public static void main(String[] args) {
        cirLL cl= new cirLL();
        cl.head=cl.insertF(cl.head,12);
        cl.head=cl.insertF(cl.head,13);
        cl.head=cl.insertF(cl.head,14);
        cl.head=cl.insertF(cl.head,15);
         cl.display(cl.head);
    }
}
