import java.util.*;
public class Main {
    public static void main(String[] args) {
//        int n=0;
//        while(n<5){
//            System.out.println("Hello world!");
//            n++;
//        }
//        int n=1;
//        while(n<=10){
//
//            System.out.println(n);
//            n++;
//        }

//        print 1 to n
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your value of n");
//        int n= sc.nextInt();
//        int i=1;
//        while(i<=n){
//            System.out.println(i);
//            i++;
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your value of n");
        int n= sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);

    }
}