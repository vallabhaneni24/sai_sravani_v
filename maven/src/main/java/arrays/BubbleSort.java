package arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {6, 8, 1, 7, 3, 10};

        System.out.println("Original Array:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nArray after sorting:");
        printArray(numbers);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num +" ");
        }
        System.out.println();
    }
}