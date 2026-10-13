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
@Entity(name = "FacultadEntity")
@Table(name = "facultad")
public class FacultadEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codfac")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomfac", length = 50, nullable = false)
    private String nombre;
    @Column(name = "desfac", nullable = false)
    private String descripcion;
    @Column(name = "estfac", nullable = false)
    private Boolean estado;

}
