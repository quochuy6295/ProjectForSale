package projectmicroservice.projectforsale.pagination;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageInfo {
//    @Schema(description = "Số trang hiện tại", example = "1", required = true)
    private int currentPage;
//    @Schema(description = "Số bản ghi một trang", example = "5", required = true)
    private int pageSize;
}
