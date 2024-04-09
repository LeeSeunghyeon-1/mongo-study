package mongostudy.mongo;

import domain.member.document.Member;
import domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootApplication(scanBasePackages = {"domain.member.repository", "mongostudy.mongo"})
@EntityScan(basePackages = "domain.member.document")
@EnableMongoRepositories(basePackages = "domain.member.repository")
@RequiredArgsConstructor
public class MongoApplication implements CommandLineRunner {

	private final MemberRepository memberRepository;

    public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Member member1 = new Member("강낭콩");
		Member member2 = new Member("애호박");
		Member member3 = new Member("고구마");

		memberRepository.insert(Arrays.asList(member1, member2, member3));

		List<Member> result  = memberRepository.findByName("강낭콩");
		log.info("result 확인용 : {}", result);
	}
}


