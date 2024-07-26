import java.util.*;
public class avg {
    public static void  average(float a, float b, float c,float n){
        float averages=(a+b+c)/n;
        System.out.println(averages);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        float a=sc.nextFloat();
        System.out.println("Enter the value of b");
        float b=sc.nextFloat();
        System.out.println("Enter the value of c");
        float c=sc.nextFloat();
        System.out.println("Enter the value of n");
        float n=sc.nextFloat();
        average(a,b,c,n);
    }

}
