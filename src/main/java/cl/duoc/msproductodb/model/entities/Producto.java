package cl.duoc.msproductodb.model.entities;

import java.io.Serializable;
/*Al utilizar varias librerias de persistence importamos todo el conjunto, +persistence*/
import javax.persistence.*;
import lombok.Data;


@Data
@Entity
//anotación de  tabla se incorpora con el nombre de la BD 
@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

        @Id 
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idProducto;
        private String nomprod;
        private String marca;
        private int valor;
        private int cantidad;
        private int idcategoria;
        
}
