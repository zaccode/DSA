package xr.com;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}

public class LinkedListInsertion {
    static node insert(node head, int data){
        node ptr=new node(data);
        ptr.next=head;

        return ptr;
    }
    static void print(node head){
        node ptr=head;
        System.out.print("head->");
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.print("null");
    }
    static node insertIndex(node head,int index,int data){
        node n=new node(data);

        node ptr=head;
        int i=0;
        while(i!=index-1){
            ptr=ptr.next;
            i++;
        }
        n.next=ptr.next;
        ptr.next=n;
        return head;
    }

    static node insertEnd(node head,int data){
        node ptr=new node(data);

        node p=head;
//        int i=0;
        while(p.next!=null){
            p=p.next;

        }
        p.next=ptr;
//        ptr.next=null;
        return head;
    }

    public static void main(String[] args) {
//     node n1=new node(10);
//     node n2=new node(20);
//     node n3=new node(30);

     node head=null;
//     n1.next=n2;
//     n2.next=n3;
//     n3.next=null;


        head=insert(head,60);
        head=insert(head,50);
        head=insert(head,40);
        head=insert(head,30);
        head=insert(head,20);
        head=insert(head,10);
        head=insertIndex(head,5,80);
        head=insertEnd(head,90);
     print(head);

    }
}
