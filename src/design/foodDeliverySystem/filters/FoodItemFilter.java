package design.foodDeliverySystem.filters;

import design.foodDeliverySystem.data.FoodItem;

public interface FoodItemFilter {
    boolean filter(FoodItem foodItem);
}
