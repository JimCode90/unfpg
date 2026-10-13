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
@Entity(name = "GradoInstruccionEntity")
@Table(name = "gradoinstruccion")
public class GradoInstruccionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codgrai")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomgrai", length = 50, nullable = false)
    private String nombre;
    @Column(name = "estgrai", nullable = false)
    private Boolean estado;

}
