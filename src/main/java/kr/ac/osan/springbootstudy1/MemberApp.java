package kr.ac.osan.springbootstudy1;

import kr.ac.osan.springbootstudy1.member.Grade;
import kr.ac.osan.springbootstudy1.member.Member;
import kr.ac.osan.springbootstudy1.member.MemberService;
import kr.ac.osan.springbootstudy1.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "A", Grade.VIP);
        memberService.join(member);


        Member findMember = memberService.findMember(1L);
        System.out.println("new findMember = "  + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
