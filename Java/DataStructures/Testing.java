package Java.DataStructures;

public class Testing {
    
    private static void stackTesting(){
        MyStack firstStack = new MyStack(3);
        MyStack secondStack = new MyStack(4);

        firstStack.printStack();
        secondStack.printStack();

        secondStack.push(3);
        secondStack.push(22);
        secondStack.push(31);
        secondStack.push(311);

        firstStack.printStack();
        secondStack.printStack();

        secondStack.pop();

        try{

            firstStack.pop();

        }catch(Exception e){

            System.out.println("Stack is empty");

        }

        firstStack.push(1);
        firstStack.push(2);
        firstStack.push(3);

        firstStack.printStack();
        
        try{

            firstStack.push(4);

        }catch(Exception e){

            System.out.println("Stack is Full");

        }

        secondStack.printStack();

        System.out.println(secondStack.isEmpty());
        System.out.println(secondStack.isFull());

        System.out.println(secondStack.peek());
        System.out.println(firstStack.peek());
        
        
    }

    public static void queueTesting(){
        MyQueue firstQueue = new MyQueue(3);
        MyQueue secondQueue = new MyQueue(10);

        secondQueue.enQueue(3);
        secondQueue.enQueue(22);
        secondQueue.enQueue(31);
        secondQueue.enQueue(311);

        secondQueue.printQueue();
        System.out.println(secondQueue.deQueue());

        secondQueue.printQueue();
        firstQueue.printQueue();

        System.out.println(secondQueue.peek());
        System.out.println(secondQueue.isEmpty());
        System.out.println(secondQueue.isFull());
    }


    public static void main(String args[]){

        // System.out.println("Stack testing");
        // stackTesting();
        // System.out.println("\n");

        System.out.println("Queue testing");
        queueTesting();
        System.out.println("\n");

    }
}
