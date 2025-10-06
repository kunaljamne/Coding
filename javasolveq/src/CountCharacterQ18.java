import java.util.Scanner;

public class CountCharacterQ18 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        char ch=kb.next().charAt(0);

        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            char temp=str.charAt(i);
            if(temp==ch) cnt++;
        }
        System.out.println("Occurance of character is: "+cnt);
    }
}
