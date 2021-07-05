package io.mahesh.springjava.storeproc;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID baseid;

    @Column
    private Integer id;

    @Column
    private String instrument;

    @Column
    private Integer stock;

}
