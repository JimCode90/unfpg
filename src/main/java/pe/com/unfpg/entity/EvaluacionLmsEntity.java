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
@Entity(name = "EvaluacionLmsEntity")
@Table(name = "evaluacionlms")
public class EvaluacionLmsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codeval")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomeval", length = 100, nullable = false)
    private String nombre;
    @Column(name = "deseval", nullable = true)
    private String descripcion;
    @Column(name = "feceval", nullable = false)
    private LocalDateTime fechaevaluacion;
    @Column(name = "esteval", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codcurl", nullable = false)
    private CursoLmsEntity cursolms;
}
