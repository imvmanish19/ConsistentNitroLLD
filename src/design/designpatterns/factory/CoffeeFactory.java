package design.designpatterns.factory;

public class CoffeeFactory implements AbstractFactory {
    public Coffee getCoffee(String coffeeType) {
        Coffee coffee;
        if(coffeeType.equals("Cappuccino")) {
            coffee = new Cappuccino();
        } else if(coffeeType.equals("Expresso")) {
            coffee = new Expresso();
        } else {
            coffee = new Robusta();
        }
        return coffee;
    }
}
