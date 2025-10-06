/*import java.util.Scanner;

public class SumOfTwoChemicalQ11 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the numOfChem: ");
        int n=kb.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= kb.nextInt();
        }
        int pro=0,temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {

                pro=Math.max(pro,arr[i]+temp);

            temp=Math.max(temp,arr[i]);
        }

        System.out.println(pro);

    }
}*/
import java.util.Scanner;

public class SumOfTwoChemicalQ11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the numOfChem: ");
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        int pro = firstMax + secondMax;
        System.out.println("Maximum sum of two chemicals: " + pro);
    }
}

