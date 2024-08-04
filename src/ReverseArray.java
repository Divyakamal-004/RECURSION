import java.util.Scanner;

public class ReverseArray {
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
        reverseArray(arr,n-1);
    }
        public static void reverseArray(int[] arr,int idx){
            if(idx==-1){
                return;
            }
            System.out.print(arr[idx]);
            reverseArray(arr,idx-1);

        }
    }

