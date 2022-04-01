package com.iteesoft.sta.model;

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
    private String leaveType;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean approvalStatus = false;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private User user;

}
