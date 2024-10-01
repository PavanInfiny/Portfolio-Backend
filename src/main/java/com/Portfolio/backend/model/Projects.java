package com.Portfolio.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Lombok;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Projects {
    @Id
    int id;
    @Column(length = 1000)
    String projectdesc;
    String projecttitle;
    @Column(length = 1000)
    String Abstract;
    @Column(length = 1000)
    String Technology;
    String ppt;
    String report;
    String Code;
    @Column(length = 1000)
    String Working;
}
