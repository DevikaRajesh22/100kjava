public class PrimeClass {
    void checkPrime(int k)
    {
        boolean isPrime=true;
        if(k<=1){
            isPrime=false;
        }
        else {
            for (int i=2;i<=Math.sqrt(k);i++)
            {
                if(k%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Entered number is prime");
        }
        else{
            System.out.println("Entered number is not prime");
        }
    }
}
