package com.iteesoft.ems.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Leave {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String type;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
