package recentQ;

public class RotateArray {

    public static void main(String[] args) {
        // Array to rotate
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;  // Number of rotations
        int len = arr.length; // Length of the array

        // Ensure k is within array bounds
        k = k % len;  // In case k is larger than array length

        // Rotate the array using a temporary array
        int[] temp = new int[len];

        // Copy the last k elements to the beginning of temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[len - k + i];
        }

        // Copy the remaining elements
        for (int i = 0; i < len - k; i++) {
            temp[k + i] = arr[i];
        }

        // Copy the temp array back into the original array
        for (int i = 0; i < len; i++) {
            arr[i] = temp[i];
        }

        // Print the rotated array
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

