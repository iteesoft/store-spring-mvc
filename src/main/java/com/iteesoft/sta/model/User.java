package com.iteesoft.sta.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Builder
@AllArgsConstructor
@Getter
@Entity
@Table(name = "users")
@NoArgsConstructor
public class User extends BaseEntity{

	private String firstName;
	private String lastName;
	private String email;
	private String password;
}
