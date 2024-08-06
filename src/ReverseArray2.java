import java.util.Scanner;

public class ReverseArray2 {
    public static void main(String[] args) {
        System.out.print("enter the number of elements:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        System.out.print("displaying array:");
        displayArray(arr,0);
    }
    static void displayArray(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        displayArray(arr,idx+1);
        System.out.println(arr[idx]);
    }
}