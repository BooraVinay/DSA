package FactoryObjectPattern;
/* creational Pattern 
 * is to create objects
 * object creation hapens in the factories
 * 
*/
public class Knife {
    
    Knife orderKnife(String knifeType){
        Knife knife;
        if(knifeType.equals("steak")){
            knife=new SteakKnife();
        }
        else if(knifeType.equals("chefs")){
            knife=new ChefsKnife();
        }
        //prepare the knife
         knife.sharpen();
         knife.polish();
         knife.package();
         return knife;
    }

}
