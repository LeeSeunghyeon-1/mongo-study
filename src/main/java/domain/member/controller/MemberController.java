package domain.member.controller;

import domain.member.document.Member;
import domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/test")
    public List<Member> getMember(@RequestParam(name="name")String name){
        log.info("name-check : {}", name);
        return memberService.getMember(name);
    }
}
