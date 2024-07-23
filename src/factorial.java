import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int f=factorial(n);
     System.out.println(f);
    }
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fm1=factorial(n-1);
        int fn=n*fm1;
        return fn;
    }
}
