package projectmicroservice.projectforsale.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "msp_properties")
public class MspProperties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    private String type;

    private Integer status;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;
}
