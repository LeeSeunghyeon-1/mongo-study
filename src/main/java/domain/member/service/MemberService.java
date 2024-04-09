package domain.member.service;

import domain.member.document.Member;
import domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public List<Member> getMember(String name){
        return memberRepository.findByName(name);
    }
}
