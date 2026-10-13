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
@Entity(name = "CursoEntity")
@Table(name = "curso")
public class CursoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codcur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "sercur", length = 20, nullable = false, unique = true)
    private String serie;
    @Column(name = "nomcur", length = 150, nullable = false)
    private String nombre;
    @Column(name = "crecur", nullable = false)
    private Integer creditos;
    @Column(name = "blocur", nullable = false)
    private Integer bloque;

    @ManyToOne
    @JoinColumn(name = "codprog", nullable = false)
    private ProgramaEntity programa;

}
