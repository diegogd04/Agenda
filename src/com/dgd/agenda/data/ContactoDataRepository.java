package com.dgd.agenda.data;

import com.dgd.agenda.data.local.ContactoFileLocalDataSource;
import com.dgd.agenda.data.local.ContactoMemLocalDataSource;
import com.dgd.agenda.domain.models.Contacto;
import com.dgd.agenda.domain.useCase.ContactoRepository;

import java.util.List;

public class ContactoDataRepository implements ContactoRepository {

    public ContactoFileLocalDataSource localDataSource = ContactoFileLocalDataSource.getInstance();

    @Override
    public void save(Contacto contacto) {
        localDataSource.save(contacto);
    }

    @Override
    public List<Contacto> getAll() {
        return localDataSource.findAll();
    }
}
