package projectmicroservice.projectforsale.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "msp_category")
public class MspCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long property_id;

    private Long category_path;

    private String category_path_name;

    private String section;

    private String title;

    private String contents;

    private LocalDateTime createAt;

    private LocalDateTime showStartDate;

    private LocalDateTime showEndDate;

    private LocalDateTime alarmStartDate;

    private LocalDateTime alarmEndDate;

    private Integer hitCount;
}
