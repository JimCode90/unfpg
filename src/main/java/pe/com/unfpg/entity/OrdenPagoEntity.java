package pe.com.unfpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "OrdenPagoEntity")
@Table(name = "ordenpago")
public class OrdenPagoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codordpag")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "fecordpag", nullable = false)
    private LocalDateTime fechaordenpago;
    @Column(name = "monto", precision = 10, scale = 2, nullable = false)
    private BigDecimal monto;
    @Column(name = "estordpag", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "nummat", nullable = false)
    private MatriculaEntity matricula;

    @ManyToOne
    @JoinColumn(name = "codconp", nullable = false)
    private ConceptoPagoEntity conceptopago;

    @ManyToOne
    @JoinColumn(name = "codmetp", nullable = false)
    private MetodoPagoEntity metodopago;

    @ManyToOne
    @JoinColumn(name = "codestp", nullable = false)
    private EstadoPagoEntity estadopago;
}
