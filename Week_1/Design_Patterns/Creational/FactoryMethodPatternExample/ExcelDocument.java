package Week_1.Design_Patterns.Creational.FactoryMethodPatternExample;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}