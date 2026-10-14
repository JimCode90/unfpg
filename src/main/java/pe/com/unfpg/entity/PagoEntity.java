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
@Entity(name = "PagoEntity")
@Table(name = "pago")
public class PagoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codpag")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "fecpag", nullable = false)
    private LocalDateTime fechapago;
    @Column(name = "montopag", precision = 10, scale = 2, nullable = false)
    private BigDecimal monto;
    @Column(name = "estpag", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codordpag", nullable = false)
    private OrdenPagoEntity ordenpago;
}
