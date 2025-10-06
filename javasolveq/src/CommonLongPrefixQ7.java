import java.util.Scanner;

public class CommonLongPrefixQ7 {

    static String helper(String str1, String str2) {
        // Find common prefix of two strings
        int minLen = Math.min(str1.length(), str2.length());
        int i = 0;
        while (i < minLen && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return str1.substring(0, i);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length of string array:");
        int n = kb.nextInt();
        System.out.println("Enter the strings:");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.next();
        }

        String prefix = arr[0];
        for (int i = 1; i < n; i++) {
            prefix = helper(prefix, arr[i]);
            if (prefix.isEmpty()) break; // no common prefix
        }
        System.out.println("Final Common Prefix is: " + prefix);
    }
}
