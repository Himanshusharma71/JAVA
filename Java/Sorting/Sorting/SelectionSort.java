public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void arrPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        System.out.println(); // To print a newline after printing the array
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 3, 8, 9, 7};
        selectionSort(arr);
        arrPrint(arr);
    }
}
