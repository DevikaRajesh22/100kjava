import java.util.Scanner;

public class Prime {
    public static void main(String[] args)
    {
        PrimeClass obj=new PrimeClass();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        obj.checkPrime(num);
    }
}
