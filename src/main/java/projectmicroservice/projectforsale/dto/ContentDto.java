package projectmicroservice.projectforsale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContentDto {

    private String id;

    private String groupId;

    private String category;

    private String categoryPath;

    private String categoryPathId;

    private String categoryPathName;

    private String categoryPathEnName;

    private String section;

    private String title;

    private String contents;

    private String createdDt;

    private String showStartdate;

    private String showEnddate;

    private String alarmStartdate;

    private String alarmEnddate;

    private Integer hitCount;
}
