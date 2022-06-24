package FactoryMethodPattern;

public class BudgetKnifeStore extends KnifeStore{
    // up to any subclass of KnifeStore to define this method
    Knife createKnife (String knifeType){
        if (knifeType.equals("steak")){
            return new BudgetSteakKnife(knifeType);
        } else if (knifeType.equals("chefs")){
            return new BudgetChefsKnife(knifeType);
        } else {
            return null;
        }
    }
}
