package projectmicroservice.projectforsale.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Builder.Default
    private List<String> sortableField = List.of("createdDt");

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
