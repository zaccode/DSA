package xr.com;
class QLL{
    nod front = null;
    nod rear = null;

    class nod {
    int data;
    nod next;

    nod(int val) {
        data = val;
    }
}

    void enqueue(int val){
        nod n =new nod(val);
        if(n==null){
            System.out.println("Queue is Overflow");
        }else{
           n.next=null;
           if(front == null){
               front = rear = n;
           }else{
               rear.next=n;
               rear = n;
           }
        }
    }

    int dequeue(){
        nod ptr=front;
        int val=-1;
        if(front == null){
            System.out.println("Queue is empty");
        }else{
            front = front.next;
            val=ptr.data;
            ptr=null;
        }
        return val;
    }

    void display(nod ptr){
        while(ptr!=null){
            System.out.println("Element:"+ptr.data);
            ptr=ptr.next;
        }
    }
}
public class QueueLL {
    public static void main(String[] args) {
        QLL qll = new QLL();
        qll.enqueue(12);
        qll.enqueue(13);
        qll.enqueue(14);
        qll.enqueue(15);
        qll.display(qll.front);
        System.out.println("Dequeue fonction is call "+qll.dequeue());
        qll.display(qll.front);

    }
}
