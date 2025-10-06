import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCompQ9 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        Map<Character,Integer> table=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            table.put(ch, table.getOrDefault(ch,0)+1);
        }
        int cnt=0;
        for(int freq:table.values())
        {
            if(freq==1)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
