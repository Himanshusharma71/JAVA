public class BinaryToDeci {

    public static int BinaryNum(int n){
        int pow = 0;
        int deci = 0;
        int originalN = n; // Store the original value of n for printing

        while(n > 0){
            int lastDigit = n % 10;
            deci = deci + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("decimal of binary num is " + originalN + " = " + deci);
        return deci;
    }

    public static void main(String[] args) {
        BinaryNum(100);
    }
}


