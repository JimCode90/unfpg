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
@Entity(name = "DiaSemanaEntity")
@Table(name = "diasemana")
public class DiaSemanaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "coddias")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomdias", length = 20, nullable = false)
    private String nombre;
    @Column(name = "estdias", nullable = false)
    private Boolean estado;

}
