package Java.DataStructures;

public class MyCircleQueue {

    private int queue[];
    private int capacity;
    private int front;
    private int rear;

    public MyCircleQueue(int size){
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

        rear = (rear + 1) % capacity;
        queue[rear] = item;

    }

    public int deQueue(){

        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }

        int frontElement = queue[front];
        front = (front + 1) % capacity;

        if(front == rear){
            front = -1;
            rear = -1;
        }

        return frontElement;
    }

    public Boolean isEmpty(){
        return front == rear;
    }

    public Boolean isFull(){
        return (front == rear + 1) || ((rear == capacity - 1) && (front == 0));
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
            if(front < rear){
                for(int i = front; i <= rear; i++){
                    if(i == front){
                        queueAsString = queueAsString  + Integer.toString(queue[i]);
                    }else{
                        queueAsString = queueAsString + "| " + Integer.toString(queue[i]);
                    }
                }

            }else{
                for(int i = front; i < capacity; i++){
                    if(i == capacity - 1){
                        queueAsString = queueAsString + Integer.toString(queue[i]);
                    }else{
                        queueAsString = queueAsString + Integer.toString(queue[i]) + "| ";
                    }
                }

                for(int i = 0; i <= rear; i++){
                    queueAsString = queueAsString + "| " + Integer.toString(queue[i]);
                }
            }
        }

        queueAsString = queueAsString + "] <- Rear";
        System.out.println(queueAsString);
    }

}
