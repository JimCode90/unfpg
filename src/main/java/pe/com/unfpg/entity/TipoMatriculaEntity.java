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
@Entity(name = "TipoMatriculaEntity")
@Table(name = "tipomatricula")
public class TipoMatriculaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codtipm")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomtipm", length = 40, nullable = false)
    private String nombre;
    @Column(name = "destipm", length = 300, nullable = false)
    private String descripcion;
    @Column(name = "esttipm", nullable = false)
    private Boolean estado;

}
