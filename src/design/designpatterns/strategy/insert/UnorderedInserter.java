package design.designpatterns.strategy.insert;

import java.util.List;

public class UnorderedInserter implements Inserter {

    @Override
    public void insert(Integer num, List<Integer> nums) {
        System.out.println("Unordered Inserter");
    }
}
