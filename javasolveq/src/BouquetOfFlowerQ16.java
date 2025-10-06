import java.util.Scanner;

public class BouquetOfFlowerQ16 {

    static void printOutPut(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static int[] sorterAsc(int start,int end,int[] arr)
    {
        for(int i=start;i<end;i++){
            for(int j=i+1;j<end;j++)
            {
                if (arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }

        return arr;
    }
    static int[] sorterDes(int start,int end,int[] arr)
    {
        for(int i=start;i<end;i++){
            for(int j=i+1;j<end;j++)
            {
                if (arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        int k=kb.nextInt();

        sorterAsc(0,k,arr);
        sorterDes(k,n,arr);

        printOutPut(arr);
    }
}
//input
//8
//11 7 5 10 46 23 16 8
//3
//output
//5 7 11 46 23 16 10 8
