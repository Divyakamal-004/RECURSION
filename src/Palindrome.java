import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(palin(num));
    }
    static int Reverse(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper (n, digits);
    }

    private static int helper(int n, int digits) {
        if(n %10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits -1)) + helper(n/10, digits- 1);
    }
    static boolean palin(int n){
        return n ==Reverse(n);
    }

}
