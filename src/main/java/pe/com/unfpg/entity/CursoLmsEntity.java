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
@Entity(name = "CursoLmsEntity")
@Table(name = "cursolms")
public class CursoLmsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codcurl")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "estcurl", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codpla", nullable = false)
    private PlanEstudioEntity planestudio;

    @ManyToOne
    @JoinColumn(name = "codsec", nullable = false)
    private SeccionEntity seccion;
}
