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
@Entity(name = "MatriculaEntity")
@Table(name = "matricula")
public class MatriculaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "nummat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "obsmat", nullable = true)
    private String observacion;
    @Column(name = "fecmat", nullable = false)
    private LocalDateTime fechamatricula;
    @Column(name = "estmat", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codalu", nullable = false)
    private AlumnoEntity alumno;

    @ManyToOne
    @JoinColumn(name = "codestm", nullable = false)
    private EstadoMatriculaEntity estadomatricula;

    @ManyToOne
    @JoinColumn(name = "codtipm", nullable = false)
    private TipoMatriculaEntity tipomatricula;

    @ManyToOne
    @JoinColumn(name = "codper", nullable = false)
    private PeriodoAcademicoEntity periodoacademico;
}
