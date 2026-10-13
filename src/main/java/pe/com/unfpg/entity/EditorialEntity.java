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
@Entity(name = "EditorialEntity")
@Table(name = "editorial")
public class EditorialEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codedi")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name = "nomedi", length = 100, nullable = false)
    private String nombre;
    @Column(name = "estedi", nullable = false)
    private Boolean estado;

}
