package cl.duoc.msproductodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.duoc.msproductodb.model.entities.Producto;

@Service
public class ProductoServiceimp implements ProductoServicio {

    @Autowired
    private Producto producto;



    @Override
    public List<Producto> listaProductos() {
        // metodo findall, para que recupere todos los objetos de tipo persona
        //retornamos el LIST
        return (List<Producto>) producto.findAll();

    }

    @Override
    public void guardar(Producto producto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void eliminar(Producto producto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Producto encontraProducto(Producto producto) {
        // TODO Auto-generated method stub
        
    }
    
}
