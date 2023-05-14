public class AbstractTextScanner {
    AbstractHello obj;
    public AbstractTextScanner(AbstractHello obj){
        this.obj=obj;
    }
    void scan(){
        String text="Scanned";
        obj.onText(text);
    }
}
