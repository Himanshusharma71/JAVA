//
////this is function overloading
////public class Main {
////    public static int sum(int a, int b){
////        return a+b;
////    }
////    public static int sum(int a, int b,int c){
////        return a+b+c;
////    }
////    public static void main(String[] args) {
////        int a;
////        int b;
////        int c;
////        System.out.println("the sum of given numbers : "+ sum(4,5));
////        System.out.println("the sum of given numbers : "+ sum(4,5,11));
////    }
////}
//
//
////this is function overloading using diff data type
////public class Main {
////    public static int sum(int a, int b){
////        return a+b;
////    }
////    public static float sum(float a, float b){
////        return a+b;
////    }
////    public static void main(String[] args) {
////        int a;
////        int b;
////        System.out.println("the sum of given numbers : "+ sum(4,5));
////        System.out.println("the sum of given float numbers : "+ sum(4.2f,5.8f));
////    }
////}
//
//
////check the given number is prime or not
//
////import java.util.*;
////public class Main {
////    public static boolean isPrime(int n){
////        boolean isPrime=true;
////        for(int i=2;i<=n-1; i++){
////            if(n%i==0){
////                isPrime=false;
////                break;
////            }
////        }
////        return isPrime;
////    }
////
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        System.out.println("Enter the value of n :");
////        int n=sc.nextInt();
////        System.out.println("The given number is  : "+isPrime(n));
////    }
////}
//
//
////by this method be can optime the loop so it can only count same factor only one time
//
////import java.util.*;
////public class Main {
////    public static boolean isPrime(int n){
////        if(n==2){
////            return true;
////        }
////        for(int i=2;i<=Math.sqrt(n); i++){
////            if(n%i==0){
////                return false;
////            }
////        }
////        return true;
////    }
////
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        System.out.println("Enter the value of n :");
////        int n=sc.nextInt();
////        System.out.println("The given number is  : "+isPrime(n));
////    }
////}
//
//
//import java.util.*;
//public class Main {
//    public static boolean isPrime(int n){
//        if(n==2){
//            return true;
//        }
//        for(int i=2;i<=Math.sqrt(n); i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public  static void primeInRange(int n){
//        for(int i=2;i<=n;i++){
//            if(isPrime(i)){
//                System.out.println(i+ " ");
//            }
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of n :");
//        int n=sc.nextInt();
//        System.out.println("The given number is  : "+isPrime(n));
//        primeInRange(n);
//    }
//}
//
//

public class Main {
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

