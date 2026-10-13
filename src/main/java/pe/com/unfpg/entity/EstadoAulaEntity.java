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
@Entity(name = "EstadoAulaEntity")
@Table(name = "estadoaula")
public class EstadoAulaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codesta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomesta", length = 50, nullable = false)
    private String nombre;
    @Column(name = "estesta", nullable = false)
    private Boolean estado;

}
