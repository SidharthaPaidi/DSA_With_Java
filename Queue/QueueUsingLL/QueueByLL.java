public class QueueByLL {
    CreationSingly.SinglyLinkedList LinkedList;

    public QueueByLL() {
        LinkedList = new CreationSingly.SinglyLinkedList();
        System.out.println("The Queue is successfully Created");
    }

    // isEmpty
    public boolean isEmpty() {
        if (LinkedList.head == null) {
            return true;
        }
        return false;
    }

    // enQueue
    public void enQueue(int value) {
        LinkedList.Insertion(value, LinkedList.size);
        System.out.println("The value " + value + " successfully inserted in the queue");

    }

    // deQueue
    public int deQueue() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return result;
        } else {
            result = LinkedList.head.value;
            LinkedList.deletion(0);
        }
        return result;

    }

    // peek
    public int peek() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return result;
        } else {
            result = LinkedList.head.value;
        }
        return result;
    }

    //delete
    public void delete(){
        // LinkedList.entiredeletion();
        LinkedList.head = null;
        LinkedList.tail = null;
        System.out.println("Queue Successfully deleted");
    }

    public static void main(String[] args) {
        QueueByLL newQLL = new QueueByLL();
        newQLL.enQueue(1);
        newQLL.enQueue(2);
        newQLL.enQueue(3);
        newQLL.enQueue(4);
        // System.out.println(newQLL.isEmpty());
        // System.out.println(newQLL.deQueue());
        // System.out.println(newQLL.deQueue());
        System.out.println(newQLL.peek());
        System.out.println(newQLL.peek());
    }

}
