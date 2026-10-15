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
@Entity(name = "EjemplarLibroEntity")
@Table(name = "ejemplarlibro")
public class EjemplarLibroEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codeje")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "codejemplar", length = 50, nullable = false, unique = true)
    private String codigoejemplar;
    @Column(name = "estadoeje", length = 30, nullable = false)
    private String disponibilidad;
    @Column(name = "esteje", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codlib", nullable = false)
    private LibroEntity libro;
}
