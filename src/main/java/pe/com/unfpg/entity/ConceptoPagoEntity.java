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
@Entity(name = "ConceptoPagoEntity")
@Table(name = "conceptopago")
public class ConceptoPagoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codconp")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomconp", length = 100, nullable = false)
    private String nombre;
    @Column(name = "desconp", nullable = true)
    private String descripcion;
    @Column(name = "estconp", nullable = false)
    private Boolean estado;

}
