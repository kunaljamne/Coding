import java.util.Scanner;

public class OnlineGameQ22{

    static void printArray(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size");
        int n=kb.nextInt();

        System.out.println("Enter elements:");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }

        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                temp[j++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                temp[j++]=arr[i];
            }
        }

        printArray(temp);
    }
}
