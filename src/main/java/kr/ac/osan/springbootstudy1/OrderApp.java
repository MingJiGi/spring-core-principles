package kr.ac.osan.springbootstudy1;

import kr.ac.osan.springbootstudy1.member.Grade;
import kr.ac.osan.springbootstudy1.member.Member;
import kr.ac.osan.springbootstudy1.member.MemberService;
import kr.ac.osan.springbootstudy1.member.MemberServiceImpl;
import kr.ac.osan.springbootstudy1.order.Order;
import kr.ac.osan.springbootstudy1.order.OrderService;
import kr.ac.osan.springbootstudy1.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.
                createOrder(memberId, "itemA",10000);

        System.out.println("order = " + order);

    }

}
