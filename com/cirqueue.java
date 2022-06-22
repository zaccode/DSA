package xr.com;
class wse{
    public int front;
    public int rear;
    public int size=6;
    public int data;
    public int []arr;
    wse(){
        front=rear=0;
        arr= new int[size];
    }

    public void enqueue(int val){
        if((rear+1)%size == front){
            System.out.println("Queue is Overflow");
        }else{
            rear=(rear+1)%size;
            arr[rear]=val;
            System.out.println("The Inserted value in Queue is "+val);
        }
    }
    public int dequeue(){
        int val=-1;
        if(front == rear){
            System.out.println("Queue is Underflow");
        }else{
            front = (front+1)%size;
            val=arr[front];
        }
        return val;
    }

    public void display(){
        System.out.println();
        for(int i=front+1;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class cirqueue {
    public static void main(String[] args) {
        wse q=new wse();
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        q.enqueue(16);

        q.display();

        System.out.println("Dequeue of element in queue is "+q.dequeue());
        System.out.println("Dequeue of element in queue is "+q.dequeue());
        System.out.println("Dequeue of element in queue is "+q.dequeue());

        q.enqueue(23);
        q.enqueue(24);
        q.enqueue(25);
        q.enqueue(26);

        q.display();

    }
}
