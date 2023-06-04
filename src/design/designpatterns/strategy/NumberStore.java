package design.designpatterns.strategy;

import design.designpatterns.strategy.insert.Inserter;
import design.designpatterns.strategy.search.Searcher;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {
    private final List<Integer> nums;
    private final Inserter inserter;
    private final Searcher searcher;

    public NumberStore(Inserter inserter, Searcher searcher) {
        this.nums = new ArrayList<>();
        this.inserter = inserter;
        this.searcher = searcher;
    }

    public void insert(Integer num) {
        this.inserter.insert(num, nums);
    }

    public Integer search(Integer target) {
        return this.searcher.search(target, nums);
    }

}
