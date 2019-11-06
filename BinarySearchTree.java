import java.util.*;
public class BinarySearchTree{
    Node root;
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data; 
            left = right  = null;
        }
    }
    void insert(int data){
        root = insertRec(root,data);
    }
        Node insertRec(Node root, int data){
            if(root == null){
                root = new Node(data);
                return root;
            }
            if(data < root.data){
                root.left = insertRec(root.left,data);
            } else if(data > root.data){
                root.right = insertRec(root.right,data);
            }
            return root;
        }
          void inorder()  { 
            inorderRec(root); 
         } 
       void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.print(" "+root.data); 
            inorderRec(root.right); 
        } 
    } 
 
     public static void main(String[] args) { 
        BinarySearchTree tree = new BinarySearchTree(); 
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);
        System.out.println("Inorder:"); 
         tree.inorder(); 
          System.out.println("");
        System.out.println("Preorder:"); 
         tree.postorder();
          System.out.println("");
        System.out.println("Postorder:"); 
         tree.postorder();
    } 
   
    
}
