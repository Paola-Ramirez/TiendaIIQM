
package com.TiendaIIQM.service.Impl;

import com.TiendaIIQM.dao.CategoriaDao;
import com.TiendaIIQM.domain.Categoria;
import com.TiendaIIQM.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * @author Maria
 */
@Service
public class CategoriaServiceImpl implements CategoriaService{
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> lista= categoriaDao.findAll();
        // para rewmover las categorias donde activo = falso
        if (activos){
            lista.removeIf(x ->x.isActivo());
        }
        return lista;
    }
    
    
}
