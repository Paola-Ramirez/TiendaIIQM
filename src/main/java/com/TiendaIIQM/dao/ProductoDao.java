
package com.TiendaIIQM.dao;

import com.TiendaIIQM.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto,Long>{
    // mas adelante vamos a tener metodos ampliados
}
