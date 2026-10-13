package pe.com.unfpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "BloqueEntity")
@Table(name = "bloque")
public class BloqueEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codblo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomblo", length = 20, nullable = false)
    private String nombre;
    @Column(name = "iniblo", nullable = false)
    private LocalTime horainicio;
    @Column(name = "finblo", nullable = false)
    private LocalTime horafin;
    @Column(name = "estblo", nullable = false)
    private Boolean estado;

}
