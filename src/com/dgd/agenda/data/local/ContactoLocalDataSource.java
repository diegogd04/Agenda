package com.dgd.agenda.data.local;

import com.dgd.agenda.domain.models.Contacto;

import java.util.List;

public interface ContactoLocalDataSource {
    public void save(Contacto contacto);
    public Contacto findById(Integer contactoId);
    public List<Contacto> findAll();
}
