package design.designpatterns.problemsWithoutStrategy;

import design.designpatterns.problemsWithoutStrategy.enums.InsertStrategy;
import design.designpatterns.problemsWithoutStrategy.enums.SearchStrategy;

import java.util.List;

public class NumberStore {
    /** Bad Design
     * 1. if else
     * 2. Violates OCP (Bloated up class)
     * **/

    private final List<Integer> nums;
    private final InsertStrategy insertStrategy;
    private final SearchStrategy searchStrategy;

    public NumberStore(List<Integer> nums, InsertStrategy insertStrategy, SearchStrategy searchStrategy) {
        this.nums = nums;
        this.insertStrategy = insertStrategy;
        this.searchStrategy = searchStrategy;
    }

    public void insert(Integer num) {
        if(insertStrategy.equals(InsertStrategy.ORDERED)) {
            orderedInsert(num);
        } else {
            unorderedInsert(num);
        }
    }

    public Integer search(Integer target) {
        if(searchStrategy.equals(SearchStrategy.LINEAR)) {
            return linearSearch(target);
        } else {
            return binarySearch(target);
        }
    }

    private void orderedInsert(Integer num) {

    }

    private void unorderedInsert(Integer num) {

    }

    private Integer linearSearch(Integer target) {
        return 0;
    }

    private Integer binarySearch(Integer target) {
        return 0;
    }
}
