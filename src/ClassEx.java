public class ClassEx {
    public static void main(String[] args)
    {
        ClassExObj obj1=new ClassExObj();
        ClassExObj obj2=new ClassExObj();
        obj1.a=10;
        obj1.b=20;
        obj2.a=30;
        obj2.b=40;
        System.out.println("A of obj1 ="+obj1.a+"\n"+"B of obj1 = "+obj1.b);
        System.out.println("A of obj2 ="+obj2.a+"\n"+"B of obj2 = "+obj2.b);

    }
}
