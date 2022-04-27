class MyStack:

    def __init__(self, size):
        self.capacity = size
        self.top = -1
        self.stack = [None] * size

    def push(self, item):

        # Checking if the stack is fulll
        if self.isFull():
            raise Exception(f'The element {item} could not be pushed on to the stack because the stack is full.')

        self.top = self.top + 1
        self.stack[self.top] = item
            
    def pop(self):

        if self.isEmpty():
            raise Exception('Nothing to pop. Stack is empty.')

        topElement = self.stack[self.top]
        self.top = self.top - 1

        return topElement

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.capacity - 1

    def peek(self):
        if self.isEmpty():
            raise Exception('Nothing to peek. Stack is empty.')

        return self.stack[self.top]

    def __str__(self):

        if self.isEmpty():
            return '[]'

        return f'{[self.stack[x] for x in range(self.top + 1)]} <- Top'