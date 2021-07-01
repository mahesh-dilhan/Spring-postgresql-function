package io.mahesh.springjava.storeproc;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String instrument;

    @Column
    private Integer stock;


}
