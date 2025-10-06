import java.util.Scanner;
import java.lang.Math;

public class saleDiscountEli {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size");
        int n=kb.nextInt();

        System.out.println("Enter the prices");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }

        int disCus=0;
        for(int x:arr)
        {
            double temp=Math.sqrt(x);
            if((int)Math.sqrt(x)==temp) disCus++;
        }
        System.out.println(disCus);
    }
}
