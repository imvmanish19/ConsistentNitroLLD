package design.designpatterns.abstractFactory;

public class ExpressoIngredientsFactory implements IngredientsFactory {
    @Override
    public Bean getBean() {
        return new FrenchBean();
    }

    @Override
    public Milk getMilk() {
        return new PowderMilk();
    }

    @Override
    public Sugar getSugar() {
        return new RegularSugar();
    }
}
