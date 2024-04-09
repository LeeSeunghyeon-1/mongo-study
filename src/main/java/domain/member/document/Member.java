package domain.member.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collation = "Member")
@Document(collation = "{ 'locale': 'en' }")
@NoArgsConstructor
@Getter
public class Member {

    private String name;

    public Member(String name) {
        this.name = name;
    }
}
