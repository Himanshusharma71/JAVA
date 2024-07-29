import java.util.Arrays;
import java.util.Collections;

public class inbuildSorting {
    public static void main(String[] args) {
        Integer arr[] = {8, 5, 7, 6, 2, 9, 3};
        Arrays.sort(arr, 0, 4);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
