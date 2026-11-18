package kr.ac.osan.springbootstudy1.member;

public interface MemberService {

    void join(Member member); // 회원가입

    Member findMember(Long memberId); // 조회




}
