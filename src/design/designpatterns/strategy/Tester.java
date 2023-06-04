package design.designpatterns.strategy;

import design.designpatterns.strategy.insert.OrderedInserter;
import design.designpatterns.strategy.insert.UnorderedInserter;
import design.designpatterns.strategy.search.BinarySearch;
import design.designpatterns.strategy.search.LinearSearch;

public class Tester {
    public static void main(String[] args) {
//        NumberStore store = new NumberStore(new OrderedInserter(), new BinarySearch());
        NumberStore store = new NumberStore(new UnorderedInserter(), new LinearSearch());
        store.insert(1);
        store.insert(2);
        store.search(3);
    }
}
