package com.iteesoft.ems.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import static javax.persistence.GenerationType.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
abstract class User {

    @Id
    @GeneratedValue(strategy =  IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Transient
    private Integer age;

    @Column(name = "role")
    private String role;

    public User(String firstName, String lastName, LocalDate dob, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.password = password;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }
}
