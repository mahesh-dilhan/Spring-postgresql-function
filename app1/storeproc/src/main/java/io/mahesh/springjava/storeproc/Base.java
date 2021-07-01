package io.mahesh.springjava.storeproc;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String instrument;

    @Column
    private Integer stock;

}
