package ImplementationOfPatterns;
import FactoryMethodPattern.FactoryMethodPattern;
import FecadePattern.FecadePattern;
import SingletonPattern.SingletonPattern;

import java.util.Scanner;

public class ImplementationOfPatterns {

    public static void implementation(int designPatternNum) {
        switch (designPatternNum){
            case 1:
                SingletonPattern.implementSingletonPattern();
            case 2:
                FactoryMethodPattern.implementFactoryMethodPattern();
            case 3:
                FecadePattern.implementFecadePattern();
            default:
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println("Select the number of the design patter to implement \n 1. SingletonPattern \n 2. FactoryMethodPattern \n 3. Fecade Pattern");
        Scanner in = new Scanner(System.in);

        int designPatternNum =  in.nextInt();
        implementation(designPatternNum);
    }
}
