import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter your number");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
                //System.out.println("enter number is multiple of 10 :");
            }
            System.out.println(n);
        }
        while(true);
    }
}
//        while(n>0){
//            int lastDigit=n%10;
//
//            n=n/10;
//            System.out.print(lastDigit);
//        }
//        System.out.println();
//    }
//}
