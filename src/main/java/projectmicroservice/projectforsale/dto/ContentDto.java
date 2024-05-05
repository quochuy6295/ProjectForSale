package projectmicroservice.projectforsale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ContentDto {

    private Long id;

//    private String groupId;

    private String category;

//    private String categoryPath;

//    private String categoryPathId;

    private String categoryPathName;

//    private String categoryPathEnName;

    private String section;

    private String title;

    private String contents;

    private LocalDateTime createdDt;

    private LocalDateTime showStartdate;

    public ContentDto(Long id, String category, String categoryPathName, String section, String title, String contents, LocalDateTime createdDt, LocalDateTime showStartdate, LocalDateTime showEnddate, LocalDateTime alarmStartdate, LocalDateTime alarmEnddate, Integer hitCount) {
        this.id = id;
        this.category = category;
        this.categoryPathName = categoryPathName;
        this.section = section;
        this.title = title;
        this.contents = contents;
        this.createdDt = createdDt;
        this.showStartdate = showStartdate;
        this.showEnddate = showEnddate;
        this.alarmStartdate = alarmStartdate;
        this.alarmEnddate = alarmEnddate;
        this.hitCount = hitCount;
    }

    private LocalDateTime showEnddate;

    private LocalDateTime alarmStartdate;

    private LocalDateTime alarmEnddate;

    private Integer hitCount;
}
