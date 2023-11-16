public class stackUsingLL {
    CreationSingly.SinglyLinkedList LinkedList;

    public stackUsingLL() {
        LinkedList = new CreationSingly.SinglyLinkedList();
    }

    // Push Method
    public void push(int value) {
        LinkedList.Insertion(value, 0);
        System.out.println("Inserted " + value + " in  Stack");
    }

    // Is empty method
    public boolean isEmpty() {
        if (LinkedList.head == null) {
            return true;
        }
        return false;
    }

    // Pop Method
    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The Stack is empty");
        } else {
            result = LinkedList.head.value;
            LinkedList.deletion(0);
        }
        return result;
    }

    // peek Method
    public int peek() {

        if (isEmpty()) {
            return -1;
        } else {
            return LinkedList.head.value;
        }

    }

    public void delete() {
        LinkedList.entiredeletion();
    }

    public static void main(String[] args) {
        stackUsingLL newStack = new stackUsingLL();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.delete();
    }
}
