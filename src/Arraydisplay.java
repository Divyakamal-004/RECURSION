import java.util.Scanner;

public class Arraydisplay {
    public static void main(String[] args) {
        System.out.print("Enter the length of the array:");
       Scanner inp=new Scanner(System.in);
       int n=inp.nextInt();
       int[] arr=new int[n];
       System.out.print("enter the integer in array: ");
       for(int i=0;i<arr.length;i++){
           arr[i]=inp.nextInt();
       }
        System.out.print("displaying array: ");
       displayArr(arr,0);

    }
    public static void displayArr(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }

        System.out.print(arr[idx]);
        displayArr(arr,idx+1);
    }

}
