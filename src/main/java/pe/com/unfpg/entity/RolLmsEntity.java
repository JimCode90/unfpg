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
@Entity(name = "RolLmsEntity")
@Table(name = "rollms")
public class RolLmsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codroll")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomroll", length = 40, nullable = false)
    private String nombre;
    @Column(name = "estroll", nullable = false)
    private Boolean estado;

}
