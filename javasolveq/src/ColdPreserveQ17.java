import java.util.Scanner;

public class ColdPreserveQ17 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        int cnt=0;
        for(int x:arr)
        {
            if(x<0)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
