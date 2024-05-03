package projectmicroservice.projectforsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import projectmicroservice.projectforsale.dto.LnbResponseDto;
import projectmicroservice.projectforsale.entity.UbiGlobal;

import java.util.List;

@Repository
public interface UbiSupportRepository extends JpaRepository<UbiGlobal, Long>, UbiSupportRepositoryCustom {

//    @Query("select new projectmicroservice.projectforsale.dto.LnbResponseDto() FROM UbiGlobal ubi" +
//            "LEFT JOIN u")
//    List<LnbResponseDto>  findAllLnb(String lang, String scope, String state, String type);
}
