public class solution {
    public static boolean isPalind(int n) {
        int myNum = n;
        int reverse = 0;

        while (myNum != 0) {
            int lastDigit = myNum % 10;
            myNum = myNum / 10;
            reverse = reverse * 10 + lastDigit;
        }

        // Compare the reversed number with the original number
        return reverse == n;
    }

    public static void main(String[] args) {
        boolean result = isPalind(11011);
        System.out.println(result); // It should print true for 11011
    }
}
