import java.util.Scanner;

public class ReplaceValuessQ20 {

    static void printArray(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void replaceValues(int n,int []arr)
    {
        int val;
        val=(n%2 ==0) ? 0 : 1;
        for(int i=0;i<n;i++)
        {
            arr[i]=val;
        }

        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter the size of input: ");
        int n=kb.nextInt();

        System.out.println("enter the element of list:");
        int list[]=new int[n];

        for(int i=0;i<n;i++)
        {
            list[i]=kb.nextInt();
        }

        replaceValues(n,list);
    }
}
