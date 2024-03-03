package FactoryMethodPattern;

public class BudgetKnifeStore extends KnifeStore {

    @Override
    Knife createKnife(String knifeType) {
        if(knifeType.equals("steak")){
            return new BudgetSteakKnife();
        }
        else if(knifeType.equals("steak")){
            return new BudgetChefsKnife();
        }

        //.. more types
    }
    
}
