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
@Entity(name = "TrasladoEntity")
@Table(name = "traslado")
public class TrasladoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codtra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "progori", length = 100, nullable = true)
    private String programaorigen;
    @Column(name = "uniori", length = 100, nullable = true)
    private String universidadorigen;
    @Column(name = "esttras", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "nummat", nullable = false)
    private MatriculaEntity matricula;
}
