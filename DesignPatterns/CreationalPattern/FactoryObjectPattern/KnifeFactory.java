package FactoryObjectPattern;

public class KnifeFactory {
/* In general Factory object is an instance of such a class
 * which has a method to create product objects
*/
/* benefits of factory objects
 * If there are multiple clients that want to instantiate
 * the same set of classes, then by using a Factory object, 
 * you have
 * cut out redundant code and made the 
 * 
 * software easier to modify.
 */
    public Knife createKnife(String knifeType){
        Knife knife=null;
        if(knifeType.equals("steak")){
            knife=new SteakKnife();
        }
        else if(knifeType.equals("chefs")){
            knife=new ChefsKnife();
        }
        return knife;
    }
    
}
