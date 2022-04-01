package com.iteesoft.sta.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import javax.persistence.*;
import java.time.Instant;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
@Entity
public class Product extends BaseEntity{

    private String name;
    private String description;
    private String image;
    private double price;
    private int quantity;

}
