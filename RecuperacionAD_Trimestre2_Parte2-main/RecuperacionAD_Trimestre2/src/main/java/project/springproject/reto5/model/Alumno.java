package project.springproject.reto5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "alumnado")

public class Alumno implements Serializable {
    public Alumno(Long id, String nombre, String telefono, String email, Double ad,Double di) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.ad = ad;
        this.di = di;
    }

    public Alumno() {
    }

    @Id
    @Column(name = "id")
    private Long id = null;
    @Column(name = "nombre")
    private String nombre = null;
    @Column(name = "telefono")
    private String telefono = null;
    @Column(name = "email")
    private String email = null;
    @Column(name = "ad")
    private Double ad = null;
    @Column(name = "di")
    private Double di = null;



    public boolean noneNull() {
        return id != null && nombre != null && telefono != null && email != null && ad != null;
    }

    @Override
    public String toString () {
        return "Libro{" +
                "ISBN='" + id + '\'' +
                ", titulo='" + nombre + '\'' +
                ", autor='" + telefono + '\'' +
                ", categoria='" + email + '\'' +
                ", edicion='" + ad + '\'' +
                '}';
    }
}
