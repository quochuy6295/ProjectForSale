package projectmicroservice.projectforsale.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetailResponseDto {

    private Long total;

    private List<?> content;

    private Integer offset;

    private Integer limit;

    private String sort;

    private List<String> sortableField;

    public static DetailResponseDto convertPage(Page<?> page) {
        return DetailResponseDto
                .builder()
                .total(page.getTotalElements())
                .content(page.getContent())
                .offset(page.getPageable().getPageNumber())
                .limit(page.getPageable().getPageSize())
                .build();
    }
}
