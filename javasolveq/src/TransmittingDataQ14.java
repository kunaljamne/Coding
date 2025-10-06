import java.util.Scanner;

public class TransmittingDataQ14 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        int cnt=0;
        int i=0,j=str.length()-1;
        while(i<=j)
        {

                if (str.charAt(i) == str.charAt(j)) {
                    cnt += 2;
                }


            i++;
            j--;
        }
        cnt=str.length()%2==0?cnt:cnt-1;
        System.out.println(cnt);
    }
}
