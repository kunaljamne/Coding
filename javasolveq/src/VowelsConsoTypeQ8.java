import java.util.Scanner;

public class VowelsConsoTypeQ8 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=kb.nextInt();
        System.out.println("Enter the characters : ");
        char []arr=new char[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.next().charAt(0);
        }
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            char ch=Character.toLowerCase(arr[i]);
            if(ch=='a' || ch=='e' ||ch=='i' || ch=='o'||ch=='u')
            {
                cnt++;
            }
        }
        System.out.println("The num productId fo the deshtop priduct in the sales data are: "+cnt);
    }
}
