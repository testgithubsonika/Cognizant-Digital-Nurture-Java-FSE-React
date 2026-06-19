package Week_1.Design_Patterns.Creational.Singleton;

public class Logger {
    private static Logger ins;
    private Logger(){
        System.out.println("Logger instance created");
    }
    public static Logger getins(){
        if(ins==null){
            ins=new Logger();

        }
        return ins;
    }
    public void log(String m){
        System.out.println("[LOG]: "+m);
    }
}
