package kr.ac.osan.springbootstudy1.order;

import kr.ac.osan.springbootstudy1.discount.DiscountPolicy;
import kr.ac.osan.springbootstudy1.discount.FixDiscountPolicy;
import kr.ac.osan.springbootstudy1.member.Member;
import kr.ac.osan.springbootstudy1.member.MemberRepository;
import kr.ac.osan.springbootstudy1.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
