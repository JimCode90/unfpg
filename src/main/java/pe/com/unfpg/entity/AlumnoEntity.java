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
@Entity(name="AlumnoEntity")
@Table(name="alumno")
public class AlumnoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="codalu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name="nomalu", length = 50, nullable = false)
    private String nombre;
    @Column(name="apepalu", length = 40, nullable = false)
    private String apellidopaterno;
    @Column(name="apemalu", length = 40, nullable = false)
    private String apellidomaterno;
    @Column(name="fecnac", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechanacimiento;
    @Column(name="numdoc", length = 20, nullable = false)
    private String numerodocumento;
    @Column(name="nacalu", length = 20, nullable = false)
    private String lugarnacimiento;
    @Column(name="diralu", length = 300, nullable = false)
    private String direccion;
    @Column(name="telalu", length = 15, nullable = true)
    private String telefono;
    @Column(name="celalu", length = 15, nullable = true)
    private String celular;
    @Column(name="coralu", length = 100, nullable = false)
    private String correo;
    @Column(name="estalu", nullable = false)
    private Boolean estado;

    //clave foraneas
    @ManyToOne
    @JoinColumn(name = "coddis",nullable = false)
    private DistritoEntity distrito;

    @ManyToOne
    @JoinColumn(name = "codsex",nullable = false)
    private SexoEntity sexo;

    @ManyToOne
    @JoinColumn(name = "codtipd",nullable = false)
    private TipoDocumentoEntity tipodocumento;

    @ManyToOne
    @JoinColumn(name = "codestc",nullable = false)
    private EstadoCivilEntity estadocivil;

}
