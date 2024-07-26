import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        for(int i=2; i<=num/2;i++){
            if(num%i==0){
                System.out.println("Enter number is not prime");
                return;
            }
            else {
                System.out.println("number is prime");
                return;
            }
        }
    }
}

//import java.util.*;
//public class factorial {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = sc.nextInt();
//
//        if (isPrime(num)) {
//            System.out.println(num + " is a prime number.");
//        } else {
//            System.out.println(num + " is not a prime number.");
//        }
//    }
//
//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

