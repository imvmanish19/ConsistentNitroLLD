package design.designpatterns.abstractFactory;

public class DefaultIngredientsFactory implements IngredientsFactory {
    @Override
    public Bean getBean() {
        return new AmericanBean();
    }

    @Override
    public Milk getMilk() {
        return new CowMilk();
    }

    @Override
    public Sugar getSugar() {
        return new RegularSugar();
    }
}
