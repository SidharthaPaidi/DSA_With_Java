import java.util.*;

public class BT {
    public static class BinaryNode {
        public String value;
        public BinaryNode left;
        public BinaryNode right;
        public int height;

    }

    public static class BinaryTreeLL {
        BinaryNode root;

        public BinaryTreeLL() {
            this.root = null;
        }

        // pre Order Traversal
        public void preOrder(BinaryNode node) {
            if (node == null) {
                return;
            }
            System.out.println(node.value + "  ");
            preOrder(node.left);
            preOrder(node.right);
        }

        // In order Traversal
        public void inOrder(BinaryNode node) {
            if (node == null) {
                return;
            }
            inOrder(node.left);
            System.out.println(node.value + "  ");
            inOrder(node.right);
        }

        //Post order Traversal
        public void postOrder(BinaryNode node) {
            if (node == null) {
                return;
            }
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.value + "  ");
            
        }

        // Level Order Traversal
        public void levelOrder() {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                System.out.print(presentNode.value + "  ");
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }

        // search an Node in binary node
        public boolean search(String n) {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                if (presentNode.value == n) {
                    return true;
                } else {
                    if (presentNode.left != null) {
                        queue.add(presentNode.left);
                    }
                    if (presentNode.right != null) {
                        queue.add(presentNode.right);
                    }
                }

            }
            return false;
        }

        // Insertion in Binary tree
        public void insert(String n) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = n;
            if (root == null) {
                root = newNode;
                System.out.println("Successfully Inserted the Root Node");
                return;
            } else {
                Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
                queue.add(root);
                while (!queue.isEmpty()) {
                    BinaryNode presentNode = queue.remove();
                    if (presentNode.left == null) {
                        presentNode.left = newNode;
                        System.out.println("Successfully Inserted");
                        break;
                    } else if (presentNode.right == null) {
                        presentNode.right = newNode;
                        System.out.println("Successfully Inserted");
                        break;
                    } else {
                        queue.add(presentNode.left);
                        queue.add(presentNode.right);
                    }
                }
            }
        }
        // Deletion of the Node

        // Get Deepest Node
        public BinaryNode getDeepestNode() {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            BinaryNode presentNode = null;
            while (!queue.isEmpty()) {
                presentNode = queue.remove();
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }

            }
            return presentNode;
        }

        // Delete DeepestNode
        public void deleteDeepestNode() {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            BinaryNode previousNode, presentNode = null;
            while (!queue.isEmpty()) {
                previousNode = presentNode;
                presentNode = queue.remove();
                if (presentNode.left == null) {
                    previousNode.right = null;
                    return;
                } else if (presentNode.right == null) {
                    presentNode.left = null;
                    return;
                }
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }

        // Delete the Node
        public void deleteNode(String n) {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                if (presentNode.value == n) {
                    presentNode.value = getDeepestNode().value;
                    deleteDeepestNode();
                    System.out.println("Sucessfully Deleted the Node");
                    return;
                } else {
                    if (presentNode.left != null)
                        queue.add(presentNode.left);
                    if (presentNode.right != null)
                        queue.add(presentNode.right);
                }
            }
            System.out.println("The Node is not in the Tree");
        }

        //delete entire tree
        public void deletetree(){
            root = null;
            System.out.println("Successfully deleted the Binary tree");
        }

    }

    public static void main(String[] args) {
        BinaryTreeLL binarytree = new BinaryTreeLL();
        // BinaryNode N1 = new BinaryNode();
        // N1.value = "N1";
        // BinaryNode N2 = new BinaryNode();
        // N2.value = "N2";
        // BinaryNode N3 = new BinaryNode();
        // N3.value = "N3";
        // binarytree.root = N1;
        // N1.left = N2;
        // N1.right = N3;
        // // binarytree.levelOrder(N1);
        // // System.out.println(binarytree.search("N2"));
        // binarytree.levelOrder(N1);
        // binarytree.insert("N4");
        // binarytree.levelOrder(N1);
        binarytree.insert("N1");
        binarytree.insert("N2");
        binarytree.insert("N3");
        binarytree.insert("N4");
        binarytree.insert("N5");
        binarytree.insert("N6");
        // binarytree.postOrder(N1);

        // binarytree.levelOrder();
        // System.out.println(binarytree.getDeepestNode().value);
        // binarytree.levelOrder();
        // System.out.println();
        binarytree.deleteDeepestNode();
        // binarytree.levelOrder();
        // binarytree.deleteNode("N2");
        // binarytree.levelOrder();
        // binarytree.deletetree();

    }
}
