import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {12, 45, 74, 65, 42, 32, 24, 44};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        sc.close();  // Close the scanner

        int index = linearSearch(arr, key);
        System.out.println(index);
    }
}
