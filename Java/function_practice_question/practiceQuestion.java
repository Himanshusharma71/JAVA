//import java.util.*;
//public class practiceQuestion {
//    public static int Addition(int x ,int y){
//        int z;
//        if(x>y){
//            z=x+y;
//        }
//        else {
//            z=(x+y)*5;
//        }
//        return z;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of x");
//        int a=sc.nextInt();
//        System.out.println("Enter the value of y");
//        int b=sc.nextInt();
//
//        System.out.println(Addition(a,b));
//
//    }
//}

//import java.util.*;
//public class practiceQuestion {
//    public static float average(int x , int y,int z){
//        float avg=(x+y+z)/3f;
//        return avg;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of a");
//        int a=sc.nextInt();
//        System.out.println("Enter the value of b");
//        int b= sc.nextInt();
//        System.out.println("Enter the value of c");
//        int c= sc.nextInt();
//        System.out.println("Average of numbers is : " + average(a ,b,c));
//    }
//}

import java.util.*;

//public class practiceQuestion {
//    public static int sumOfOddNum(int n) {
//        int sum=0;
//        for (int i = 0; i <=n ; i++) {
//            if( i % 2 !=0){
//                sum =sum+i;
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int a=sc.nextInt();
//        System.out.println("The sum of odd number is: " + sumOfOddNum(a));
//    }
//
//}

//public class practiceQuestion {
//    public static int sumOfEvenNum(int n) {
//        int sum=0;
//        for (int i = 0; i <=n ; i++) {
//            if( i % 2 ==0){
//                sum =sum+i;
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int a=sc.nextInt();
//        System.out.println("The sum of odd number is: " + sumOfEvenNum(a));
//    }
//
//}


//new question
//
//import java.util.*;
//public class practiceQuestion {
//    public static int greaterNum(int x ,int y,int z){
//        int greater=x;
//        if(y>greater){
//            greater=y;
//        }
//        if (z> greater){
//            greater=z;
//        }
//        return greater;
//    }
//
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the value of a");
//        int a= input.nextInt();
//        System.out.println("Enter the value of b");
//        int b= input.nextInt();
//        System.out.println("Enter the value of c");
//        int c= input.nextInt();
//
//        System.out.println("the greatest number is :" + greaterNum(a,b,c));
//    }
//}


//Question new area of circle while taking user inpur radius


//

//new Question
//import java.util.*;
//public class practiceQuestion {
//
//    public static int Voting(int age){
//        int eligible = age;
//        if(age>=18){
//            System.out.println("YOU ARE ELIGIBLE FOR VOTE PLEASE 🙏 VOTE");
//        }
//        else if(age>100){
//            System.out.println("Ab aapke jane ka time ho gya hai");
//        }
//        else {
//            System.out.println("Plese come here after 18 ");
//        }
//        return eligible;
//    }
//
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter your age");
//        int UMR= input.nextInt();
//        Voting(UMR);
//    }
//}

//import java.util.*;
//public class practiceQuestion {
//    public  static int natural(int n){
//        int check=n;
//        if(n>0){
//            System.out.println(n + " Enter number is positive");
//        } else if (n==0) {
//            System.out.println("Enter number is zero" + n);
//        }
//        else {
//            System.out.println("Enter number is negative" + n);
//        }
//        return check;
//    }
//
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter your number : ");
//        int num= input.nextInt();
//        natural(num);
//    }
//}