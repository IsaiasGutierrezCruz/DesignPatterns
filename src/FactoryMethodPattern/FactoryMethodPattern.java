package FactoryMethodPattern;

public class FactoryMethodPattern {

    public static void implementFactoryMethodPattern(){
        // create the budget knife store object
        BudgetKnifeStore store1 = new BudgetKnifeStore();

        // create a knife
        Knife knife1;
        knife1 = store1.createKnife("steak");
        knife1.identification();

        // create the chefs knife
        Knife knife2;
        knife2 = store1.orderKnife("chefs");
        knife2.identification();
    }
}
