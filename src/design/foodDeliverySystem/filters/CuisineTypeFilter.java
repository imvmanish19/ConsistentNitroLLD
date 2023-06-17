package design.foodDeliverySystem.filters;

import design.foodDeliverySystem.data.CuisineType;
import design.foodDeliverySystem.data.FoodItem;

import java.util.List;

public class CuisineTypeFilter implements FoodItemFilter {

    private final List<CuisineType> cuisines;

    public CuisineTypeFilter(List<CuisineType> cuisines) {
        this.cuisines = cuisines;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return cuisines.contains(foodItem.getCuisineType());
    }
}
