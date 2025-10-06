import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnlockingKey {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        if(n<=9 && n>=-9)
        {
            System.out.println(n);
        }else if(n>9){
            int temp=n,i=0;
            ArrayList<Integer> arr=new ArrayList<>();
            while(temp!=0){
                arr.set(i++, temp % 10);
                temp/=10;
            }
//            Arrays.sort(arr);

        }
    }
}
