package codewithfreddy;

public class heap {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10); // Create a max-heap with capacity 10

        // Insert elements
        // Print the heap
        heap.insert(10);
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);
        heap.insert(5);
        heap.printHeap();

        // Extract the maximum element
        heap.extractMax();
        heap.printHeap();

        // Delete an element at index 2
        heap.delete(2);
        heap.printHeap();

        // Decrease the value of an element at index 1
        heap.decreaseKey(1, 8);
        heap.printHeap();
    }

}

    class MaxHeap {
        private int[] heap;
        private int capacity, size;
        public MaxHeap(int capacity) {
            this.capacity = capacity;
            this.heap = new int[capacity];
            this.size = 0;
        }

        private int parent(int i) {
            return (i - 1) / 2;
        }

        private int leftChild(int i) {
            return 2 * i + 1;
        }
        private int rightChild(int i) {
            return 2 * i + 2;
        }
        private void swap(int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

        private void heapifyUp(int i) {
            while (i > 0 && heap[parent(i)] < heap[i]) {
                swap(i, parent(i));
                i = parent(i);
            }
        }

        private void heapifyDown(int i) {
            int maxIndex = i;
            int left = leftChild(i);
            int right = rightChild(i);

            if (left < size && heap[left] > heap[maxIndex]) {
                maxIndex = left;
            }
            if (right < size && heap[right] > heap[maxIndex]) {
                maxIndex = right;
            }
            if (i != maxIndex) {
                swap(i, maxIndex);
                heapifyDown(maxIndex);
            }
        }


        public void insert(int value) {
            if (size == capacity) {
                System.out.println("Heap is full cannot insert " + value);
                return;
            }
            heap[size] = value;
            size++;
            heapifyUp(size - 1);
            System.out.println("Inserted: " + value);
        }


        public void delete(int i) {
            if (i < 0 || i >= size) {
                System.out.println("Invalid index cannot delete");
                return;
            }
            heap[i] = heap[size - 1];
            size--;
            heapifyDown(i);
            System.out.println("Element is deleted at index " + i);
        }


        public int extractMax() {
            if (size == 0) {
                System.out.println("Heap is empty cannot extract max");
                return -1;
            }
            int max = heap[0];
            heap[0] = heap[size - 1];
            size--;
            heapifyDown(0);
            System.out.println("Extracted max: " + max);
            return max;
        }

        public void decreaseKey(int i, int newValue) {
            if (i < 0 || i >= size) {
                System.out.println("Invalid index. Cannot decrease key.");
                return;
            }
            if (newValue > heap[i]) {
                System.out.println("New value is greater than current value. Cannot decrease key.");
                return;
            }
            heap[i] = newValue;
            heapifyDown(i);
            System.out.println("Decreased key at index " + i + " to " + newValue);
        }

        public void printHeap() {
            System.out.print("Heap: ");
            for (int i = 0; i < size; i++) {
                System.out.print(heap[i] + " ");
            }
            System.out.println();
        }
    }


