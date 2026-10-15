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
@Entity(name = "UbicacionEntity")
@Table(name = "ubicacion")
public class UbicacionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codubi")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomubi", length = 100, nullable = false)
    private String nombre;
    @Column(name = "desubi", nullable = true)
    private String descripcion;
    @Column(name = "estubi", nullable = false)
    private Boolean estado;

}
