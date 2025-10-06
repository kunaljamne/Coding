import java.util.Scanner;

public class MultiplyNumberErrorSolveQ23 {

    static int multiplyNum2(int num1,int num2,int num3)
    {
        num1=Math.max(num1,num2);
        num2=Math.max(num2,num3);
        int result=num1*num2;
        return result;
    }

    static int multiplyNum(int num1,int num2,int num3)
    {
        int result,min,max,mid;
        max=(num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
        min=(num1<num2)?((num1<num3)?num1:num3):((num2<num3)?num2:num3);
        mid=(num1+num2+num3)-(min+max);
        result=max*mid;
        return result;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1,num2,num3;
        num1=kb.nextInt();
        num2=kb.nextInt();
        num3=kb.nextInt();

        System.out.println("Multiplicative product is: "+multiplyNum(num1,num2,num3));
    }
}
