public class AbstractSample extends AbstractHello {
    void onText(String text){
        System.out.println(text);
    }
    AbstractSample(){
        AbstractTextScanner ts=new AbstractTextScanner(this);
        ts.scan();
    }
    public static void main(String[] args){
        AbstractSample s=new AbstractSample();
    }

}
