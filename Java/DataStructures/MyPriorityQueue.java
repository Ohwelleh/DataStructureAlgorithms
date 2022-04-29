package Java.DataStructures;

import java.util.ArrayList;

public class MyPriorityQueue {
    
    private ArrayList<Integer> heap;

    public MyPriorityQueue(){
        heap = new ArrayList<Integer>();
    }

    private void myHeapify(int currentIndex){

        int size = heap.size();
        int largest = currentIndex;
        int leftChild = 2 * currentIndex + 1;
        int rightChild = 2 * currentIndex + 2;

        if(leftChild < size && heap.get(currentIndex) < heap.get(leftChild)){
            largest = leftChild;
        }

        if(rightChild < size && heap.get(largest) < heap.get(rightChild)){
            largest = rightChild;
        }

        if(largest != currentIndex){
            int temp = heap.get(largest);
            heap.set(largest, heap.get(currentIndex));
            heap.set(currentIndex, temp);

            myHeapify(largest);
        }

    }

    public void insertion(int item){
        int size = heap.size();

        heap.add(item);

        if(size > 0){

            for(int i = (size / 2) - 1; i >= 0; i--){
                myHeapify(i);
            }
        }
    }

    public void deletion(int item){
        int i;
        int size = heap.size();

        for(i = 0; i < size; i++){
            if(item == heap.get(i)){
                break;
            }
        }

        int temp = heap.get(size - 1);
        heap.set(size - 1, heap.get(i));
        heap.set(i, temp);

        heap.remove(size - 1);

        for(int j = (size / 2) - 1; j >= 0; j--){
            myHeapify(j);
        }

    }

    public int peek(){
        return heap.get(0);
    }

    public int extractRoot(){
        int rootValue = heap.get(0);
        deletion(rootValue);

        return rootValue;
    }

    public void printPriorityQueue(){
        for(Integer i : heap){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
