package pe.com.unfpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//@ -> significa anotación
//Lombok----------------------------------------------------------------
@NoArgsConstructor //método constructor vacío
@AllArgsConstructor //método constructor con parámetros
@Data // métodos GET,SET,EQUALS, HASHCODE, TOSTRING
@Builder //clase builder
//----------------------------------------------------------------------
//Jakarta----------------------------------------------------------------
@Entity(name = "DistritoEntity") //define la entidad
@Table(name = "distrito") //define la tabla con la que se trabaja
//-----------------------------------------------------------------------
public class DistritoEntity implements Serializable {

    //código de serialización
    private static final long serialVersionUID = 1L;

    //atributos de la clase
    @Id //define la clave primaria
    @Column(name = "coddis") //define la columna con la que se relaciona
    @GeneratedValue(strategy = GenerationType.IDENTITY) //es para el auto_increment
    private Long codigo;
    @Column(name = "nomdis",length = 50, nullable = false)
    private String nombre;
    @Column(name = "estdis", nullable = false)
    private Boolean estado;

}
