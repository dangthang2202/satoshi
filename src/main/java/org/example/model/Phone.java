package org.example.model;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MobilePhone")
public class Phone {
    @Id
    @GeneratedValue
    private String ID;
    @Column(nullable = false)
    @Length(min = 3,max = 128)
    private String name;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private int quantity;
    @ManyToOne
    @JoinColumn(name="ID", nullable=false)
    private Manufacture manufacture;
}
