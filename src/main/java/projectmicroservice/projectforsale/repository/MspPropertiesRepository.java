package projectmicroservice.projectforsale.repository;

import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectmicroservice.projectforsale.entity.MspProperties;

@Repository
public interface MspPropertiesRepository extends JpaRepository<MspProperties, Long> {
}
