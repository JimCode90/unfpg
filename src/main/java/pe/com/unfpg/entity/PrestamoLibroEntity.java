package pe.com.unfpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "PrestamoLibroEntity")
@Table(name = "prestamolibro")
public class PrestamoLibroEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "numpre")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "fecpre", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaprestamo;
    @Column(name = "fecdpre", nullable = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechadevolucion;
    @Column(name = "devpre", nullable = false)
    private Boolean devuelto;
    @Column(name = "estpre", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codalu", nullable = false)
    private AlumnoEntity alumno;

    @ManyToOne
    @JoinColumn(name = "codeje", nullable = false)
    private EjemplarLibroEntity ejemplarlibro;

    @ManyToOne
    @JoinColumn(name = "codestl", nullable = false)
    private EstadoPrestamoLibroEntity estadoprestamolibro;
}
