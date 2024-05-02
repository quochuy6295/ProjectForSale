package projectmicroservice.projectforsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectmicroservice.projectforsale.entity.MspCategory;

@Repository
public interface MspCategoryRepository extends JpaRepository<MspCategory, Long> {
}
