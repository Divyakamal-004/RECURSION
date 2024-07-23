import java.util.Scanner;

public class decrincr {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        printDecrease(n);
        printIncrease(n);
    }
    static void printDecrease(int n){
        if(n==0) {
            return;
        }
            System.out.println(n);
            printDecrease(n-1);
    }
    static void printIncrease(int n){
        if(n==0){
            return;
        }
        printIncrease(n-1);
        System.out.println(n);
    }
}
