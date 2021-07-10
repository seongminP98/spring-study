package hello.core.member;

public class MemberServiceImpl implements  MemberService{

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) { //DI (의존관계 주입)
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //테스트 용도 (Configuration과 싱글톤)
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
