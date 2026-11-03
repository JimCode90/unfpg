package pe.com.unfpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "EmpleadoGradoEntity")
@Table(name = "empleadogrado")
public class EmpleadoGradoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private EmpleadoGradoId id;
    @Column(name = "institucion", length = 150, nullable = false)
    private String institucion;
    @Column(name = "anioobtencion", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate anioobtencion;
    @Column(name = "nomesp", length = 100, nullable = false)
    private String especialidad;

    @ManyToOne
    @MapsId("codemp")
    @JoinColumn(name = "codemp", nullable = false)
    private EmpleadoEntity empleado;

    @ManyToOne
    @MapsId("codgrai")
    @JoinColumn(name = "codgrai", nullable = false)
    private GradoInstruccionEntity gradoinstruccion;
}
