import java.util.Scanner;

public class SchoolGroupQ12 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int parGrp=kb.nextInt();
        int stdGrp=kb.nextInt();
        int cnt=0;
        while(stdGrp!=0)
        {
            if(stdGrp%10==parGrp)
            {
                cnt++;
            }
            stdGrp/=10;
        }
        System.out.println(cnt);
    }
}
