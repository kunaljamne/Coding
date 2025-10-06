import java.util.Arrays;
import java.util.Scanner;

public class AlternateSortListQ21 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        int n=kb.nextInt();

        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i+=2)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
