import java.util.*;
public class new_function {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.next();
        printMyName(name);//upar bale new function joh banaya hai use call kiya hai
    }
}
