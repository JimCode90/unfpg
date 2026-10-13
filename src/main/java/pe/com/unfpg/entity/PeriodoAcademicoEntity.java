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
@Entity(name = "PeriodoAcademicoEntity")
@Table(name = "periodoacademico")
public class PeriodoAcademicoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codper")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomper", length = 20, nullable = false)
    private String nombre;
    @Column(name = "fecini", nullable = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechainicio;
    @Column(name = "fecfin", nullable = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechafin;
    @Column(name = "desper", nullable = true)
    private String descripcion;
    @Column(name = "estper", nullable = false)
    private Boolean estado;

}
