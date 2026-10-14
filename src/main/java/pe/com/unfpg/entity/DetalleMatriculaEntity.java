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
@Entity(name = "DetalleMatriculaEntity")
@Table(name = "detallematricula")
public class DetalleMatriculaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "coddet")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "estdet", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "nummat", nullable = false)
    private MatriculaEntity matricula;

    @ManyToOne
    @JoinColumn(name = "codsec", nullable = false)
    private SeccionEntity seccion;
}
