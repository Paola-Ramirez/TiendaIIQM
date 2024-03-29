package com.TiendaIIQM.service;

import com.TiendaIIQM.domain.Producto;
import java.util.List;

public interface ProductoService {
    //metodo que retorna la lista de productos

    public List<Producto> getProductos(boolean activos);

    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);

    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);

    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);

}
