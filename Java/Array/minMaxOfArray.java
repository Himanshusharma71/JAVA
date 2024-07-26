public class minMaxOfArray {
    public static int max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3, 6, 7, 21};
        int maxValue = max(arr);
        int minValue = min(arr);
        System.out.println("Maximum value in the array: " + maxValue);
        System.out.println("Minimum value in the array: " + minValue);
    }
}
