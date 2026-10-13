package pe.com.unfpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name="DocenteEntity")
@Table(name="docente")
public class DocenteEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="coddoc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name="nomdoc", length = 50, nullable = false)
    private String nombre;
    @Column(name="apepdoc", length = 40, nullable = false)
    private String apellidopaterno;
    @Column(name="apemdoc", length = 40, nullable = false)
    private String apellidomaterno;
    @Column(name="fecnac", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechanacimiento;
    @Column(name="numdoc", length = 20, nullable = false)
    private String numerodocumento;
    @Column(name="nacdoc", length = 20, nullable = false)
    private String lugarnacimiento;
    @Column(name="dirdoc", length = 300, nullable = false)
    private String direccion;
    @Column(name="teldoc", length = 15, nullable = true)
    private String telefono;
    @Column(name="celdoc", length = 15, nullable = false)
    private String celular;
    @Column(name="cordoc", length = 100, nullable = false)
    private String correo;
    @Column(name="suedoc", precision = 8, scale = 2, nullable = false)
    private BigDecimal sueldo;
    @Column(name="estdoc", nullable = false)
    private Boolean estado;

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
