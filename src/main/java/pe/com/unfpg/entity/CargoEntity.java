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
@Entity(name = "CargoEntity")
@Table(name = "cargo")
public class CargoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codcar")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomcar", length = 50, nullable = false)
    private String nombre;
    @Column(name = "estcar", nullable = false)
    private Boolean estado;

}
