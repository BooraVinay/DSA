package FactoryObjectPattern;

public class KnifeStore {
    private KnifeFactory factory;

//requores a knifeFactory object to be passed to
//this constrcutor
//it is a client to knife factory
//there can be many cleints to knife factory
public KnifeStore(KnifeFactory factory){
    this.factory=factory;

}
public Knife orderKnife(String knifeType){
    Knife knife;
//using the create method in the factory
    knife=factory.createKnife(knifeType);

    //preapre the knife
    knife.sharpen();
    knife.polish();
    knife.package();
    return knife;
}
}
