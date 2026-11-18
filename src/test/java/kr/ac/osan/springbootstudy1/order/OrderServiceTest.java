package kr.ac.osan.springbootstudy1.order;

import kr.ac.osan.springbootstudy1.member.Grade;
import kr.ac.osan.springbootstudy1.member.Member;
import kr.ac.osan.springbootstudy1.member.MemberService;
import kr.ac.osan.springbootstudy1.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}
