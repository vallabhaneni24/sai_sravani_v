public class Reverse {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(originalArray);

        reverseArray(originalArray);

        System.out.println("\nReversed Array:");
        printArray(originalArray);
    }

    public static void reverseArray(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length / 2; i++) {
            // Swap elements at index i and its corresponding position from the end
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}