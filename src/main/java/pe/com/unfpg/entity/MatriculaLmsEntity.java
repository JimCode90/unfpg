package pe.com.unfpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "MatriculaLmsEntity")
@Table(name = "matriculalms")
public class MatriculaLmsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "nummatl")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "fecmatl", nullable = false)
    private LocalDateTime fechamatricula;
    @Column(name = "estmatl", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codalu", nullable = false)
    private AlumnoEntity alumno;

    @ManyToOne
    @JoinColumn(name = "codcurl", nullable = false)
    private CursoLmsEntity cursolms;

    @ManyToOne
    @JoinColumn(name = "codroll", nullable = false)
    private RolLmsEntity rollms;
}
