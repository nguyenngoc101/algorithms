package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day22 {

    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    static class Solution{
        public static int getHeight(Node root){
            //Write your code here
            if (root == null) {
                return -1;
            }

            int rightHeight = getHeight(root.right);
            int leftHeight = getHeight(root.left);

            return rightHeight > leftHeight ? rightHeight + 1 : leftHeight + 1;
        }

        public static Node insert(Node root,int data){
            if(root==null){
                return new Node(data);
            }
            else{
                Node cur;
                if(data<=root.data){
                    cur=insert(root.left, data);
                    root.left=cur;
                }
                else{
                    cur=insert(root.right, data);
                    root.right=cur;
                }
                return root;
            }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T--> 0){
                int data=sc.nextInt();
                root = insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }
    }
}
