package design.designpatterns.factory;

public class CoffeeServer {

    private AbstractFactory abstractFactory;

    public CoffeeServer(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public Coffee serve(String coffeeType) {
        Coffee coffee = this.abstractFactory.getCoffee(coffeeType);
        coffee.brew();
        coffee.boil();
        return coffee;
    }
}
