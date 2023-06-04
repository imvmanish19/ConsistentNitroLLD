package design.designpatterns.abstractFactory;

public class CoffeeFactory {
    public Coffee getCoffee(String coffeeType) {
        /** Problem -> Creation Responsibility +  Remebering Ingredients **/
        /**
         * Coffee coffee;
         * if(coffeeType.equals("Cappuccino")) {
         *         coffee = new Cappuccino(new AmericanBean(), new CowMilk(), new BrownSugar());
         *  } else if(coffeeType.equals("Expresso")) {
         *         coffee = new Expresso(new FrenchBean(), new PowderMilk(), new RegularSugar());
         *  } else {
         *         coffee = new Robusta(new AmericanBean(), new CowMilk(), new RegularSugar());
         *  }
         */
        Coffee coffee;
        if(coffeeType.equals("Cappuccino")) {
            coffee = new Cappuccino(new CappuccinoIngredientFactory());
        } else if(coffeeType.equals("Expresso")) {
            coffee = new Expresso(new ExpressoIngredientsFactory());
        } else {
            coffee = new Robusta(new DefaultIngredientsFactory());
        }
        return coffee;
    }
}
