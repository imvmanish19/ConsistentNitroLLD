package design.designpatterns.strategy.search;

import java.util.List;

public class LinearSearch implements Searcher {

    @Override
    public Integer search(Integer num, List<Integer> nums) {
        System.out.println("Linear Search");
        return null;
    }
}
