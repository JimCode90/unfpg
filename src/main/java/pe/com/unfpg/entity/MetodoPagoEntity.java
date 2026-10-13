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
@Entity(name = "MetodoPagoEntity")
@Table(name = "metodopago")
public class MetodoPagoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codmetp")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nommetp", length = 40, nullable = false)
    private String nombre;
    @Column(name = "estmetp", nullable = false)
    private Boolean estado;

}
