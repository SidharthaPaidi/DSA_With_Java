
class creationcircular {
    public static class Node {
        public int value;
        public Node next;
    }

    public static class CircularSinglyLinkedList {
        public Node head;
        public Node tail;
        public int size;

        public Node createcsll(int nodeValue) {
            head = new Node();
            Node node = new Node();
            node.value = nodeValue;
            node.next = node;
            head = node;
            tail = node;
            size = 1;
            return head;
        }

        public void insertcsLL(int nodevalue, int location) {
            Node node = new Node();
            node.value = nodevalue;
            if (head == null) {
                createcsll(nodevalue);
                return;
            } else if (location == 0) {
                node.next = head;
                head = node;
                tail.next = head;
            } else if (location >= size) {
                tail.next = node;
                tail = node;
                tail.next = head;
            } else {
                Node tempNode = head;
                int index = 0;
                while (index < location - 1) {
                    tempNode = tempNode.next;
                    index++;
                }
                node.next = tempNode.next;
                tempNode.next = node;
            }
            size++;

        }

        // traversal method
        public void traversal() {
            if (head != null) {
                Node tempNode = head;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempNode.value);
                    if (i != size - 1) {
                        System.out.print("->");
                    }
                    tempNode = tempNode.next;
                }
                System.out.println("");
            } else {
                System.out.println("List does not exist");
            }
        }

        // Searching
        public boolean search(int nodeValue) {
            if (head != null) {
                Node tempNode = head;
                for (int i = 0; i < size; i++) {
                    if (nodeValue == tempNode.value) {
                        System.out.println("Value found at " + i);
                        return true;
                    }
                    tempNode = tempNode.next;
                }
            }
            System.out.println("Node not found in The list");
            return false;
        }

        // Deletion of an node
        public void deletion(int location) {
            if (head == null) {
                System.out.println("The List is empty");
                return;
            } else if (location == 0) {
                head = head.next;
                tail.next = head;
                size--;
                if (size == 0) {
                    head = null;
                    head.next = null;
                    tail = null;

                }
            } else if (location >= size) {
                Node tempnode = head;
                for (int i = 0; i < size-1; i++) {
                    tempnode = tempnode.next;
                }
                if (tempnode == head) {
                    head.next = null;
                    tail = head = null;

                } else {
                    tempnode.next = head;
                    tail = tempnode;
                }

                size--;
            } else {
                Node tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                size--;
            }
        }
        //delete entire list
        public void deletelist()
        {
            if(head == null)
            {
                System.out.println("the list is empty");
                return;
            }else{
                head = null;
                tail.next = null;
                tail = null;
                System.out.println("the list has been deleted sucessfully");
            }
        }
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csLL = new CircularSinglyLinkedList();
        csLL.createcsll(4);
        csLL.insertcsLL(5, 0);
        csLL.insertcsLL(6, 1);
        csLL.insertcsLL(7, 2);
        csLL.traversal();
        // csLL.search(7);
        // csLL.deletion(9);
        csLL.deletelist();
        csLL.traversal();

    }

}
