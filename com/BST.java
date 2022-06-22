package xr.com;
import java.util.Scanner;
class no{
    no left,right;
   int data;
    public no(int data){
        this.data=data;
    }
}
public class BST {
    static no createTree(){
        Scanner sc= new Scanner(System.in);
        no root=null;

        System.out.println("Enter data");
        int data =sc.nextInt();
        if(data ==-1) return null;
        root = new no(data);
        System.out.println("Enter left for "+data);
        root.left=createTree();
        System.out.println("Enter right for "+data);
        root.right=createTree();
        return root;
    }
    static void inorder(no root){
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }


    }
    static void preorder(no root){
        if(root!=null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(no root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        no root = createTree();
//        System.out.println(root);
        inorder(root);
        System.out.println();
        System.out.print("=====================");
        System.out.println();
        preorder(root);
        System.out.println();
        System.out.print("=====================");
        System.out.println();
        postorder(root);
    }
}
