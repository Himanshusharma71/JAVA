//import java.util.*;
//public class himanshu {
//    public static int Sum(int x, int y){
//        int z;
//        if(x>y){
//            z=x+y;
//        }
//        else {
//            z=(x+y)*5;
//        }
//        return z;
//    }
//
//    public static void main(String args[]) {
//       Scanner sc=new Scanner(System.in);
//        System.out.println("enter the value of x");
//       int x=sc.nextInt();
//        System.out.println("enter the value of y");
//        int y=sc.nextInt();
//       Sum(z);
//    }
//}

//import java.util.*;
//public class himanshu {
//    static void myMethod(String fname) {
//        System.out.println(fname);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your name");
//        String fname=sc.next();
//        myMethod(fname);
//    }
//}
//import java.util.*;
//public class himanshu {
//    static int myMethod(int x, int y) {
//        int z;
//        if(x>y){
//            z=x+y;
//        }
//        else{
//            z=(x+y)*(x+y);
//        }
//        return z;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter Your value of x");
//        int x=sc.nextInt();
//        System.out.println("enter the value of y");
//        int y=sc.nextInt();
//        System.out.println(myMethod(x,y));
//    }
//}

//import java.util.*;
//
//public class himanshu {
//    public static void collageName(String cName) {
//        System.out.println("your collage Name is :" + cName);
//        return;
//    }
//
//    public static void main(String[] args) {
//        Scanner col=new Scanner(System.in);
//        System.out.println("Enter your collage name");
//        String cname=col.next();
//        collageName(cname);
//    }
//
//}


import java.util.*;

public class himanshu {
    public static void calculateFactorial(int n) {
        int factorial=1;
        if(n<0){
            System.out.println("Enter number is invalid number");
            return;
        }
        for (int i=n; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial of number is : " +  factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want the factorial");
        int n=sc.nextInt();
        calculateFactorial(n);
    }

}
