import java.util.*;
public class Arrayprograms {
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of p c m :");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy :" + marks[0]);
        System.out.println("che :" + marks[1]);
        System.out.println("math :" + marks[2]);
//        System.out.println(marks);

        int percentage =((marks[0]+marks[1]+marks[2]))/3;
        System.out.println(percentage);
        System.out.println(marks.length);
    }
}
