package com.iteesoft.sta.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@MappedSuperclass
@RequiredArgsConstructor
@Data
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy =  IDENTITY)
    private long id;

    @CreatedDate
    private Instant createdAt = Instant.now();

    @UpdateTimestamp
    private Instant updatedAt;
}
