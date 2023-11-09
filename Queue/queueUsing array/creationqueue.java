class creationqueue{
    public static class queueArray{
        int[] arr;
        int topOfQueue;
        int beginningOfQueue;
        public queueArray(int size){
            this.arr = new int[size];
            this.topOfQueue = -1;
            this.beginningOfQueue = -1;
            System.out.println("The Queue is successfully created with size of:" + size);
        }

        public boolean isFull(){
            if (topOfQueue == arr.length-1) {
                return true;
            }
            return false;
        }

        public boolean isEmpty(){
            if(beginningOfQueue == -1 || beginningOfQueue == arr.length){
                return true;
            }
            return false;
        }
        public void enQueue(int value){
            if(isFull()){
                System.out.println("The Queue is Full");
            }else if(isEmpty()){
                beginningOfQueue = 0;
                topOfQueue++;
                arr[topOfQueue] = value;
                System.out.println("Successfully added element "+ value);
            }else{
                topOfQueue++;
                arr[topOfQueue] = value;
                System.out.println("Successfully added element " + value);
            }
        }
        //deQueue
        public int deQueue(){
            if(isEmpty()){
                System.out.println("The Queue is empty");
                return -1;
            }else{
                int result = arr[beginningOfQueue];
                beginningOfQueue++;
                if(beginningOfQueue>topOfQueue){
                    beginningOfQueue = topOfQueue = -1;
                }
                return result;
            }
        }
        //peek 
        public int peek(){
            if (!isEmpty()) {
                return arr[beginningOfQueue];
            }
            return -1;
        }
        //delete Queue
        public void delete(){
            arr = null;
            System.out.println("The queue successfully deleted");
        }
    }
    public static void main(String[] args) {
        queueArray newQueue = new queueArray(5);
        
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
        newQueue.enQueue(5);
        int result = newQueue.deQueue();
        System.out.println(result);
       
        System.out.println(newQueue.peek());
        // newQueue.delete();
        
        
        
    }
}