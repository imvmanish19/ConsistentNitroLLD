package design.designpatterns.strategy.search;

import java.util.List;

public class BinarySearch implements Searcher {
    @Override
    public Integer search(Integer num, List<Integer> nums) {
        System.out.println("Binary Search");
        return null;
    }
}
