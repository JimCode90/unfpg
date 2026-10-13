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
@Entity(name = "EstadoPagoEntity")
@Table(name = "estadopago")
public class EstadoPagoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codestp")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomestp", length = 40, nullable = false)
    private String nombre;
    @Column(name = "estestp", nullable = false)
    private Boolean estado;

}
