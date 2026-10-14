package pe.com.unfpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "CalificacionEntity")
@Table(name = "calificacion")
public class CalificacionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codcal")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "feccal", nullable = false)
    private LocalDateTime fechacalificacion;
    @Column(name = "nota", precision = 5, scale = 2, nullable = false)
    private BigDecimal nota;

    @ManyToOne
    @JoinColumn(name = "coddet", nullable = false)
    private DetalleMatriculaEntity detallematricula;

    @ManyToOne
    @JoinColumn(name = "codsec", nullable = false)
    private SeccionEntity seccion;

    @ManyToOne
    @JoinColumn(name = "codtipc", nullable = false)
    private TipoCalificacionEntity tipocalificacion;
}
