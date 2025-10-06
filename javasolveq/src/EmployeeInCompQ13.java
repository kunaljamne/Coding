import java.util.Scanner;

public class EmployeeInCompQ13 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        int totalOtherModule=0,maxModule=0;
        for(int i=0;i<n;i++)
        {
            totalOtherModule+=arr[i];
            maxModule=Math.max(maxModule,arr[i]);
        }
        totalOtherModule-=maxModule;
        if(maxModule<=totalOtherModule+1)
        {
            System.out.println("Total Weeks required to complete is: "+totalOtherModule);
        }
        else{
            System.out.println("Total Weeks required to complete is: "+(2*totalOtherModule+1));
        }
    }
}
