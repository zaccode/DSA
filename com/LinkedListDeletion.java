package xr.com;
class LL{
    node head;
    class node{
        int data;
        node next;
        node(int val){
            data = val;
        }
    }
    node insert(node head,int val){
     node ptr=new node(val);
     ptr.next=head;
     head=ptr;
     return head;
    }
    node deleteathead(node head){
        if(head==null){
            System.out.println("No deletion operation is performed");
        }
        node temp=head;
        head=head.next;
        temp=null;

        return head;
    }
    node deletepos(node head,int pos){
        if(pos==1){
            deleteathead(head);

        }
        node temp =head;
        node ptr =head.next;
        for(int i=0;i<pos-2;i++){
            temp= temp.next;
            ptr= ptr.next;
        }
        temp.next=ptr.next;


        return head;
    }
    void display(node ptr){
        while(ptr!=null){
            System.out.println("ELement:"+ptr.data);
            ptr=ptr.next;
        }
    }
}
public class LinkedListDeletion {
    public static void main(String[] args) {
        LL ll =new LL();
        ll.head=ll.insert(ll.head, 16);
        ll.head=ll.insert(ll.head, 17);
        ll.head=ll.insert(ll.head, 18);
        ll.head=ll.insert(ll.head, 19);
        ll.head=ll.insert(ll.head, 20);
        ll.head=ll.insert(ll.head, 21);
        ll.head=ll.insert(ll.head, 22);
        ll.display(ll.head);
        System.out.println("_____________");
//        ll.head= ll.deleteathead(ll.head);
        ll.head= ll.deletepos(ll.head,3);
        ll.display(ll.head);

    }
}