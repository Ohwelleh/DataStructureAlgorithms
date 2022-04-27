package Java.DataStructures;

public class MyQueue {
    
    private int queue[];
    private int capacity;
    private int front;
    private int rear;

    public MyQueue(int size){
        queue = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
    }

    public void enQueue(int item){

        if(isFull()){
            throw new RuntimeException("Queue is full");
        }

        if(front == -1) front++;

        rear++;
        queue[rear] = item;

    }

    public int deQueue(){

        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }

        int frontElement = queue[front];
        front++;

        return frontElement;
    }

    public Boolean isEmpty(){
        return front == rear;
    }

    public Boolean isFull(){
        return rear == capacity - 1;
    }

    public int peek(){
        
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }

        return queue[front];
    }

    public void printQueue(){
        String queueAsString = "[";

        if(!isEmpty()){
            for(int i = front; i <= rear; i++){
                if(i == front){
                    queueAsString = queueAsString  + Integer.toString(queue[i]);
                }else{
                    queueAsString = queueAsString + " | " + Integer.toString(queue[i]);
                }
            }
        }

        queueAsString = queueAsString + "] <- Rear";
        System.out.println(queueAsString);
    }

}
