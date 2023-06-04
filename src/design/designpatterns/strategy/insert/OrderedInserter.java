package design.designpatterns.strategy.insert;

import java.util.List;

public class OrderedInserter implements Inserter {
    @Override
    public void insert(Integer num, List<Integer> nums) {
        System.out.println("Ordered Inserter");
    }
}
