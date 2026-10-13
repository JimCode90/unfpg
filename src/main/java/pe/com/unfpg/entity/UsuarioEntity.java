package pe.com.unfpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name="UsuarioEntity")
@Table(name="usuario")
public class UsuarioEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="codusu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name="nomusu", length = 50, nullable = false)
    private String nombre;
    @Column(name="clausu", length = 255, nullable = false)
    private String clave;
    @Column(name="corusu", length = 100, nullable = false)
    private String correo;
    @Column(name="estusu", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codalu",nullable = true)
    private AlumnoEntity alumno;

    @ManyToOne
    @JoinColumn(name = "coddoc",nullable = true)
    private DocenteEntity docente;

    @ManyToOne
    @JoinColumn(name = "codemp",nullable = true)
    private EmpleadoEntity empleado;

}
