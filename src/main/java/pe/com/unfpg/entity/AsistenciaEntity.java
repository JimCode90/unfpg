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
@Entity(name = "AsistenciaEntity")
@Table(name = "asistencia")
public class AsistenciaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codasis")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "fecasis", nullable = false)
    private LocalDateTime fechaasistencia;
    @Column(name = "presente", nullable = false)
    private Boolean presente;
    @Column(name = "justificada", nullable = false)
    private Boolean justificada;

    @ManyToOne
    @JoinColumn(name = "coddet", nullable = false)
    private DetalleMatriculaEntity detallematricula;

    @ManyToOne
    @JoinColumn(name = "codsec", nullable = false)
    private SeccionEntity seccion;
}
