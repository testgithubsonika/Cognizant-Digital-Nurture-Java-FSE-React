package Week_1.Design_Patterns.Creational.FactoryMethodPatternExample;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}
