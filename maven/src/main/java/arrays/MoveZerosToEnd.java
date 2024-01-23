package arrays;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 0, 4, 0, 1, 7};

        System.out.println("Original Array:");
        printArray(numbers);

        moveZerosToEnd(numbers);

        System.out.println("\nArray after moving 0's to the end:");
        printArray(numbers);
    }

    public static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, move it to the nonZeroIndex position
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with 0
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}