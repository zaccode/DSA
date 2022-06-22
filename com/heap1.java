package xr.com;

class maxheap{
    private int[] theHeap;
    private int capacity;
    private int pos;

    public maxheap(){
       pos =1;
       capacity = 10;
       theHeap = new int[capacity];
    }
    public void insert(int value){
        if(pos == capacity){
            System.out.println("Increase the Capacity");
        }else{
            theHeap[pos++] = value;

            int child = pos-1;
            int parent = child/2;

            while(theHeap[parent] < theHeap[child] && parent > 0){
                int temp = theHeap[parent];
                theHeap[parent] = theHeap[child];
                theHeap[child] = temp;

                child = parent;
                parent = child/2;
            }
        }
    }
    void printArray(){
        for(int i =1;i<pos;++i){
            System.out.print(theHeap[i]+" ");
        }
        System.out.println();
    }
}

public class heap1 {


    public static void main(String[] args) {
        maxheap heap = new maxheap();
        heap.insert(12);
        heap.insert(7);
        heap.insert(6);
        heap.insert(10);
        heap.insert(8);
        heap.insert(20);
        heap.insert(30);

        heap.printArray();
    }
}
