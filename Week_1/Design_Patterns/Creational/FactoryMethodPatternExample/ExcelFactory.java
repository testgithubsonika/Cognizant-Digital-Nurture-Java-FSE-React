package Week_1.Design_Patterns.Creational.FactoryMethodPatternExample;

public class ExcelFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
