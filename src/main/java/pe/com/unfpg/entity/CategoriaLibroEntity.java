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
@Entity(name = "CategoriaLibroEntity")
@Table(name = "categorialibro")
public class CategoriaLibroEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codcatl")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomcatl", length = 40, nullable = false)
    private String nombre;
    @Column(name = "estcatl", nullable = false)
    private Boolean estado;

}
