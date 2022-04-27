from MyStack import MyStack
from MyQueue import MyQueue


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


def main():
    
    # print("Stack tests\n")
    # stackTesting()
    # print()

    print("Queue tests")
    queueTesting()
    print()

if __name__ == '__main__':
    main()