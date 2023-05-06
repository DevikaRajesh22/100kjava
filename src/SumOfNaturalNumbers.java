import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int limit=sc.nextInt();
        int sum=0;
        for(int i=0;i<=limit;i++){
            sum+=i;
        }
        System.out.println("Sum = "+sum);
    }
}
