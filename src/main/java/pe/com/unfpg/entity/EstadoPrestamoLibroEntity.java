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
@Entity(name = "EstadoPrestamoLibroEntity")
@Table(name = "estadoprestamolibro")
public class EstadoPrestamoLibroEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codestl")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomestl", length = 50, nullable = false)
    private String nombre;
    @Column(name = "estestl", nullable = false)
    private Boolean estado;

}
