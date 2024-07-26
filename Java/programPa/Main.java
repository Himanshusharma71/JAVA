//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int num=sc.nextInt();
//        switch (num){
//            case 1:
//                if(num==1) {
//                    System.out.println("Monday");
//                }
//                break;
//            case 2:
//                if(num==2) {
//                    System.out.println("tuesday");
//                }
//                break;
//
//            case 3:
//                if(num==3) {
//                    System.out.println("wednesday");
//                }
//                break;
//            case 4:
//                if(num==4) {
//                    System.out.println("thursday");
//                }
//                break;
//            case 5:
//                if(num==5) {
//                    System.out.println("Friday");
//                }
//                break;
//            case 6:
//                if(num==6) {
//                    System.out.println("saturday");
//                }
//                break;
//            case 7:
//                if(num==7) {
//                    System.out.println("Sunday");
//                }
//                break;
//            default:
//                System.out.println("YOU ENTER WRONG INPUT");
//        }
//
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
////        System.out.println("Hello world!");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the year : ");
//        int year=sc.nextInt();
//        if(year % 4==0 ){
//            System.out.println("enter year is leap year");
//        }
//        else if(year % 400==0 ){
//            System.out.println("enter year is leap year");
//        }
//        else if(year % 100==0 ){
//            System.out.println("enter year is leap year");
//        }
//        else {
//            System.out.println("the year is not leap year");
//        }
//
//
//    }
//}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a= sc.nextInt();
        System.out.println("Enter the value of b");
        int b= sc.nextInt();
        System.out.println("Enter the opertor : ");
        int opr=sc.next().charAt(0);
        switch (opr){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println( a*b);
                break;
            case 4:
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("YOU ENTER WRONG INPUT");
        }

    }
}

















