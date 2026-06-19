package Week_1.Design_Patterns.Creational.Singleton;

public class SingletonTest {
    public static void main(String[] args){
           Logger log1=Logger.getins();
           Logger log2=Logger.getins();
           log1.log("first message");
           log2.log("second message");
           if(log1==log2){
            System.out.println("Singleton works! only one instance created. ");
           }
           else{
            System.out.println("singleton failed! ");
           }
           System.out.println("logger1 hash-code: "+log1.hashCode());
           System.out.println("logger2 hash-code: "+log2.hashCode());
    }
}
