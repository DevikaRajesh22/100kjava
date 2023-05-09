import java.util.Scanner;

public class FunSum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=Sum(num1,num2);
        System.out.println("Sum = "+res);
    }
    static int Sum(int a,int b)
    {
        return a+b;
    }
}
