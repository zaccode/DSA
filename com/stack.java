package xr.com;

class sam{

    public int size;
    public int top;
    public int arr[];

   public sam(){

           size = 50;
           top = -1;
           arr = new int[size];

    }

    public  void push(int val){
        if(top==size-1){
            System.out.println("stack is Overflow");
        }else{
            top++;
            arr[top]=val;
        }
    }
    public int pop(){
        int val=-1;
        if(top==-1){
            System.out.println("Stack is Underflow");
        }else{
           val=arr[top];
           top--;
        }
        return val;
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.println("element:"+arr[i]);
        }
    }
}

public class stack {
    public static void main(String[] args) {
//        Stack st=new Stack();    //define the classs

            sam st = new sam();

            st.push(12);
            st.push(13);
            st.push(14);
            st.push(15);
            st.display();

        System.out.println(st.pop());
        st.display();

    }
}
