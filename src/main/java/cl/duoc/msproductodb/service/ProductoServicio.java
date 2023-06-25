package cl.duoc.msproductodb.service;

import java.util.List;

import cl.duoc.msproductodb.model.entities.Producto;


public interface ProductoServicio {
    
    
    public List<Producto> listaProductos();
    
    public void guardar(Producto producto);

    public void eliminar(Producto producto);

    public Producto encontrarProducto(Producto producto);
    
    
}
