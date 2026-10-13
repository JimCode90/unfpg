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
@Entity(name = "LibroEntity")
@Table(name = "libro")
public class LibroEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codlib")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "isbnlib", length = 20, nullable = true)
    private String isbn;
    @Column(name = "titlib", length = 200, nullable = false)
    private String titulo;
    @Column(name = "autlib", length = 150, nullable = false)
    private String autor;
    @Column(name = "deslib", length = 300, nullable = true)
    private String descripcion;
    @Column(name = "estlib", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codcatl", nullable = false)
    private CategoriaLibroEntity categorialibro;

    @ManyToOne
    @JoinColumn(name = "codedi", nullable = false)
    private EditorialEntity editorial;

}
