package pe.com.unfpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name="TipoDocumentoEntity")
@Table(name="tipodocumento")
public class TipoDocumentoEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="codtipd")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name="nomtipd", length = 50, nullable = false)
    private String nombre;
    @Column(name="esttipd", nullable = false)
    private Boolean estado;
}
