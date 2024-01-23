package arrays;
public class LargeSmall {
    public static void main(String[] args) {
        int[] integerArray = {5, 2, 9, 1, 7, 3};

        int[] result = findLargeAndSmall(integerArray);

        System.out.println("Largest number: " + result[0]);
        System.out.println("Smallest number: " + result[1]);
    }

    public static int[] findLargeAndSmall(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{0, 0};
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }

        return new int[]{largest, smallest};
    }
}