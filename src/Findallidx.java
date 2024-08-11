import java.util.Scanner;

public class Findallidx {
    public static void main(String[] args) {
        System.out.print("enter the number of elements:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        System.out.print("enter the data :");
        int data = inp.nextInt();
        int[] hh=allidx(arr,data,0,0);
        System.out.print("number of indices:"+hh);


    }


    static int[] allidx(int[] arr, int data, int idx, int fosofa) {
        if (idx == arr.length) {
            return new int[fosofa];
        }
        if (arr[idx] == data) {
            int[] iarr = allidx(arr, data, idx + 1, fosofa + 1);
            iarr[fosofa] = idx;
            return iarr;
        } else {
            int[] iarr = allidx(arr, data, idx + 1, fosofa);
            return iarr;
        }
    }
}
