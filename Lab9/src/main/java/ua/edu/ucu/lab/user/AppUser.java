package ua.edu.ucu.lab.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class AppUser {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    @Transient
    private int age;

    public AppUser(String email, LocalDate dob) {
        this.email = email;
        this.dob = dob;
    }

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
