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
@Entity(name = "UsuarioRolEntity")
@Table(name = "usuariorol")
public class UsuarioRolEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private UsuarioRolId id;

    @ManyToOne
    @MapsId("codusu")
    @JoinColumn(name = "codusu", nullable = false)
    private UsuarioEntity usuario;

    @ManyToOne
    @MapsId("codrol")
    @JoinColumn(name = "codrol", nullable = false)
    private RolEntity rol;
}
