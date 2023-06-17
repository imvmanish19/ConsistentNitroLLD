package design.foodDeliverySystem.filters;

import design.foodDeliverySystem.data.FoodItem;
import design.foodDeliverySystem.data.MealType;

public class MealTypeFilter implements FoodItemFilter {

    private final MealType mealType;

    public MealTypeFilter(MealType mealType) {
        this.mealType = mealType;
    }


    @Override
    public boolean filter(FoodItem foodItem) {
        return false;
    }
}
