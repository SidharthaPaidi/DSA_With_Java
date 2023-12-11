
/**
 * BT
 */
import java.lang.reflect.Array;
import java.util.*;

public class BT {
    public static class BinaryTree {
        String[] arr;
        int lastUsedIndex;

        public BinaryTree(int size) {
            this.arr = new String[size + 1];
            this.lastUsedIndex = 0;
            System.out.println("The BinaryTree of size " + size + " has been created");
        }

        public boolean isFull() {
            if (arr.length - 1 == lastUsedIndex) {
                return true;
            } else {
                return false;
            }

        }

        public void insert(String value) {
            if (!isFull()) {
                arr[lastUsedIndex + 1] = value;
                lastUsedIndex++;
                System.out.println("The value of " + value + " has been inserteted");
            } else {
                System.out.println("The Tree is Full");
            }
        }

        // preOrder Traversal
        public void preOrder(int index) {
            if (index > lastUsedIndex) {
                return;
            }
            System.out.println(arr[index] + " ");
            preOrder(index * 2);
            preOrder(index * 2 + 1);
        }

        // inOrder Traversal
        public void inOrder(int index) {
            if (index > lastUsedIndex) {
                return;
            }

            inOrder(index * 2);
            System.out.println(arr[index] + " ");
            inOrder(index * 2 + 1);
        }

        // postOrder Traversal
        public void postOrder(int index) {
            if (index > lastUsedIndex) {
                return;
            }

            postOrder(index * 2);
            postOrder(index * 2 + 1);
            System.out.println(arr[index] + " ");
        }

        // Level Order Traversal
        public void levelOrder() {
            for (int i = 1; i <= lastUsedIndex; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        // search in binary tree
        public int search(String value) {
            for (int i = 1; i <= lastUsedIndex; i++) {
                if (arr[i] == value) {
                    System.out.println("Value found at " + i);
                    return i;
                }
            }
            return -1;
        }

        // delete the Node
        public void deleteNode(String value) {
            int location = search(value);
            if (location == -1) {
                System.out.println("Node not Found");
            } else {
                arr[location] = arr[lastUsedIndex];
                lastUsedIndex--;
                System.out.println("Successfully deteted the given node");
            }

        }

        // delete entire tree
        public void deleteTree() {
            try {
                arr = null;
                System.out.println("Successfully delete the tree");
            } catch (Exception e) {
                System.out.println("There is an error while deleting the tree");
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(9);
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");
        // binaryTree.preOrder(1);
        // binaryTree.inOrder(1);
        // binaryTree.postOrder(1);
        binaryTree.levelOrder();
        System.out.println();
        // System.out.println( binaryTree.search("N9"));
        // binaryTree.deleteNode("N3");
        binaryTree.deleteTree();
        // binaryTree.levelOrder();

    }
}