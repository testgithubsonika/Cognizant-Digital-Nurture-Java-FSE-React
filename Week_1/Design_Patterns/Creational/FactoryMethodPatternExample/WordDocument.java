package Week_1.Design_Patterns.Creational.FactoryMethodPatternExample;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
}