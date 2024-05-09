package orz.zerock.jwttokenex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import orz.zerock.jwttokenex.domain.APIUser;

public interface APIUserRepository extends JpaRepository<APIUser, String> {
}
