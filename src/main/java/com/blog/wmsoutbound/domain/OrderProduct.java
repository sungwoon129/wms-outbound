package com.blog.wmsoutbound.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int quantity;

    private boolean picked;

    @CreatedDate
    private LocalDateTime pickedDate;
}
