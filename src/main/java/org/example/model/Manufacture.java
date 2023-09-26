package org.example.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Manufacture")
public class Manufacture {
    @Id @GeneratedValue
    private String ID;
    private String name;
    private String location;
    private int employee;
    @OneToMany(mappedBy="manufacture")
    private List<Phone> phoneList;
}
