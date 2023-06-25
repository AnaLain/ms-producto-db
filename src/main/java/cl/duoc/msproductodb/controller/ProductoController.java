package cl.duoc.msproductodb.controller;
/*en el fichero application.properties, 
 en el directorio resources, añadiremos la
  información de nuestra base de datos, siendo
 el nombre de la base */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
@RequestMapping("/productos-db")
 public class ProductoController {
        
    @Autowired
    ProductoService productoServoce;

    @GetMapping(path = "/producto", produces = {"application/json"})
    public List<Producto> getAll(){
        return ProductoService.getAll();
    }
    
    @PostMapping(path = "/producto", consumes= {"application/json"}, produces = {"application/json"})
    public Producto add(@RequestBody Producto producto){
        return productoService.add(producto);
    }
}
