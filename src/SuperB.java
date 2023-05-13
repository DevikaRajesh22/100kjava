public class SuperB  extends SuperA{
    int a;
    void displa()
    {
        System.out.println("Its superB");
        super.diplay();
    }
    public static void main(String[] args)
    {
        SuperB b=new SuperB();
        b.diplay();

    }

}
