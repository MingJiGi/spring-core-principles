package kr.ac.osan.springbootstudy1.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member); // 스토어 Map 에 id를 키로, 회원 객체의 참조를 값으로 저장한다.

    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
