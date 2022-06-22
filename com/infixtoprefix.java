package xr.com;
class xm{
    public int top;
    public int size;
    public char arr[];
    xm(){
       top=-1;
       size=20;
       arr=new char[size];
    }

    boolean empty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    boolean full(){
        if(top==size-1){
            return true;
        }
        return false;
    }

    void push(char val){
        if(full()){
            System.out.println("Stack is Overflow");
        }else{
            top++;
            arr[top]=val;
        }
    }

    char pop(){
        char val;
        if(empty()){
            System.out.println("Stack is underflow");
        }else{
        val=arr[top];
        top--;
        }
        return 0;
    }

    char stacktop() {
        return arr[top];
    }
}
public class infixtoprefix {

    static boolean operator(char ch){
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^' || ch=='(' || ch==')'){
            return true;
        }
        return false;
    }
    static int prec(char ch){
        if(ch=='^'){
            return 3;
        }else if(ch=='*' || ch=='/'){
            return 2;
        }else if(ch=='+' || ch=='-'){
            return 1;
        }
        return 0;
    }

    static String intopo(String exp){
        xm st=new xm();
        String res=new String(" ");
        for(int i=0;i<exp.length();i++){
            char c =exp.charAt(i);
            if(!operator(c)){
                    res += c;

            }else if(c=='('){
                st.push(c);
            }else if(c==')') {
                while (!st.empty() && st.stacktop() == '(') {
                    res += st.stacktop();
                    st.pop();
                        }
                    }

            else{
                while(!st.empty() && (prec(c) <= prec(st.stacktop()))){
                    res+=st.stacktop();
                    st.pop();
                }
                st.push(c);
            }
        }
        while(!st.empty()){
           res+=st.stacktop();
           st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
    String exp = "a+b *(c^b*d)";
        System.out.println("Infix to postfix conversion is "+intopo(exp));
    }
}
