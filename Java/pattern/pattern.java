import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
//        int n=5;
//        int i=1;
//        while(i<=n){
//            int y=1;
//            while(y<=i){
//                System.out.print(y);
//                y++;
//            }
//            System.out.println();
//            i++;
//        }
//        output of this program
//            1
//            12
//            123
//            1234
//            12345

//      NEW PATTERN

//        int n=5;
//        int i=1;
//        while(i<=n){
//            int y=1;
//            while(y<=n){
//                System.out.print(y);
//                y++;
//            }
//            System.out.println();
//            i++;
//        }
//             output of this program is
//                12345
//                12345
//                12345
//                12345
//                12345

//        PATTERN 3
//        int n=5;
//        int i=1;
//
//        while(i<=n){
//            int y=1;
//            while(y<=i){
//                System.out.print(n-y+1);
//                y++;
//            }
//            System.out.println();
//            i++;
//        }
//        ouput is reverse of above pattern

//        new pattern

//        int n=4;
//       int  row =1;
//        int count=1;
//        while(row<=n){
//            int col=1;
//            while(col<=row){
//                System.out.print(count);
//                count++;
//                col++;
//            }
//            System.out.println();
//            row++;
//        }
//        output of this program
//        1
//        23
//        345
//        6789

//        New pattern

//        int n=4;
//        int  row =1;
//        while(row<=n){
//            int col=1;
//            int value=row;
//            while(col<=row){
//                System.out.print(value);
//                value++;
//                col++;
//            }
//            System.out.println();
//            row++;
//        }
//        output of this pattern is
//        1
//        23
//        345
//        4567

//        New pattern

//        int n=4;
//        int  row =1;
//        while(row<=n){
//            int col=1;
//            while(col<=row){
//                System.out.print(row-col);
//                col++;
//            }
//            System.out.println();
//            row++;
//        }
//        output is
//        0
//        10
//        210
//        3210

//new pattern new method to print previous code
//        1
//        23
//        345
//        4567
//        int n=4;
//        int  row =1;
//        while(row<=n){
//            int col=1;
//            while(col<=row){
//                System.out.print(row + col - 1);
//                col++;
//            }
//            System.out.println();
//            row=row+1;
//        }

//        NEW PATTER
//        int n=4;
//        int  row =1;
//        while(row<=n){
//            int col=1;
//            while(col<=row){
//                System.out.print(row - col +1);
//                col++;
//            }
//            System.out.println();
//            row=row+1;
//        }
//        output of this program
//        1
//        21
//        321
//        4321

//        new pattern
//        int n=4;
//        int  row =1;
//        while(row<=n){
//            int col=1;
//            int start=1;
//            while(col<=row){
//                System.out.print(col);
//                start++;
//                col++;
//            }
//            System.out.println();
//            row++;
//        }


//        by user input
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of rows for the pyramid: ");
//        int rows = scanner.nextInt();
//
//        int i = 1;
//        while (i <= rows) {
//            int spaces = 1;
//            while (spaces <= rows - i) {
//                System.out.print(" ");
//                spaces++;
//            }
//
//            int stars = 1;
//            while (stars <= 2 * i - 1) {
//                System.out.print("*");
//                stars++;
//            }
//
//            System.out.println();
//            i++;
//        }
//
//        scanner.close();


//        new pattern

//        int n=3;
//        int i=1;
//        while(i<=n){
//
//            int j=1;
//            char start='A';
//            while(j<=n){
//                System.out.print(start + i -1);
//                start++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        PATTERNS USING FOR LOOP
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your value of n");
//        int n= sc.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n");
//        int n = sc.nextInt();
//        System.out.println("enter the value of m");
//        int m = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (i == 1 || j == 1 || i == n || j == m) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}



//        NEXT PATTERN
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of n");
//        int n= sc.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                    System.out.print("*");
//                }
//            System.out.println();
//            }
//        output
//            *
//            **
//            ***
//            ****
//            *****
//            ******

//        next pattern
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of n");
//        int n= sc.nextInt();
//        for (int i = n; i >=1 ; i--) {
//            for (int j = 1; j <=i ; j++) {
//                    System.out.print("*");
//                }
//            System.out.println();
//            }
//
//        output
//                *****
//                ****
//                ***
//                **
//                *

//        NEW PATTERN

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of n");
//        int n= sc.nextInt();
//        for (int i = 1; i<=n ; i++) {
//            for (int j=1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                    System.out.print("*");
//                }
//            System.out.println();
//            }
//             output
//                        *
//                       **
//                      ***
//                     ****
//                    *****



//        New pattern

//        int n=5;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                int sum=i+j;
//                if (sum%2==0){
//                    System.out.print("1");
//                }
//                else {
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }
//            OUT PUT IS
//        1
//        01
//        101
//        0101
//        10101


//        NEW PATTERN BUTTERFLY

//        UPPER HALF
//            int n=5;
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//
////            spaces
//            int spaces=2*(n-i);
//            for (int j = 1; j <=spaces ; j++) {
//                System.out.print(" ");
//            }
//
////            2nd part stars
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
////         lower half
//        for(int i = n; i >= 1; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//
////            spaces
//            int spaces=2*(n-i);
//            for (int j = 1; j <=spaces ; j++) {
//                System.out.print(" ");
//            }
//
////            2nd part stars
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        output is butter fly
//                    *      *
//                    **    **
//                    ***  ***
//                    ********
//                    ********
//                    ***  ***
//                    **    **
//                    *      *


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        char ch=65;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
