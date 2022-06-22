package xr.com;
class sd{
    public int size;
    public int top;
    public int arr[];

    sd(){
        size = 30;
        top=-1;
        arr=new int[size];
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    void push(int val){
        if(isFull()){
            System.out.println("Stack is Empty");
        }else{
            top++;
            arr[top]=val;
        }
    }

    boolean isFull(){
        if(top==size-1){
            return true;
        }
        return false;
    }
    int pop(){
        int val=-1;
        if(isEmpty()){
            System.out.println("Stack is Underflow");
        }else{
           val=arr[top];
           top--;
//            System.out.println("the pop Element  is "+val);
        }
        return val;
    }
    int stacktop(){
        return arr[top];
    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.println(" Element in stack is "+arr[i]);
        }
    }
}

public class parenthesismatch {

    public static boolean parenthesis(String  str){
        sd st = new sd();
        char c;
        for(int i=0;i<str.length();i++){
            c= str.charAt(i);
            if(c == '('){
                st.push(c);
            }else if(c==')'){
                if(st.isEmpty()){
                    return false;
                }else if( st.stacktop()=='('){
                   st.pop();
                }


            }
            if(c=='{'){
                st.push(c);
            }else if(c=='}'){
                if(st.isEmpty()){
                    return false;
                }else if(st.stacktop()=='{'){
                    st.pop();
                }
            }
            if(c=='['){
                st.push(c);
            }else if(c==']'){
                if(st.isEmpty()){
                    return false;
                }else if(st.stacktop()=='['){
                    st.pop();
                }
            }
        }

       return st.isEmpty();
    }


    public static void main(String[] args) {
        String exp = "{a+[b+(c+d)+e+]f}";
    if(parenthesis(exp)){
        System.out.println("parenthesis Match" );
    }else{
        System.out.println("parenthesis doesn't Match" );

    }

    }
}



//import java.util.*;
//class Solution{
//    public static boolean isBalanced(String s){
//        Stack<Character>st = new Stack<Character>();
//
//        for(int i=0;i<s.length();i++){
//            char x = s.charAt(i);
//            if(x== '{' || x=='[' || x=='(' ){
//                st.push(x);
//
//            }else {
//                if(st.isEmpty()){
//                    return false;
//
//                }
//                char ch;
//                switch(x){
//                    case ')':
//                        ch= st.pop();
//                        if(ch == '{' || ch == '['){
//                            return false;
//                        }
//                        break;
//
//                    case '}':
//                        ch = st.pop();
//                        if(ch == '(' || ch == ']'){
//                            return false;
//                        }
//                        break;
//
//                    case ']':
//                        ch = st.pop();
//                        if(ch == '{' || ch == '('){
//                            return false;
//                        }
//                        break;
//                }
//
//            }
//        }
//        return (st.isEmpty());
//    }
//
//
//
//    public static void main(String []argh)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        while (sc.hasNext()) {
//            String input=sc.next();
//            if(isBalanced(input)){
//                System.out.println("true");
//            }else {
//                System.out.println("false");
//            }
//        }
//
//    }
//}




