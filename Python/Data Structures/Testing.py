from MyStack import MyStack
from MyQueue import MyQueue
from MyCircleQueue import MyCircleQueue
from MyPriorityQueue import MyPriorityQueue


def stackTesting():
    firstStack = MyStack(3)
    secondStack = MyStack(10)

    secondStack.push(3)
    secondStack.push(22)
    secondStack.push(31)
    secondStack.push(311)

    print(firstStack)
    print(secondStack)

    secondStack.pop()
    # firstStack.pop()

    firstStack.push("Hello")
    firstStack.push("World")
    firstStack.push("!")

    print(firstStack)
    #  firstStack.push("2")
    print(secondStack)
    print(secondStack.isEmpty())
    print(secondStack.isFull())

    print(secondStack.peek())
    print(firstStack.peek())

def queueTesting():
    
    firstQueue = MyQueue(3)
    secondQueue = MyQueue(10)

    secondQueue.enQueue(3)
    secondQueue.enQueue(22)
    secondQueue.enQueue(31)
    secondQueue.enQueue(311)

    print(secondQueue)
    print(secondQueue.deQueue())

    print(secondQueue)
    print(firstQueue)

    print(secondQueue.peek())
    print(secondQueue.isEmpty())
    print(secondQueue.isFull())

def circleQueueTesting():
    
    cirQueue = MyCircleQueue(3)

    print(cirQueue)

    cirQueue.enQueue(3)
    cirQueue.enQueue(22)
    cirQueue.enQueue(31)

    print(cirQueue)
    cirQueue.deQueue()

    print(cirQueue)

    cirQueue.enQueue(312)

    print(cirQueue)

    cirQueue.deQueue()
    cirQueue.enQueue(1234)

    print(cirQueue)

def priorityQueueTesting():
    prioQueue = MyPriorityQueue()

    prioQueue.insertion(3)
    prioQueue.insertion(4)
    prioQueue.insertion(9)
    prioQueue.insertion(5)
    prioQueue.insertion(2)

    print(f'Priority Queue: {prioQueue}')

    print(f'Priority Queue Peek: {prioQueue.peek()}')

    print(f'Priority Queue: {prioQueue}')

    extractedRoot = prioQueue.extractRoot()
    print(f'Priority Queue Extract: {extractedRoot}')

    print(f'Priority Queue: {prioQueue}')

    prioQueue.deletion(4)

    print(f'Priority Queue: {prioQueue}')



def main():
    
    # print("Stack tests\n")
    # stackTesting()
    # print()

    # print("Queue tests")
    # queueTesting()
    # print()

    # print("Circle Queue tests")
    # circleQueueTesting()
    # print()

    print("Priority Queue tests")
    priorityQueueTesting()
    print()

if __name__ == '__main__':
    main()