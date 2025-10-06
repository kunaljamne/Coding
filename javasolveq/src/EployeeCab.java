import java.util.Scanner;

public class EployeeCab {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the size of num");
        int n=kb.nextInt();

        System.out.println("Enter the array's element");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }

        int stRange=kb.nextInt();
        int endRange=kb.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(stRange<=arr[i] && endRange>=arr[i])
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
