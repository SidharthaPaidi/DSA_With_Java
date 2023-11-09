class CreationSingly {

    public static class Node {
        public int value;
        public Node next;

    }

    public static class SinglyLinkedList {
        public Node head;
        public Node tail;
        public int size;

        public Node createSinglyLinklist(int nodeValue) {
            head = new Node();
            Node node = new Node();
            node.next = null;
            node.value = nodeValue;
            head = node;
            tail = node;
            size = 1;
            return head;
        }

        // Insertion of node
        public void Insertion(int nodeValue, int location) {
            Node node = new Node();
            node.value = nodeValue;
            if (head == null) {
                createSinglyLinklist(nodeValue);
                return;
            } else if (location == 0) {
                node.next = head;
                head = node;
            } else if (location >= size) {
                node.next = null;
                tail.next = node;
                tail = node;
            } else {
                Node tempNode = head;
                int index = 0;
                while (index <= location - 1) {
                    tempNode = tempNode.next;
                    index++;
                }
                Node nextNode = tempNode.next;
                tempNode = node;
                node.next = nextNode;

            }
            size++;
        }

        // traversal in singly linkedlist
        public void traversalLinkedlist() {
            if (head == null) {
                System.out.println("List does not Exists!");

            } else {
                Node tempNode = head;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempNode.value);
                    if (i < size - 1) {
                        System.out.print("->");
                    }
                    tempNode = tempNode.next;
                }
                System.out.println("");
            }
        }

        // searchig in a singlylinklist
        public boolean search(int nodeValue) {
            if (head != null) {
                Node currNode = head;
                for (int i = 0; i < size; i++) {
                    if (currNode.value == nodeValue) {
                        System.out.println("found the element at node at index ->  " + i);
                        return true;

                    }
                    currNode = currNode.next;

                }

            }
            System.out.println("The element does not exist in the linkedlist");
            return false;
        }

        // deletion of element on singly linked list

        public void deletion(int location) {
            if (head == null) {
                System.out.println("List does not Exists!");
                return;
            } else if (location == 0) {
                head = head.next;
                size--;
                if (size == 0) {
                    tail = null;

                }
            } else if (location >= size) {
                Node tempNode = head;
                for (int i = 0; i < size - 1; i++) {
                    tempNode = tempNode.next;

                }
                if (tempNode == head) {
                    tail = head = null;
                    size--;
                    return;
                }
                tempNode.next = null;
                tail = tempNode;
                size--;

            }else {
                Node currNode = head;
                int index = 0;
                while (index <= location-1) {
                    currNode = currNode.next;
                    index++;

                }
                currNode.next =currNode.next.next;
                size--;
            }

        }
        //delete entire list
        public void entiredeletion()
        {
            head = null;
            tail = null;
            System.out.println(" List deleated Successfully");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinklist(5);
        sLL.Insertion(6, 1);
        sLL.Insertion(7, 2);
        sLL.Insertion(8, 3);
        sLL.Insertion(9, 4);
        sLL.traversalLinkedlist();
        // sLL.search(90);
        sLL.entiredeletion();
        sLL.traversalLinkedlist();
    }
}
