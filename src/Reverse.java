import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        rev(n);

    }
    static void rev (int n){
        if(n==n%10){
            System.out.print(n);
        }
       else{
           System.out.print(n%10);
           rev(n/10);
        }
    }

    }

