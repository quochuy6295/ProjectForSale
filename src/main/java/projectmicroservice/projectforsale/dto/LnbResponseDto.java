package projectmicroservice.projectforsale.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class LnbResponseDto {

    private String value;

    private Integer seq;

    private String category;

    private Long count;

    public LnbResponseDto(String value, Integer seq, String category, Long count) {
        this.value = value;
        this.seq = seq;
        this.category = category;
        this.count = count;
    }
}
