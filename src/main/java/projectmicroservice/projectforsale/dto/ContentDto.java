package projectmicroservice.projectforsale.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import projectmicroservice.projectforsale.Const;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ContentDto {

    private Long id;

    private String groupId;

    private String category;

    private String categoryPath;

    private String categoryPathId;

    private String categoryPathName;

    private String categoryPathEnName;

    private String section;

    private String title;

    private String contents;

    @JsonFormat(pattern = Const.TIME_FORMAT)
    private LocalDateTime createdDt;

    @JsonFormat(pattern = Const.TIME_FORMAT)
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

    @JsonFormat(pattern = Const.TIME_FORMAT)
    private LocalDateTime showEnddate;

    @JsonFormat(pattern = Const.TIME_FORMAT)
    private LocalDateTime alarmStartdate;

    @JsonFormat(pattern = Const.TIME_FORMAT)
    private LocalDateTime alarmEnddate;

    private Integer hitCount;
}
