public class decimalTobinary {
    public static void deciBin(int n){
        int myNum=n;
        int pow=0;
        int Binnum=0;
        while(n > 0){
            int rem=n%2;
            Binnum=Binnum + (rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println(Binnum);
    }

    public static void main(String[] args){
        deciBin(10);
    }
}
