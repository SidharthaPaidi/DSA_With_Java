package StackUsingArray;
class stackUsingArray {
    public static class Stack{
        int[] arr;
        int topOfStack;
        public Stack(int size){
            this.arr = new int[size];
            this.topOfStack = -1;
            System.out.println("The Stack is created of size:" + size);
        }
        //is Empty method
        public boolean isEmpty(){
            if(topOfStack == -1)return true;

            return false;
        }
        //is Full method
        public boolean isFull(){
            if(topOfStack==arr.length-1){
                System.out.println("The stack is full");
                return true;
            }
            return false;
        }
        //push method
        public void push(int value){
            if(isFull()){
                // System.out.println("The stack is Full");
            }else{
                arr[topOfStack+1] = value;
                topOfStack++;
                System.out.println("The value successfully inserted in the stack");
            }
        }
        //pop method
        public int pop(){
            if(isEmpty()){
                // System.out.println("The stack is empty");
                return -1;
            }else{
                int topStack = arr[topOfStack];
                topOfStack--;
                return topStack;
            }
        }
        //peek method 
        public int peek(){
            if(isEmpty()){
                // System.out.println("The stack is empty");
                return -1;
            }else{
                
                return arr[topOfStack];
            }

    }
    //delete method
        public void deletestack(){
            arr = null;
            System.out.println("The stack successfully deleted");
        }
}
    public static void main(String[] args) {
        Stack stackByarray = new Stack(7);
        stackByarray.push(8);
        stackByarray.push(8);
        stackByarray.push(8);
        stackByarray.push(9);
        // int result = stackByarray.pop();
        // int result = stackByarray.peek();
        // System.out.println(result);
        // int result1 = stackByarray.peek();
        // System.out.println(result1);
        stackByarray.deletestack();;
        // boolean result = stackByarray.isEmpty();
        // System.out.println(result);
        // System.out.println(stackByarray.isFull());
    }
}