package com.example.clientservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "fecha_nacimiento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate fechaNacimiento;

    @Transient
    private int edad;

    @Override
    public String toString() {
        return "{ \n" +
                "\"id\": " + id + "," +
                "\"name\": " +  "\""+ name +"\""+ "," +
                "\"lastName\": "  + "\""+ lastName + "\""+ "," +
                "\"edad\":" + edad +
                "}";
    }

}
