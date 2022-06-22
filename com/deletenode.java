package xr.com;
import java.util.Scanner;
class nods{
    nods left,right;
    int data;
    public nods(int data){
        this.data = data;
    }
}

public class deletenode {
    static nods createtree(){
        Scanner sc= new Scanner(System.in);
        nods root = null;

        System.out.println("Enter the data");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new nods(data);          // create the node

        System.out.println("Enter left for "+data);
        root.left= createtree();

        System.out.println("Enter right for "+data);
        root.right= createtree();


        return root;
    }

    static void inorder(nods root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data + "," );
            inorder(root.right);
        }
    }

    public static nods deletenode(nods root,int key){
        if(root == null) return root;
        if(key < root.data){        //if key is less than roots data,so grab the left side root
            root.left = deletenode(root.left,key);
        }
        else if(key > root.data){
            root.right = deletenode(root.right,key);
        }
        else
        {
            if(root.left == null)
                return root.right;

            else if(root.right == null)
                return root.left;
            root.data = minval(root.right);
            root.right = deletenode(root.right,root.data);
        }
        return root;
    }

    static int minval(nods root){
        int minv = root.data;
        while(root.left != null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

//    static nods search(nods root ,int key){
//        if(root ==null){
//            return null;
//        }
//        if(key == root.data)
//            return root;
//        else if(key < root.data)
//            return search(root.left,key);
//        else if(key > root.data)
//            return search(root.right,key);
//       return root;
//    }

    static boolean search(nods root,int x){
        if(root ==null){
            return false;
        }
        if(root.data ==x){
            return true;
        }
        if(root.data > x){
            return search(root.left,x);
        }else if(root.data < x){
            return search(root.right,x);
        }
        return false;
    }

   static boolean isBst(nods root){
        nods prev =null;
        if(root!=null){
            if(!isBst(root.left)){
                return false;
            }
            if(prev != null && (root.data <= prev.data)){
                return false;
            }
            prev =  root;
            return isBst(root.right);
        }else{
            return true;
        }
   }

    public static void main(String[] args) {
        nods root = createtree();
        inorder(root);
        System.out.println(" ");
       root= deletenode(root,9);
        inorder(root);



        if(search(root,3)){
            System.out.println("The Element Was Found in BST");
        }else{
            System.out.println("Element not found");
        }

        if(isBst(root)){
            System.out.println("This is the bst");
        }else{
            System.out.println("this is  not bst");
        }
    }
}
