/**
 * BH
 */
public class BH {
    public static class BinaryHeap {
        int arr[];
        int sizeOfTree;

        public BinaryHeap(int size) {
            arr = new int[size + 1];
            this.sizeOfTree = 0;
            System.out.println("A binary Heap has been created");
        }

        // is Empty method
        public boolean isEmpty() {
            if (sizeOfTree == 0) {
                return true;
            }
            return false;
        }

        // peek method
        public Integer peek() {
            if (isEmpty()) {
                System.out.println("The Binary Heap is Empty");
                return -1;
            } else {
                return arr[1];
            }
        }

        // size methhod
        public Integer sizeofBH() {
            return sizeOfTree;
        }

        // traversal of the Binary Heap

        // level order traaversal
        public void levelOrder() {
            for (int i = 1; i <= sizeOfTree; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        // heapify method
        public void heapifyBottomtoTop(int index, String heapType) {
            int parent = index / 2;
            if (index <= 1)
                return;

            if (heapType == "Min") {
                if (arr[index] < arr[parent]) {
                    int temp = arr[index];
                    arr[index] = arr[parent];
                    arr[parent] = temp;
                }
            } else if (heapType == "Max") {
                if (arr[index] > arr[parent]) {
                    int temp = arr[index];
                    arr[index] = arr[parent];
                    arr[parent] = temp;
                }
            }
            heapifyBottomtoTop(parent, heapType);
        }

        // insert method
        public void insert(int value, String heapType) {
            arr[sizeOfTree + 1] = value;
            sizeOfTree++;
            heapifyBottomtoTop(sizeOfTree, heapType);
            System.out.println("The value " + value + " successfully inserted");
        }

        // heapify toptoBottom
        public void heapifyToptoBottom(int index, String heapType) {
            int left = index * 2;
            int right = index * 2 + 1;
            int swapChild = 0;

            if (sizeOfTree < left) {
                return;
            }
            if (heapType == "Max") {
                if (sizeOfTree == left) {
                    if (arr[index] < arr[left]) {
                        int temp = arr[index];
                        arr[index] = arr[left];
                        arr[left] = temp;
                    }
                    return;
                } else {
                    if (arr[left] > arr[right]) {
                        swapChild = left;
                    } else {
                        swapChild = right;
                    }
                    if (arr[index] < arr[swapChild]) {
                        int temp = arr[index];
                        arr[index] = arr[swapChild];
                        arr[swapChild] = temp;
                    }
                }
            } else if (heapType == "Min") {
                if (sizeOfTree == left) {
                    if (arr[index] > arr[left]) {
                        int temp = arr[index];
                        arr[index] = arr[left];
                        arr[left] = temp;
                    }
                    return;
                } else {
                    if (arr[left] < arr[right]) {
                        swapChild = left;
                    } else {
                        swapChild = right;
                    }
                    if (arr[index] > arr[swapChild]) {
                        int temp = arr[index];
                        arr[index] = arr[swapChild];
                        arr[swapChild] = temp;
                    }
                }
            }
            heapifyToptoBottom(swapChild, heapType);

        }

        public int extractHeadOfBH(String heapType){
            if(isEmpty()){
                return -1;
            }else{
                int extractedValue = arr[1];
                arr[1] = arr[sizeOfTree];
                sizeOfTree--;
                heapifyToptoBottom(1, heapType);
                return extractedValue;                 
            }
        }
        //delete the entire Binary heap
        public void deleteBH(){
            arr = null;
            System.out.println("The Binary Heap has been successfully deleted");
        }

    }

    public static void main(String[] args) {
        BinaryHeap newBH = new BinaryHeap(8);
        // newBH.peek();
        newBH.insert(60, "Max");
        newBH.insert(10, "Max");
        newBH.insert(20, "Max");
        newBH.insert(30, "Max");
        newBH.insert(40, "Max");
        newBH.insert(50, "Max");
        newBH.insert(5, "Max");
        newBH.levelOrder();
        // System.out.println();
        // newBH.insert(1, "Min");
        // // System.out.println();
        // newBH.levelOrder();
        newBH.extractHeadOfBH("Max");
        System.out.println();
        newBH.levelOrder();
        newBH.deleteBH();

    }
}