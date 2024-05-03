package projectmicroservice.projectforsale.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LnbResponseDto {

    private String value;

    private Integer seq;

    private String category;

    private Integer count;
}
