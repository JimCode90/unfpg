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
@Entity(name="AulaEntity")
@Table(name="aula")
public class AulaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="codaul")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name="nomaul", length = 50, nullable = false)
    private String nombre;
    @Column(name="capaul", nullable = false)
    private Integer capacidad;

    @ManyToOne
    @JoinColumn(name = "codubi",nullable = false)
    private UbicacionEntity ubicacion;

    @ManyToOne
    @JoinColumn(name = "codtipa",nullable = false)
    private TipoAulaEntity tipoaula;

    @ManyToOne
    @JoinColumn(name = "codesta",nullable = false)
    private EstadoAulaEntity estadoaula;

}
