package Week_1.Design_Patterns.Creational.FactoryMethodPatternExample;

public class PdfFactory extends DocumentFactory {
    @Override
    public Document createDocument(){
        return new PdfDocument();
    }
    
}
