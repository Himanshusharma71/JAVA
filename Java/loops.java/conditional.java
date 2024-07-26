// Question1:Write a Java program to get a number from the user and print whether it is positive or negative

// import java.util.*;
// public class conditional {
//         public static void main(String[] args) {
//             Scanner sc= new Scanner(System.in);
//             System.out.println("Enter the value of a");
//             int a =sc.nextInt();
//             if(a==0 || a>0){
//                 System.out.println("the number is positive");
//             }
//             else{
//                 System.out.println("the number is negetive");
//             }
//         }
//     }

// the following code so that it prints You have a fever if your temperatureis above 100 and otherwise prints You don't have a fever


// import java.util.*;
// public class conditional {
//         public static void main(String[] args) {
//             Scanner sc= new Scanner(System.in);
//             System.out.println("Enter your body temperature");
//             double temp =sc.nextDouble();
//             if(temp > 100 && temp<104){
//                 System.out.println("you have fever please go to dr office");
//             }
//             else if(temp> 104){
//                 System.out.println("Khatam tata byby gya tu");
//             }
//             else{
//                 System.out.println("No fever please maintain your health");
//             }
//         }
//     }

// INCOME TEX CALCULATIONS

// import java.util.*;
// public class conditional {
//         public static void main(String[] args) {
//             Scanner scanner= new Scanner(System.in);
//             System.out.println("Enter your income");
//             double income =scanner.nextDouble();
//             double tax;
//             if(income <=50000 ){
//                 tax=0;
//             }
//             else if(income >50000 && income<100000){
//                 tax=income*0.2;
//             }
//             else{
//                 tax=income*0.3;
//             }
//             System.out.println("your tax is " + tax);
//     }
// }

// import java.util.*;
// public class conditional {
//     public static void main(String[] args) {
//         System.out.println("Hello world!");
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number : ");
//         int num=sc.nextInt();
//         switch (num){
//             case 1:
//                 if(num==1) {
//                     System.out.println("Monday");
//                 }
//                 break;
//             case 2:
//                 if(num==2) {
//                     System.out.println("tuesday");
//                 }
//                 break;

//             case 3:
//                 if(num==3) {
//                     System.out.println("wednesday");
//                 }
//                 break;
//             case 4:
//                 if(num==4) {
//                     System.out.println("thursday");
//                 }
//                 break;
//             case 5:
//                 if(num==5) {
//                     System.out.println("Friday");
//                 }
//                 break;
//             case 6:
//                 if(num==6) {
//                     System.out.println("saturday");
//                 }
//                 break;
//             case 7:
//                 if(num==7) {
//                     System.out.println("Sunday");
//                 }
//                 break;
//             default:
//                 System.out.println("YOU ENTER WRONG INPUT");
//         }

//     }
// }

//leap year function
import java.util.*;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year=sc.nextInt();
        if(year % 4==0 ){
            System.out.println("enter year is leap year");
        }
        else if(year % 400==0 ){
            System.out.println("enter year is leap year");
        }
        else if(year % 100==0 ){
            System.out.println("enter year is leap year");
        }
        else {
            System.out.println("the year is not leap year");
        }


    }
}