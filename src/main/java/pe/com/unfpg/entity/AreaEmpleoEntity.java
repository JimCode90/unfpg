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
@Entity(name = "AreaEmpleoEntity")
@Table(name = "areaempleo")
public class AreaEmpleoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codare")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomare", length = 50, nullable = false)
    private String nombre;
    @Column(name = "estare", nullable = false)
    private Boolean estado;

}
