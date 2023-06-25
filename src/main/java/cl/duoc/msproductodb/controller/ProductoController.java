package cl.duoc.msproductodb.controller;
/*en el fichero application.properties, 
 en el directorio resources, añadiremos la
  información de nuestra base de datos, siendo
 el nombre de la base */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.duoc.msproductodb.model.repository.ProductoRepository;
@Controller
@RequestMapping("/productos-db")
 public class ProductoController {
        
    @Autowired
    private ProductoRepository productoRepository;

    
    @GetMapping("/")
    public String inicio(Model model){
        var producto = productoRepository.findAll();
        model.addAttribute("producto", producto);
        return "index";   
    }
    
    
}
