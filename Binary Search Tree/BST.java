import java.util.*;

/**
 * BST
 */
public class BST {
    public static class BinaryNode {
        public int value;
        public int height;
        public BinaryNode left;
        public BinaryNode right;
    }

    public static class BinarySearchTree {
        BinaryNode root;

        public BinarySearchTree() {
            root = null;
        }

        // Insertion
        private BinaryNode insert(BinaryNode currentNode, int value) {
            if (currentNode == null) {
                BinaryNode newNode = new BinaryNode();
                newNode.value = value;
                // System.out.println("Successfully inserted the Node of value "+ value);
                return newNode;
            } else if (value <= currentNode.value) {
                currentNode.left = insert(currentNode.left, value);
                return currentNode;
            } else {
                currentNode.right = insert(currentNode.right, value);
                return currentNode;
            }
        }

        public void insert(int value) {
            root = insert(root, value);
        }

        // preOrder Traversal
        public void preOrder(BinaryNode node) {
            if (node == null) {
                return;
            }
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }

        // inOrder
        public void inOrder(BinaryNode node) {
            if (node == null) {
                return;
            }

            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }

        // postOrder
        public void postOrder(BinaryNode node) {
            if (node == null) {
                return;
            }

            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }

        //levelOrder 
        public void levelOrder(BinaryNode node){
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                System.out.print(presentNode.value+" ");
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        
        //search in BST
        public BinaryNode search(BinaryNode node,int value){
            if(node == null){
                System.out.println("The node with value "+ value + " is not found in BST ");
                return null;
            }else if(node.value == value){
                System.out.println("The node with value "+ value + " is found in BST ");
                return node;
            }else if(value<node.value){
                return search(node.left,value);
            }else{
                return search(node.right, value);
            }
        }
        //minimum node
        public BinaryNode minimumNode(BinaryNode root){
            if(root.left == null){
                return root;
            }else{
                return minimumNode(root.left);
            }
        }
        //delete the node
        public BinaryNode deleteNode(BinaryNode root , int value){
            if(root == null){
                System.out.println("Node with the value "+ value + " not found");
                return null;
            }
            if(value<root.value){
                root.left = deleteNode(root.left, value);
            }else if(value>root.value){
                root.right = deleteNode(root.right, value);
            }else{
                if(root.left!=null && root.right!=null){
                    BinaryNode temp = root;
                    BinaryNode successorNode = minimumNode(temp.right);
                    root.value = successorNode.value;
                    root.right = deleteNode(root.right, successorNode.value);
                }else if(root.left!=null){
                    root = root.left;
                }else if(root.right!=null){
                    root = root.right;
                }else {
                    root = null;
                }
                
            }
            return root;
        }
        //delete entire tree
        public void deleteTree(){
           try{
             root = null;
             System.out.println("Successfully Deleted");
           }catch (Exception e){
            System.out.println("Some error occured while deleting the tree");
           }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        // newBST.preOrder(newBST.root);
        // newBST.levelOrder (newBST.root);
        // System.out.println();
        // newBST.search(newBST.root, 200);
        newBST.deleteNode(newBST.root, 70);
        // newBST.deleteTree();
        newBST.levelOrder (newBST.root);
    }
}