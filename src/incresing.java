import java.util.Scanner;

public class incresing {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       printincreasing(n);
    }
    static void printincreasing(int n){
        if(n==0){
            return;
        }
        printincreasing(n-1);
        System.out.println(n);
    }
}
