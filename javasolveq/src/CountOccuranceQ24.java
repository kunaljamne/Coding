import java.util.Scanner;

public class CountOccuranceQ24 {

    static int countOccurance(int []arr,int value)
    {
        int cnt=0;
        for(int x:arr)
        {
            if(x==value) cnt++;
        }
        return cnt;
    }
    public static  void add(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter the length or size: ");
        int size=kb.nextInt();

        System.out.println("Enter the value for which you have to countOccurance: +Msg ");
        int value=kb.nextInt();

        System.out.println("enter the value in array");
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }

        System.out.println("count is: "+countOccurance(arr,value));
    }
}
