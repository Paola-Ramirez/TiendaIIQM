
package com.TiendaIIQM.service;

import com.TiendaIIQM.domain.Categoria;
import java.util.List;

public interface CategoriaService {
   //metodo que retorna la lista de categorias
    public List<Categoria> getCategorias(boolean activos);
    
}
