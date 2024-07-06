import java.util.*;

public class RootToLeaf {

    static class Node {
        int data;
        Node left, right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void printRootToLeaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        if(root.left == null && root.right==null){
            for(int i=0 ; i<path.size() ; i++){
                System.out.print(path.get(i)+"->");
                System.out.println();
            }
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String args[]){
        
    }
}
