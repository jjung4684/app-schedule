package app.schedule.service;

import app.schedule.model.Member;
import app.schedule.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member getMemberName(String name){
        Member member = memberRepository.findByName(name);
        return member;
    }


}
