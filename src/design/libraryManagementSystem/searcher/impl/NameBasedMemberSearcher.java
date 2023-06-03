package design.libraryManagementSystem.searcher.impl;

import design.libraryManagementSystem.member.Member;
import design.libraryManagementSystem.searcher.MemberSearcher;

import java.util.List;

public class NameBasedMemberSearcher implements MemberSearcher {

    private String memberName;

    public NameBasedMemberSearcher(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public List<Member> search() {
        return null;
    }
}
