package cl.duoc.msproductodb.model.repository;


import org.springframework.data.repository.CrudRepository;
import cl.duoc.msproductodb.model.entities.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer>{
    
}
