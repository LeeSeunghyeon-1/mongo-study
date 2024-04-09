package domain.member.repository;

import domain.member.document.Member;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends MongoRepository<Member, ObjectId> {
    public List<Member> findByName(String name);

}