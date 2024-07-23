import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int n = inp.nextInt();
        int xn = power(x, n);
        System.out.println(xn);
    }
        static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n-1);
        int xn=x*xnm1;

            return xn;
        }
        }
