public class creationdoubly {
    public static class DoublyNode {
        public int value;
        public DoublyNode next;
        public DoublyNode prev;
    }

    public static class doublyLinkedList {
        DoublyNode head;
        DoublyNode tail;
        int size;

        public DoublyNode createDLL(int nodeValue) {
            head = new DoublyNode();
            DoublyNode newNode = new DoublyNode();
            newNode.value = nodeValue;
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            tail = newNode;
            size++;
            return head;
        }

        // Inssertion of a node in Dll
        public void Inssertion(int nodeValue, int location) {
            DoublyNode newNode = new DoublyNode();
            newNode.value = nodeValue;
            if (head == null) {
                createDLL(nodeValue);
                return;
            } else if (location == 0) {
                newNode.next = head;
                newNode.prev = null;
                head.prev = newNode;
                head = newNode;
            } else if (location >= size) {
                newNode.next = null;
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            } else {
                DoublyNode tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next;
                }
                newNode.prev = tempNode;
                newNode.next = tempNode.next;
                tempNode.next = newNode;
                newNode.next.prev = newNode;
            }
            size++;
        }

        // Traversal for Dll
        public void traversal() {
            if (head == null) {
                System.out.println("List is Empty");

            } else {
                DoublyNode tempNode = head;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempNode.value);
                    if (i != size - 1) {
                        System.out.print(" -> ");
                    }
                    tempNode = tempNode.next;
                }
            }

            System.out.println("\n");
        }

        // Reverse Traversal
        public void reverseDLL() {
            if (head == null) {
                System.out.println("List is empty");

            } else {
                DoublyNode tempDoublyNode = tail;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempDoublyNode.value);
                    if (i != size - 1) {
                        System.out.print(" <- ");
                    }
                    tempDoublyNode = tempDoublyNode.prev;
                }

            }
            System.out.println("\n");
        }

        // Search Node
        public boolean searchNode(int nodeValue) {
            if (head != null) {
                DoublyNode tempNode = head;
                for (int i = 0; i < size; i++) {
                    if (tempNode.value == nodeValue) {
                        System.out.println("Found the Node at -> " + i);
                        return true;
                    }
                    tempNode = tempNode.next;
                }
                System.out.println("Node Not Found");
                return false;
            }
            System.out.println("list is empty");
            return false;
        }

        // Delete the node
        public void deletion(int location) {
            if (head == null) {
                System.out.println("List is Empty");
                return;
            } else if (location == 0) {

                if (size == 1) {
                    head = null;
                    tail = null;
                    size--;
                    return;
                } else {
                    head = head.next;
                    head.prev = null;
                    size--;

                }

            } else if (location >= size) {

                if (size == 1) {
                    head = null;
                    tail = null;
                    size--;
                    return;
                } else {
                    tail = tail.prev;
                    tail.next = null;
                    size--;
                }
            } else {
                DoublyNode tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                tempNode.next.prev = tempNode;
                size--;
            }
        }
        public void DeleteEntireList(){
            DoublyNode tempNode =head;
            for(int i =0;i<size;i++)
            {
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
            System.out.println("List has been successsfully deleated");
        }

    }

    public static void main(String[] args) {
        doublyLinkedList dLL = new doublyLinkedList();
        dLL.createDLL(8);
        dLL.Inssertion(2, 0);
        dLL.Inssertion(3, 1);
        dLL.Inssertion(7, 7);
        // System.out.println(dLL.head.value);
        dLL.traversal();
        // dLL.deletion(2);
        dLL.DeleteEntireList();
        dLL.traversal();
        // dLL.reverseDLL();
        // dLL.searchNode(7);

    }
}