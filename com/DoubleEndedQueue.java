package xr.com;

    class que{
       public int size;
       public int front;
       public int rear;
        int arr[];

        que (){
            size=30;

            front=size/2;
            rear = (size/2)+1;
            arr =new int[size];
        }

    void addrear(int val){
        if( rear ==size){
            System.out.println("Rear is full");
        }
        if(front == -1){
            front =0;
            rear =0;
            arr[0]=val;
            return;
        }
        rear++;
        arr[rear] =val;
    }
    void addfront(int val){
            if(front==0){
                System.out.println("front is full");
                return;
            }
//           if(front ==-1){
//               front=0;
//               rear=0;
//               arr[0]=val;
//               return;
//           }
           front--;
           arr[front]=val;
    }

    int deletefront(){
            if(front ==-1){
                System.out.println("Queue is Empty");
                return -1;
            }
            if(front == rear){
                int temp1=arr[front];
                front = -1;
                rear =-1;
                return temp1;
            }
        int temp =arr[front];
             front++;
            return temp;
    }

    int deleterear(){
            if(rear ==-1){
                System.out.println("Queue is empty");
                return -1;
            }
            if(front ==rear){
                int temp1 =arr[rear];
                front=-1;
                rear=-1;
                return temp1;
            }
            int temp = arr[rear];
            rear--;
            return temp;
    }
    void display(){
           for(int i=(size/2);i>=front;i--){
               System.out.print("-"+arr[i]);
           }
        System.out.println("");
        System.out.println("==========");
    }
    void print(){
            for(int i=(size/2)+1;i<=rear;i++){
                System.out.print("-"+arr[i]);
            }
        System.out.println("");
        System.out.println("==========");
    }
    void show(){
            for(int i=0;i<=size;i++){
                System.out.print("-"+arr[i]);
            }
    }
}
public class DoubleEndedQueue {
    public static void main(String[] args) {
        que Q= new que();
        Q.addfront(12);
        Q.addfront(13);
        Q.addfront(14);
        Q.addfront(15);
        Q.addfront(16);
        Q.display();
        Q.deletefront();
        Q.display();

        Q.addrear(23);
        Q.addrear(24);
        Q.addrear(25);
        Q.addrear(26);
        Q.addrear(27);
        Q.print();
        Q.deleterear();
        Q.print();
        Q.show();
    }
}
