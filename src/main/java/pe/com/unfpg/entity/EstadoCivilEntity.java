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
@Entity(name="EstadoCivilEntity")
@Table(name="estadocivil")
public class EstadoCivilEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="codestc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name="nomestc", length = 50, nullable = false)
    private String nombre;
    @Column(name="estestc", nullable = false)
    private Boolean estado;
}
