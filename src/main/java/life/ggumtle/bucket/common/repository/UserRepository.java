package life.ggumtle.bucket.common.repository;

import life.ggumtle.bucket.common.entity.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<Users, Long> {
    Mono<Users> findByInternalId(String internalId);
}
