public class ThreadMain {
    public static void main(String[] args)
    {
        ThreadClass tc=new ThreadClass();
        tc.start();
        ThreadClass tc1=new ThreadClass();
        tc1.start();
    }
}
