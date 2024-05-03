package projectmicroservice.projectforsale.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.print.Pageable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetailResponseDto {

    private String total;

    private List<ContentDto> content;

    private Integer offset;

    private Integer limit;

    private String sort;

    private List<String> sortableField;
}
