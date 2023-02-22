package com.verzilin.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MyNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long numberValue;
}
