class circularQueue {
    public static class CircularQueueByArray {
        int[] arr;
        int size, topOfQueue, beginningOfQueue;

        // creation
        public CircularQueueByArray(int size) {
            this.arr = new int[size];
            this.size = size;
            this.topOfQueue = -1;
            this.beginningOfQueue = -1;
            System.out.println("The circular Queue successfully created");
        }

        // Empty method
        public boolean isEmpty() {
            if (topOfQueue == -1) {
                return true;
            }
            return false;
        }

        // is Full
        public boolean isFull() {
            if (topOfQueue + 1 == beginningOfQueue) {
                return true;
            } else if (beginningOfQueue == 0 && topOfQueue + 1 == size) {
                return true;
            } else {
                return false;
            }
        }

        // enQueue
        public void enQueue(int value) {
            if (isFull()) {
                System.out.println("The Queue is Full");
            } else if (isEmpty()) {
                beginningOfQueue = 0;
                topOfQueue++;
                arr[topOfQueue] = value;
                System.out.println("Successfully inserted the " + value + " in the Queue");
            } else {
                if (topOfQueue + 1 == size) {
                    topOfQueue = 0;
                } else {
                    topOfQueue++;
                }
                arr[topOfQueue] = value;
                System.out.println("Successfully inserted the " + value + " in the Queue");
            }
        }

        // deQueue
        public int deQueue() {
            if (isEmpty()) {
                System.out.println("The Queue is empty");
                return -1;
            } else {
                int result = arr[beginningOfQueue];
                arr[beginningOfQueue] = 0;
                if (beginningOfQueue == topOfQueue) {
                    beginningOfQueue = topOfQueue = -1;
                } else if (beginningOfQueue + 1 == size) {
                    beginningOfQueue = 0;
                } else {
                    beginningOfQueue++;
                }
                return result;
            }

        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("The Queue is empty");
                return -1;
            } else {
                return arr[beginningOfQueue];
            }
        }

        //delete Queue
        public void delete(){
            arr = null;
            System.out.println("The Queue successfully deleated");
        }
    }

    public static void main(String[] args) {
        CircularQueueByArray newCircularQueue = new CircularQueueByArray(5);
        System.out.println(newCircularQueue.isEmpty());
        newCircularQueue.enQueue(1);
    }

}