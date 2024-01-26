import java.util.HashMap;

public class Indices {
    public static int[] findTwoSumIndices(int[] nums, int target) {
        // Create a HashMap to store the difference and index of each element
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Check if the current element's complement exists in the HashMap
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target sum
                return new int[]{numMap.get(complement), i};
            }

            // If not found, add the current element and its index to the HashMap
            numMap.put(nums[i], i);
        }

        // If no solution is found
        return null;
    }

    public static void main(String[] args) {
        int[] inputArray = {10, 20, 30, 40, 50, 60};
        int targetSum = 100;

        int[] result = findTwoSumIndices(inputArray, targetSum);

        if (result != null) {
            System.out.printf("The indices of two numbers that add up to %d: [%d, %d]%n", targetSum, result[0], result[1]);
        } else {
            System.out.println("No such indices found.");
        }
    }
}