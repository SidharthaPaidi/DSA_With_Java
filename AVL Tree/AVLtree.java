
/**
 * AVLtree
 */
import java.util.*;

public class AVLtree {
    public static class BinaryNode {
        public int value;
        public int height;
        public BinaryNode left;
        public BinaryNode right;

        public BinaryNode() {
            this.height = 0;
        }
    }

    public static class AVL {
        BinaryNode root;

        public AVL() {
            root = null;
        }

        // preOrder
        public void preOrder(BinaryNode node) {
            if (node == null)
                return;
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }

        // inOrder
        public void inOrder(BinaryNode node) {
            if (node == null)
                return;
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }

        // postOrder
        public void postOrder(BinaryNode node) {
            if (node == null)
                return;
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }

        // level order
        public void levelOrder(BinaryNode node) {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(node);
            while (!queue.isEmpty()) {
                BinaryNode present = queue.remove();
                System.out.print(present.value + "  ");
                if (present.left != null) {
                    queue.add(present.left);
                }
                if (present.right != null) {
                    queue.add(present.right);
                }
            }

        }

        // search
        public BinaryNode search(BinaryNode node, int value) {
            if (node == null) {
                System.out.println("The node with the value " + value + " is not found");
                return null;
            } else if (node.value == value) {
                System.out.println("The node with the value " + value + " is found");
                return node;
            } else if (node.value < value) {
                return search(node.left, value);
            } else {
                return search(node.right, value);
            }

        }

        // getHeight method
        public int getHeight(BinaryNode node) {
            if (node == null)
                return 0;
            return node.height;
        }

        // right Rotation
        private BinaryNode rotateRight(BinaryNode disBalancedNode) {
            BinaryNode newRoot = disBalancedNode.left;
            disBalancedNode.left = disBalancedNode.left.right;
            newRoot.right = disBalancedNode;
            disBalancedNode.height = 1 + Math.max(getHeight(disBalancedNode.left), getHeight(disBalancedNode.right));
            newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
            return newRoot;
        }

        // left Rotation
        private BinaryNode rotateLeft(BinaryNode disBalancedNode) {
            BinaryNode newRoot = disBalancedNode.right;
            disBalancedNode.right = disBalancedNode.right.left;
            newRoot.left = disBalancedNode;
            disBalancedNode.height = 1 + Math.max(getHeight(disBalancedNode.left), getHeight(disBalancedNode.right));
            newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
            return newRoot;
        }

        // getBalanced
        public int getBalanced(BinaryNode node) {
            if (node == null)
                return 0;
            return getHeight(node.left) - getHeight(node.right);
        }

        // insert a value in tree
        private BinaryNode insert(BinaryNode node, int value) {
            if (node == null) {
                BinaryNode newNode = new BinaryNode();
                newNode.value = value;
                newNode.height = 1;
                return newNode;
            } else if (value < node.value) {
                node.left = insert(node.left, value);
            } else {
                node.right = insert(node.right, value);
            }

            node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
            int balance = getBalanced(node);
            if (balance > 1 && value < node.left.value) {
                return rotateRight(node);
            }
            if (balance > 1 && value > node.left.value) {
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }
            if (balance < -1 && value < node.right.value) {
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }
            if (balance < -1 && value > node.right.value) {
                return rotateLeft(node);
            }
            return node;
        }

        public void insertNode(int value) {
            root = insert(root, value);
        }

        // get succcessor value of node
        public BinaryNode getMinimumNode(BinaryNode root) {
            if (root.left == null)
                return root;
            else
                return getMinimumNode(root.left);

        }

        // Delete the Node
        public BinaryNode delete(BinaryNode node, int value) {
            if (node == null) {
                System.out.println("The Value " + value + " not found in the BST");
            }
            if (value < node.value) {
                node.left = delete(node.left, value);
            } else if (value > node.value) {
                node.right = delete(node.right, value);
            } else {
                if (node.left != null && node.right != null) {
                    BinaryNode temp = node;
                    BinaryNode miniBinaryNode = getMinimumNode(temp.right);
                    node.value = miniBinaryNode.value;
                    node.right = delete(node.right, miniBinaryNode.value);
                } else if (node.left != null) {
                    node = node.left;
                } else if (node.right != null) {
                    node = node.right;
                } else {
                    node = null;
                }
            }
            int balance = getBalanced(node);
            if (balance > 1 && getBalanced(node.left) >= 0) {
                return rotateRight(node);
            }
            if (balance > 1 && getBalanced(node.left) < 0) {
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }
            if (balance < -1 && getBalanced(node.right) <= 0) {
                return rotateLeft(node);
            }
            if (balance < -1 && getBalanced(node.right) > 0) {
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }
            return node;

        }

        // delete method
        public void deleteNode(int value) {
            root = delete(root, value);
        }

        // delete entire tree
        public void deleteAVL() {
            root = null;
        }

    }

    public static void main(String[] args) {
        AVL newAVL = new AVL();
        newAVL.insertNode(5);
        newAVL.insertNode(10);
        newAVL.insertNode(15);
        newAVL.insertNode(20);
        newAVL.levelOrder(newAVL.root);
        newAVL.deleteNode(5);
        System.out.println();
        newAVL.levelOrder(newAVL.root);
    }

}