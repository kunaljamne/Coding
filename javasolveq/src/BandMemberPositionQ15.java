import java.util.Scanner;

public class BandMemberPositionQ15 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("total nober of member: ");
        int totalMember=kb.nextInt();
        System.out.println("No of swapsor Performance: ");
        int q=kb.nextInt();
        int swapSize=kb.nextInt();

        int []member=new int[totalMember];
        for(int i=0;i<totalMember;i++)
        {
            member[i]=i+1;
        }

        for(int i=0;i<q;i++)
        {
            int pos1=kb.nextInt()-1;
            int pos2=kb.nextInt()-1;

            int temp=member[pos1];
            member[pos1]=member[pos2];
            member[pos2]=temp;
        }

        int posMember=kb.nextInt();
        System.out.println(member[posMember-1]);
    }
}
