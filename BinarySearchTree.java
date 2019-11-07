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
