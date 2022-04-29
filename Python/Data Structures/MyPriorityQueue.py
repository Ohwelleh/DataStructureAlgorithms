# Credit goes to the website Programiz (https://www.programiz.com/dsa/priority-queue)
# I needed to use this site as a guide for this implementation.


from logging import root


class MyPriorityQueue:

    def __init__(self):
        self.heap = []

    def myHeapify(self, size, currentIndex):
        
        # Setting the index values for the left child, right child, and intial largest value index.
        largest = currentIndex
        leftChild = 2 * currentIndex + 1
        rightChild = 2 * currentIndex + 2

        # Checking that the calculated child value is within the list size and if the value at this index is less than the current
        # largest value.
        if leftChild < size and self.heap[currentIndex] < self.heap[leftChild]:
            largest = leftChild
        
        if rightChild < size and self.heap[largest] < self.heap[rightChild]:
            largest = rightChild

        # Swap and continue heapifying if root is not largest
        if largest != currentIndex:
            self.heap[currentIndex], self.heap[largest] = self.heap[largest], self.heap[currentIndex]
            self.myHeapify(size, largest)

    def insertion(self, item):

        size = len(self.heap)

        self.heap.append(item)
        
        if size > 0:
            
            # Starting at the first non-leaf node and decrementing.
            # Using floor division to ensure an integer.
            for i in range((size // 2) -1, -1, -1):
                self.myHeapify(size, i)


    def deletion(self, item):
        size = len(self.heap)
        i = 0
        for i in range(0, size):
            if item == self.heap[i]:
                break
        
        self.heap[i], self.heap[size - 1] = self.heap[size - 1], self.heap[i]

        del self.heap[-1]

        for i in range((len(self.heap) // 2) -1, -1, -1):
                self.myHeapify(len(self.heap), i)

    def peek(self):
        return self.heap[0]

    def extractRoot(self):
        rootValue = self.heap[0]
        self.deletion(rootValue)

        return rootValue

    def __str__(self):
        return f'{self.heap}'