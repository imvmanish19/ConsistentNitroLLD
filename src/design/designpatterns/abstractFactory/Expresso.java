package design.designpatterns.abstractFactory;


public class Expresso extends Coffee {

//    public Expresso(Bean bean, Milk milk, Sugar sugar) {
//        super(bean, milk, sugar);
//    }

    public Expresso(IngredientsFactory ingredientsFactory) {
        super(ingredientsFactory);
    }

    @Override
    public void brew() {

    }

    @Override
    public void boil() {

    }
}
