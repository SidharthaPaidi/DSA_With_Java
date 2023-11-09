public class CircularDLL {
    public static class DoublyNode {
        public DoublyNode prev;
        public DoublyNode next;
        public int value;

    }

    public static class CircularDoublyLinkList {
        public DoublyNode head;
        public DoublyNode tail;
        public int size;

        public DoublyNode createCDLL(int nodeValue) {
            DoublyNode node = new DoublyNode();
            node.value = nodeValue;
            head = node;
            tail = node;
            node.next = node;
            node.prev = node;
            size = 1;
            return head;
        }

        // Insertion
        public void Insertion(int nodeValue, int location) {
            DoublyNode newNode = new DoublyNode();
            newNode.value = nodeValue;
            if (head == null) {
                createCDLL(nodeValue);
                return;
            } else if (location == 0) {
                newNode.prev = tail;
                newNode.next = head;
                head.prev = newNode;
                tail.next = newNode;
                head = newNode;
                size++;
                return;
            } else if (location >= size) {
                newNode.prev = tail;
                newNode.next = head;
                head.prev = newNode;
                tail.next = newNode;
                tail = newNode;
                size++;
                return;
            } else {
                DoublyNode tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next;
                }
                newNode.next = tempNode.next;
                newNode.prev = tempNode;
                tempNode.next.prev = newNode;
                tempNode.next = newNode;
                size++;
                return;
            }
        }

        // Traversal
        public void traversalCDLL() {
            if (head != null) {
                DoublyNode tempNode = head;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempNode.value);
                    tempNode = tempNode.next;
                    if (size - 1 != i) {
                        System.out.print(" -> ");
                    }
                }
            } else {
                System.out.println("List Does Not Exists");
            }
            System.out.println("");
        }

        // Reverse Traversal
        public void reversal() {
            if (tail != null) {
                DoublyNode tempNode = tail;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempNode.value);
                    tempNode = tempNode.prev;
                    if (size-1 != i) {
                        System.out.print(" <- ");
                    }
                }
            } else {
                System.out.println("List Does Not Exists");
            }
            System.out.println("");
        }
        //Searching 
        public void SearchElement(int nodeValue){
            DoublyNode tempNode = head;
            for(int i = 0;i<size;i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Element found at Location : "+(i+1));
                    return;
                }
                tempNode = tempNode.next;
            }
            System.out.println("Element Not Found");
        }
        //Deletion 
        public void Deletion(int location){
            if(head == null){
                System.out.println("List is Empty");
                return;
            }else if(location == 0){
                if(size==1){
                    head.prev = null;
                    head.next = null;
                    head = null;
                    tail = null;
                    size--;
                    return;
                }
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }else if(location>=size){
                if(size==1){
                    head.prev = null;
                    head.next = null;
                    head = null;
                    tail = null;
                    size--;
                    return;
                }
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }else{
                DoublyNode tempNode = head;
                for(int i = 0 ;i<location -1 ;i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                tempNode.next.prev = tempNode;
                size--;
            }
        }
        public void DeleteEntire(){
            DoublyNode tempNode = head;
            for(int i = 0;i<size;i++){
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
            System.out.println("List has been deleted");
        }
    }

    public static void main(String[] args) {
        CircularDoublyLinkList cdLL = new CircularDoublyLinkList();
        cdLL.createCDLL(6);
        cdLL.Insertion(0, 0);
        cdLL.Insertion(8, 9);
        cdLL.Insertion(7, 1);
        // System.out.println(cdLL.head.value);
        // System.out.println(cdLL.head.next.value);
        // System.out.println(cdLL.head.next.next.value);
        cdLL.traversalCDLL();
        // cdLL.Deletion(2);
        cdLL.DeleteEntire();
        cdLL.traversalCDLL();
        // cdLL.reversal();
        // cdLL.SearchElement(8);
    }
}
