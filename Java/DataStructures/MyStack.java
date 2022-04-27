package Java.DataStructures;

public class MyStack{

    private int stack[];
    private int capacity;
    private int top;

    public MyStack(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int item){

        if(isFull()){
            throw new RuntimeException("Stack is full");
        }

        top++;
        stack[top] = item;
    }

    public int pop(){

        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        int topElement = stack[top];
        top--;

        return topElement;
    }

    public Boolean isEmpty(){
        return top == -1;
    }

    public Boolean isFull(){
        return top == capacity - 1;
    }

    public int peek(){

        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        return stack[top];
    }

    public void printStack(){
        String stackAsString = "[";

        if(!isEmpty()){
            for(int i = 0; i <= top; i++){
                if(i == 0){
                    stackAsString = stackAsString  + Integer.toString(stack[i]);
                }else{
                    stackAsString = stackAsString + " | " + Integer.toString(stack[i]);
                }
            }
        }

        stackAsString = stackAsString + "] <- Top";
        System.out.println(stackAsString);
    }
}