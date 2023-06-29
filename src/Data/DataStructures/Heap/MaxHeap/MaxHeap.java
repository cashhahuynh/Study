package Data.DataStructures.Heap.MaxHeap;

public class MaxHeap {

    private static int heapSize;

    //METHODS TO GRAB PARENT, LEFT, AND RIGHT CHILD
    public static int parent(int p) {
        return (p - 1) / 2;
    }

    public static int left(int l) {
        return (2 * l) + 1;
    }

    public static int right(int r) {
        return (2 * r) + 2;
    }

    //behaves as insertion. learn about inserting in backend
    public static void buildMaxHeap(int [] arr) {
        heapSize = arr.length;
        for(int i = (heapSize/2); i >= 0; i--) {
            maxHeapify(arr, i);
        }
    }

    //maintains property of max-heap
    public static void maxHeapify(int [] arr, int i) {
        int left = left(i);
        int right = right(i);
        int largest = i;

        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, largest);
        }
    }

    //delete method
    public static int deleteMax(int [] arr) {

        int max = 0;

        if (heapSize < 0) {
            System.out.println("underflow");
            return max;
        }

        max = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize --;
        maxHeapify(arr, 0);

        return max;

    }

    //
    public static void increaseKey(int [] arr, int i, int key) {

        if (key < arr[i]) {
            System.out.println("error");
        }

        arr[i] = key;

        while (i >= 0 && arr[parent(i)] < arr[i]) {
            int temp = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i] = temp;

            i = parent(i);
        }
    }

    public static void printHeap(int arr []) {
        for(int i = 0; i < heapSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
