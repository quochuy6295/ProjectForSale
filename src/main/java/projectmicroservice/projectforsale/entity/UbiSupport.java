package projectmicroservice.projectforsale.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ubi_support")
public class UbiSupport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long global_id;

    private String category_path_name;

    private String section;

    private String title;

    private LocalDateTime createdDt;

    private LocalDateTime showStartDate;

    private LocalDateTime showEndDate;

    private LocalDateTime alarmStartDate;

    private LocalDateTime alarmEndDate;

    private Integer hitCount;

    private String category;
}
