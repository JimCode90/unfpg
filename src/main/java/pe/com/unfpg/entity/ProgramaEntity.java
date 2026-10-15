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
@Entity(name = "ProgramaEntity")
@Table(name = "programa")
public class ProgramaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codprog")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomprog", length = 100, nullable = false)
    private String nombre;
    @Column(name = "estprog", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codfac", nullable = false)
    private FacultadEntity facultad;

}
