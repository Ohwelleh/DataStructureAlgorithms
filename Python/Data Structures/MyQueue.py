class MyQueue:
    
    def __init__(self, size):
        self.capacity = size
        self.front = -1
        self.rear = -1
        self.queue = [None] * size
    
    def enQueue(self, item):
        
        if self.isFull():
            raise Exception("Queue is Full.")

        if self.front == -1:
            self.front = self.front + 1
        
        self.rear = self.rear + 1

        self.queue[self.rear] = item

    def deQueue(self):
        
        if self.isEmpty():
            raise Exception("Queue is Empty.")
        
        frontElement = self.queue[self.front]
        self.front = self.front + 1

        return frontElement

    def isEmpty(self):
        return self.rear == self.front

    def isFull(self):
        return self.rear == self.capacity - 1

    def peek(self):
        
        if self.isEmpty():
            raise Exception("Queue is Empty.")
        
        return self.queue[self.front]

    def __str__(self):
        
        if self.isEmpty():
            return '[]'
        
        return f'{[self.queue[x] for x in range(self.front, self.rear + 1)]} <- Rear'
