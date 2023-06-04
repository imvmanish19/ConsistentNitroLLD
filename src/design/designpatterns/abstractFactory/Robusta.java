package design.designpatterns.abstractFactory;

public class Robusta extends Coffee {

//    public Robusta(Bean bean, Milk milk, Sugar sugar) {
//        super(bean, milk, sugar);
//    }

    public Robusta(IngredientsFactory ingredientsFactory) {
        super(ingredientsFactory);
    }

    @Override
    public void brew() {

    }

    @Override
    public void boil() {

    }
}
