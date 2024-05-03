package projectmicroservice.projectforsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectmicroservice.projectforsale.entity.UbiSupport;

@Repository
public interface UbiRepository extends JpaRepository<UbiSupport, Long> {
}
