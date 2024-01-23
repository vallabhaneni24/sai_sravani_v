package arrays;
public class ArrRotate {
   public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int rotationPositions = 2;

        System.out.println("Original Array:");
        printArray(originalArray);

        rotateLeft(originalArray, rotationPositions);

        System.out.println("\nArray after left rotation:");
        printArray(originalArray);
    }

    public static void rotateLeft(int[] arr, int positions) {
        int length = arr.length;

        // Take the remainder to handle cases where positions are greater than array length
        int effectivePositions = positions % length;

        for (int rotation = 0; rotation < effectivePositions; rotation++) {
            int firstElement = arr[0];

            // Shift all elements to the left
            for (int i = 0; i < length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Place the first element at the end
            arr[length - 1] = firstElement;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}