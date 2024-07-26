import java.util.*;
public class sumofintchoice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        int choice;
        do{
            System.out.println("Enter the value of number");
            int number=sc.nextInt();
            if(number%2==0){
                evenSum+=number;
            }
            else {
                oddSum +=number;
            }
            System.out.println("do you continue? then press one else 0 for exit ");
            choice=sc.nextInt();;
        }
        while(choice==1);
        System.out.println("sum of even number is :" + evenSum);
        System.out.println("sum of odd number is :" + oddSum);
    }
}
