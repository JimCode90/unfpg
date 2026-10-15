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
@Entity(name = "HorarioEntity")
@Table(name = "horario")
public class HorarioEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codhor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "codblo", nullable = false)
    private BloqueEntity bloque;

    @ManyToOne
    @JoinColumn(name = "codsec", nullable = false)
    private SeccionEntity seccion;

    @ManyToOne
    @JoinColumn(name = "coddias", nullable = false)
    private DiaSemanaEntity diasemana;

    @ManyToOne
    @JoinColumn(name = "codaul", nullable = false)
    private AulaEntity aula;
}
