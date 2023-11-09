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
        //enQueue
        public void enQueue(int value){
            if(isFull()){
                System.out.println("The Queue is Full");
            }else if(isEmpty()){
                beginningOfQueue = 0;
                topOfQueue++;
                arr[topOfQueue] = value;
                System.out.println("Successfully inserted the "+value+" in the Queue");
            }else{
                if(topOfQueue+1==size){
                    topOfQueue = 0;
                }else{
                    topOfQueue++;
                }
                arr[topOfQueue] = value;
                System.out.println("Successfully inserted the "+value+" in the Queue");
            }
        }
    }

    public static void main(String[] args) {
        CircularQueueByArray newCircularQueue = new CircularQueueByArray(5);
        System.out.println(newCircularQueue.isEmpty());
        newCircularQueue.enQueue(1);
    }

}