//public class Main {
//    public static void greet(){
//        System.out.println("Hello world how are you ");
//    }
//    public static void main(String[] args) {
//        System.out.println("this is my first function");
//        greet();
//    }
//}


//function with perameters()
//public class Main {
//    public static int sumoftwo(int a, int b){
//        int sum=a+b;
//        return sum;
//    }
//    public static void main(String[] args) {
//        int a;
//        int b;
//        int sum= sumoftwo(3,5);
//        System.out.println(("sum of the a and b is :" + sum));
//    }
//}

//public class Main {
//    public static int factorialofnum(int a){
//        if(a==1 || a==0){
//            return 1;
//        }
//        else {
//         return  a * factorialofnum(a-1) ;
//        }
//    }
//    public static void main(String[] args) {
//        int a;
//        int fact= factorialofnum(5);
//        System.out.println("factorial of num a : "+ fact);
//    }
//}


//Binomical cofficient

public class Main {
    public static int factorialofnum(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{

        return n* factorialofnum(n-1);
        }
    }
    public static int bincoff(int n ,int r){
        int fact_n=factorialofnum(n);
        int fact_r=factorialofnum(r);
        int fact_nmr=factorialofnum(n-r);

        int binCoff=fact_n/(fact_r * fact_nmr);
        return binCoff;
    }
    public static void main(String[] args) {
        System.out.println( "the binomial coff is :"+ bincoff(5,4));
    }
}