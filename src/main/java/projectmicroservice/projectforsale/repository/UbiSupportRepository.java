package projectmicroservice.projectforsale.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import projectmicroservice.projectforsale.dto.ContentDto;
import projectmicroservice.projectforsale.dto.DetailResponseDto;
import projectmicroservice.projectforsale.dto.LnbResponseDto;
import projectmicroservice.projectforsale.entity.UbiGlobal;
//import projectmicroservice.projectforsale.pagination.Page;

import java.util.List;

@Repository
public interface UbiSupportRepository extends JpaRepository<UbiGlobal, Long>, UbiSupportRepositoryCustom {

    @Query("select new projectmicroservice.projectforsale.dto.LnbResponseDto(ubi.value, ubi.seq, su.category, count(su) as count) FROM UbiSupport su " +
            " LEFT JOIN UbiGlobal ubi ON ubi.id = su.global_id" +
            " WHERE ubi.key = :type AND ubi.state = :state AND ubi.lang = :lang" +
            " GROUP BY ubi.value, su.category, ubi.seq")
    List<LnbResponseDto> findAllLnb(String lang, String state, String type);

    @Query("select new projectmicroservice.projectforsale.dto.ContentDto(su.id, su.category, su.category_path_name, su.section, su.title," +
            " de.contents, su.createdDt, su.showStartDate, su.showEndDate, su.alarmStartDate, su.alarmEndDate, su.hitCount) FROM UbiSupport su " +
            " LEFT JOIN UbiGlobal ubi ON ubi.id = su.global_id" +
            " LEFT JOIN UbiSupportDetail de ON de.support_id = su.id" +
            " WHERE ubi.key = :type AND ubi.state = :state AND ubi.lang = :lang")
    Page<ContentDto> getDetail(String lang, String state, String type, Pageable pageable);
}
