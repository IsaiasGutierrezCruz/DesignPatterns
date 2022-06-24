package FactoryMethodPattern;

// Knives shop example
public abstract class KnifeStore {
    public Knife orderKnife(String knifeType){
        Knife knife;
        // creating a knife
        knife = createKnife(knifeType);
        // prepare the knife
        knife.sharpen();
        knife.polish();
        knife.packaging();
        return knife;
    }
    abstract Knife createKnife(String knifeType);
}
