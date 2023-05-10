package com.dgd.agenda.domain.useCase;

import com.dgd.agenda.domain.models.Contacto;

import java.util.List;

public interface ContactoRepository {
    public void save(Contacto contacto);

    public List<Contacto> getAll();
}
