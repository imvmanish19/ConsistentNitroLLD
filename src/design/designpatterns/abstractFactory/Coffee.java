package design.designpatterns.abstractFactory;

public abstract class Coffee {
    private final Bean bean;
    private final Sugar sugar;
    private final Milk milk;
    private final IngredientsFactory ingredientFactory;

//    public Coffee(Bean bean, Milk milk, Sugar sugar) {
//        this.bean = bean;
//        this.milk = milk;
//        this.sugar = sugar;
//    }

    protected Coffee(IngredientsFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.bean = ingredientFactory.getBean();
        this.sugar = ingredientFactory.getSugar();
        this.milk = ingredientFactory.getMilk();
    }

    abstract void brew();

    abstract void boil();
}
