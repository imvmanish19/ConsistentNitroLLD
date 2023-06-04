package design.designpatterns.abstractFactory;

public interface IngredientsFactory {
    Bean getBean();

    Milk getMilk();

    Sugar getSugar();
}
