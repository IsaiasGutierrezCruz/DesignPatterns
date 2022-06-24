package FactoryMethodPattern;

public abstract class Knife {
    int sizeCm;
    String material;
    String knifeType;

    public Knife(String knifeType){
        this.sizeCm = 20;
        this.material = "Metal";
        this.knifeType = knifeType;
    }

    public void sharpen(){ System.out.println("I'm sharp");}

    public void polish(){
        System.out.println("I'm polished");
    }

    public void packaging(){
        System.out.println("I'm packaged");
    }

    public void identification(){
        System.out.println("I'm a Budget " + this.knifeType + " Knife");
    }
}

class BudgetSteakKnife extends Knife {
    public BudgetSteakKnife (String knifeType){
        super(knifeType);
    }

}

class BudgetChefsKnife extends Knife {
    public BudgetChefsKnife (String knifeType){
        super(knifeType);
    }
}