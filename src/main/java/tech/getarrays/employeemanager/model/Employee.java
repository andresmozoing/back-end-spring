package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity //Esto nos ayuda a mapear esta clase con una tabla de la base de datos
public class Employee implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(nullable = false , updatable = false)
    private Long id;

    private String nombre;

    private String email;

    private String cargo;

    private String numeroTelefono;

    private String imageUrl;

    @Column(nullable = false , updatable = false)
    private String codigoEmpleado;

    public Employee(Long id, String nombre, String email, String cargo, String numeroTelefono, String imageUrl, String codigoEmpleado) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.cargo = cargo;
        this.numeroTelefono = numeroTelefono;
        this.imageUrl = imageUrl;
        this.codigoEmpleado = codigoEmpleado;
    }

    public Employee() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", codigoEmpleado='" + codigoEmpleado + '\'' +
                '}';
    }
}
