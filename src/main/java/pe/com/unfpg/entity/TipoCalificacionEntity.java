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
@Entity(name = "TipoCalificacionEntity")
@Table(name = "tipocalificacion")
public class TipoCalificacionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codtipc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomtipc", length = 50, nullable = false)
    private String nombre;
    @Column(name = "esttipc", nullable = false)
    private Boolean estado;

}
