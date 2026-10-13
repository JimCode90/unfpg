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
@Entity(name = "TipoAulaEntity")
@Table(name = "tipoaula")
public class TipoAulaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codtipa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomtipa", length = 50, nullable = false)
    private String nombre;
    @Column(name = "esttipa", nullable = false)
    private Boolean estado;

}
