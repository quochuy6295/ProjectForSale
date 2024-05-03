package projectmicroservice.projectforsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectmicroservice.projectforsale.entity.UbiGlobal;

@Repository
public interface UbiGlobalRepository extends JpaRepository<UbiGlobal, Long> {
}
