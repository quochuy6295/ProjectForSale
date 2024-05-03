package projectmicroservice.projectforsale.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ubi_support_detail")
public class UbiSupportDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long support_id;

    private String contents;

    private Integer hitCount;
}
