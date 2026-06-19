package Week_1.Design_Patterns.Creational.FactoryMethodPatternExample;

public class WordFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
