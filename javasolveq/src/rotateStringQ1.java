import java.util.Scanner;

public class rotateStringQ1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter First String");
        String s1 = kb.next();
        System.out.println("Enter Second String");
        String s2 = kb.next();


        if (s1.length() != s2.length()) {
            System.out.println(-1);
            return;
        }


        String doublee = s1 + s1;

        if (doublee.contains(s2)) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
