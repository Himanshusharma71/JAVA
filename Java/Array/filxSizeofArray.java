import java.util.*;
public class array_practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int size = sc.nextInt();
        System.out.println("Enter the array numbers ");
        int Number[]=new int[size];

        for (int i = 0; i <size ; i++) {
            Number[i] = sc.nextInt();
        }
        for (int i = 0; i <Number.length ; i++) {
            System.out.println("Your numbers is " + Number[i]  );
        }

        System.out.println("Enter the number you want to find ");
        int x=sc.nextInt();
        for (int i = 0; i < Number.length ; i++) {
            if(Number[i]==x){
                System.out.println("yes your number on index number " + i);
            }
        }
    }
}
