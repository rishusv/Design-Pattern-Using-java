package org.designpattern.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream =
                new ChocoChips(
                        new StrawberryScoop(
                                new ChocolateCone(
                                        new ChocoChips(
                                                new OrangeCone()
                                        )
                                )
                        )
                );
        //Choco Cone -> -> Choco Chips -> Chocolate Cone -> Strawberry Scoop -> ChocoChips.
        System.out.println("Description of Softy :"+iceCream.getDescription());
        System.out.println("Cost :"+iceCream.getCost());
    }
}
