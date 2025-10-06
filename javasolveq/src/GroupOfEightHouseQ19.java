import java.util.Scanner;

public class GroupOfEightHouseQ19 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = kb.nextInt();
        System.out.println("Enter the elements either 0 or 1");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println("Enter the number of days: ");
        int days = kb.nextInt();

        int[] temp = new int[n];

        while (days-- > 0) {

            temp[0] = (arr[1]==0) ? 0 : 1;

            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i - 1] == arr[i + 1]) {
                    temp[i] = 0;
                } else {
                    temp[i] = 1;
                }
            }

            temp[arr.length - 1] = (arr[arr.length - 2] ==0) ? 0 : 1;

            arr = temp.clone();
        }

        System.out.println("Printing array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
