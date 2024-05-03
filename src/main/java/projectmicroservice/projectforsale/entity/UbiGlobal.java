package projectmicroservice.projectforsale.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "ubi_global")
public class UbiGlobal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String key;

    private String value;

    @CreatedDate
    private LocalDateTime createAt;

    private Integer state;

    private Integer seq;
}
