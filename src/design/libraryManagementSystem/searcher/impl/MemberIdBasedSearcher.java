package design.libraryManagementSystem.searcher.impl;

import design.libraryManagementSystem.member.Member;
import design.libraryManagementSystem.searcher.MemberSearcher;

import java.util.List;

public class MemberIdBasedSearcher implements MemberSearcher {
    private int memberId;

    public MemberIdBasedSearcher(int memberId) {
        this.memberId = memberId;
    }
    @Override
    public List<Member> search() {
        return null;
    }
}
