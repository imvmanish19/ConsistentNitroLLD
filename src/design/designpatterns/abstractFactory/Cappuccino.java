package design.designpatterns.abstractFactory;

public class Cappuccino extends Coffee {

//    public Cappuccino(Bean bean, Milk milk, Sugar sugar) {
//        super(bean, milk, sugar);
//    }

    public Cappuccino(IngredientsFactory ingredientsFactory) {
        super(ingredientsFactory);
    }

    @Override
    public void brew() {

    }

    @Override
    public void boil() {

    }
}
