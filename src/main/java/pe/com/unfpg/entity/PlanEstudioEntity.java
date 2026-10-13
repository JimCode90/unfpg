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
@Entity(name = "PlanEstudioEntity")
@Table(name = "planestudio")
public class PlanEstudioEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codpla")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nompla", length = 100, nullable = false)
    private String nombre;
    @Column(name = "despla", nullable = true)
    private String descripcion;
    @Column(name = "estpla", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codprog", nullable = false)
    private ProgramaEntity programa;

}
