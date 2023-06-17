//package design.foodDeliverySystem.searcher;
//
//import design.foodDeliverySystem.data.DataAccessObjectConverter;
//import design.foodDeliverySystem.data.DataAccessResult;
//import design.foodDeliverySystem.data.DataAccessor;
//import design.foodDeliverySystem.data.FoodItem;
//import design.foodDeliverySystem.filters.FoodItemFilter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class FoodItemSearcher {
//
//    public List<FoodItem> search(String foodItemName, List<FoodItemFilter> filters) {
//        if (foodItemName ==  null || foodItemName.length() == 0 || filters == null)
//            throw new IllegalArgumentException("Missing params");
//        DataAccessResult dataAccessResult = DataAccessor.getFoodItemsWithName(foodItemName);
//        // TODO : Implement DataAccessObjectConverter
//        List<FoodItem> foodItems = DataAccessObjectConverter.convertToFoodItems(dataAccessResult);
//        for (FoodItemFilter filter : filters) {
//            List<FoodItem> filteredFoodItems = new ArrayList<>();
//            for (FoodItem foodItem : foodItems) {
//                if (filter.filter(foodItem))
//                    filteredFoodItems.add(foodItem);
//            }
//            foodItems = filteredFoodItems;
//        }
//        return foodItems;
//    }
//
//    public FoodItem searchById(int id) {
//
//    }
//
//}
