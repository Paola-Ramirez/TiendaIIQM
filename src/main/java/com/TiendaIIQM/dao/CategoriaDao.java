
package com.TiendaIIQM.dao;

import com.TiendaIIQM.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria,Long>{
    // mas adelante vamos a tener metodos ampliados
}
