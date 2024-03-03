package FactoryMethodPattern;

public abstract class KnifeStore {
   


public Knife orderKnife(String knifeType){
    Knife knife;
//using the create method in the factory
    knife=createKnife(knifeType);

    //preapre the knife
    knife.sharpen();
    knife.polish();
    knife.package();
    return knife;
}
abstract Knife createKnife(String knifeType);
}
