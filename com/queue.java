package xr.com;
class eam{
    public int size=12;
    public int front;
    public int rear;
    public int arr[];

    eam(){
        front = 0;
        rear =-1;
        arr = new int[size];
    }

    public void enqueue(int val){
        if(rear==size-1){
            System.out.println("Queue is Overflow");
        }else{
            rear++;
            arr[rear]=val;
            System.out.println("the Inserted value in queue is "+val);
        }
    }

    public int dequeue(){

        int val=-1;
        if(front==rear || front > rear){
            System.out.println("Queue is Underflow");
        }else{
            front++;
            val=arr[front];
        }
        return val;
    }

    public void display(){
        for(int i= front;i<=rear;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }

}
public class queue {
    public static void main(String[] args) {
    eam q=new eam();
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        q.enqueue(16);
        q.display();
        System.out.println("Dequeue element is "+q.dequeue());
        q.display();
    }
}
