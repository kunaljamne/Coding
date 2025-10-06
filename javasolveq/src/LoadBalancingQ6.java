import java.util.Scanner;

public class LoadBalancingQ6 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=kb.nextInt();
        System.out.println("Enter the elements: ");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }

        int ans=1;
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
            {
                ans++;
            }
        }

        System.out.println("the request serverd by the server 1: "+ans);

    }
}
