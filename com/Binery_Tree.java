package xr.com;
class BT{

    node root=null;
    class node{
        int data;
        node left;
        node right;

        node(int val){
            data=val;
            left=null;
            right=null;
        }
    }

    node insert(node root,int key){
        if(root==null){
            node n =new node(key);
            root =n;
            return root;
        }

        if(root.data < key){
            root.right= insert(root.right,key);
        }else if(root.data>key){
            root.left = insert(root.left,key);
        }
        return root;
    }

//    node insert(node root ,int key){
//        node n =new node(key);          //create a root
//
//        node cur = root;
//        node parent=null;
//
//        while(cur!=null){           // to grab the parent root
//            parent = cur;
//            if(key < cur.data){
//                cur=cur.left;
//            }else{
//                cur = cur.right;
//            }
//
//        }
//
//        if(parent == null){
//            parent = n;
//        } else if (key < parent.data) {
//            parent.left=n;
//        }else{
//            parent.right =n;
//        }
//        return parent;
//    }

    static void inorder(node root){
        if(root != null) {
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);

        }
    }

//    static void preorder(node root){
//        if(root !=null){
//            System.out.println(root.data+" ");
//            preorder(root.left);
//            preorder(root.right);
//        }
//    }
}
public class Binery_Tree {

    public static void main(String[] args) {
        BT bt =new BT();
        bt.root=bt.insert(bt.root, 12);
        bt.root=bt.insert(bt.root, 13);
        bt.root=bt.insert(bt.root, 14);
        bt.root=bt.insert(bt.root, 15);
        bt.root=bt.insert(bt.root, 16);

        bt.inorder(bt.root);
//        bt.preorder(bt.root);
    }
}
